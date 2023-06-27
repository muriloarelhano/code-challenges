memo = {}


def fibonacci(n):
    if n in memo:
        return memo[n]
    if n <= 1:
        return n, 0
    else:
        fib1, calls1 = fibonacci(n-1)
        fib2, calls2 = fibonacci(n-2)
        memo[n] = (fib1 + fib2, 2 + calls1 + calls2)
        return memo[n]


def main(num_cases):
    for _ in range(num_cases):
        x = int(input())
        if 1 <= x <= 39:
            result, num_calls = fibonacci(x)
            print("fib({}) = {} calls = {}".format(x, num_calls, result))


if __name__ == "__main__":
    num_cases = int(input())
    main(num_cases)
