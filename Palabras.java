
package com.mycompany.testpalabras;

import java.util.StringTokenizer;

/**
 *
 * @author Rafa
 */
public class Palabras {
    public int countWords(String palabra) {
        StringTokenizer st = new StringTokenizer(palabra);
        return st.countTokens();
    }
}