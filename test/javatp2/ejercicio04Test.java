/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatp2;

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
public class ejercicio04Test {
    
    public ejercicio04Test() {
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
     * Test of main method, of class ejercicio04.
     */
    //@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ejercicio04.main(args);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toStringCantidadBilletes method, of class ejercicio04.
     */
    @Test
    public void testToStringCantidadBilletes() {
        System.out.println("toStringCantidadBilletes");
        float money = 1531.55F;
        String expResult = "{c200=7,c100=1,c50=0,c20=1,c10=1,c5=0,c2=0,c1=1,c05=1,c025=0,c01=0,c005=1}";
        String result = ejercicio04.toStringCantidadBilletes(money);
        assertEquals("Nt_1",expResult, result);
        
        money = 1405.15F;
        result = ejercicio04.toStringCantidadBilletes(money);
        expResult = "{c200=7,c100=0,c50=0,c20=0,c10=0,c5=1,c2=0,c1=0,c05=0,c025=0,c01=1,c005=1}";
        assertEquals("Nt_2",expResult, result);
        
    }
    
}
