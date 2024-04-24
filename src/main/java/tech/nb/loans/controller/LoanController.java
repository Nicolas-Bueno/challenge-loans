package tech.nb.loans.controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import tech.nb.loans.dto.CustomerLoanRequest;
import tech.nb.loans.dto.CustomerLoanResponse;
import tech.nb.loans.service.LoanService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@NoArgsConstructor
@AllArgsConstructor
@RestController
public class LoanController {

    private LoanService loanService;

    @PostMapping(value = "/customer-loans")
    public ResponseEntity<CustomerLoanResponse> customerLoans(@RequestBody CustomerLoanRequest loanRequest){
        var loanResponse = loanService.checkLoanAvailability(loanRequest);

        return ResponseEntity.ok(loanResponse);
    }
    
}
