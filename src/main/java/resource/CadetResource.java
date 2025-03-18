package resource;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import model.Cadet;

@Path("/cadets")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CadetResource {

    @GET
    public List<Cadet> getAll() {
        return Cadet.listAll();
    }

    @POST
    public void create(Cadet cadet) {
        cadet.persist();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        Cadet.deleteById(id);
    }
}
