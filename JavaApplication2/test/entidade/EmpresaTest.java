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

    Empresa instance = new Empresa(11885,"Totvs");
    
    public EmpresaTest(){
        
    }
    
    @Test
    public void testGetNumeroContrato() {
        System.out.println("get Numero do Contrato");
        long expResult = 11885;
        long result = instance.getNumeroContrato();
        assertEquals(expResult, result);
        fail();
    }

    @Test
    public void testSetNumeroContrato() {
        System.out.println("set Numero do Contrato");
        long numeroContrato = 11885;
        instance.setNumeroContrato(numeroContrato);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetNomeEmpresa() {
        System.out.println("get Nome da Empresa");

        String expResult = "Totvs";
        String result = instance.getNomeEmpresa();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetNomeEmpresa() {
        System.out.println("set Nome da Empresa");
        String nomeEmpresa = "Totvs";
        Empresa instance = new Empresa();
        instance.setNomeEmpresa(nomeEmpresa);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testToString() {
        System.out.println("to String");
        Empresa instance = new Empresa();
        String expResult = "Totvs";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }
    
}
