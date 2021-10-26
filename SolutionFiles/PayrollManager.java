package com.amazon.ata.dependencyinjection.prework;

import com.banking.business.payroll.client.BankClient;

import java.math.BigDecimal;
import java.util.List;

public class PayrollManager {
    /**
     * Main method of project.
     * @param args Main method parameter
     */
    public static void main(String[] args) {
        runPayroll();
    }

    private static void runPayroll() {
        // Note that in your project, we create a helper method to ensure we only ever instantiate the
        // Dagger component once. Since this is only run once by the main method directly above, we
        // have left out that extra detail here.
        PayrollManagerComponent dagger = DaggerPayrollManagerComponent.create();
        EmployeePaymentDistributor employeePaymentDistributor = dagger.provideEmployeePaymentDistributor();
        HumanResourcesClient humanResourcesClient = dagger.provideHumanResourcesClient();

        List<Employee> payroll = humanResourcesClient.getNextPayrollEmployees();

        for (Employee employee : payroll) {
            BigDecimal updatedBalance = employeePaymentDistributor.payEmployee(employee);
            System.out.println("Updated balance: $" + updatedBalance.setScale(2, BigDecimal.ROUND_HALF_UP));
        }
    }
}
