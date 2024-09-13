import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.*;

public class StreamAPI {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 32, 23, 44, 55, 66, 27, 18,59, 60);
        System.out.println(numbers);

        // filter 
        // Find the even number form the collection from ArrayList using stream
        List<Integer> filteredList = numbers.stream().filter(i -> i%2==0).toList();
        System.out.println(filteredList);


        //mapToInt
        // Find the sum of all numbers in the collection
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);

        //map
        // Multiply by two for each element from the collection
        List<Integer> doubledList = numbers.stream().map(i -> i*2).toList();
        System.out.println(doubledList);

        List<Integer> marks = numbers.stream().filter(i -> i>30).toList();
        System.out.println(marks);

        List<Integer> passed = numbers.stream().filter(i -> i<30).map(j-> j+5).toList();
        System.out.println(passed);

        //count
        //Get the total number of failed student
        long failedStudent = numbers.stream().filter(i -> i<30).count();
        System.out.println("Failed Students " + failedStudent);


        //sorted Natural Sorting
        List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        //sorted using Comparator
        List<Integer> descendingSorting = numbers.stream().sorted((a,b) -> b-a).collect(Collectors.toList());
        System.out.println(descendingSorting);

        //sort the string by length
        List<String> StringList = Arrays.asList("A","AA","AAAAA","B","bbb");

        Optional<String> sortLis =  StringList.stream().max((a,b) -> b.length() - a.length());
        System.out.println(sortLis);


        //forEach();
        numbers.forEach(System.out::println);

        String[] i = StringList.stream().toArray(String[] :: new);
        for (String string : i) {
            System.out.println(string) ;
        }

        //Array to stream
        Arrays.stream(i).sorted((a,b) -> a.length() - b.length()).forEach(System.out::println);

        //stream.of()

        Stream<Object> iStream =  Stream.of(5,3,3,2,"ad","wr");
        iStream.map(a -> a + "ayush").forEach(System.out:: println);

        //Find the employee who has maximum salary
        Optional<Integer> maxSalary = numbers.stream().max((a,b) -> a-b);
        System.out.println(maxSalary);



    
    }
}
