while True:
    try:

        num_days = int(input())

        cost_per_day = int(input())

        revenues = []
        for _ in range(num_days):
            revenues.append(int(input()))

        max_profit = 0
        optimal_days = []

        for i in range(num_days):
            for j in range(i, num_days):
                profit = sum(revenues[i:j+1]) - (j - i + 1) * cost_per_day

                if profit > max_profit:
                    max_profit = profit
                    optimal_days = [i+1, j+1]

        print(max_profit)

    except EOFError:
        break
