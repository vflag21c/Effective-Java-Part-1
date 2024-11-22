package example.chapter01.item03.functionalinterface;

import example.chapter01.item03.methodreference.Person;

import java.time.LocalDate;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctions {
    public static void main(String[] args) {
        // input -> output
        Function<Integer, String> intToString = (i) -> "hello";
        Function<Integer, String> intToString2 = Objects::toString;


        // output
        Supplier<Person> integerSupplier = Person::new;
        Function<LocalDate, Person> personFunction = Person::new;

        // input ( void )
        Consumer<Integer> integerConsumer = System.out::println;

        // boolean 값을 반환
        Predicate<Integer> integerPredicate = i -> i > 10;
    }
}
