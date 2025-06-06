import java.util.*;

class Student {
    String name;
    List<Integer> marks;

    Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    int getTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    double getAverage() {
        return getTotal() / (double) marks.size();
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", Arrays.asList(85, 90, 78)));
        students.add(new Student("Bob", Arrays.asList(70, 65, 72)));
        students.add(new Student("Charlie", Arrays.asList(88, 84, 91)));
        students.add(new Student("David", Arrays.asList(60, 75, 69)));
        students.add(new Student("Eva", Arrays.asList(92, 89, 95)));

        for (Student student : students) {
            System.out.println("Student: " + student.name);
            System.out.println("Total Marks: " + student.getTotal());
            System.out.println("Average Marks: " + student.getAverage());
            System.out.println();
        }
    }
}
