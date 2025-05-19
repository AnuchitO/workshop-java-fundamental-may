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

    init(applicantName: String, loanAmount: Double, interestRate: Float) {
        self.applicantName = applicantName
        self.loanAmount = loanAmount
        self.interestRate = interestRate
    }

    func calculateInterest() -> Double {
        print("Mortgage:: Interest()")
        return 3.5
    }
}

*/