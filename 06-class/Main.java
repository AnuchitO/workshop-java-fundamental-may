public class Main {
	public static void main(String[] args) {
		String applicantName = "Laumcing";
		double loanAmount = 10000.0d;
		float interestRate = 7.5f;

        System.out.println("Applicant Name: " + applicantName);
		System.out.println("Loan Amount: " + loanAmount);
		System.out.println("Interest Rate: " + interestRate);
        System.out.println("============XXX=============");

        // class Loan
        Loan xxx = new Loan();
        xxx.setApplicantName("Laumcing");
        xxx.setLoanAmount(10000.0d);
        xxx.setInterestRate(7.5f);
        // how to get the value of field in class Loan
        System.out.println("Applicant Name: " + xxx.getApplicantName());
        System.out.println("Loan Amount: " + xxx.getLoanAmount());
        System.out.println("Interest Rate: " + xxx.getInterestRate());

        System.out.println("============YYY=============");
        Loan yyy = new Loan("Somchai", 30000.0d, 2.5f);
        // yyy.setApplicantName("Somchai");
        // yyy.setLoanAmount(30000.0d);
        // yyy.setInterestRate(2.5f);
       
        System.out.println("Applicant Name: " + yyy.getApplicantName());
        System.out.println("Loan Amount: " + yyy.getLoanAmount());
        System.out.println("Interest Rate: " + yyy.getInterestRate());


        Mortgage jenny = new Mortgage("Jenny", 20000.0d, 8.5f);
		System.out.println(jenny.getInterestRate());
        System.out.println(jenny.getLoanAmount());
        System.out.println(jenny.getApplicantName());
        // jenny.setLoanAmount(20000.0d);
        // jenny.setInterestRate(8.5f);
        // jenny.setApplicantName("Jenny");
        System.out.println("============ZZZ=============");
		System.out.println(jenny);
    }
}