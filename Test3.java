
import com.mycompany.testtaza.TestTaza;
import com.mycompany.testtaza.Taza;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rafa
 */
public class Test3 { 
    Taza cup = new Taza();
    
    @Test
    public void testCup1() {
        assertEquals(28 ,cup.totalCups(24));
    }
    
    @Test
    public void testCup2() {
        assertEquals(116 ,cup.totalCups(100));
    }
    
    @Test
    public void testCup3() {
        assertEquals(70 ,cup.totalCups(65));
    }
}