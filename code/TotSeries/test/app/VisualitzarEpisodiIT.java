/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import app.VisualitzarEpisodi;
import app.VisualitzarEpisodi;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sergiplanes
 */
public class VisualitzarEpisodiIT {
    
    public VisualitzarEpisodiIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of validateEpisodi method, of class VisualitzarEpisodi.
     */
    @Test
    public void testValidateEpisodi() {
        System.out.println("validateEpisodi");
        ArrayList<String> serie = new  ArrayList<>();
        VisualitzarEpisodi instance = new VisualitzarEpisodi();
        boolean expResult = true;
        boolean result = instance.validateEpisodi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
