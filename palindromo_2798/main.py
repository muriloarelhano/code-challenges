def is_palindrome(n, base):
    digits = []
    
    while n > 0:
        digits.append(str(n % base))
        n //= base

    return digits == digits[::-1]

def check_palindrome():
    number = int(input())
    count = 1
    
    while number != 0:
        if is_palindrome(number, 2):
            print(f"Numero {count} e palindromo")
        else:
            print(f"Numero {count} nao e palindromo")
        
        count += 1
        number = int(input())

check_palindrome()