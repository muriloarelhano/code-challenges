def calculate_couples(months):
    if months <= 2:
        return 1
    else:
        previous = 1
        current = 1
        for _ in range(months - 2):
            previous, current = current, previous + current
        return current

while True:
    months = int(input())
    if months == 0:
        break
    couples = calculate_couples(months)
    print(couples)
