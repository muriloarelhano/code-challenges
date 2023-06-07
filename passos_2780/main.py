def min_steps(x, y):
    distance = y - x
    step = 1
    total_steps = 0

    while distance > 0:
        total_steps += 1
        distance -= step
        if total_steps % 2 == 0:
            step += 1

    return total_steps

# Função para ler os casos de teste e imprimir a saída
def main():
    test_cases = int(input())
    for _ in range(test_cases):
        x, y = map(int, input().split())
        print(min_steps(x, y))

if __name__ == "__main__":
    main()
