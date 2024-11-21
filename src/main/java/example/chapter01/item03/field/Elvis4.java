package example.chapter01.item03.field;

import java.lang.reflect.Constructor;

public enum Elvis4 {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("기다려~");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Elvis4 elvis4 = Elvis4.INSTANCE;
        elvis4.leaveTheBuilding();

        // 오류 발생
//        Constructor<Elvis4> declaredConstructor = Elvis4.class.getDeclaredConstructor();
    }
}
