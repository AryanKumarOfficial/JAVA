package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student {" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Comparator<Student> comparator = (o1, o2) -> o1.age > o2.age ? 1 : -1;

        ;
//        List<Integer> nums = new ArrayList<>();
//        nums.add(43);
//        nums.add(71);
//        nums.add(69);
//        nums.add(50);

//        Collections.sort(nums);
//        Collections.sort(nums, comparator);

//        System.out.println(nums);


        List<Student> students = new ArrayList<>();

        students.add(new Student(12, "Javed"));
        students.add(new Student(21, "Atlas"));
        students.add(new Student(42, "Raven"));
        students.add(new Student(32, "Reddy"));
        Collections.sort(students, comparator);

        for (Student s : students) {
            System.out.println(s);
        }


        /*
         * Sorting in Java:
         * 1. Collections.sort(List<T> list)
         * 2. Collections.sort(List<T> list, Comparator<T> comparator)
         *
         * Collections.sort() uses merge sort algorithm.
         * Comparator is a functional interface.
         * Comparator has only one abstract method compare(T o1, T o2).
         * Comparator can be implemented using lambda expression.
         * Comparable is a functional interface.
         *
         * Comparable has only one abstract method compareTo(T o).
         * Comparable is implemented by the class whose objects are to be sorted.
         * Comparable is used to provide natural ordering to the class.
         * Comparable is implemented by the class whose objects are to be sorted.
         * Comparable is used to provide natural ordering to the class.
         *
         * */
    }
}
//}
