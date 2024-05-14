package com.example.restful;

import jakarta.ws.rs.*;
import com.example.restful.Book;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.HashMap;
import java.util.Map;

@Path("/hello-world")
public class HelloResource {

    private static Map<Integer, Book> books = new HashMap<>();

//    static{
//        books.put(1,new Book("Java","John Doe",1));
//        books.put(2,new Book("Python","Jane Smith",2));
//    }
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateBook(@PathParam("id") int id){

        return Response.status(200).entity("SUCCESS").build();
    }

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}