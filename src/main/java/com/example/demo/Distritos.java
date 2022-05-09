package com.example.demo;

public class Distritos {
    private String id;
    private String nome;
    
    @Override
    public String toString() {
        return "Distritos [id=" + id + ", nome=" + nome + "]";
    }

    public Distritos(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
