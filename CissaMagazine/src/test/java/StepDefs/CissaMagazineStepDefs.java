package StepDefs;

import actions.CissaMagazineActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import utils.InstanciarWebDriver;

public class CissaMagazineStepDefs {
	
	CissaMagazineActions acao;
	
	public CissaMagazineStepDefs(){
		InstanciarWebDriver.getDriver();
		acao = new CissaMagazineActions(InstanciarWebDriver.getDriver());
	}
	
	@Given("Abro o navegador")
	public void abro_o_navegador() {
		InstanciarWebDriver.getDriver();
		 acao = new CissaMagazineActions(InstanciarWebDriver.getDriver());
	}

	@And("Acesso site {string}")
	public void acesso_site(String url) {
		InstanciarWebDriver.getDriver().get(url);
	}

	@And("Pesquisar pelo site do teste")
	public void preencher_campo() {
		acao.PesquisarCissaGoogle();
		acao.BotaoPesquisarGoogle();

	}

	@And("Entra no site")
	public void entrar_site() {
		acao.ItemGoogleEntrar();

	}

	@Given("Inicia o cadastro do cliente")
	public void Cadrastro_Cliente() throws InterruptedException {
		acao.CadrastroCliente();
		acao.emailCadastro();
		acao.AceitarCokkie();
		Thread.sleep(3000);
		acao.BotaoCadastroCliente();
		acao.pFisica();

	}


	@And("Preenche os campos")
	public void carrinho_com_item() throws InterruptedException {
		acao.clineteemail();
		acao.NomeCompleto();
		acao.selecaoSexo();
		acao.CpfCliente1();
		acao.Dianasc();
		Thread.sleep(3000);
		acao.Mesnasc();
		Thread.sleep(3000);
		acao.Anonasc();
		acao.TelefoneCliente();
		acao.CelularCliente();
		acao.senha1();
		acao.senha2();

	}

	@Then("Volta para tela inicial")
	public void tela_inicial() {
		acao.InicioPagina();
	}


	@And("Pesquisar e selecionar um item")
	public void Pesquisa_item() {
		acao.CampoPesquisa();
		acao.pesquisabtn();
		acao.clickItemCompra();
	}

	@And("Verifica valor do frete")
	public void informar_cep() {
		acao.informarCep();
	}

	@When("Confirma a comprar")
	public void btn_pagamento() throws Exception {
		Thread.sleep(3000);
		acao.botaoCompra();
		acao.botaoAumentar();
		Thread.sleep(3000);
		acao.botaoDiminuir();
		Thread.sleep(3000);
		acao.botaoPagamento();
	}

	@And("Faz login informando o Login e Senha")
	public void login_senha() {
		acao.fazerLogin();
		acao.senhaLogin();
		acao.loginCompra();
	}


}