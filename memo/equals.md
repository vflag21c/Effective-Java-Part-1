## Equals는 일반 규약을 지켜 재정의하라
### equals를 재정의 하지 않는 것이 최선

- 다음의 경우에 해당한다면 equals를 재정의 할 필요가 없다.
- 각 인스턴스가 본질적으로 고유하다.
- 인스턴스의 '논리적 동치성'을 검사할 필요가 없다.
- 상위 클래스에서 재정의한 equals 가 하위 클래스에서도 적절하다.
- 클래스가 private 이거나 package-private 이고 equals 메서드를 호출할 일이 없다.


- 반사성: A.equals(A) == true
- 대칭성: A.equals(B) == B.equals(A)
  - CaseInsensitiveString
- 추이성: A.equals(B) && B.equals(C), A.equals(C)
- 일관성: A.equals(B) == A.equals(B)
- null-아님: A.equals(null) == false


- equals를 재정의 할 때 hashCode도 반드시 재정의하자.
- 너무 복잡하게 해결하지 말자.
- Object 가 아닌 타입의 매개변수를 받는 equals 메서드는 선언하지 말자.