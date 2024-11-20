package example.chapter01.item03.field;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ElvisTest {

    @Test
    void test() {
        Concert concert = new Concert(new MockElvis());
        concert.perform();

        Assertions.assertTrue(concert.isLightsOn());
        Assertions.assertTrue(concert.isMainStateOpen());
    }
}