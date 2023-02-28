$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastro_usuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 5,
  "name": "Cadastro de usuario",
  "description": "",
  "id": "cadastro-de-usuario",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@cadastro"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Cadastro usuario sucesso",
  "description": "",
  "id": "cadastro-de-usuario;cadastro-usuario-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@cadastro-sucesso"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que estou na pagina de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "acesso cadastro de novo usuario",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "eu preencho o cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "finalizo o cadastro",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu vejo a mensagem de novo usuario",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.acessarLogin()"
});
formatter.result({
  "duration": 3691464207,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.acesso_cadastro_de_novo_usuario()"
});
formatter.result({
  "duration": 1604421364,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.eu_preencho_o_cadastro()"
});
formatter.result({
  "duration": 1945259830,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.finalizo_o_cadastro()"
});
formatter.result({
  "duration": 4486382185,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.eu_vejo_a_mensagem_de_novo_usuario()"
});
formatter.result({
  "duration": 22410984,
  "status": "passed"
});
});