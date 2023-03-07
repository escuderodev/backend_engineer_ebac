package br.com.escuderodev.generics.models;

public class ICarro {

    private String marca;
    private String modelo;
    private int anoModelo;

    //    getters and setters
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    };

    public String getModelo() {
        return this.modelo;
    };

    public void setModelo(String modelo) {
        this.modelo = modelo;
    };

    public int getAnoModelo() {
        return this.anoModelo;
    };

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    };

}
