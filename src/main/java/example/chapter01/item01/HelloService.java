package example.chapter01.item01;

public interface HelloService {

    String hello();

    static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }

    static String hi() {
        prepareMessage();
        return "hi";
    }

    // 자바 9 부터 지원
    static private void prepareMessage() {
        //공통적인 작업 ...
    }

    // public 생략
    static String hi1() {
        prepareMessage();
        return "hi";
    }

    //1. 인스턴스 생성 하지 않고도 제공할 것이냐
    static String hi2() {
        prepareMessage();
        return "hi";
    }

    //2. 인스턴스 생성후 메소드 제공 할 것이냐
    default String bye() {
        return "bye";
    }
}
