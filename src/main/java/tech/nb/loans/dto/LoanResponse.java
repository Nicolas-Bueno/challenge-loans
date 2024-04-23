package tech.nb.loans.dto;

import tech.nb.loans.domain.LoanType;

public record LoanResponse(LoanType type, Double InterestRate) {

}
