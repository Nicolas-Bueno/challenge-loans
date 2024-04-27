package tech.nb.loans.dto;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import tech.nb.loans.domain.Customer;

public record CustomerLoanRequest(@Min(value = 18) @NotNull Integer age,
                                @CPF String cpf,
                                @NotBlank String name,
                                @NotNull @Min(value = 1000)Double income,
                                @NotBlank String location) {
    public Customer toCustomer(){
        return new Customer(
            age,
            cpf,
            name,
            income,
            location
        );
    }

}
