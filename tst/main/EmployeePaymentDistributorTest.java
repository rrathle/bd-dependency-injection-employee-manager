package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeePaymentDistributorTest {
    private EmployeePaymentDistributor employeePaymentDistributor;

    @BeforeEach
    public void setup() {
        employeePaymentDistributor = DaggerPayrollManagerComponent.create().provideEmployeePaymentDistributor();
    }

    @Test
    public void employeeHasBeenPaid_withPaidEmployee_checksThePayrollTrackersSetOfPaidEmployees() {
        // GIVEN a paid employee
        BigDecimal salary = BigDecimal.valueOf(500);
        Employee employee = new Employee(salary);
        employeePaymentDistributor.payEmployee(employee);

        // WHEN we check if an employee has been paid
        boolean hasBeenPaid = employeePaymentDistributor.employeeHasBeenPaid(employee);

        // THEN assert it is return true
        assertTrue(hasBeenPaid,
            "Expected hasBeenPaid to be true for an employee who has been paid");
    }
}
