/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author victor mattoso
 */
public class EmpresaTest {

    @Test
    public void testGetNumeroContrato() {
        System.out.println("get Numero do Contrato");
        Empresa instance = null;
        long expResult = 0L;
        long result = instance.getNumeroContrato();
        assertEquals(expResult, result);
        fail();
    }

    @Test
    public void testSetNumeroContrato() {
        System.out.println("set Numero do Contrato");
        long numeroContrato = 0L;
        Empresa instance = null;
        instance.setNumeroContrato(numeroContrato);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetNomeEmpresa() {
        System.out.println("get Nome da Empresa");
        Empresa instance = null;
        String expResult = "";
        String result = instance.getNomeEmpresa();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetNomeEmpresa() {
        System.out.println("set Nome da Empresa");
        String nomeEmpresa = "";
        Empresa instance = null;
        instance.setNomeEmpresa(nomeEmpresa);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testToString() {
        System.out.println("to String");
        Empresa instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }
    
}
