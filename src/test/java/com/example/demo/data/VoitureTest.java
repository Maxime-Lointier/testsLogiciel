package com.example.demo.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {
    private Voiture voiture;

    @Test
    void creerVoiture(){
        assertEquals(1,1);
    }

    @BeforeEach
    void setUp() {
         voiture = new Voiture("bmw", 10);
    }
    @Test
    void  testMarque() {
        assertEquals(voiture.getMarque(),"bmw", "la marque devrati etre bmw, erreur dans test");
    }
    @Test
    void testPrix(){
        assertEquals(voiture.getPrix(),10,"devrait etre 10,erreur prix");
    }
    @Test
    void testSetId(){
        voiture.setId(19);
        assertEquals(voiture.getId(),19,"doit etre 19, test error");
    }
}
