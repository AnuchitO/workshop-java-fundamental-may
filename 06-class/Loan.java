public class Loan {
    private String applicantName;
    private double loanAmount;
    private float interestRate;

    public String getApplicantName() {
        return applicantName;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public Float getInterestRate() {
        return interestRate;
    }

    public String toString()  {
        return "applicantName: " + applicantName + "\n" +
               "loanAmount: " + loanAmount + "\n" +
               "interestRate: " + interestRate;
    }

    /**
     Golang method

     struct Loan {
         applicantName string
         LoanAmount    float64
         InterestRate  float32
     }

     func (l Loan) String() string {
         return "hello here"
     }

     func (l Loan) ApplicantName() string {
         return l.applicantName
     }
     */
}