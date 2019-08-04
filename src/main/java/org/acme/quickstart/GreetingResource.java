package org.acme.quickstart;

import org.acme.quickstart.dto.GiftDto;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/santa-clause")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {

    @Inject
    SantaClausService santaClausService;

    @GET
    public List<Gift> getAllGifts() {
        return santaClausService.getAllGifts();
    }

    @POST
    public Response createGift(GiftDto gift){
        santaClausService.createGift(gift);
        return Response.ok().build();
    }
}