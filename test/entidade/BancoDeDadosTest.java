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
public class BancoDeDadosTest {
    
    @Test
    public void testValues() {
        System.out.println("value");
        BancoDeDados[] expResult = null;
        BancoDeDados[] resultado = BancoDeDados.values();
        assertArrayEquals(expResult, resultado);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String nome = "";
        BancoDeDados expResult = null;
        BancoDeDados resultado = BancoDeDados.valueOf(nome);
        assertEquals(expResult, resultado);
        fail("O caso de teste é um protótipo.");
    }
    
}
