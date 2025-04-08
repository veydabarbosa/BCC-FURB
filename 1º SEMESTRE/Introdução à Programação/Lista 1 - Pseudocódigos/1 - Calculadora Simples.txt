##1. Implemente um algoritmo em pseudocódigo que solicite dois números ao usuário e realize as quatro
operações básicas (adição, subtração, multiplicação e divisão). Certifique-se de tratar o caso de divisão por zero.

inicio Calculadora
variáveis: numeroUm, numeroDois, resultado

escrever("Digite o primeiro número: ")
ler(numeroUm)

escrever("Digite o segundo número: ")
ler(numeroDois)

funcao Calcular()
  Adicao(numeroUm, numeroDois)
  Subtracao(numeroUm, numeroDois)
  Multiplicacao(numeroUm, numeroDois)
  Divisao(numeroUm, numeroDois)
fim funcao Calcular

funcao Adicao(numeroUm, numeroDois)
  resultado = numeroUm + numeroDois
  escrever("O resultado da adição é: ", resultado)
fim funcao Adicao

funcao Subtracao(numeroUm, numeroDois)
  resultado = numeroUm - numeroDois
  escrever("O resultado da subtração é: ", resultado)
fim funcao Subtracao

funcao Multiplicacao(numeroUm, numeroDois)
  resultado = numeroUm * numeroDois
  escrever("O resultado da multiplicação é: ", resultado)
fim funcao Multiplicacao

funcao Divisao(numeroUm, numeroDois)
  se numeroDois != 0 então
    resultado = numeroUm / numeroDois
    escrever("O resultado da divisão é: ", resultado)
  senão
    escrever("Erro: Divisão por zero não é permitida.")
  fim se
fim funcao Divisao

Calcular()
