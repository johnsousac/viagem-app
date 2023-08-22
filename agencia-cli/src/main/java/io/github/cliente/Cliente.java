package io.github.cliente;

public class Cliente {

    private Long id;
    private String nome;

    public Cliente() {
    }

    private Cliente(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public static Cliente of(Long id, String nome) {
        return new Cliente(id, nome);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

}
