package com.josetesan.poc.quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class S3Resource {

    @GET
    @Path("/{key}")
    public String download(@PathParam("key") String key) {
        return "GET "+key;
    }

    @PUT
    @Path("/{key}")
    public String upload(@PathParam("key") String key) {
        return "PUT "+key;
    }
}