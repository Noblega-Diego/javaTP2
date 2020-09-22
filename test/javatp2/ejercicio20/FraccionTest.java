/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatp2.ejercicio20;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class FraccionTest {
    
    public FraccionTest() {
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
     * Test of sumarFracciones method, of class Fraccion.
     */
    //@Test
    public void testSumarFracciones() {
        System.out.println("sumarFracciones");
        Fraccion f1 = null;
        Fraccion f2 = null;
        Fraccion instance = null;
        Fraccion expResult = null;
        Fraccion result = instance.sumarFracciones(f1, f2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restarFracciones method, of class Fraccion.
     */
    //@Test
    public void testRestarFracciones() {
        System.out.println("restarFracciones");
        Fraccion f1 = null;
        Fraccion f2 = null;
        Fraccion instance = null;
        Fraccion expResult = null;
        Fraccion result = instance.restarFracciones(f1, f2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicarFracciones method, of class Fraccion.
     */
    //@Test
    public void testMultiplicarFracciones() {
        System.out.println("multiplicarFracciones");
        Fraccion f1 = null;
        Fraccion f2 = null;
        Fraccion instance = null;
        Fraccion expResult = null;
        Fraccion result = instance.multiplicarFracciones(f1, f2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividirFracciones method, of class Fraccion.
     */
    //@Test
    public void testDividirFracciones() {
        System.out.println("dividirFracciones");
        Fraccion f1 = null;
        Fraccion f2 = null;
        Fraccion instance = null;
        Fraccion expResult = null;
        Fraccion result = instance.dividirFracciones(f1, f2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MCD method, of class Fraccion.
     */
    @Test
    public void testMCD() {
        System.out.println("MCD");
        int num1 = -50;
        int num2 = 120;
        Fraccion instance = new Fraccion(10, 5);
        int expResult = 10;
        int result = instance.MCD(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Fraccion.
     */
    //@Test
    public void testToString() {
        System.out.println("toString");
        Fraccion instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
