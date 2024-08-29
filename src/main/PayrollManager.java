package main;

import java.math.BigDecimal;
import java.util.List;
import main.DaggerPayrollManagerComponent;


public class PayrollManager {
    /**
     * Main method of project.
     * @param args Main method parameter
     */
    public static void main(String[] args) {
        PayrollManagerComponent component = DaggerPayrollManagerComponent.create();

        // Get the instances of EmployeePaymentDistributor and HumanResourcesClient from Dagger
        EmployeePaymentDistributor employeePaymentDistributor = component.provideEmployeePaymentDistributor();
        HumanResourcesClient humanResourcesClient = component.provideHumanResourcesClient();

        // Run the payroll using the injected dependencies
        runPayroll(employeePaymentDistributor, humanResourcesClient);
    }
    private static void runPayroll(EmployeePaymentDistributor employeePaymentDistributor, HumanResourcesClient humanResourcesClient) {
        List<Employee> payroll = humanResourcesClient.getNextPayrollEmployees();

        for (Employee employee : payroll) {
            BigDecimal updatedBalance = employeePaymentDistributor.payEmployee(employee);
            System.out.println("Updated balance: $" + updatedBalance.setScale(2, BigDecimal.ROUND_HALF_UP));
        }
    }
}
