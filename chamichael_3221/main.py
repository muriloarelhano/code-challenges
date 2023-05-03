def is_carmichael(n):
    if is_prime(n):
        return False
    for a in range(2, n):
        if pow(a, n, n) != a:
            return False
    return True

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

while True:
    n = int(input())
    if n == 0:
        break
    if is_carmichael(n):
        print(f"O numero {n} eh um numero de Carmichael.")
    else:
        print(f"{n} eh normal.")