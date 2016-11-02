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
public class RegistroChamadoTest {
    
    public RegistroChamadoTest(){
        
    }
    
    @Test
    public void testGetCodigo() {
        System.out.println("get Codigo");
        RegistroChamado instance = null;
        Integer expResult = null;
        Integer result = instance.getCodigo();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetCodigo() {
        System.out.println("set Codigo");
        Integer codigo = null;
        RegistroChamado instance = null;
        instance.setCodigo(codigo);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetChamado() {
        System.out.println("set Chamado");
        Chamado chamado = null;
        RegistroChamado instance = null;
        instance.setChamado(chamado);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetChamado() {
        System.out.println("get Chamado");
        RegistroChamado instance = null;
        Chamado expResult = null;
        Chamado result = instance.getChamado();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetHora() {
        System.out.println("get Hora");
        RegistroChamado instance = null;
        String expResult = "";
        String result = instance.getHora();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetHora() {
        System.out.println("set Hora");
        String hora = "";
        RegistroChamado instance = null;
        instance.setHora(hora);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetData() {
        System.out.println("get Data");
        RegistroChamado instance = null;
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetData() {
        System.out.println("set Data");
        String data = "";
        RegistroChamado instance = null;
        instance.setData(data);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetAssunto() {
        System.out.println("get Assunto");
        RegistroChamado instance = null;
        String expResult = "";
        String result = instance.getAssunto();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetAssunto() {
        System.out.println("set Assunto");
        String assunto = "";
        RegistroChamado instance = null;
        instance.setAssunto(assunto);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetTecnico() {
        System.out.println("get Tecnico");
        RegistroChamado instance = null;
        Tecnico expResult = null;
        Tecnico result = instance.getTecnico();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetTecnico() {
        System.out.println("set Tecnico");
        Tecnico tecnico = null;
        RegistroChamado instance = null;
        instance.setTecnico(tecnico);
        fail("O caso de teste é um protótipo.");
    }
    
}
