package br.com.franciscochaves.buscacep.model;

public class CEP {

    private String cidade;
    private String bairro;
    private String estado;
    private String cep;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "CEP: " + getCep()
                + "\nBairro: " + getBairro()
                + "\nCidade:" + getCidade()
                + "\nEstado: " + getEstado();
    }
}
