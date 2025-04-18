/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author María Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.simuladorautomovil.models.Lector
 * @version 1.0.0
 */
public interface Lector {
    /**
     * Lee el archivo
     * @param localizacionArchivo Es el archivo en el que se va a leer.
     * @return Retorna un ArrayList de String que contiene cada línea del archivo como un elemento de la lista.
     * @throws IOException Si el archivo no existe
     */
    public abstract ArrayList<String> leer(String localizacionArchivo)
                                                    throws IOException;
}
