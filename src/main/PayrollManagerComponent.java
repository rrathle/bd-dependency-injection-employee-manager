package main;

import dagger.Component;

@Component
interface PayrollManagerComponent {

    EmployeePaymentDistributor provideEmployeePaymentDistributor();
    HumanResourcesClient provideHumanResourcesClient();

}
