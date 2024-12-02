package example.chapter02.item10.record;

///equals & hashCode 를 재정의 해 줄 필요가 없다.
/// toString 도 마찬가지.
public record Point(int x, int y) {

    public String hello() {
        return "hello";
    }
}
