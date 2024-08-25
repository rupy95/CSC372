import java.util.Comparator;
public class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student sstudent1, Student sstudent2) {
        return Integer.compare(sstudent1.getrollNo(), sstudent2.getrollNo());
    }
}