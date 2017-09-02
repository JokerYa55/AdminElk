/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import beans.resalt;
import beans.user1;
import beans.users;
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

    public user1 getHello() {
        user1 item = new user1();
        item.setDob("01012017");
        item.setPatronymic("Иванов");
        item.setName("user");
        item.setEmail("user@mail.ru");
        item.setPhone("44444");
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

    private static String convertObjectToXml(user1 user) {
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
    }
}
