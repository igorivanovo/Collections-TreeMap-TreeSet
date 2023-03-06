import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Игорь", "Архипов-Иваново", 53));
        people.add(new Person("Филипп", "Воронов-Netology-эксперт", 30));
        people.add(new Person("Алёна", "Загрекова", 26));
        people.add(new Person("Георгий", "Власов-Аспирант", 25));
        people.add(new Person("Максим", "Водолажский", 33));
        System.out.println(people);

        Collections.sort(people, new PersonsSuNameLengthComparator(1));
        System.out.println(" По возрасту -  " + people);

        Collections.sort(people, new PersonsSuNameLengthComparator(2));
        System.out.println(" Есть ограничение на количество фамилий -  " + people);

        Collections.sort(people, new PersonsSuNameLengthComparator(3));
        System.out.println(" По длине фамилии , потом по возрасту - " + people);


    }
}