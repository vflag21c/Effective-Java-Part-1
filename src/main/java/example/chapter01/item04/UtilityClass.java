package example.chapter01.item04;

public class UtilityClass {

    /**
     * 이 클래스는 인스턴스를 만들 수 없습니다.
     */
    private UtilityClass() { // private 생성자를 활용하라.
        System.out.println("Constructor");
        throw new AssertionError();
    }

    public static String hello() {
        return "Hello World!";
    }

    public static void main(String[] args) {
//        UtilityClass utilityClass = new UtilityClass();
//        utilityClass.hello(); // 좋지 못한 코드 ( 자동 완성 기능 X )


    }
}
