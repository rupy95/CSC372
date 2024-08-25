//Option #1: Storing an ArrayList
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n<------------- Welcome to my Classroom Program ------------->\n");
        ArrayList<Student> studentsObject = new ArrayList<>();

        studentsObject.add(new Student(5, "John", "123 Street A"));
        studentsObject.add(new Student(2, "Alice", "456 Street B"));
        studentsObject.add(new Student(8, "Bob", "789 Street C"));
        studentsObject.add(new Student(1, "Diana", "101 Street D"));
        studentsObject.add(new Student(10, "Charlie", "202 Street E"));
        studentsObject.add(new Student(3, "Eve", "303 Street F"));
        studentsObject.add(new Student(6, "Frank", "404 Street G"));
        studentsObject.add(new Student(7, "Grace", "505 Street H"));
        studentsObject.add(new Student(4, "Hank", "606 Street I"));
        studentsObject.add(new Student(9, "Ivy", "707 Street J"));

        System.out.println("\n<------------- Original List ------------->\n");
        for (Student sstudent : studentsObject) {
            System.out.println(sstudent);
        }

        // Sort by name
        SelectionSort.selectionSort(studentsObject, new NameComparator());
        System.out.println("\n<------------- Sorted by Name ------------->");
        for (Student sstudent : studentsObject) {
            System.out.println(sstudent);
        }

        // Sort by rollNo
        SelectionSort.selectionSort(studentsObject, new RollNoComparator());
        System.out.println("\n<------------- Sorted by Roll Number ------------->");
        for (Student sstudent : studentsObject) {
            System.out.println(sstudent);
        }

        System.out.println("\n<------------- Thanks for using my program ------------->\n");
    }
}
