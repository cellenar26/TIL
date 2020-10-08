# List(Python)

### Function

    a = []
    a = list() # 빈 리스트 생성

    n = 10
    a = [0] * n # 크기가 n이고 모든값이 0인 리스트를 생성

    a[-1] # 뒤에서 첫 번째 원소
    a[3] = data # 네 번째 원소의 값을 data로 변경

    a[1:4] # 두번째 원소부터 세 번째 원소까지 출력

    a = [i for i in range(0,20,1) if i % 2 == 1] # 리스트 컴프리핸션. 0~19까지의 수에서 홀수만 포함하는 리스트

    n = 3
    m = 4
    a = [[0]*m]*n # 리스트 컴프리핸션. n*m 의 2차원 배열 생성. 2차원 배열 생성은 반드시 리스트 컴프리핸션으로 할 것

    a.append(data) # 리스트에 원소 삽입
    a.sort() # 리스트 원소들 정렬
    a.sort(reverse=True) # 리스트 원소들 역순 정렬
    a.reverse() # 리스트 원소들의 순서를 모두 뒤집음
    a.insert(삽입할 인덱스, data) # 해당 인덱스에 data 삽입
    a.count(data) # 리스트 내부에 data와 일치하는 개수를 return 
    a.remove(data) # data를 제거. 제거 대상 데이터가 여러개라면 한개만 제거.
    a.index(data) # data의 인덱스를 반환
    a.pop() # 리스트의 가장 끝의 인덱스에 해당하는 요소를 출력 후 제거
    a.pop(index) # 리스트에서 해당 인덱스에 있는 요소 제거
    a.extend(anotherList) # 리스트에 다른 리스트를 더해준다.
