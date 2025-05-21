public class Main {
	public static void main(String[] args) {
		BaseLoan laumcing = new Auto("Laumcing", 10000.0d, 7.5f);
	//   TYPE     name    = Value;

		System.out.println(laumcing.getInterestRate());
		System.out.println(laumcing.getLoanAmount());
		System.out.println(laumcing.getApplicantName());
		System.err.println(laumcing.calculateInterest());

		
		BaseLoan somchai = new BaseLoan("Somchai", 30000.0d, 2.5f) {
			@Override
			public double calculateInterest() {
				System.out.println("BaseLoan:: Interest()");
				return 2.5;
			}
		};

		// function 
		// data  -> function -> data

		System.out.println(somchai.calculateInterest());

	}
}