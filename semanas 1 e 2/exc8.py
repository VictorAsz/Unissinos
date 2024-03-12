# solicitar ao usuário 2 valores com ponto flutuante e imprimir na tela o
# resultado da divisão de um pelo outro com 2 casas decimais

    valor1 = float(input("Digite o primeiro valor: "))
    valor2 = float(input("Digite o segundo valor: "))

    resultado = valor1/valor2
    resultadoFormatado = float("%.2f" % resultado)

    print(resultadoFormatado)


#  solicitar ao usuário 2 valores com ponto flutuante e imprimir na tela o
#  resultado da divisão de um pelo outro com 3 casas decimais

    valor1 = float(input("Digite o primeiro valor: "))
    valor2 = float(input("Digite o segundo valor: "))

    resultado = valor1/valor2
    resultadoFormatado = float("%.3f" % resultado)

    print(resultadoFormatado)

# solicitar ao usuário 2 valores com ponto flutuante e imprimir na tela o
# resultado da divisão de um pelo outro com 4 casas decimais

    valor1 = float(input("Digite o primeiro valor: "))
    valor2 = float(input("Digite o segundo valor: "))

    resultado = valor1/valor2
    resultadoFormatado = float("%.4f" % resultado)

    print(resultadoFormatado)