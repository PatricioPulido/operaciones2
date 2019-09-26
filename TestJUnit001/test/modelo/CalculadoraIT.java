/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class CalculadoraIT {
    
    public CalculadoraIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        Calculadora instance = new Calculadora(8,2);
       
        assertTrue(instance.Sumar()==10);//como lo hace el Profe.
        
    }

    /**
     * Test of Restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("Restar");
        Calculadora instance = new Calculadora(8,9);
        int expResult = 0;
        int result = instance.Restar();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of Multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        Calculadora instance = new Calculadora(8,0);
        int expResult = 1;
        int result = instance.Multiplicar();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of Dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        Calculadora instance = new Calculadora(8,0);
        int expResult = 0;
        int result = instance.Dividir();
        assertEquals(expResult, result);
      
    }
    
}
