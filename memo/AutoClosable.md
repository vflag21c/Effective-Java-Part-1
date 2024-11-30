## AutoClosable
### try-with-resource를 지원하는 인터페이스

- void close() throws Exception
  - 인터페이스에 정의된 메서드에서 Exception 타입으로 예외를 던지지만
  - 실제 구현체에서는 구체적인 예외를 던지는 것을 추천
  - 가능하다면 예외를 던지지 않는 것도 권장한다
- Closeable 클래스와 차이점
  - IOException을 던지며 반드시 idempotent 해야한다.