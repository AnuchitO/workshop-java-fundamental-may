public class Loan {
    private String applicantName;
    private double loanAmount;
    private float interestRate;

    public Loan() {}  // default constructor

    public Loan(String applicantName, double loanAmount, float interestRate) {
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }  // constructor with parameters

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

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
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

     func (l Loan) SetApplicantName(applicantName string) {
         l.applicantName = applicantName
     }


      ln := Loan{
         applicantName: "Laumcing",
         LoanAmount:    10000.0,
         InterestRate:  7.5,
         }
     */


    /***
     Swift class example

        class Loan { 
            var applicantName: String
            var loanAmount: Double
            var interestRate: Float
    
            init(applicantName: String, loanAmount: Double, interestRate: Float) {
                self.applicantName = applicantName
                self.loanAmount = loanAmount
                self.interestRate = interestRate
            }
    
            func getApplicantName() -> String {
                return applicantName
            }
    
            func setApplicantName(applicantName: String) {
                self.applicantName = applicantName
            }

            // toString() method
            func toString() -> String {
                return "applicantName: \(applicantName), loanAmount: \(loanAmount), interestRate: \(interestRate)"
            }
        }


        inheritance example in swift Mortgage class inherits from Loan class

        class Mortgage: Loan {
            init(applicantName: String, loanAmount: Double, interestRate: Float) {
                super.init(applicantName: applicantName, loanAmount: loanAmount, interestRate: interestRate)
            }
        }

        
        let mortgage = Mortgage(applicantName: "Jenny", loanAmount: 20000.0, interestRate: 8.5)
     */
}