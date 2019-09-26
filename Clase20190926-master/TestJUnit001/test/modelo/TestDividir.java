package modelo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestDividir {

    public TestDividir() {
    }
    
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        Calculadora instance = new Calculadora(8,2);
        assertTrue(instance.Dividir()==4);
    }
    
}
