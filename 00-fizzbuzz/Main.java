
import java.util.ArrayList;
import java.util.List;

public class Main {

    // extract to class FizzBuzz
    // extract to method getFizzBuzz
    private static String getFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(number);
        }
    }

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 30);
        // FizzBuzz rules:
        // 1. If the number is divisible by 3, print "Fizz"
        // 2. If the number is divisible by 5, print "Buzz"
        // 3. If the number is divisible by both 3 and 5, print "FizzBuzz"
        // 4. If the number is not divisible by either, print the number itself

        // sol1 : for loop
        List<String> result = new ArrayList<>();
        for (int number : numbers) {
            result.add(getFizzBuzz(number));
        }
        

        // Print the result
        for (String fb : result) {
            System.out.println(fb);
        }

        // sol2 : use class and method
	}
}
