/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.testpalabras.Palabras;
import com.mycompany.testpalabras.TestPalabras;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rafa
 */
public class Test2 {
    Palabras word = new Palabras();
    
    @Test
    public void testWord1() {
        assertEquals(7, word.countWords("Programar es analizar y comprender el problema"));
    }
    
    @Test
    public void testWord2() {
        assertEquals(3 , word.countWords("Loro sono razzage"));
    }
    
    @Test
    public void testWord3() {
        assertEquals(3, word.countWords("On the floor"));
    }
}