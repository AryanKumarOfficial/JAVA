package collections;

import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        Map<String, Integer> students = new HashMap<>();
        Map<String, Integer> students = new Hashtable<>();
        students.put("Navin", 56);
        students.put("Sushil", 26);
        students.put("John", 96);
        students.put("Jordon", 46);
        System.out.println(students.keySet()); // Set
        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
        System.out.println(students.get("Navin"));

//        List<Integer> numbers = new ArrayList<Integer>();
//        Set<Integer> numbers = new HashSet<>();
//        Set<Integer> numbers = new TreeSet<>();
//        numbers.add(62);
//        numbers.add(54);
//        numbers.add(72);
//        numbers.add(21);
//        numbers.add(Integer.valueOf("5"));
//        System.out.println(numbers.get(2));
//        System.out.println(numbers.indexOf(6));

//        Iterator<Integer> values = numbers.iterator();
//
//        while (values.hasNext()) {
//            System.out.println(values.next());
//        }

//        for (Object o : numbers) {
//            System.out.println(o);
//        }


        /*
         * 1. Collection API: A collection represents a group of objects known as its elements.
         * 2. Collection: It is the root interface in the collection hierarchy.
         * 3. Collections: It is a utility class that consists of static methods that operate on or return collections.
         *
         * Collection Interface:
         * 1. Collection interface is the root interface in the collection hierarchy.
         * 2. It is a part of java.util package.
         * 3. It is a group of objects known as its elements.
         * 4. It is used to represent a group of individual objects as a single entity.
         * 5. It is used to store, retrieve, manipulate, and communicate aggregate data.
         * 6. It is an interface that provides the standard functionality of data structure to classes like ArrayList, LinkedList, etc.
         * 7. It is a generic interface that is declared as:
         *   public interface Collection<E> { ... }
         *list support duplicate values and sets support unique values
         *HasSet doesn't have any order
         * TreeSet sorts the values
         *
         * Hashtable is synchronized where HashMap isn't.
         * */
    }
}
