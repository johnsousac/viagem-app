package io.github.reserva;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Reserva extends PanacheEntity {

    // FetchType.LAZY irá carregar os dados de cliente
    // somente quando precisarmos consultar algum dado
    // do cliente, sendo assim ao realizar uma consulta
    // na reserva os dados do cliente não serão retornados
    // @ManyToOne(fetch = FetchType.LAZY)
    // public Cliente cliente;

    public Long idCliente;

}
