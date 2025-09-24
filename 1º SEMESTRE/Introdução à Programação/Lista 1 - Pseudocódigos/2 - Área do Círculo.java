#2. Escreva um algoritmo em pseudocódigo que peça ao usuário o valor do raio de um círculo e implemente
uma função para calcular e exibir a área desse círculo. Utilize 3,14 como valor de Pi.

inicio Calculo
variáveis: valorRaio, PI, area

escrever("Digite o valor do raio do círculo: ")
ler(valorRaio)

PI = 3.14

funcao calcularArea(valorRaio)
    area = (valorRaio * valorRaio) * PI
    retornar area
fim funcao calcularArea

area = calcularArea(valorRaio)
escrever("O valor da área é igual a: ", area)

fim Calculo

