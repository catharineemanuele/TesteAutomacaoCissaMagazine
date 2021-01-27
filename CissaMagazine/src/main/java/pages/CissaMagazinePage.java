package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CissaMagazinePage {

	public CissaMagazinePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}

	//campo para pesquisa google
	@FindBy(how = How.NAME, using = "q")
	protected WebElement campoPesquisaGoogle;

	//bot�o de pesquisa ap�s o preenchimento da pesquisa
	@FindBy(how = How.NAME, using = "btnK")
	protected WebElement btnPesquisaGoogle;

	//validacao do site que ir� ser utilizado no teste
	@FindBy(how = How.XPATH, using = "//cite[@class='iUh30'][contains(.,'https://www.cissamagazine.com.br')]")
	protected WebElement ValidacaoPesquisaGoogle;

	//selecionar no item da busca do google casa a validacao a cima esteja correta
	@FindBy(how = How.CLASS_NAME, using = "LC20lb")
	protected WebElement ItemGoogle;


	//Bot�o para fazer o cadastro do cliente
	@FindBy(how = How.XPATH, using = "/html/body/header/div[1]/div/div[4]/div[2]/span[2]/a[1]")
	protected WebElement Cadastro;


	//Campo de email para fazer cadastro do cliente
	@FindBy(how = How.ID, using = "email")
	protected WebElement emailCadastro;

	//Bot�o para o cadastro do cliente
	@FindBy(how = How.XPATH, using = "//*[@id=\"register-form\"]/form/div[2]/button")
	protected WebElement btnpCadastro;

	//Bot�o para aceitar o cokkie e continuar
	@FindBy(how = How.XPATH, using = "/html/body/div[10]/button")
	protected WebElement aceitarcokkie;


	//Sele��o pessoa juridica
	@FindBy(how = How.ID, using = "juridica")
	protected WebElement psJuridica;

	//Sele��o pessoa f�sica
	@FindBy(how = How.ID, using = "fisica")
	protected WebElement psFisica;

	//Email para valida��o do email colocado da tela anterior
	@FindBy(how = How.ID, using = "email_1")
	protected WebElement email;

	//Campo para colocar o nome completo do cliente
	@FindBy(how = How.ID, using = "nome-completo_1")
	protected WebElement nomecliente;

	//Local para informar o sexo do cliente "f" ou "m"
	@FindBy(how = How.ID, using = "sexo_1")
	protected WebElement sexo;

	//Colocar o numero de cpf do cliente
	@FindBy(how = How.ID, using = "cpf_1")
	protected WebElement cpf;

	//Colocar o dia de nascimento do cliente = OK
	@FindBy(how = How.ID, using = "datanasc-dia_1")
	protected WebElement diaNasc;

	//Colocar o mes de nascimento do cliente
	@FindBy(how = How.ID, using = "datanasc-mes_1")
	protected WebElement mesNasc;

	//Colocar o ano de nascimento do cliente
	@FindBy(how = How.ID, using = "datanasc-ano_1")
	protected WebElement anoNasc;

	//Colocar um numero telefone
	@FindBy(how = How.NAME, using = "telefone")
	protected WebElement telefone;

	//Colocar o numero celular
	@FindBy(how = How.NAME, using = "celular")
	protected WebElement celular;

	//Coloca uma senha para o cliente
	@FindBy(how = How.ID, using = "senha_1")
	protected WebElement senha;

	//Faz a confirma��o da senha
	@FindBy(how = How.NAME, using = "senha2")
	protected WebElement confirmacaoSenha;


	//Voltar para pagina inicial
	@FindBy(how = How.ID, using = "Camada_x0020_1")
	protected WebElement paginaInicial;

	//Campo para digitar a pesquisa do item para compra
	@FindBy(how = How.NAME, using = "q")
	protected WebElement campoPesquisaCissa;

	//Bot�o para fazer a pesquisa da compra
	@FindBy(how = How.XPATH, using = "//*[@id=\"frm-search\"]/button")
	protected WebElement btnPesquisaCissa;

	//Clicar no item para compra
	@FindBy(how = How.XPATH, using = "//*[@id=\"lista-produtos-area\"]/ul/li[1]")
	protected WebElement itemparaComprar;

	//Adicionar o cep para frete
	@FindBy(how = How.NAME, using = "cep")
	protected WebElement colocarCepFrete;

	//Bot�o comprar para adicionar ao carrinho
	@FindBy(how = How.XPATH, using = "//*[@id=\"oferta-principal\"]/div[4]/div/div[2]/button")
	protected WebElement btnComprar;

	//Bot�o aumentar quantidade
	@FindBy(how = How.XPATH, using = "//*[@id=\"cart-items\"]/div[2]/div/div[1]/div[2]/div/button[2]")
	protected WebElement aumentar;

	//Bot�o diminuir quantidade
	@FindBy(how = How.XPATH, using = "//*[@id=\"cart-items\"]/div[2]/div/div[1]/div[2]/div/button[1]")
	protected WebElement diminuir;

	//Bot�o pagamento
	@FindBy(how = How.XPATH, using = "//*[@id=\"main-cart-area\"]/div[2]/div[2]/button")
	protected WebElement btnPagamento;

	//Campo Login
	@FindBy (how = How.ID, using = "login_1")
	protected WebElement login;

	//Campo Senha
	@FindBy (how = How.ID, using = "pass_1")
	protected WebElement senhaAcesso;

	//Bot�o login
	@FindBy (how = How.XPATH, using = ("//*[@id=\"login-form\"]/form/div[5]/button"))
	protected WebElement botaoLoginCompra;
}
