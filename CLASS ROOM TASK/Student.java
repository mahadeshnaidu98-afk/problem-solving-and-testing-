import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " - " + marks;
    }
}

public class Main {
    public static void main(String[] args) {

        // 1. Ascending order
        List<Integer> numbers1 = Arrays.asList(50, 20, 40, 10, 30);

        numbers1.sort(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return Integer.compare(a, b);
            }
        });

        System.out.println("Ascending: " + numbers1);


        // 2. Descending order
        List<Integer> numbers2 = Arrays.asList(50, 20, 40, 10, 30);

        numbers2.sort(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return Integer.compare(b, a);
            }
        });

        System.out.println("Descending: " + numbers2);


        // 3. Alphabetical order
        List<String> names1 = Arrays.asList(
            "Rahul", "Amit", "Kiran", "David", "Bharat"
        );

        names1.sort(new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        System.out.println("Alphabetical: " + names1);


        // 4. Sort names according to length
        List<String> names2 = Arrays.asList(
            "Rahul", "Amit", "Christopher", "Raj", "Kiran"
        );

        names2.sort(new Comparator<String>() {
            public int compare(String a, String b) {
                return Integer.compare(a.length(), b.length());
            }
        });

        System.out.println("By Length: " + names2);


        // 5. Sort students by marks
        List<Student> students = Arrays.asList(
            new Student("Rahul", 75),
            new Student("Amit", 90),
            new Student("Kiran", 65),
            new Student("David", 85)
        );

        students.sort(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.marks, s2.marks);
            }
        });

        System.out.println("Students by Marks:");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}