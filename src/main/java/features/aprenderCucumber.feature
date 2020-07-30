
#language: en
@SmokeTest
Feature: Aprender Cucumber
  Como um aluno
  Eu quero aprender utilizar Cucumber
  Para que eu possa automatizar criterios de aceitacao

Scenario: Deve executar especificação
  Given que criei o arquivo corretamente
  When executa-lo
  Then a especificação deve finalizar com sucesso