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
public class TipoProblemaTest {
    
    @Test
    public void testValues() {
        System.out.println("values");
        TipoProblema[] expResult = "";
        TipoProblema[] result = TipoProblema.values();
        assertArrayEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String nome = "";
        TipoProblema expResult = "";
        TipoProblema result = TipoProblema.valueOf(nome);
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }
    
}
