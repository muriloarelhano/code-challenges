import math

def calcular_coeficiente_binomial(n, k):
    return math.factorial(n) // (math.factorial(k) * math.factorial(n - k))

# Função para ler a entrada e calcular os coeficientes binomiais
def calcular_coeficientes_binomiais():
    while True:
        try:
            n = int(input())
            n1, n2 = map(int, input().split())
            
            coeficiente = calcular_coeficiente_binomial(n, n1)
            
            print(coeficiente)
        
        except EOFError:
            break

# Chamada da função para resolver o problema
calcular_coeficientes_binomiais()