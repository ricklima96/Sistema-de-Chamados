/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class ControladorPrincipalTest {
    
    public ControladorPrincipalTest() {
    }

   
    @Test
    public void testStart() {
        System.out.println("start");
        ControladorPrincipal instance = new ControladorPrincipal();
        instance.start();
        fail("Este teste é um protótipo");
    }

   
    @Test
    public void testGetCtrEmpresa() {
        System.out.println("getCtrEmpresa");
        ControladorPrincipal instance = new ControladorPrincipal();
        ControleEmpresas expResult = null;
        ControleEmpresas result = instance.getCtrEmpresa();
        assertEquals(expResult, result);
        fail("Este teste é um protótipo");
    }

  
    
}
