package  com.anuchito.database.loan;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    private final LoanRepository loanRepository;

    public LoanController(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    // Add methods to handle HTTP requests, e.g., create, read, update, delete loans
    // Example: public ResponseEntity<Loan> createLoan(Loan loan) { ... }
    // Example: public ResponseEntity<List<Loan>> getAllLoans() { ... }
    // Example: public ResponseEntity<Loan> getLoanById(Long id) { ... }


    @GetMapping
    public List<Loan> getAllLoans() {
        return this.loanRepository.findAll();
    }

    @GetMapping("/{loanId}")
    public Optional<Loan> getLoansByLoanId(@PathVariable String loanId) {
        return this.loanRepository.findByLoanId(loanId);
    }
}