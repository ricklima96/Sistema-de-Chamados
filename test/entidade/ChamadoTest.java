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
public class ChamadoTest {

    @Test
    public void testGetTecnico() {
        System.out.println("get Tecnico");
        Chamado instance = null;
        Tecnico expResult = null;
        Tecnico result = instance.getTecnico();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetCodigo() {
        System.out.println("get Codigo");
        Chamado instance = null;
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetCodigo() {
        System.out.println("set Codigo");
        int codigo = 0;
        Chamado instance = null;
        instance.setCodigo(codigo);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetTecnico() {
        System.out.println("set Tecnico");
        Tecnico tecnico = null;
        Chamado instance = null;
        instance.setTecnico(tecnico);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetCliente() {
        System.out.println("get Cliente");
        Chamado instance = null;
        ClienteEmpresa expResult = null;
        ClienteEmpresa result = instance.getCliente();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetCliente() {
        System.out.println("set Cliente");
        ClienteEmpresa cliente = null;
        Chamado instance = null;
        instance.setCliente(cliente);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetStatus() {
        System.out.println("get Status");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetStatus() {
        System.out.println("set Status");
        String status = "";
        Chamado instance = null;
        instance.setStatus(status);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetTipoProblema() {
        System.out.println("get Tipo de Problema");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getTipoProblema();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetTipoProblema() {
        System.out.println("set Tipo de Problema");
        String tipoProblema = "";
        Chamado instance = null;
        instance.setTipoProblema(tipoProblema);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetData() {
        System.out.println("get Data");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetData() {
        System.out.println("set Data");
        String data = "";
        Chamado instance = null;
        instance.setData(data);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetHora() {
        System.out.println("get Hora");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getHora();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetHora() {
        System.out.println("set Hora");
        String hora = "";
        Chamado instance = null;
        instance.setHora(hora);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetTitulo() {
        System.out.println("get Titulo");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetTitulo() {
        System.out.println("set Titulo");
        String titulo = "";
        Chamado instance = null;
        instance.setTitulo(titulo);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetDescricao() {
        System.out.println("get Descricao");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetDescricao() {
        System.out.println("set Descricao");
        String descricao = "";
        Chamado instance = null;
        instance.setDescricao(descricao);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetPrioridade() {
        System.out.println("get Prioridade");
        Chamado instance = null;
        int expResult = 0;
        int result = instance.getPrioridade();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetPrioridade() {
        System.out.println("set Prioridade");
        int prioridade = 0;
        Chamado instance = null;
        instance.setPrioridade(prioridade);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetSistemaOperacional() {
        System.out.println("get Sistema Operacional");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getSistemaOperacional();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetSistemaOperacional() {
        System.out.println("set Sistema Operacional");
        String sistemaOperacional = "";
        Chamado instance = null;
        instance.setSistemaOperacional(sistemaOperacional);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetVersaoSO() {
        System.out.println("get Versao SO");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getVersaoSO();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetVersaoSO() {
        System.out.println("set Versao SO");
        String versaoSO = "";
        Chamado instance = null;
        instance.setVersaoSO(versaoSO);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetBancoDeDados() {
        System.out.println("get Banco De Dados");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getBancoDeDados();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetBancoDeDados() {
        System.out.println("set Banco De Dados");
        String bancoDeDados = "";
        Chamado instance = null;
        instance.setBancoDeDados(bancoDeDados);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetCausaProblema() {
        System.out.println("get Causa Problema");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getCausaProblema();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetCausaProblema() {
        System.out.println("set Causa Problema");
        String causaProblema = "";
        Chamado instance = null;
        instance.setCausaProblema(causaProblema);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetSolucaoProblema() {
        System.out.println("get Solucao Problema");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getSolucaoProblema();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetSolucaoProblema() {
        System.out.println("set Solucao Problema");
        String solucaoProblema = "";
        Chamado instance = null;
        instance.setSolucaoProblema(solucaoProblema);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetTipoConexao() {
        System.out.println("get Tipo de Conexao");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getTipoConexao();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetTipoConexao() {
        System.out.println("set Tipo de Conexao");
        String tipoConexao = "";
        Chamado instance = null;
        instance.setTipoConexao(tipoConexao);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetEnderecoRede() {
        System.out.println("get Endereco de Rede");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getEnderecoRede();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetEnderecoRede() {
        System.out.println("set Endereco de Rede");
        String enderecoRede = "";
        Chamado instance = null;
        instance.setEnderecoRede(enderecoRede);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetOperacao() {
        System.out.println("get Operação");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getOperacao();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetOperacao() {
        System.out.println("set Operação");
        String operacao = "";
        Chamado instance = null;
        instance.setOperacao(operacao);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetDuracaoOperacao() {
        System.out.println("get Duracao da Operação");
        Chamado instance = null;
        double expResult = 0.0;
        double result = instance.getDuracaoOperacao();
        assertEquals(expResult, result, 0.0);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetDuracaoOperacao() {
        System.out.println("set Duracao da Operação");
        double duracaoOperacao = 0.0;
        Chamado instance = null;
        instance.setDuracaoOperacao(duracaoOperacao);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object c = null;
        Chamado instance = null;
        boolean expResult = false;
        boolean result = instance.equals(c);
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }
    
}
