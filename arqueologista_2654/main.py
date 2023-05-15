import math

while True: 
    try:    
        n = int(input())
        x = 0
        hasNumber = False

        while True: 
            x += 1
            result = str(pow(2, x))
            if int(result[:len(str(n))]) == n:
                print(x)
                hasNumber = True
                break
        
        if not hasNumber:
            print('nao existe potencia de dois')
    except EOFError:
        break