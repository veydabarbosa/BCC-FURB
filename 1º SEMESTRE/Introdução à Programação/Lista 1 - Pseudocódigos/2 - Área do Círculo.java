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
