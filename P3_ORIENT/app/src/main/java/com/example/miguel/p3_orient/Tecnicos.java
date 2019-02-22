package com.example.miguel.p3_orient;

public class Tecnicos {

    private String nom, ape, sexo, org, email;
    private int edad;

    public Tecnicos(String nom, String ape, String sexo, String org, String email, int edad) {
        this.nom = nom;
        this.ape = ape;
        this.sexo = sexo;
        this.org = org;
        this.email = email;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
