## NullPointerException
### JAVA 8 Optional을 활용해서 NPE를 최대한 피하자

- NullPointerException을 만나는 이유
  - 메소드에서 null을 리턴하기 때문에 && null 체크를 하지 않았기 때문에
- 메소드에서 적절한 값을 리턴할 수 없는 경우에 선택할 수 있는 대안
  - 예외를 던진다.
  - null을 리턴한다.
  - Optional을 리턴한다.