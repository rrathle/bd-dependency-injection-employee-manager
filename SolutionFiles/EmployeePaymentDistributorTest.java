package com.amazon.ata.dependencyinjection.prework;

import com.google.common.collect.ImmutableSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class EmployeePaymentDistributorTest {
    @InjectMocks
    private EmployeePaymentDistributor employeePaymentDistributor;

    @Mock
    private PayrollTracker payrollTracker;

    @BeforeEach
    public void setup() {
        initMocks(this);
    }

    @Test
    public void employeeHasBeenPaid_withPaidEmployee_checksThePayrollTrackersSetOfPaidEmployees() {
        // GIVEN a paid employee
        BigDecimal salary = BigDecimal.valueOf(500);
        Employee employee = new Employee(salary);
        employeePaymentDistributor.payEmployee(employee);
        when(payrollTracker.getPaidEmployees()).thenReturn(ImmutableSet.of(employee));

        // WHEN we check if an employee has been paid
        boolean hasBeenPaid = employeePaymentDistributor.employeeHasBeenPaid(employee);

        // THEN assert it is return true
        assertTrue(hasBeenPaid,
            "Expected hasBeenPaid to be true for an employee who has been paid");
    }
}
