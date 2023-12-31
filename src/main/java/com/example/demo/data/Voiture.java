package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voiture {

    int id;

    String marque;

    int prix;

    public Voiture(){
        this.id = 0;
        this.marque = "";
        this.prix = 0;
    }

    public Voiture(int id, String marque, int prix) {
        this.id = id;
        this.marque = marque;
        this.prix = prix;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String toString(){
        return  "Id : " + this.id + "\n" +
                "Marque : " + this.marque + "\n" +
                "Prix : " + this.prix;
    }

}
