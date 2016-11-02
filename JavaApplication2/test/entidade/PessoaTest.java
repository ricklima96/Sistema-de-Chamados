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
public class PessoaTest {
    Pessoa instance = new Pessoa("Victor", 29588764);
    
    public PessoaTest(){
        
    }
    
    @Test
    public void testGetNome() {
        System.out.println("get Nome");
        String expResult = "Victor";
        String result = instance.getNome();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetNome() {
        System.out.println("set Nome");
        String nome = "Victor";
        instance.setNome(nome);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetTelefone() {
        System.out.println("get Telefone");
        long expResult = 29588764;
        long result = instance.getTelefone();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetTelefone() {
        System.out.println("set Telefone");
        long telefone = 29588764;
        instance.setTelefone(telefone);
        fail("O caso de teste é um protótipo..");
    }
    
}
