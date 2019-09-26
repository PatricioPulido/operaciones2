/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Dell
 */
public class TestSumar {
    
     @Test
    public void testSumar() {
        System.out.println("Sumar");
        Calculadora instance = new Calculadora(8,2);
       
        assertTrue(instance.Sumar()==10);//como lo hace el Profe.
        
    }
}
