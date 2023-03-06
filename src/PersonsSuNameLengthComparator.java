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
        }
        if ((o1.getSurname().length() - text1.length + 1) < (o2.getSurname().length()) - text2.length + 1) {
            return -1;
        } else if (o1.getSurname().length() > o2.getSurname().length()) {
            return 1;
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
