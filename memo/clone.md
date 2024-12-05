## clone 재정의는 주의해서 진행하라

- clone 규약
  - x.clone() != x 반드시 true
  - x.clone().getClass() == x.getClass() 반드시 true
  - x.clone().equals(x) true 가 아닐 수도 있다.
- 불변 객체라면 다음으로 충분하다
  - cloneable 인터페이스를 구현하고
  - clone 메서드를 재정의한다. 이때 super.clone()을 사용하라

### 가변 객체의 clone 구현하는 방법

- 접근 제한자는 public, 반환 타입은 자신의 클래스로 변경한다
- super.clone 을 호출한 뒤 필요한 필드를 적절히 수정한다
  - 배열을 복제할 때는 배열 clone 메서드를 사용하라
  - 경우에 따라 final을 사용할 수 없을지도 모른다
  - 필요한 경우 deep copy를 해야한다
  - super.clone으로 객체를 만든 뒤, 고수준 메서드를 호출하는 방법도 있다
  - 오버라이딩 할 수 있는 메서드는 참조하지 않도록 조심해야 한다
  - 상속용 클래스는 Cloneable 을 구현하지 않는 것이 좋다
  - Cloneable 을 구현한 스레드 안전 클래스를 작성할 때는 동기화를 해야 한다