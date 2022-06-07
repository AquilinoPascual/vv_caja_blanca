package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class mayorLongitudTest {
    private final Editor editor = new Editor();

    @DisplayName("Texto vacío") //Otra vez los metacaracteres
    @Test
    public void emptyText(){
        editor.leerFichero("vacio.txt");
        try {
            assertNull(editor.mayorLongitud());
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }

    @DisplayName("Caso 1")
    @Test
    public void case1(){
        editor.leerFichero("caso1mayorLongitud.txt");
        try {
            assertEquals("hola",editor.mayorLongitud());
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }
    @DisplayName("Caso 2")
    @Test
    public void case2(){
        editor.leerFichero("caso2mayorLongitud.txt");
        try {
            assertEquals("hola",editor.mayorLongitud());
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }
    @DisplayName("Caso 3")
    @Test
    public void case3(){
        editor.leerFichero("caso3mayorLongitud.txt");
        try {
            assertEquals("adios",editor.mayorLongitud());
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }
    @DisplayName("Caso 4")
    @Test
    public void case4(){
        editor.leerFichero("caso4mayorLongitud.txt");
        try {
            assertEquals("adios",editor.mayorLongitud());
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }

}
