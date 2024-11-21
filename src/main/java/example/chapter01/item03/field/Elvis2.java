package example.chapter01.item03.field;

public class Elvis2 {

    /**
     * 싱글톤
     */
    private static final Elvis2 INSTANCE = new Elvis2();
    private Elvis2() {}

    public static Elvis2 getInstance() {
        return INSTANCE;
    }


    // 이 메서드는 보통 클래스 바깥(다른 클래스)에 작성해야 한다!
    public static void main(String[] args) {
        Elvis2 elvis = Elvis2.getInstance();
    }
}
