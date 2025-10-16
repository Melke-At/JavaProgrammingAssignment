import java.util.*;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCity() { return city; }

    @Override
    public String toString() {
        return name + " (" + age + ") - " + city;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, "New York"));
        people.add(new Person("Bob", 25, "Los Angeles"));
        people.add(new Person("Charlie", 35, "New York"));
        people.add(new Person("Diana", 28, "Chicago"));
        people.add(new Person("Ethan", 40, "New York"));
        people.add(new Person("Fiona", 22, "Los Angeles"));

        System.out.println("Original list:");
        people.forEach(System.out::println);

        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("\nSorted by age (ascending):");
        people.forEach(System.out::println);

        String targetCity = "New York";
        people.removeIf(person -> !person.getCity().equalsIgnoreCase(targetCity));

        System.out.println("\nFiltered by city (" + targetCity + "):");
        people.forEach(System.out::println);
    }
}

