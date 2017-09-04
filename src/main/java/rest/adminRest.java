/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import beans.kkUser;
import beans.resalt;
import beans.user1;
import beans.users;
import java.util.HashMap;
import java.util.logging.Logger;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.validation.Constraint;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import rtk.sso.REST.apiREST;

/**
 *
 * @author vasil
 */
@Path("/")
@Stateless
public class adminRest {

    Logger log = Logger.getLogger(getClass().getName());

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_XML)
    //@RolesAllowed("admin-elk-user")
    /* в web.xml
    <login-config>
        <auth-method>KEYCLOAK</auth-method>
        <realm-name>videomanager</realm-name>
    </login-config>
     */

    public kkUser getHello() {
        kkUser item = new kkUser();
        item.setEmail("test@mail.ru");
        item.setFirstName("Иванов");
        item.setSecondName("Петр");
        item.setThirdName("Петрович");
        item.setUsername("test");
        item.setPhone("44444");
        item.setPassword("123");
        //convertObjectToXml(item);
        return item;
    }

    @POST
    @Path("/addUser")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_XML)
    public users addUser(users item) {
        return item;
    }

    @POST
    @Path("/addUser1")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public resalt addUser1(user1 item) {
        log.info("addUser1 => " + item);
        resalt res = new resalt();
        res.setResultCode(0);
        res.setResultComment("Yes");
        return res;
    }

    @POST
    @Path("/addUser2")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public resalt addUser2(kkUser item) {
        log.info("addUser2 => " + item);
        resalt res = new resalt();

        try {
            apiREST keycloak = new apiREST("vasil", "123", "192.168.1.150:8080", "videomanager");
            keycloak.Init();
            rtk.sso.admintest.keycloakUser user = new rtk.sso.admintest.keycloakUser();
            user.setEmail(item.getEmail());
            user.setEnabled(true);
            user.setFirstName(item.getFirstName());
            user.setLastName(item.getSecondName());            
            user.setUsername(item.getUsername());            
            
            HashMap<String, String> attr = new HashMap<>();
            attr.put("third_name", item.getThirdName());
            attr.put("phone", item.getPhone());            
            attr.put("password", item.getPassword()); 

            user.setAttributes(attr);

            log.info("user = " + user);
            String resObj = keycloak.addUser(user);
            if ((resObj != null) && (resObj.equals("Bearer"))) {
                keycloak.Init();
                keycloak.addUser(user);
            }
            
            
        } catch (Exception e) {
        }

        res.setResultCode(0);
        res.setResultComment("Yes");
        return res;
    }

    /*private static String convertObjectToXml(user1 user) {
        try {
            JAXBContext context = JAXBContext.newInstance(user1.class);
            Marshaller marshaller = context.createMarshaller();
            // устанавливаем флаг для читабельного вывода XML в JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // маршаллинг объекта в строку
            marshaller.marshal(user, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }*/
}
