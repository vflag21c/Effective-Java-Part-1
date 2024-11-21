package example.chapter01.item03.field;

import java.util.function.Supplier;

public class Elvis3Main {

    public void start(Supplier<Singer> singerSupplier) {
        Singer singer = singerSupplier.get();
        singer.sing();
    }

    public static void main(String[] args) {
        Elvis3Main elvis3Main = new Elvis3Main();
        elvis3Main.start(Elvis3::getInstance);
//        elvis3Main.start(() -> Elvis3.getInstance());
    }
}
