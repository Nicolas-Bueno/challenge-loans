package tech.nb.loans.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Customer {
        
    private Integer age;
    private String cpf;
    private String name;
    private Double income;
    private String location;

    public boolean isIncomeEqualOrLowerThan(double value) {
        return income <= value;
    }

    public boolean isIncomeBetween(Double minValue, Double maxValue){
        return income >= minValue && income <= maxValue;
    }

    public boolean isAgeLowerThan(int value){
        return age < value;
    }

    public boolean isFromLocation(String location){
        return this.location.equalsIgnoreCase(location);
    }

    public boolean isIncomeEqualOrHigher(double value){
        return income >= value;
    }

}
