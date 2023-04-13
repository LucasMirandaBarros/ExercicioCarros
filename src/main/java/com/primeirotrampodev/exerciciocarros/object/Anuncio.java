package com.primeirotrampodev.exerciciocarros.object;

public class Anuncio {

    private Usuario usuario;
    private Carro carro;
    private PlanoDePagemento planoDePagemento;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public PlanoDePagemento getPlanoDePagemento() {
        return planoDePagemento;
    }

    public void setPlanoDePagemento(PlanoDePagemento planoDePagemento) {
        this.planoDePagemento = planoDePagemento;
    }
}
