/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.testzero.TestZero;
import com.mycompany.testzero.Zero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rafa
 */
public class Test1 {
    Zero z = new Zero();
    
    @Test
    public void testZero1() {
        assertEquals(true, z.lessThanOrEqualToZero(-2));
    }
    
    @Test
    public void testZero2() {
        assertEquals(false, z.lessThanOrEqualToZero(0));
    }
    
    @Test
    public void testZero3() {
        assertEquals(false, z.lessThanOrEqualToZero(2));
    }
}