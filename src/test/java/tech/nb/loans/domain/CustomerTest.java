package tech.nb.loans.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Nested;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import tech.nb.loans.factory.CusomerFactory;

@MockitoSettings(strictness = Strictness.LENIENT)
class CustomerTest {
    
    @Nested
    class IsIncomeEqualOrLowerThan {

        @Test
        void shouldBeTrueWhenIncomeIsEqual(){
            var customer = CusomerFactory.build(5000.0);
            
            assertTrue(customer.isIncomeEqualOrLowerThan(5000.0));
        }

        @Test
        void shouldBeTrueWhenIncomeIsLower(){
            var customer = CusomerFactory.build(5000.0);
            
            assertTrue(customer.isIncomeEqualOrLowerThan(9000.0));
        }
        @Test
        void shouldBeFalseWhenIncomeIsGreaterThanValue(){
            var customer = CusomerFactory.build(5000.0);
            
            assertFalse(customer.isIncomeEqualOrLowerThan(4000.0));
        }
    }
}
