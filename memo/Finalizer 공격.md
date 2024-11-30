## Finalizer 공격
### 만들다 만 객체를 finalize 메소드에서 사용하는 방법

- 방어하는 방법
  - final 클래스로 만든다.
  - finalizer() 메소드를 오버라이딩 한 다음 final을 붙여서 하위 클래스에서 오버라이딩 할 수 없도록 막는다.