package example.chapter01.item03.methodreference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    LocalDate birthday;

    public Person() {
    }

    public Person(LocalDate birthday) {
        this.birthday = birthday;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public int compareByAgeInstance(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(1991,8,23)));
        people.add(new Person(LocalDate.of(1991,8,24)));
        people.add(new Person(LocalDate.of(1991,8,25)));

        // 자바8 이전
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.birthday.compareTo(o2.birthday);
            }
        });

        // 자바 8
        people.sort((p1, p2) -> p1.birthday.compareTo(p2.birthday));

        // 자바 8 - static 메소드 레퍼런스
        people.sort(Person::compareByAge);

        // Instance Method 참조 레퍼런스
        Person person = new Person(LocalDate.of(2024, 11, 11));
        people.sort(person::compareByAgeInstance);

        // 생성자 레퍼런스
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1991,8,23));
        dates.add(LocalDate.of(1991,8,24));
        dates.add(LocalDate.of(1991,8,25));

        dates.stream().map(d -> new Person(d)).collect(Collectors.toList());
        dates.stream().map(Person::new).collect(Collectors.toList());
    }
}
