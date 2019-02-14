package com.example.miguel.eva1_12_listas_personalizadas;

public class Clima {
    private int imagen_clima;
    private String ciudad, clima, desc_clima;
    private double temp;

    public Clima(int imagen_clima, String ciudad, String clima, String desc_clima, double temp) {
        this.imagen_clima = imagen_clima;
        this.ciudad = ciudad;
        this.clima = clima;
        this.desc_clima = desc_clima;
        this.temp = temp;
    }
}
