
package com.mycompany.testtartamudar;

/**
 *
 * @author Rafa
 */
public class Tartamudar {
    public String stutter(String palabra) {
        return palabra.substring(0, 2)+"... " + palabra.substring(0, 2)+"... " + palabra +"?";
    }
}