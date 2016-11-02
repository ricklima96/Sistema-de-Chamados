/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Empresa;
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
public class ControleEmpresasTest {
   
    @Test
    public void testRetorna() {
        System.out.println("retorna");
        long nmr = 0L;
        String nome = "TEST NAME";
        ControleEmpresas instance = new ControleEmpresas();
        Empresa expResult = new Empresa(nmr, nome);
        Empresa result = instance.retorna(nmr, nome);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

 
    @Test
    public void testValidar() {
        System.out.println("validar");
        long contrato = 0L;
        String nome = "TEST NAME";
        ControleEmpresas instance = new ControleEmpresas();
        int expResult = 0;
        int result = instance.validar(contrato, nome);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    
    }
    
}
