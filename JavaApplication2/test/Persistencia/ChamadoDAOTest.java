/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Chamado;
import entidade.RegistroChamado;
import java.util.Collection;
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
public class ChamadoDAOTest {
    
    public ChamadoDAOTest() {
    }
    

    @Test
    public void testGerarCodigoRegistroChamado() {
        System.out.println("Gerando código de registro de chamada");
        ChamadoDAO instance = new ChamadoDAO();
        int expResult = 0;
        int result = instance.gerarCodigoRegistroChamado();
        assertEquals(expResult, result);
        fail("Este teste é um protótipo");
    }

    @Test
    public void testPut() {
        System.out.println("Teste de put");
        Chamado chamado = new Chamado();;
        ChamadoDAO instance = new ChamadoDAO();
        instance.put(chamado);
        fail("Este teste é um protótipo");
    }

   
}
