package com.kraemer;

import java.util.List;
import java.util.ArrayList;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("api/v1/get-users")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {
        User user1 = new User("nome1", "email1@gmail.com");
        User user2 = new User("nome2", "email2@gmail.com");
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        return Response.ok(users).build();
    }
}
