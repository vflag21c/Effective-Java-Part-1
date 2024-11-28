## finalizer 와 cleaner 사용을 피하라

- finalizer와 cleaner는 즉시 수행된다는 보장이 없다.
- finalizer와 cleaner는 실행되지 않을 수도 있다.
- finalizer 동작 중에 예외가 발생하면 정리 작업이 처리되지 않을 수도 있다.
- finalizer와 cleaner는 심각한 성능 문제가 있다.
- finalizer는 보안 문제가 있다.
- 반납할 자원이 있는 클래스는 `AutoCloseable`을 구현하고 클라이언트에서 close()를 호출하거나 try-with-resource를 사용해야 한다.

- Finalizer 공격
- AutoClosable
- 정적이 아닌 중첩 클래스는 자동으로 바깥 객체의 참조를 갖는다.
- 람다 역시 바깥 객체의 참조를 갖기 쉽다.
