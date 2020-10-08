# TIL

# 파이썬 입/출력

## 한 줄에 출력 하기의 예시
     print('a'+'b'+'c') # abc
     print('a', end=' ') # a b c  
     print('b', end=' ')  
     print('c', end=' ')  

## % 출력 하기의 예시
     print('\%d')
     print('%d' %10)
     print('%c' %'a')
     print('%s' %'string letter')
     print('%s grade is : %d and avg is : %d' %('JAMES', 100, 80))
     print('%f' %2.123456789)
     print('%.2f' %2.111) # 2.11
     print('%.2f' %2.554) # 2.55
     print('%.2f' %2.555) # 2.56
     print('%.2f' %2.556) # 2.56

## 아스키 코드 변환
     print(ord('A'))
     print(chr(65))

## int()를 통한 진법변환
     print(int('0b101010', 2)) # 42
     print(int('0o52', 8)) # 42
     print(int('42',10)) # 42
     print(int('42')) # 42

## 숫자에서 다른진수의 문자열로 변환 - 인자가 숫자일 때
     print(bin(42)) # 0b101010
     print(oct(42)) # 0o52
     print(hex(42)) # 0x2a
     print(str('42')) # 42

## 숫자에서 다른진수의 문자열로 변환 - 인자가 다른 진법의 숫자일 때
     print(bin(0b101010)) # 0b101010
     print(oct(0b101010)) # 0o52
     print(hex(0b101010)) # 0x2a
     print(str(0b101010)) # 42

## 다중 입력 받기
     a,b,c = input().split() # 공백을 기준으로 입력을 받음

     a,b,c,d = input().split(',') # ,을 기준으로 입력 받음
     
     a,b,c = map(int, input().split()) # 공백을 기준으로 입력 받고 int형으로 형 변환, 예상 출력 결과 ==> 3 5 7
     
     data = list(map(int, input().split())) # 각 데이터를 공백으로 구분해 입력 받음. data는 list 형
    
## 삼항 연산자 입력
    (참일때의 출력값) if 조건문 else (거짓일 때의 출력값)
