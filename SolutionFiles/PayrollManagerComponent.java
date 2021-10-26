package com.amazon.ata.dependencyinjection.prework;

import dagger.Component;

import javax.inject.Singleton;

@Component(modules = { BankClientModule.class })
@Singleton
interface PayrollManagerComponent {
    EmployeePaymentDistributor provideEmployeePaymentDistributor();
    HumanResourcesClient provideHumanResourcesClient();
}
