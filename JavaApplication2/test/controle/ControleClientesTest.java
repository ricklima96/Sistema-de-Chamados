/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import Persistencia.ClienteDAO;
import entidade.ClienteEmpresa;
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
public class ControleClientesTest {
    
    public ControleClientesTest() {
    }
    
    @Test
    public void testGetClienteDAO() {
        System.out.println("getClienteDAO");
        ControleClientes instance = new ControleClientes();
        ClienteDAO expResult = null;
        ClienteDAO result = instance.getClienteDAO();
        assertEquals(expResult, result);
        fail("Este teste é um protótipo");
    }

    @Test
    public void testCadastrarCliente() {
        System.out.println("cadastrarCliente");
        ControleClientes instance = new ControleClientes();
        instance.cadastrarCliente();
        fail("Este teste é um protótipo");
    }

    @Test
    public void testIncluiNovoCliente() {
        System.out.println("incluiNovoCliente");
        Empresa empresa = null;
        long cpf = 0L;
        String nome = "CUSTOMER";
        long telefone = 0L;
        ControleClientes instance = new ControleClientes();
        ClienteEmpresa expResult = null;
        ClienteEmpresa result = instance.incluiNovoCliente(empresa, cpf, nome, telefone);
        assertEquals(expResult, result);
        fail("Este teste é um protótipo");
    }
    
}
