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
public class TipoConexaoTest {
    
    @Test
    public void testValues() {
        System.out.println("values");
        TipoConexao[] expResult = "";
        TipoConexao[] result = TipoConexao.values();
        assertArrayEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testValueOf() {
        System.out.println("value Of");
        String nome = "";
        TipoConexao expResult = "";
        TipoConexao result = TipoConexao.valueOf(nome);
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }
    
}
