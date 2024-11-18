package example.chapter01.item01;

import java.util.Arrays;

public class Order {
    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus orderStatus;

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {
        Arrays.stream(OrderStatus.values()).forEach(System.out::println);

        //Enum == 비교 권장
        //equals null point Exception 가능성
//        if (order.orderStatus.equals(OrderStatus.DELIVERED)) {
//            System.out.println("error");
//        }

        Order order = new Order();
        if (order.orderStatus == OrderStatus.DELIVERING) {
            System.out.println("delivered");
        }

        // Enum 을 Key 사용 할 경우
        //EnumMap 권장
        //EnumSet
    }
}
