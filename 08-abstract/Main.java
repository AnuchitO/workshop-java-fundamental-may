public class Main {
	public static void main(String[] args) {
		BaseLoan laumcing = new Auto("Laumcing", 10000.0d, 7.5f);
	//   TYPE     name    = Value;

		System.out.println(laumcing.getInterestRate());
		System.out.println(laumcing.getLoanAmount());
		System.out.println(laumcing.getApplicantName());
		System.err.println(laumcing.calculateInterest());

		// new BaseLoan("Laumcing", 10000.0d, 7.5f);
			// BaseLoan laumcing2 = new BaseLoan("Laumcing", 10000.0d, 7.5f);
			// System.out.println(laumcing2.getInterestRate());
			// System.out.println(laumcing2.getLoanAmount());
			// System.out.println(laumcing2.getApplicantName());
		
	}
}