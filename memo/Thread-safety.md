## 스레드 안전
### 멀티 스레드 환경에서 안전한 코드, Thread-safety

- 가장 안전한 방법은 여러 스레드 간에 공유하는 데이터가 없는 것!
- 공유하는 데이터가 있다면
  - Synchronization
  - ThreadLocal
  - 불변 객체 사용
  - Synchronized 데이터 사용
  - Concurrent 데이터 사용
  - ...