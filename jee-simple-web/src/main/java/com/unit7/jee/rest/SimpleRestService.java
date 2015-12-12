package com.unit7.jee.rest;

import com.unit7.jee.ejb.SimpleRemote;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by breezzo on 13.12.15.
 */
@Path("simple")
public class SimpleRestService {

    @EJB
    private SimpleRemote simpleBean;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response simpleGet() {
        return Response.ok(simpleBean.help()).build();
    }
}
