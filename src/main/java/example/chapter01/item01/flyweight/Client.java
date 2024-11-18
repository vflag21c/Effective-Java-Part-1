package example.chapter01.item01.flyweight;

public class Client {

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();

        // 객체 재사용
        Font font = fontFactory.getFont("nanum:12");
        Font font2 = fontFactory.getFont("nanum:12");
    }

}
