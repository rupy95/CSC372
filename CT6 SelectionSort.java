import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {

    public static void selectionSort(ArrayList<Student> studentsList, Comparator<Student> comparator) {
        int n = studentsList.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(studentsList.get(j), studentsList.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            Student tempStudent = studentsList.get(minIndex);
            studentsList.set(minIndex, studentsList.get(i));
            studentsList.set(i, tempStudent);
        }
    }
}
