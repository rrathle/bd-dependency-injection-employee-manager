package main;

import dagger.Module;
import dagger.Provides;

@Module
public class BankClientModule {
    @Provides
    public BankClient provideBankClient() {
        return new BankClient();
    }
}
