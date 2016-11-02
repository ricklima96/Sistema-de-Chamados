/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.RegistroChamado;
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
public class ControleChamadosTest {
    
    public ControleChamadosTest() {
    }
    
    @Test
    public void testAlterarChamado_4args() {
        System.out.println("alterarChamado");
        Chamado chamado = null;
        String status = "teste";
        String causa = "causa válida";
        String solucao = "solução válida";
        ControleChamados instance = new ControleChamados();
        Chamado expResult = null;
        Chamado result = instance.alterarChamado(chamado, status, causa, solucao);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testInserirChamadoBancoDeDados() {
        System.out.println("InserirChamadoBancoDeDados");
        String titulo = "título X";
        String descricao = "desc";
        int prioridade = 0;
        Tecnico tecnico = null;
        ClienteEmpresa cliente = null;
        String so = "Windows";
        String versaoSO = "8";
        String bancoDeDados = "DB-1";
        ControleChamados instance = new ControleChamados();
        Chamado expResult = null;
        Chamado result = instance.InserirChamadoBancoDeDados(titulo, descricao, prioridade, tecnico, cliente, so, versaoSO, bancoDeDados);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testInserirChamadoDesempenho() {
        System.out.println("InserirChamadoDesempenho");
        String titulo = "Título X";
        String descricao = "desc";
        int prioridade = 0;
        Tecnico tecnico = null;
        ClienteEmpresa cliente = null;
        String so = "Widows";
        String versaoSO = "8";
        String operacao = "op";
        double tempo = 0.0;
        ControleChamados instance = new ControleChamados();
        Chamado expResult = null;
        Chamado result = instance.InserirChamadoDesempenho(titulo, descricao, prioridade, tecnico, cliente, so, versaoSO, operacao, tempo);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testInserirRegistroChamado() {
        System.out.println("inserirRegistroChamado");
        String assunto = "assunto";
        Chamado chamado = null;
        Tecnico tec = null;
        ControleChamados instance = new ControleChamados();
        RegistroChamado expResult = null;
        RegistroChamado result = instance.inserirRegistroChamado(assunto, chamado, tec);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
