/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Tecnico;
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
public class ControleTecnicosTest {
    
    
    @Test
    public void testCadastrarTecnico() {
        System.out.println("cadastrarTecnico");
        ControleTecnicos instance = new ControleTecnicos();
        instance.cadastrarTecnico();
        fail("Este teste é um protótipo");
    }

    @Test
    public void testFecharTelaTecnico() {
        System.out.println("fecharTelaTecnico");
        ControleTecnicos instance = new ControleTecnicos();
        instance.fecharTelaTecnico();
        fail("Este teste é um protótipo");
    }
    
}
