/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Tecnico;
import java.util.HashMap;
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
public class TecnicoDAOTest {
    
    public TecnicoDAOTest() {
    }
   
    @Test
    public void testPut() {
        System.out.println("Teste guardar");
        Tecnico tecnico = new Tecnico();
        TecnicoDAO instance = new TecnicoDAO();
        instance.put(tecnico);
        fail("Este teste é um protótipo");
    }

    @Test
    public void testGet() {
        System.out.println("Teste obter");
        Integer codigo = 12;
        TecnicoDAO instance = new TecnicoDAO();
        Tecnico expResult = 12;
        Tecnico result = instance.get(codigo);
        assertEquals(expResult, result);
        fail("Este teste é um protótipo");
    }

    @Test
    public void testPersit() {
        System.out.println("Teste persistencia");
        TecnicoDAO instance = new TecnicoDAO();
        instance.persit();
        fail("Este teste é um protótipo");
    }
    
}
