## UncheckedException
### 왜 우리는 비검사 예외를 선호하는가?

- 컴파일 에러를 신경쓰지 않아도 되며,
- try-catch 로 감싸거나
- 메서드 선언부에 선언하지 않아도 된다


### 그렇다면 우리는 비검사 예외만 쓰면 되는걸까?

- 왜 잡지 않은 예외를 메서드에 선언해야 하는가?
  - 메서드에 선언한 예외는 `프로그래밍 인터페이스의 일부`다. 즉 해당 메서드를 사용하는 코드가 반드시 알아야 하는 정보다. 그래야 해당 예외가 발생했을 상황에 대처하는 코드를 작성할 수 있을테니까.
- 비검사 예외는 그럼 왜 메서드에 선언하지 않아도 되는가?
  - 비검사 예외는 어떤 식으로든 처리하거나 복구할 수 없는 경우에 사용하는 예외다. 가령, 숫자를 0으로 나누거나, null 레퍼런스에 메서드를 호출하는 등
  - 이런 예외는 프로그램 전반에 걸쳐 어디서든 발생할 수 있기 때문에 이모든 비검사 예외를 메서드에 선언하도록 강제한다면 프로그램의 명확도가 떨어진다.
