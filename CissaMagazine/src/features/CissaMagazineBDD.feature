#language: pt
@Regressao @TesteMagazine
Funcionalidade: Automacao Cissa Magazine

   Contexto:
      Dado Abro o navegador
      E Acesso site "https://www.google.com.br"
      E Pesquisar pelo site do teste
      Então Entra no site

  @SmokeTest
  Cenario: Realizar Cadastro de um novo cliente
    Dado Inicia o cadastro do cliente
    E Preenche os campos
    Então Volta para tela inicial

  Cenario: Realizar a compra de um relógio
  Dado Pesquisar e selecionar um item
  E Verifica valor do frete
  E Confirma a comprar
  Então Faz login informando o Login e Senha