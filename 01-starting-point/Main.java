public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

            float interestRate = 7.5f; // 5% interest rate
            int principal = 1000; // Principal amount
            double interest = principal * (interestRate / 100); // Calculate interest

            char grade = 'A'; // Grade variable
            boolean isPassed = true; // Boolean variable
            String name = "John Doe"; // String variable
            byte age = 30; // Age variable


    
        System.out.println("Interest Rate: " + interestRate + "%");

        // Wrapper types
        String name = "Launching";
        System.out.println(name);

        Integer loanTerm = 36;
        System.out.println(loanTerm);

        // - float must add `f` at the end of the number.
        // - The precision of float is only six or seven decimal digits
        Float interestRate = 7.5f;
        System.out.println(interestRate);

		// - double must add `d` at the end of the number.
		// - The precision of double is about 15 decimal digits
		// - Therefore it is safer to use double for most calculations.
		Double loanAmount = 10000.0d;
		System.out.println(loanAmount);

		Boolean isApproved = true;
		System.out.println(isApproved);

		Character grade = 'A';
		System.out.println(grade);
    }
}
