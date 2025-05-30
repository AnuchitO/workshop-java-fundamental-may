package  com.anuchito.database.loan;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


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
        return List.of(new Loan(1L, "L001", "John Doe", 10000.0, 12, "Approved", 5.0),
                       new Loan(2L, "L002", "Jane Smith", 15000.0, 24, "Pending", 4.5));
    }
}