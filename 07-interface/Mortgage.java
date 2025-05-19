public class Mortgage implements Loan, Payment {
	private String applicantName;
	private double loanAmount;
	private float interestRate;

	public Mortgage(String applicantName, double loanAmount, float interestRate) {
		this.applicantName = applicantName;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
	}

	public String anuchitO() {
		return "anuchitO";
	}

	@Override
	public double calculateInterest() {
		System.out.println("Mortgage:: Interest()");
		return 3.5;
	}

	@Override
	public String[] paymentOptions() {
		System.out.println("Mortgage:: paymentOptions()");
		String[] options = { "Credit Card", "Debit Card", "Cash" };
		return options;
	}

	public String toString() {
		return "Mortgage:: toString()";
	}
}
