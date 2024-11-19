package example.chapter01.item01;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    public static void main(String[] args) throws ClassNotFoundException {
        // ex1
        HelloService ko = HelloService.of("ko");
        System.out.println(ko.hello());

        // ex2
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Optional<HelloService> helloServiceOptional = loader.findFirst();   // 별도 jar Load
        helloServiceOptional.ifPresent(h -> System.out.println(h.hello()));

        // ex3 - 생성자 & 정적 팩토리 메소드 모두 사용 가능
        ArrayList<Object> list = new ArrayList<>();
        List<String> list2 = List.of("yy", "dd");

        // 리플렉션
        Class<?> aClass = Class.forName("example.chapter01.item01.HelloService");
        Method[] declaredMethods = aClass.getDeclaredMethods(); //...
    }
}
