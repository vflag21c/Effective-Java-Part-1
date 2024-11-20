package example.chapter01.item02.illegalargumentexception;

import java.time.LocalDate;

public class Order {
    public void updateDeliveryDate(LocalDate deliveryDate) {
        if (deliveryDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("deliveryDate can't be earlier than " + LocalDate.now());
        }
    }

    public void updateDeliveryDate2(LocalDate deliveryDate)  throws IllegalArgumentException, NullPointerException { // Client 에게 명시적으로 알려주고 싶을 경우 사용한다.
        if (deliveryDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("deliveryDate can't be earlier than " + LocalDate.now());
        }
    }
}
