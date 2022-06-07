package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class sustituirPalabrasTest {

    private static final Editor editor = new Editor();

    @DisplayName("Editor size <= 0") //1º   1-2-FIN 2º 1-2-3-4-5-6-7-8-9-15-16-17-18-FIN
    @Test
    public void doNothing(){
        editor.leerFichero("vacio.txt");
        editor.sustituirPalabra("hola","adios");
        assertTrue(editor.editIsEmpty());

    }

    @DisplayName("Una vuelta en el bucle con dos palabras coincidentes")// 4º-1-2-3-4-5-6-7-8-9--10-11-14-15-16-17-5-6-7-8-9-15-16-17-18-FIN
    @Test
    public void oneLapAndOneWord(){
        editor.leerFichero("caso4SustituirPalabra.txt");
        editor.sustituirPalabra("hola","adios");
        try {
            assertEquals("adios",editor.getLinea(1));

        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }


}
