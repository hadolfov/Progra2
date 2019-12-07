/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jherom Chacon
 */
public class BaseDatosIT {
    
    public BaseDatosIT() {
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
     * Test of setDato method, of class BaseDatos.
     */
    @Test
    public void testSetDato() {
        System.out.println("setDato");
        Object dato = null;
        BaseDatos instance = new BaseDatos();
        instance.setDato(dato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDato method, of class BaseDatos.
     */
    @Test
    public void testGetDato() {
        System.out.println("getDato");
        BaseDatos instance = new BaseDatos();
        Object expResult = null;
        Object result = instance.getDato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class BaseDatos.
     */
    @Test
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        BaseDatos instance = new BaseDatos();
        instance.salvar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class BaseDatos.
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        BaseDatos instance = new BaseDatos();
        instance.eliminar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultar method, of class BaseDatos.
     */
    @Test
    public void testConsultar() throws Exception {
        System.out.println("consultar");
        int id = 0;
        BaseDatos instance = new BaseDatos();
        instance.consultar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
