package example.chapter01.item03.field;

import java.io.ObjectInput;
import java.io.Serializable;

public class Elvis implements IElvis, Serializable {

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

    //역직렬화 할수 있도록 하는 코드
//    private Object readResolve() {
//        return INSTANCE;
//    }
}
