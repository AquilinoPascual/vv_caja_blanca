package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class sustituirPalabrasTest {



    @DisplayName("Editor size <= 0") //1º   1-2-FIN 2º
    @Test
    public void doNothing(){
        Editor editor = new Editor();
        editor.leerFichero("vacio.txt");
        editor.sustituirPalabra("hola","adios");
        assertTrue(editor.editIsEmpty());
    }

    @DisplayName("Caso 1")//Sustituye palabras de la primera y unica linea
    @Test
    public void case1(){
        Editor editor = new Editor();
        editor.leerFichero("caso1y2SustituirPalabra.txt");
        editor.sustituirPalabra("hola","adios");
        try {
            assertEquals("adios",editor.getLinea(1).getAtPos(1));
            assertEquals("adios",editor.getLinea(1).getAtPos(2));

        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }
    @DisplayName("Caso 2")//No sustituye ninguna de la primera linea
    @Test
    public void case2(){
        Editor editor = new Editor();
        editor.leerFichero("caso1y2SustituirPalabra.txt");
        editor.sustituirPalabra("adios","hastaluego");
        try {
            assertEquals("hola",editor.getLinea(1).getAtPos(1));
            assertEquals("hola",editor.getLinea(1).getAtPos(2));

        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }
    @DisplayName("Caso 3") //Sustituye y no sustituye en la primera linea
    @Test
    public void case3(){
        Editor editor = new Editor();
        editor.leerFichero("caso3SustituirPalabra.txt");
        editor.sustituirPalabra("hola","adios");
        try {
            assertEquals("adios",editor.getLinea(1).getAtPos(1));
            assertEquals("adios",editor.getLinea(1).getAtPos(2));

        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }
    @DisplayName("Caso 4")//Sustiye palabras en la segunda línea
    @Test
    public void case4(){
        Editor editor = new Editor();
        editor.leerFichero("caso4y5SustituirPalabra.txt");
        editor.sustituirPalabra("hola","adios");
        try {
            assertEquals("adios",editor.getLinea(2).getAtPos(1));
            assertEquals("adios",editor.getLinea(2).getAtPos(2));

        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }
    @DisplayName("Caso 5")//No sustituye palabras en la segunda linea
    @Test
    public void case5(){
        Editor editor = new Editor();
        editor.leerFichero("caso4y5SustituirPalabra.txt");
        editor.sustituirPalabra("hastaluego","adios");
        try {
            assertEquals("hola",editor.getLinea(2).getAtPos(1));
            assertEquals("hola",editor.getLinea(2).getAtPos(2));

        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }
    @DisplayName("Caso 6")//Sustituye y no sustituye en la segunda linea
    @Test
    public void case6(){
        Editor editor = new Editor();
        editor.leerFichero("caso6SustituirPalabra.txt");
        editor.sustituirPalabra("hola","adios");
        try {
            assertEquals("adios",editor.getLinea(2).getAtPos(1));
            assertEquals("adios",editor.getLinea(2).getAtPos(2));

        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }
    @DisplayName("Caso 7")//Sustituye y no sustituye en la primea y seguna línea
    @Test
    public void case7(){
        Editor editor = new Editor();
        editor.leerFichero("caso7SustituirPalabra.txt");
        editor.sustituirPalabra("hola","adios");
        try {
            assertEquals("adios",editor.getLinea(1).getAtPos(1));
            assertEquals("adios",editor.getLinea(1).getAtPos(2));
            assertEquals("adios",editor.getLinea(2).getAtPos(1));
            assertEquals("adios",editor.getLinea(2).getAtPos(2));

        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }
    @DisplayName("Caso 8")//Sustituye en la primera y no sustituye en la segunda
    @Test
    public void case8(){
        Editor editor = new Editor();
        editor.leerFichero("caso8SustituirPalabra.txt");
        editor.sustituirPalabra("hola","adios");
        try {
            assertEquals("adios",editor.getLinea(1).getAtPos(1));
            assertEquals("adios",editor.getLinea(1).getAtPos(2));
            assertEquals("nadaquesustituir",editor.getLinea(2).getAtPos(1));
            assertEquals("nadaquesustituir",editor.getLinea(2).getAtPos(2));

        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }
    @DisplayName("Caso 9")//Sustituye en la primera y no sustituye en la segunda
    @Test
    public void case9(){
        Editor editor = new Editor();
        editor.leerFichero("caso8SustituirPalabra.txt");
        editor.sustituirPalabra("berenjena","patata");
        try {
            assertEquals("hola",editor.getLinea(1).getAtPos(1));
            assertEquals("adios",editor.getLinea(1).getAtPos(2));
            assertEquals("nadaquesustituir",editor.getLinea(2).getAtPos(1));
            assertEquals("nadaquesustituir",editor.getLinea(2).getAtPos(2));

        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }


}
