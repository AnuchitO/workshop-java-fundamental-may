
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    // extract to class FizzBuzz
    // extract to method getFizzBuzz
 
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 30);
        // FizzBuzz rules:
        // 1. If the number is divisible by 3, print "Fizz"
        // 2. If the number is divisible by 5, print "Buzz"
        // 3. If the number is divisible by both 3 and 5, print "FizzBuzz"
        // 4. If the number is not divisible by either, print the number itself

        // sol1 : for loop
        List<String> result = new ArrayList<>();
        // for (int number : numbers) {
        //     var fb = new FizzBuzz(number);
        //     fb = new FizzBuzz(555);
        //     result.add(fb.say());
        // }

        // stream example with FizzBuzz
       var fzlist= numbers.stream()
            .map(FizzBuzz::createFizzBuzz) // map Integer to FizzBuzz
            .collect(Collectors.toList()); // collect to List<FizzBuzz>
        System.err.println(fzlist);

        // 1. List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 30);
        // 2. List<FizzBuzz> fzlist = List.of(new FizzBuzz(1), new FizzBuzz(2), new FizzBuzz(3), new FizzBuzz(4), new FizzBuzz(5), new FizzBuzz(6), new FizzBuzz(7), new FizzBuzz(8), new FizzBuzz(9), new FizzBuzz(10), new FizzBuzz(11), new FizzBuzz(12), new FizzBuzz(13), new FizzBuzz(14), new FizzBuzz(15), new FizzBuzz(30));
        // 3. List<String> result = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "FizzBuzz");
        // Print the result
        // for (FizzBuzz fb : fzlist) {
        //     System.out.println(fb.say());
        // }

        // sol2 : use class and method
	}
}
