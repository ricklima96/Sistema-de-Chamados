/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.ClienteEmpresa;
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
public class ClienteDAOTest {
    
    public ClienteDAOTest() {
    }
    
    @Test
    public void testValidarCPF() {
        System.out.println("Validação de CPF");
        long cpf = 0L;
        ClienteDAO instance = new ClienteDAO();
        boolean expResult = false;
        boolean result = instance.validarCPF(cpf);
        assertEquals(expResult, result);
        fail("Este teste é um protótipo");
    }

   
    @Test
    public void testGerarCodigo() {
        System.out.println("Gerar código");
        ClienteDAO instance = new ClienteDAO();
        int expResult = 0;
        int result = instance.gerarCodigo();
        assertEquals(expResult, result);
        fail("Este teste é um protótipo");
    }

  
    @Test
    public void testGet() {
        System.out.println("TESTE GET");
        Long codigoCliente = null;
        ClienteDAO instance = new ClienteDAO();
        ClienteEmpresa expResult = null;
        ClienteEmpresa result = instance.get(codigoCliente);
        assertEquals(expResult, result);
        fail("Este teste é um protótipo");
    }

   
}
