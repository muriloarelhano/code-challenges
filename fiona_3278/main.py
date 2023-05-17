while True:
    sentence = input().strip()
    if sentence == '*':
        break
    
    words = sentence.lower().split()
    first_char = words[0][0]
    is_tautogram = all(word[0] == first_char for word in words)
    
    if is_tautogram:
        print('Y')
    else:
        print('N')