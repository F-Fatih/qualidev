package com.example.demo.service;

import com.example.demo.data.Voiture;

public interface StatistiqueImpl {

    public void ajouter(Voiture voiture);

    public Echantillon prixMoyen() throws ArithmeticException;

}