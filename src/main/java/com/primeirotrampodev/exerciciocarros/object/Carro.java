package com.primeirotrampodev.exerciciocarros.object;

import java.util.List;

public class Carro {

    private Integer id;
    private String nome;
    private String marca;
    private String anoModelo;
    private String cor;
    private Cambio cambio;
    private List<Opcional> opcionalList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Cambio getCambio() {
        return cambio;
    }

    public void setCambio(Cambio cambio) {
        this.cambio = cambio;
    }

    public List<Opcional> getOpcionalList() {
        return opcionalList;
    }

    public void setOpcionalList(List<Opcional> opcionalList) {
        this.opcionalList = opcionalList;
    }
}
