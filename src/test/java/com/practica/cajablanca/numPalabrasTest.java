package com.practica.cajablanca;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class numPalabrasTest {

    private static final Editor editor = new Editor();

    @DisplayName("Test throws IllegalArgumentException_1") // 1-2-3-1
    @Test
    public void testThrowsIllegalArgumentException_1() {
        editor.leerFichero("validación.txt");
       assertThrows(IllegalArgumentException.class,() -> editor.numPalabras(0,2,"verificación")) ;
    }

    @DisplayName("Test throws IllegalArgumentException_2") // 1-2-4-5-1
    @Test
    public void testThrowsIllegalArgumentException_2() {
        editor.leerFichero("validación.txt");
        assertThrows(IllegalArgumentException.class,() -> editor.numPalabras(1,15,"verificación")) ;
    }

    @DisplayName("!(this.editor.size() > 0)") // 1-2-4-6-7-17
    @Test
    public void testFinishWhenEditorSizeIsEquals0() {
        editor.leerFichero("vacio.txt");
        assertEquals(0,editor.numPalabras(1,1,"verificación"));
    }

    @DisplayName("Count words until end") // 1-2-4-6-7-8-9-10-11-12-13-14-15-11-16-8-17
    @Test
    public void testCountUntilEnd() {
        editor.leerFichero("validación.txt");
        assertEquals(2,editor.numPalabras(1,11,"hola"));
    }


    @DisplayName("Count words until end without any equal word") // 1-2-4-6-7-8-9-10-11-12-13-15-11-16-8-17
    @Test
    public void testCountUntilEndWithoutEqualWord() {
        editor.leerFichero("validación.txt");
        assertEquals(0,editor.numPalabras(1,11,"pepito"));
    }

}
