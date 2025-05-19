public class Mortgage extends Loan {
    
    public Mortgage(String applicantName, double loanAmount, float interestRate) {
        super(applicantName, loanAmount, interestRate);
    }

    @Override
    public String toString() {
        return "Mortgage{" +
                "applicantName='" + super.getApplicantName() + '\'' +
                ", loanAmount=" + super.getLoanAmount() +
                ", interestRate=" + super.getInterestRate() +
                '}';
    }
}
