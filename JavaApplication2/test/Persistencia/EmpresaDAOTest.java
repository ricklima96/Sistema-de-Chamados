/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Empresa;
import java.util.Collection;
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
public class EmpresaDAOTest {
    
    public EmpresaDAOTest() {
    }
  
    @Test
    public void testGetEmpresas() {
        System.out.println("Teste obter empresas");
        EmpresaDAO instance = new EmpresaDAO();
        Collection<Empresa> expResult = getEmpresas();
        Collection<Empresa> result = instance.getEmpresas();
        assertEquals(expResult, result);
        fail("Este teste é um protótipo");
    }

    @Test
    public void testVoltaEmpresa() {
        System.out.println("hash map teste, voltar empresas");
        EmpresaDAO instance = new EmpresaDAO();
        HashMap<Long, Empresa> expResult = voltaEmpresa();
        HashMap<Long, Empresa> result = instance.voltaEmpresa();
        assertEquals(expResult, result);
        fail("Este teste é um protótipo");
    }
    
}
