package com.amazon.ata.dependencyinjection.prework;

import com.banking.business.payroll.client.BankClient;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class BankClientModule {
    @Provides
    @Singleton
    public BankClient provideBankClient() {
        return new BankClient();
    }
}
