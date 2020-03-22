package advancedexercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();

        int count = Integer.parseInt(reader.readLine());
        while(count > 0) {
            String[] tokens = reader.readLine().split("\\s");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Person person = new Person(name,age);
            people.add(person);
            count--;

        }

        people.stream().filter(person -> person.getAge() > 30).sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }
}
