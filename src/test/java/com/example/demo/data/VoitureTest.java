package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        assertEquals(1,1);
    }

    @Test
    void marque(){
       Voiture voiture = new Voiture("BMW",10);
        assertEquals("BMW",voiture.getMarque());
    }

    @Test
    void Testprix(){
       Voiture voiture = new Voiture("BMW",10);
        assertEquals(10,voiture.getPrix());
    }
    @Test
    void TestId(){
       Voiture voiture = new Voiture("BMW",10);
        voiture.setId(1);
        assertEquals(voiture.getId(), 1);
    }
    @Test
    void TestSetPrix(){
       Voiture voiture = new Voiture("BMW",10);
        voiture.setPrix(25);
        assertEquals(25,voiture.getPrix());
    }
}
