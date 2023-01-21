package ulaval.glo2003;


import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("")
public class PingPongRessource {

    @POST

    public Response pong(){

        return Response.ok("Looool").build() ;
    }


}
