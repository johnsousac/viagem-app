package io.github.cliente;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/cliente-cli")
public class ClienteResource {
    
    @Inject
    @RestClient
    ClienteService clienteService;

    @GET
    @Path("findById")
    @Produces(MediaType.APPLICATION_JSON)
    public Cliente findById(@QueryParam("id") Long id) {
        return clienteService.findById(id);
    }

    @GET
    @Path("create")
    public String create() {
        Cliente cliente = Cliente.of(99L, "Lucas Moura");
        return clienteService.create(cliente);
    }
}
