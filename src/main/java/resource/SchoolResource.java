package resource;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import model.School;

@Path("/schools")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SchoolResource {

    @GET
    public List<School> getAll() {
        return School.listAll();
    }

    @POST
    public void create(School school) {
        school.persist();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        School.deleteById(id);
    }
}
