import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Игорь", "Архипов-Иваново", 53));
        people.add(new Person("Филипп", "Воронов-Netology-эксперт", 30));
        people.add(new Person("Алёна", "Загрекова", 26));
        people.add(new Person("Георгий", "Власов-Аспирант", 25));
        people.add(new Person("Максим", "Водолажский", 33));
        System.out.println(people);
        Comparator<Person> comparator = (o1, o2) -> {
            String[] text1 = o1.getSurname().split("\\P{IsAlphabetic}+");
            String[] text2 = o2.getSurname().split("\\P{IsAlphabetic}+");
            System.out.println(text1.length + "  " + o1.getSurname() + "  " + text2.length + "  " + o2.getSurname());
            if (text1.length >= 10 & text2.length >= 10) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else if (text1.length == text2.length) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                return Integer.compare(text1.length, text2.length);
            }
        };
        Collections.sort(people, comparator);
        System.out.println(people);
    }

}


