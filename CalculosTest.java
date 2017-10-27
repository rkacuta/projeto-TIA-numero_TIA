/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDD;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31649033
 */
public class CalculosTest {
    
    public CalculosTest() {
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
     * Test of calc method, of class Calculos.
     */
    @Test
    public void testCalc() {
        /*System.out.println("calc");
        int[] digitos = null;
        int modo = 0;
        Calculos instance = new Calculos();
        float expResult = 0.0F;
        float result = instance.calc(digitos, modo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype."); */
        Calculos c = new Calculos();
        int[] digitos = new int[8];
        digitos[0]=3;
        digitos[1]=1;
        digitos[2]=6;
        digitos[3]=4;
        digitos[4]=9;
        digitos[5]=0;
        digitos[6]=3;
        digitos[7]=3;
        assertEquals(29, c.calc(digitos, 1), 0.0);
        assertEquals(3, c.calc(digitos, 2), 0.0);
        assertEquals(9, c.calc(digitos, 3), 0.0);
        assertEquals(0, c.calc(digitos, 4), 0.0);
        assertEquals(3, c.calc(digitos, 5), 0.0);
        assertEquals(3, c.calc(digitos, 6), 0.0);
        assertEquals(5, c.calc(digitos, 7), 0.0);
        assertEquals(0, c.calc(digitos, 8), 0.0);
        assertEquals(5832, c.calc(digitos, 9), 0.0);
        assertEquals(648, c.calc(digitos, 10), 0.0);
    }
    
}
