package dev.ifrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.ifrs.pessoas.Admin;
import dev.ifrs.pessoas.Usuario;

@Path("/api")
public class Service {
    
    @GET
    @Path("usuario/{username}/{email}/{password}")
    @Produces(MediaType.TEXT_PLAIN)
    public Usuario create(@PathParam("username") String username, @PathParam("email") String email, @PathParam("password") String password) {

        Usuario usuario = new Usuario(username, email, password);
        System.out.println(usuario.getEmail());
        return usuario;
        
    }

    @POST
    @Path("admin")
    @Consumes("application/x-www-form-urlencoded")
    public Admin create2(@FormParam("username") String username, @FormParam("email") String email, @FormParam("password") String password) {
        Admin admin = new Admin(username, email, password);
        System.out.println(admin.getEmail());
        return admin;
    }
    

}
