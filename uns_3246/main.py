def menor_multiplo_de_uns(n):
    resto = 1 % n
    visitados = set()
    fila = [(resto, 1)]
    
    while fila:
        r, x = fila.pop(0)
        
        if r == 0:
            return x
        
        if r in visitados:
            continue
        
        visitados.add(r)
        fila.append(((r * 10 + 1) % n, x + 1))
        fila.append((r, x + 1))
    
    return -1  # caso não exista solução


# leitura de entradas e chamada da função
while True:
    try:
        n = int(input())
        print(menor_multiplo_de_uns(n))
    except EOFError:
        break