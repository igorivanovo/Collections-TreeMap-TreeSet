import java.util.Comparator;

public class PersonsSuNameLengthComparator implements Comparator<Person> {
    protected int lengthSuName;

    public PersonsSuNameLengthComparator(int lengthSuName) {
        this.lengthSuName = lengthSuName;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().length() > lengthSuName & o2.getSurname().length() > lengthSuName) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        if (o1.getSurname().length() < o2.getSurname().length()) {
            return -1;
        } else if (o1.getSurname().length() > o2.getSurname().length()) {
            return 1;
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
