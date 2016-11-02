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
    
    @Test
    public void testGetCodigo() {
        System.out.println("get Codigo");
        ClienteEmpresa instance = null;
        Integer expResult = null;
        Integer result = instance.getCodigo();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetCodigo() {
        System.out.println("set Codigo");
        Integer codigo = null;
        ClienteEmpresa instance = null;
        instance.setCodigo(codigo);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetCpf() {
        System.out.println("get Cpf");
        ClienteEmpresa instance = null;
        long expResult = 0L;
        long result = instance.getCpf();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetCpf() {
        System.out.println("set Cpf");
        long cpf = 0L;
        ClienteEmpresa instance = null;
        instance.setCpf(cpf);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetEmpresa() {
        System.out.println("get Empresa");
        ClienteEmpresa instance = null;
        Empresa expResult = null;
        Empresa result = instance.getEmpresa();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testToString() {
        System.out.println("to String");
        ClienteEmpresa instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }
    
}
