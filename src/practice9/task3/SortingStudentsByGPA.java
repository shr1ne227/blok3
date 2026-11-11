package practice9.task3;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if (a.getGpa() < b.getGpa()) {
            return 1;
        } else if (a.getGpa() > b.getGpa()) {
            return -1;
        } else {
            return 0;
        }
    }
}
