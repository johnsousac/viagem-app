package io.github.reserva;

public class Reserva {
    
    private Long id;
    private Long idCliente;

    public Reserva() {
    }

    private Reserva(Long id, Long idCliente) {
        this.id = id;
        this.idCliente = idCliente;
    }

    public static Reserva of(Long id, Long idCliente) {
        return new Reserva(id, idCliente);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdCliente() {
        return this.idCliente;
    }

}
