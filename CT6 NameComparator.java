import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student sstudent1, Student sstudent2) {
        return sstudent1.getName().compareTo(sstudent2.getName());
    }
}
