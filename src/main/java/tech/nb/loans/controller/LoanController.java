package tech.nb.loans.controller;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import tech.nb.loans.dto.CustomerLoanRequest;
import tech.nb.loans.dto.CustomerLoanResponse;
import tech.nb.loans.service.LoanService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping(value = "/customer-loans")
    public ResponseEntity<CustomerLoanResponse> customerLoans(@RequestBody @Valid CustomerLoanRequest loanRequest){
        var loanResponse = loanService.checkLoanAvailability(loanRequest);

        return ResponseEntity.ok(loanResponse);
    }
    
}
