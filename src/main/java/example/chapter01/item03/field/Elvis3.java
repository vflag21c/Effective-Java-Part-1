package example.chapter01.item03.field;

public class Elvis3 implements Singer {

    /**
     * 싱글톤
     */
    private static final Elvis3 INSTANCE = new Elvis3();
    private Elvis3() {}

    public static Elvis3 getInstance() {
        return INSTANCE;
    }

    @Override
    public void sing() {
        System.out.println("sing~~");
    }
}
