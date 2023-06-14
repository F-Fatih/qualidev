package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        Voiture v1 = new Voiture(1, "Marcadas", 100000);
        Assert.isInstanceOf(Voiture.class, v1);

        Assert.hasLength(v1.getMarque(), "Marque ne doit pas etre vide");
        Assert.isTrue(v1.getId()>=1, "Id doit etre superieur a 1");
        Assert.isTrue(v1.getPrix()>=0, "Prix doit etre superieur a 0");
    }

    @Test
    void voitureNonNull(){
        Voiture v1 = new Voiture(1, "Marcadas", 100000);

        Assert.notNull(v1.getClass(), "Class ne doit pas etre null");
        Assert.notNull(v1.getMarque(), "Marque ne doit pas etre null");          
        Assert.notNull(v1.getId(), "Id ne doit pas etre null");        
        Assert.notNull(v1.getPrix(), "Prix ne doit pas etre null");
    }

}
