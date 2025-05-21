public class Auto extends BaseLoan {

    public Auto(String applicantName, double loanAmount, float interestRate) {
        super(applicantName, loanAmount, interestRate);
    }

    @Override
	public double calculateInterest() { 
		System.out.println("Auto:: calculateInterest() called");
		return 3.3d;
	}
}