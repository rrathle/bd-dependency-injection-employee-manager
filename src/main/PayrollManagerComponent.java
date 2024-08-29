package main;

import dagger.Component;

@Component(modules = {BankClientModule.class})
interface PayrollManagerComponent {
    HumanResourcesClient provideHumanResourcesClient();
    EmployeePaymentDistributor provideEmployeePaymentDistributor();
}

