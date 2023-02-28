#language: pt


  @cadastro
  Funcionalidade: Cadastro de usuario
    @cadastro-sucesso
    Cenario: Cadastro usuario sucesso
      Dado que estou na pagina de login
      E acesso cadastro de novo usuario
      Quando eu preencho o cadastro
      E finalizo o cadastro
      Entao eu vejo a mensagem de novo usuario