package resource;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import model.Master;

@Path("/masters")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MasterResource {

    @GET
    public List<Master> getAll() {
        return Master.listAll();
    }

    @POST
    public void create(Master master) {
        master.persist();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        Master.deleteById(id);
    }
}

