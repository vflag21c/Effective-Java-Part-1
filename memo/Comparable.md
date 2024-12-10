## Comparable 을 구현할지 고민하라

- Object.equals에 더해서 순서까지 비교할 수 있으며, Generic을 지원한다.
- 자기 자신 (this)이 compareTo에 전달된 객체보다 작으면 음수, 같으면 0, 크다면 양수를 리턴한다.
- 반사성, 대칭성, 추이성을 만족해야 한다.
- 반드시 따라야 하는 것은 아니지만 x.compareTo(y) == O 라면 x.equals(y) 가 true 여야 한다.


### 구현 방법
- 자연적인 순서를 제공할 클래스에 implements Compratable<T> 을 선언한다.
- compareTo 메서드를 재정의한다.
- compareTo 메서드 안에서 기본 타입은 박싱된 기본 타입의 compare 을 사용해 비교한다.
- 핵심 필드가 여러 개라면 비교 순서가 중요하다. 순서를 결정하는데 있어서 가장 중요한 필드를 비교하고 그 값이 0이라면 다음 필드를 비교한다.