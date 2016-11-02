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
public class TecnicoTest {
    
    @Test
    public void testToString() {
        System.out.println("to String");
        Tecnico instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }
    
}
