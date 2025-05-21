public interface Loan {
    public double calculateInterest();
}    

/*
example interface in Swift

protocol Loan {
    func calculateInterest() -> Double
}

class Mortgage: Loan {
    var applicantName: String
    var loanAmount: Double
    var interestRate: Float
 
    // signature: String, Double, Float
    init(applicantName: String, loanAmount: Double, interestRate: Float) {
        self.applicantName = applicantName
        self.loanAmount = loanAmount
        self.interestRate = interestRate
    }

    // signature: String, Double -> Double
    // var calculateInterest = func(applicantName: String, loanAmount: Double) -> Double {...}
    // var anuchito = func(applicantName: String, loanAmount: Double) -> Double {...}

    func calculateInterest(applicantName: String, loanAmount: Double) -> Double {
        print("Mortgage:: Interest()")
        return 3.5
    }
}

*/