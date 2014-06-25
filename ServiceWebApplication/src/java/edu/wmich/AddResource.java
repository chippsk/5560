/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wmich;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author malyshka
 */
@Path("add")
public class AddResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AddResource
     */
    public AddResource() {
    }

    /**
     * Retrieves representation of an instance of edu.wmich.AddResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path(value="/{a}/{b}")
    @Produces("application/json")
    public String getJSON(@PathParam(value="a") int a,@PathParam(value="b") int b) {
        //TODO return proper representation object
        int c = a + b;
        return "{\"result\":\""+c+"\"}";
    }

   
    /**
     * PUT method for updating or creating an instance of AddResource
     * @param content 
    /**representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
