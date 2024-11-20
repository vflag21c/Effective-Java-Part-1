package example.chapter01.item03.field;

public class Elvis implements IElvis {

    /**
     * 싱글톤
     */
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {}

    public void leaveTheBuilding() {
        System.out.println("whoa baby,...");
    }

    public void sing() {
        System.out.println("I'll have a blue~...");
    }

    // 이 메서드는 보통 클래스 바깥(다른 클래스)에 작성해야 한다!
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
