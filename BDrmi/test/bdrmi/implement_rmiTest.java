/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bdrmi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sara Mousselmal
 */
public class implement_rmiTest {
    
    public implement_rmiTest() {
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
     * Test of Insert method, of class implement_rmi.
     */
    @org.junit.Test
    public void testInsert() throws Exception {
        System.out.println("Insert");
        int id = 0;
        String name = "";
        implement_rmi instance = new implement_rmi();
        String expResult = "";
        String result = instance.Insert(id, name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Delete method, of class implement_rmi.
     */
    @org.junit.Test
    public void testDelete() throws Exception {
        System.out.println("Delete");
        int id = 0;
        implement_rmi instance = new implement_rmi();
        String expResult = "";
        String result = instance.Delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
