package com.anuchito.database.loan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loan {

    @Id
    private Long id;

    private String loanId;
    private String applicantName;
    private double loanAmount;
    private int loanTerm;
    private String status;
    private double interestRate;

    public Loan() {
    }

    public Loan(Long id, String loanId, String applicantName, double loanAmount, int loanTerm, String status, double interestRate) {
        this.id = id;
        this.loanId = loanId;
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
        this.loanTerm = loanTerm;
        this.status = status;
        this.interestRate = interestRate;
    }

    public Long getId() {
        return id;
    }



    public String getLoanId() {
        return loanId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }



    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    public String getStatus() {
        return status;
    }



    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    } public void setStatus(String status) {
        this.status = status;
    } public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }


    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", loanId='" + loanId + '\'' +
                ", applicantName='" + applicantName + '\'' +
                ", loanAmount=" + loanAmount +
                ", loanTerm=" + loanTerm +
                ", status='" + status + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }
}
