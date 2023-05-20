def count_divisors(num):
    count = 0
    for i in range(1, int(num ** 0.5) + 1):
        if num % i == 0:
            count += 1
            if i != num // i:
                count += 1
    return count

while True:
    n = int(input())
    if n == 0:
        break
    divisors_count = count_divisors(n)
    if divisors_count % 2 == 1:
        print("sim")
    else:
        print("nao")