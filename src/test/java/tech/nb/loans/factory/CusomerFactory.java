package tech.nb.loans.factory;

import tech.nb.loans.domain.Customer;

public class CusomerFactory {

    public static Customer build(){
        return new Customer(25, "123.456.789-10", "Name", 5000.0, "SP");
    }

    public static Customer build(Double income){
        return new Customer(25, "123.456.789-10", "Name", income, "SP");
    }
}
