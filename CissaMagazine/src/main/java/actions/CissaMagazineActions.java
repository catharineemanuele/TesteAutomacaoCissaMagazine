package actions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.CissaMagazinePage;

public class CissaMagazineActions extends CissaMagazinePage {
	
WebDriverWait wait;
    
	//Entrar no chorme
	public CissaMagazineActions(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, 30);
	}

	//Campo de pesquisa no google
	public void  PesquisarCissaGoogle() {
		wait.until(ExpectedConditions.visibilityOf(campoPesquisaGoogle)).sendKeys("Cissa Magazine");
	}


	//Pesquisar o que foi digiado no google
	public void BotaoPesquisarGoogle() {
		wait.until(ExpectedConditions.visibilityOf(btnPesquisaGoogle)).click();
	}

	//Verificar se foi feita a pesquisa corretamente e se o site apareceu na lista de resultado da pesquisa
	public void ValidacaoGoogle(String validado) {
		assertTrue("Erro", ValidacaoPesquisaGoogle.getText().contains(validado));
	}

	//Selecionar o site da pesquisa do google
	public void ItemGoogleEntrar() {
		wait.until(ExpectedConditions.visibilityOf(ItemGoogle)).click();
	}


	//Fazer um exploratorio na parte de cadastro do cliente(botão que leva ao cadastro do cliente)
	public void CadrastroCliente() {
		wait.until(ExpectedConditions.visibilityOf(Cadastro)).click();
	}

	//Informar um email para fazer o cadastro
	public void  emailCadastro() {
		wait.until(ExpectedConditions.visibilityOf(emailCadastro)).sendKeys("teste@teste.com");
	}

	//Botão para entrar no cadastro do cliente
	public void BotaoCadastroCliente() {
		wait.until(ExpectedConditions.visibilityOf(btnpCadastro)).click();
	}

	public void AceitarCokkie() {
		wait.until(ExpectedConditions.visibilityOf(aceitarcokkie)).click();
	}

	//Validar o botão de Pessoa Fisica
	public void pFisica() {
		wait.until(ExpectedConditions.visibilityOf(psFisica)).click();
	}

	//Campo que só vem preselecionar com o email que vc colocou na pagina anterior
	public void clineteemail() {
		wait.until(ExpectedConditions.visibilityOf(email)).click();
	}

	//Campo para preenchimento do nome completo
	public void  NomeCompleto() {
		wait.until(ExpectedConditions.visibilityOf(nomecliente)).sendKeys("Teste Teste Teste Teste");
	}

	//Campo para informar o sexo
	public void selecaoSexo() {
		sexo.click();
		Select combo = new Select(sexo);
		combo.selectByVisibleText("Feminino");
	}

	//Campo para informar o CPF
	public void  CpfCliente1() {
		wait.until(ExpectedConditions.visibilityOf(cpf)).sendKeys("388.392.740-65");
	}

	//Campo para informar o dia de nascimento
	public void Dianasc() {
		diaNasc.click();
		Select combo = new Select(diaNasc);
		combo.selectByVisibleText("4");
	}

	//Campo para informar o mes de nascimento
	public void Mesnasc() {
		mesNasc.click();
		Select combo = new Select(mesNasc);
		combo.selectByVisibleText("Abr");
	}

	//Campo para informar o ano de nascimento
	public void Anonasc() {
		anoNasc.click();
		Select combo = new Select(anoNasc);
		combo.selectByVisibleText("1998");
	}

	//Campo para informar o telefone do cliente
	public void  TelefoneCliente() {
		wait.until(ExpectedConditions.visibilityOf(telefone)).sendKeys("99999999999");
	}

	//Campo para informar o celular do cliente
	public void  CelularCliente() {
		wait.until(ExpectedConditions.visibilityOf(celular)).sendKeys("99999999998");
	}

	//Campo para informar a senha para o cadastro
	public void  senha1() {
		wait.until(ExpectedConditions.visibilityOf(senha)).sendKeys("tequinha123456");
	}

	//Campo para informar a confirmação da senha
	public void  senha2() {
		wait.until(ExpectedConditions.visibilityOf(confirmacaoSenha)).sendKeys("tequinha123456");
	}

	//Pagina inicial para começar o outro teste exploratorio do site
	public void InicioPagina() {
		wait.until(ExpectedConditions.visibilityOf(paginaInicial)).click();
	}

	//Informar qual item para compra
	public void CampoPesquisa() {
		wait.until(ExpectedConditions.visibilityOf(campoPesquisaCissa)).sendKeys("Relogio");
	}

	//Botão pra pesquisa do item informado
	public void pesquisabtn() {
		wait.until(ExpectedConditions.visibilityOf(btnPesquisaCissa)).click();
	}

	//Selecionar um item para compra
	public void clickItemCompra() {
		wait.until(ExpectedConditions.visibilityOf(itemparaComprar)).click();
	}

	//Informar o cep
	public void  informarCep() {
		wait.until(ExpectedConditions.visibilityOf(colocarCepFrete)).sendKeys("50030040");
	}

	//Clicar no botão para adicionar a lista de compras o item
	public void botaoCompra() {
		wait.until(ExpectedConditions.visibilityOf(btnComprar));
		wait.until(ExpectedConditions.elementToBeClickable(btnComprar)).click();
	}

	//Aumentar a quantidade do produto
	public void botaoAumentar() {
		wait.until(ExpectedConditions.visibilityOf(aumentar)).click();
	}
	//Diminuir a quantidade do produto
	public void botaoDiminuir() {
		wait.until(ExpectedConditions.visibilityOf(diminuir)).click();
	}

	//Seguir com a compra, clicando no botão
	public void botaoPagamento() {
		wait.until(ExpectedConditions.visibilityOf(btnPagamento));
		wait.until(ExpectedConditions.elementToBeClickable(btnPagamento)).click();
	}

	//Informar o login para acesso a conclusao da compra
	public void  fazerLogin() {
		wait.until(ExpectedConditions.visibilityOf(login)).sendKeys("teste_teste@teste.com");
	}

	//Informar a senha de acesso
	public void  senhaLogin() {
		wait.until(ExpectedConditions.visibilityOf(senhaAcesso)).sendKeys("tequinha");
	}

	//Botão para dar continuidade na compra
	public void loginCompra() {
		wait.until(ExpectedConditions.visibilityOf(botaoLoginCompra)).click();
	}

}

