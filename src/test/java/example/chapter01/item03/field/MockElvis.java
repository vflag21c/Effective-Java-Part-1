package example.chapter01.item03.field;

public class MockElvis implements IElvis{

    @Override
    public void leaveTheBuilding() {
        System.out.println("leave...");
    }

    @Override
    public void sing() {
        System.out.println("sing...~");
    }
}
