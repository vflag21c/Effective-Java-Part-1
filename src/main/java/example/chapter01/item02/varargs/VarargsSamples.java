package example.chapter01.item02.varargs;

import java.util.Arrays;

public class VarargsSamples {

    public void printNumbers(int... numbers) { //가변인수는 메소드 당 하나.
        System.out.println(numbers.getClass().getCanonicalName());
        System.out.println(numbers.getClass().getComponentType());
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public static void main(String[] args) {
        VarargsSamples samples = new VarargsSamples();
        samples.printNumbers(1, 20, 20, 39, 59);
    }
}
