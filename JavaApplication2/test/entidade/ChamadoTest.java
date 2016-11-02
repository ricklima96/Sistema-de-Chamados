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
    Empresa Totvs = new Empresa();
    public ChamadoTest(){
    
}

    @Test
    public void testGetTecnico() {
        System.out.println("get Tecnico");
        Chamado instance = new Chamado();
        Tecnico expResult = instance.getTecnico();
        Tecnico result = instance.getTecnico();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetCodigo() {
        System.out.println("get Codigo");
        Chamado instance = new Chamado();
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetCodigo() {
        System.out.println("set Codigo");
        int codigo = 0;
        Chamado instance = new Chamado();
        instance.setCodigo(codigo);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetTecnico() {
        System.out.println("set Tecnico");
        Tecnico tecnico = new Tecnico("Robson", 29600927);
        Chamado instance = new Chamado();
        instance.setTecnico(tecnico);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetCliente() {
        System.out.println("get Cliente");
        Chamado instance = new Chamado();
        ClienteEmpresa expResult = instance.getCliente();
        ClienteEmpresa result = instance.getCliente();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetCliente() {
        System.out.println("set Cliente");
        ClienteEmpresa cliente = new ClienteEmpresa(10,Totvs,448744392-41,"Ricardo",29588736);
        Chamado instance = new Chamado();
        instance.setCliente(cliente);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetStatus() {
        System.out.println("get Status");
        Chamado instance = new Chamado();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetStatus() {
        System.out.println("set Status");
        String status = "";
        Chamado instance = new Chamado();
        instance.setStatus(status);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetTipoProblema() {
        System.out.println("get Tipo de Problema");
        Chamado instance = new Chamado();
        String expResult = "";
        String result = instance.getTipoProblema();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetTipoProblema() {
        System.out.println("set Tipo de Problema");
        String tipoProblema = "";
        Chamado instance = new Chamado();
        instance.setTipoProblema(tipoProblema);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetData() {
        System.out.println("get Data");
        Chamado instance = new Chamado();
        String expResult = "12/06/2016";
        String result = instance.getData();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetData() {
        System.out.println("set Data");
        String data = "12/06/2016";
        Chamado instance = new Chamado();
        instance.setData(data);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetHora() {
        System.out.println("get Hora");
        Chamado instance = new Chamado();
        String expResult = "";
        String result = instance.getHora();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetHora() {
        System.out.println("set Hora");
        String hora = "";
        Chamado instance = new Chamado();
        instance.setHora(hora);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetTitulo() {
        System.out.println("get Titulo");
        Chamado instance = new Chamado();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetTitulo() {
        System.out.println("set Titulo");
        String titulo = "";
        Chamado instance = new Chamado();
        instance.setTitulo(titulo);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetDescricao() {
        System.out.println("get Descricao");
        Chamado instance = new Chamado();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetDescricao() {
        System.out.println("set Descricao");
        String descricao = "";
        Chamado instance = new Chamado();
        instance.setDescricao(descricao);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetPrioridade() {
        System.out.println("get Prioridade");
        Chamado instance = new Chamado();
        int expResult = 0;
        int result = instance.getPrioridade();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetPrioridade() {
        System.out.println("set Prioridade");
        int prioridade = 0;
        Chamado instance = new Chamado();
        instance.setPrioridade(prioridade);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetSistemaOperacional() {
        System.out.println("get Sistema Operacional");
        Chamado instance = new Chamado();
        String expResult = "";
        String result = instance.getSistemaOperacional();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetSistemaOperacional() {
        System.out.println("set Sistema Operacional");
        String sistemaOperacional = "";
        Chamado instance = new Chamado();
        instance.setSistemaOperacional(sistemaOperacional);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetVersaoSO() {
        System.out.println("get Versao SO");
        Chamado instance = new Chamado();
        String expResult = "";
        String result = instance.getVersaoSO();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetVersaoSO() {
        System.out.println("set Versao SO");
        String versaoSO = "";
        Chamado instance = new Chamado();
        instance.setVersaoSO(versaoSO);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetBancoDeDados() {
        System.out.println("get Banco De Dados");
        Chamado instance = new Chamado();
        String expResult = "";
        String result = instance.getBancoDeDados();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetBancoDeDados() {
        System.out.println("set Banco De Dados");
        String bancoDeDados = "";
        Chamado instance = new Chamado();
        instance.setBancoDeDados(bancoDeDados);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetCausaProblema() {
        System.out.println("get Causa Problema");
        Chamado instance = new Chamado();
        String expResult = "";
        String result = instance.getCausaProblema();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetCausaProblema() {
        System.out.println("set Causa Problema");
        String causaProblema = "";
        Chamado instance = new Chamado();
        instance.setCausaProblema(causaProblema);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetSolucaoProblema() {
        System.out.println("get Solucao Problema");
        Chamado instance = new Chamado();
        String expResult = "";
        String result = instance.getSolucaoProblema();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetSolucaoProblema() {
        System.out.println("set Solucao Problema");
        String solucaoProblema = "";
        Chamado instance = new Chamado();
        instance.setSolucaoProblema(solucaoProblema);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetTipoConexao() {
        System.out.println("get Tipo de Conexao");
        Chamado instance = new Chamado();
        String expResult = "";
        String result = instance.getTipoConexao();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetTipoConexao() {
        System.out.println("set Tipo de Conexao");
        String tipoConexao = "";
        Chamado instance = new Chamado();
        instance.setTipoConexao(tipoConexao);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetEnderecoRede() {
        System.out.println("get Endereco de Rede");
        Chamado instance = new Chamado();
        String expResult = "";
        String result = instance.getEnderecoRede();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetEnderecoRede() {
        System.out.println("set Endereco de Rede");
        String enderecoRede = "";
        Chamado instance = new Chamado();
        instance.setEnderecoRede(enderecoRede);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetOperacao() {
        System.out.println("get Operação");
        Chamado instance = new Chamado();
        String expResult = "";
        String result = instance.getOperacao();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetOperacao() {
        System.out.println("set Operação");
        String operacao = "";
        Chamado instance = new Chamado();
        instance.setOperacao(operacao);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testGetDuracaoOperacao() {
        System.out.println("get Duracao da Operação");
        Chamado instance = new Chamado();
        double expResult = 0.0;
        double result = instance.getDuracaoOperacao();
        assertEquals(expResult, result, 0.0);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testSetDuracaoOperacao() {
        System.out.println("set Duracao da Operação");
        double duracaoOperacao = 0.0;
        Chamado instance = new Chamado();
        instance.setDuracaoOperacao(duracaoOperacao);
        fail("O caso de teste é um protótipo.");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object c = null;
        Chamado instance = new Chamado();
        boolean expResult = false;
        boolean result = instance.equals(c);
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo.");
    }
    
}
