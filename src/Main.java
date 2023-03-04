import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Игорь", "Архипов", 53));
        people.add(new Person("Филипп", "Воронов", 30));
        people.add(new Person("Алёна", "Загрекова", 26));
        people.add(new Person("Георгий", "Власов", 25));
        people.add(new Person("Максим", " Водолажский", 33));
        System.out.println(people);

        Collections.sort(people, new PersonsSuNameLengthComparator(20));
        System.out.println("По длине фамилии, потом по возрасту -  " + people);

        Collections.sort(people, new PersonsSuNameLengthComparator(5));
        System.out.println("Есть ограничение по длине фамилии -  " + people);
    }
}