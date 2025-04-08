#3. Desenvolva um algoritmo em pseudocódigo que peça ao usuário as medidas de comprimento e largura de um retângulo. Implemente funções para calcular e exibir a área e o perímetr do retângulo.


inicio Valores
variáveis: comprimento, largura, area, perimetro

escrever("Digite o valor do comprimento do retângulo: ")
ler(comprimento)

escrever("Digite o valor da largura do retângulo: ")
ler(largura)

funcao calcularPerimetro(comprimento, largura)
    perimetro = 2 * (comprimento + largura)
    retornar perimetro
fim funcao calcularPerimetro

funcao calcularArea(comprimento, largura)
    area = comprimento * largura
    retornar area
fim funcao calcularArea

perimetro = calcularPerimetro(comprimento, largura)
area = calcularArea(comprimento, largura)

escrever("O valor do perímetro é igual a: ", perimetro)
escrever("O valor da área é igual a: ", area)

fim Valores

