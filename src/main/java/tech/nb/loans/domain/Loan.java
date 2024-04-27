package tech.nb.loans.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Loan {

    private Customer customer;

    public boolean isPersonalLoanAvailable(){
        if(customer.isIncomeEqualOrLowerThan(3000.0)) return true;

        return customer.isIncomeBetween(3000.0, 5000.0)
                && customer.isAgeLowerThan(30)
                && customer.isFromLocation("SP");
    }

    public double getPersonalLoanInterestRate(){
        if(isPersonalLoanAvailable()) return 4.0;

        throw new LoanNotAvailableExeception();
    }
            
    public boolean isConsignatLoanAvailable(){
        return customer.isIncomeEqualOrHigher(5000);
    }

    public double getConsignateLoanInterestRate(){
        if(isConsignatLoanAvailable()) return 2.0;

        throw new LoanNotAvailableExeception();
    }
    
}
