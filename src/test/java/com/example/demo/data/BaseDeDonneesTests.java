package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;

import static org.mockito.Mockito.when;

@SpringBootTest
public class BaseDeDonneesTests {

    @MockBean
    private VoitureRepository voitureRepository;

    @Test
    void uneVoiture(){
        // tester les méthodes de l'interface CrudRepository qui permette d'accéder à la base de données: https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
        // save, find, delete...

        Voiture voiture = new Voiture(1, "Merco", 13000);
 
        // save
        when(voitureRepository.save(voiture)).thenReturn(voiture);


        // find
        when(voitureRepository.findById(1)).thenReturn(java.util.Optional.of(voiture));


        // findAll
        when(voitureRepository.findAll()).thenReturn(Collections.singletonList(voiture));


        // update
        voiture.setPrix(12990);
        when(voitureRepository.save(voiture)).thenReturn(voiture);


        // delete
        voitureRepository.deleteById(1);
        when(voitureRepository.findById(1)).thenReturn(java.util.Optional.empty());

    }

    
    @Test
    void saveVoiture(){
        Voiture voiture = new Voiture(2, "Audi", 12000);
        when(voitureRepository.save(voiture)).thenReturn(voiture);
    }

    @Test
    void findVoiture(){
        Voiture voiture = new Voiture(3, "Volkswagen", 11000);
        when(voitureRepository.findById(3)).thenReturn(java.util.Optional.of(voiture));
    }

    @Test
    void findAllVoiture(){
        Voiture voiture = new Voiture(4, "Range Rover", 10000);
        when(voitureRepository.findAll()).thenReturn(Collections.singletonList(voiture));
    }

    @Test
    void updateVoiture(){
        Voiture voiture = new Voiture(5, "Peugeot", 9000);
        voiture.setPrix(8000);
        when(voitureRepository.save(voiture)).thenReturn(voiture);
    }

    @Test
    void deleteVoiture(){
        Voiture voiture = new Voiture(6, "Renault", 8000);
        voitureRepository.deleteById(6);
        when(voitureRepository.findById(6)).thenReturn(java.util.Optional.empty());
    }

}
