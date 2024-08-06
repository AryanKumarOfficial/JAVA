package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<Integer> nums = new ArrayList<>();

        List<Integer> nums = Arrays.asList(0, 6, 4, 99, 7, 6);

//        int sum = 0;
//        for (int n : nums) {
//            if (n % 2 == 0) {
//                n = n * 2;
//                sum = sum + n;
//            }
//        }
//
//        System.out.println(nums);
//        System.out.println(sum);

//        normal for loop
//        for (int n = 0; n < nums.size(); n++) {
//            System.out.println(nums.get(n));
//        }

//        enhanced for loop
//        for (int n : nums) {
//            System.out.println(n);
//        }

//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
//        Stream<Integer> s3 = s2.map(n -> n * 2);
//        int res = s3.reduce(0, Integer::sum);


//        int res = nums.stream()
//                .filter(n -> n % 2 == 0)
//                .map(n -> n * 2)
//                .reduce(0, Integer::sum);
//        System.out.println(res);
//        Stream<Integer> sorted = nums.stream().filter(n -> n % 2 == 0).sorted();
        Stream<Integer> sorted = nums.parallelStream().filter(n -> n % 2 == 0).sorted();
        sorted.forEach(n -> System.out.println(n));
//         for each loop
//        nums.forEach(n -> System.out.println(n));

        /*
         *   Stream API
         *  1. Stream is a sequence of elements supporting sequential and parallel aggregate operations.
         * 2. Stream is not a data structure.
         * 3. Stream does not store elements.
         * 4. Stream does not change the original data structure, it only provides the result as per the pipelined methods.
         * 5. Stream is functional in nature.
         * 6. Stream API makes the collection processing very easy.
         * 7. Stream takes Collections, Arrays or I/O resources as input source.
         * 8. Stream provides a method called pipeline to process the data.
         * 9. Stream API is used to process collections of objects.
         * 10. Stream is used to process the object from the collection.
         * */
    }
}
