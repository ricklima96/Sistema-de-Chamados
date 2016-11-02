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
public class ClienteEmpresaTest {
    
    Empresa Totvs = new Empresa();
    ClienteEmpresa instance = new ClienteEmpresa(10,Totvs,448744392-41,"Ricardo",29588736);
    
    public ClienteEmpresaTest(){

    }
    
    @Test
    public void testGetCodigo() {
        System.out.println("get Codigo");
        Empresa Totvs = new Empresa();
        Integer expResult = 10;
        Integer result = instance.getCodigo();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetCodigo() {
        System.out.println("set Codigo");
        Integer codigo = 10;
        instance.setCodigo(codigo);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetCpf() {
        System.out.println("get Cpf");
        long expResult = 448744392-41;
        long result = instance.getCpf();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetCpf() {
        System.out.println("set Cpf");
        long cpf = 448744392-41;
        instance.setCpf(cpf);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetEmpresa() {
        System.out.println("get Empresa");
        Empresa expResult = null;
        Empresa result = instance.getEmpresa();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testToString() {
        System.out.println("to String");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }
    
}
