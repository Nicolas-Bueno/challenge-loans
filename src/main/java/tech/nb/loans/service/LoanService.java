package tech.nb.loans.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import tech.nb.loans.domain.Loan;
import tech.nb.loans.domain.LoanType;
import tech.nb.loans.dto.CustomerLoanRequest;
import tech.nb.loans.dto.CustomerLoanResponse;
import tech.nb.loans.dto.LoanResponse;

@Service
public class LoanService {

    public CustomerLoanResponse checkLoanAvailability(CustomerLoanRequest loanRequest){
        var customer = loanRequest.toCustomer();
        var loan = new Loan(customer);

        List<LoanResponse> loans = new ArrayList<>();

        if(loan.isPersonalLoanAvailable()){
            loans.add(new LoanResponse(LoanType.PERSONAL, loan.getPersonalLoanInterestRate()));
        }

        if (loan.isConsignatLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.CONSIGNMENT, loan.getConsignateLoanInterestRate()));
        }

        return new CustomerLoanResponse(loanRequest.name(), loans);
    }
}
