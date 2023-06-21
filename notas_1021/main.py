value = float(input())

notas = [100, 50, 20, 10, 5, 2]
moedas = [1, 0.5, 0.25, 0.10, 0.05, 0.01]

print("NOTAS:")

for nota in notas:
    amount = int(value / nota)

    print(f"{amount} nota(s) de R$ {nota:.2f}")
    value -= amount * nota

print("MOEDAS:")

for moeda in moedas:
    amount = int(round(value, 2) / moeda)

    print(f"{amount} moeda(s) de R$ {moeda:.2f}")
    value -= amount * moeda
