package tech.nb.loans.dto;

import java.util.List;

public record CustomerLoanResponse(String customer, List<LoanResponse>loans) {

}
