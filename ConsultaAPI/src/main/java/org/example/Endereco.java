package org.example;

public class Endereco {
    String logradouro;
    String bairro;
    String localidade;

    String ibge;

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getIbge() {
        return ibge;
    }
    @Override
    public String toString() {
        //return "Endereco{" + "logradouro=" + logradouro + ", bairro=" + bairro + ", localidade=" + localidade + '}';
        return "Endereco{" + "logradouro=" + logradouro + ", bairro=" + bairro + ", localidade=" + localidade + ", ibge=" + ibge + '}';
    }
}
