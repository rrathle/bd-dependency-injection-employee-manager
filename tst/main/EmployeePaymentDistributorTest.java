package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class EmployeePaymentDistributorTest {
    @InjectMocks
    private EmployeePaymentDistributor employeePaymentDistributor;
    @Mock
    private PayrollTracker payrollTracker;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void employeeHasBeenPaid_withPaidEmployee_checksThePayrollTrackersSetOfPaidEmployees() {
        // GIVEN a paid employee
        BigDecimal salary = BigDecimal.valueOf(500);
        Employee employee = new Employee(salary);
        when(payrollTracker.payEmployee(employee)).thenReturn(BigDecimal.valueOf(4500));

        employeePaymentDistributor.payEmployee(employee);

        // WHEN we check if an employee has been paid
        when(payrollTracker.getPaidEmployees()).thenReturn(Set.of(employee));
        boolean hasBeenPaid = employeePaymentDistributor.employeeHasBeenPaid(employee);

        // THEN assert it is return true
        assertTrue(hasBeenPaid,
            "Expected hasBeenPaid to be true for an employee who has been paid");
    }
}
