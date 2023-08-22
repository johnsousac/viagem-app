package io.github.reserva;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/reserva-cli")
public class ReservaResource {
    
    @Inject
    @RestClient
    ReservaService reservaService;

    @GET
    @Path("create")
    public String create() {
        Reserva reserva = Reserva.of(0L, 2L);
        return reservaService.create(reserva);
    }
    
}
