# Stack(Python)
- Last In First Out구조이다
- 자료의 입출력이 한 곳에서만 발생한다.
- 가장 최근에 들어온 자료가 가장 먼저 나가는 구조.

### 구현소감
- stack[index++]처럼 c에서 하듯이 하려고 했으나 실패했다.
- 내장함수인 list.append(data), list.pop()를 이용했다.
- 함수가 비어있는지를 체크 하는 함수는 스스로 만들었다.

        class Stack():
          def __init__(self):
            self.stack=[]

          def isEmpty(self):
            return (True)if len(self.stack)==0 else(False)

          def push(self, data):
            print("push 된 data:",data)
            self.stack.append(data)

          def pop(self):
            if(self.isEmpty()==True):
              print("stack에 자료가 없으므로 pop불가!")
              return ;
            else:
              print("pop 된 data:",self.stack.pop())

        s = Stack();

        s.push(1)
        s.push(2)
        s.push(3)

        s.pop()
        s.pop()
        s.pop()
        s.pop()
