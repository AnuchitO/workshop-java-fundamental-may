public class FizzBuzz {
    private Integer number;
    private String name;
    
    private FizzBuzz(Integer number, String name) {
        this.number = number;
        this.name = name;
    }

    public static FizzBuzz createFizzBuzz(Integer number) {
        return new FizzBuzz(number, "FizzBuzz");
    }

    public String say() {
        if (isFizzBuzz()) {
            return "FizzBuzz";
        } else if (isBuzz()) {
            return "Buzz";
        } else if (isFizz()) {
            return "Fizz";
        } else {
            return String.valueOf(number);
        }
    }

    public boolean isFizz() {
        return number % 3 == 0;
    }
    public boolean isBuzz() {
        return number % 5 == 0;
    }
    public boolean isFizzBuzz() {
        return number % 3 == 0 && number % 5 == 0;
    }
}
