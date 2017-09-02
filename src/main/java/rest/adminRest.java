/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

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
    @Produces(MediaType.TEXT_HTML)
    @RolesAllowed("admin-elk-user")

    public String getHello() {
        return "Hello!";
    }

    @POST
    @Path("/addUser")
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_XML)
    public String addUser(users item) {
        return "OK";
    }

}
