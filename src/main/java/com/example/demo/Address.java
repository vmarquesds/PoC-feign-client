package com.example.demo;


public class Address {

    private String bairro;
    private String cidade;
    private String logradouro;
    private String estado;
    
    public Address(String bairro, String cidade, String logradouro, String estado) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "User [bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", logradouro=" + logradouro
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
        result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Address other = (Address) obj;
        if (bairro == null) {
            if (other.bairro != null)
                return false;
        } else if (!bairro.equals(other.bairro))
            return false;
        if (cidade == null) {
            if (other.cidade != null)
                return false;
        } else if (!cidade.equals(other.cidade))
            return false;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        if (logradouro == null) {
            if (other.logradouro != null)
                return false;
        } else if (!logradouro.equals(other.logradouro))
            return false;
        return true;
    }

    // private String id;
    // private String nome;
    // private String municipio;

    // public String getId() {
    //     return id;
    // }
    // public void setId(String id) {
    //     this.id = id;
    // }
    // public String getNome() {
    //     return nome;
    // }
    // public void setNome(String nome) {
    //     this.nome = nome;
    // }
    // public String getMunicipio() {
    //     return municipio;
    // }
    // public void setMunicipio(String municipio) {
    //     this.municipio = municipio;
    // }

}