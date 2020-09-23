# TIL

### 파이썬 입/출력

#### print('##한 줄에 출력 하기의 예시##')
-print('a'+'b'+'c') # abc


- print('a', end=' ') # a b c  
- print('b', end=' ')  
- print('c', end=' ')  
- print()  
- print()  

- print('##% 출력 하기의 예시##')
- print('\%d')
- print('%d' %10)
- print('%c' %'a')
- print('%s' %'string letter')
- print('%s grade is : %d and avg is : %d' %('JAMES', 100, 80))
- print('%f' %2.123456789)
- print('%.2f' %2.111)
- print('%.2f' %2.554)
- print('%.2f' %2.555)
- print('%.2f' %2.556)
- print()

- print('##아스키 코드 변환##')
- print(ord('A'))
- print(chr(65))

- print('##int()를 통한 진법변환##')
- print(int('0b101010', 2))
- print(int('0o52', 8))
- print(int('42',10))
- print(int('42'))
- print()

- print('##숫자에서 다른진수의 문자열로 변환 - 인자가 숫자일 때##')
- print(bin(42))
- print(oct(42))
- print(hex(42))
- print(str('42'))
- print()

- print('##숫자에서 다른진수의 문자열로 변환 - 인자가 다른 진법의 숫자일 때##')
- print(bin(0b101010))
- print(oct(0b101010))
- print(hex(0b101010))
- print(str(0b101010))
- print()

# a,b,c = input().split() # 공백을 기준으로 입력을 받음

# a,b,c,d = input().split(',') # ,을 기준으로 입력 받음
