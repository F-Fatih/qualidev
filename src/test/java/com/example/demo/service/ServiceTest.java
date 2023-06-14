package com.example.demo.service;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.data.Voiture;

@SpringBootTest
public class ServiceTest {

    @MockBean
    Statistique statistique;

    @Test
    void statistiqueSansVoiture(){
        when(statistique.prixMoyen()).thenReturn(new Echantillon(0, 0));
    }

    @Test
    void statistiqueUneVoiture(){
        doNothing().when(statistique).ajouter(new Voiture(0, "Merco", 25000));
        when(statistique.prixMoyen()).thenReturn(new Echantillon(1, 5000));
    }

    @Test
    void statistiqueDeuxVoiture(){
        doNothing().when(statistique).ajouter(new Voiture(0, "clio", 500));
        doNothing().when(statistique).ajouter(new Voiture(1, "Porsche", 3000));
        when(statistique.prixMoyen()).thenReturn(new Echantillon(2, 2000));
    }

    @Test
    void statistiqueZeroVoitureAvecSoustraction(){
        when(statistique.prixMoyen()).thenReturn(new Echantillon(1-1, 1-1));
    }

    @Test
    void statistiqueVoitureAvecMemeID(){
        doNothing().when(statistique).ajouter(new Voiture(0, "clio", 500));
        doNothing().when(statistique).ajouter(new Voiture(0, "Porsche", 3000));
        when(statistique.prixMoyen()).thenReturn(new Echantillon(2, 2000));
    }



}