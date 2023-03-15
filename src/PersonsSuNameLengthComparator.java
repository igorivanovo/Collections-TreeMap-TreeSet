import java.awt.*;
import java.util.Comparator;

public class PersonsSuNameLengthComparator implements Comparator<Person> {
    protected int quantitySuName;

    public PersonsSuNameLengthComparator(int quantitySuName) {
        this.quantitySuName = quantitySuName;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] text1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        String[] text2 = o2.getSurname().split("\\P{IsAlphabetic}+");
        if (text1.length >= quantitySuName & text2.length >= quantitySuName) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else if (text1.length == text2.length) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else if (text1.length < text2.length) {
            return -1;
        } else return 1;

    }
}

