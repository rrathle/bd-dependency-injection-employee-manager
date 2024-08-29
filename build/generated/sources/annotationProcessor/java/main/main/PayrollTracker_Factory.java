package main;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PayrollTracker_Factory implements Factory<PayrollTracker> {
  private final Provider<BankClient> bankClientProvider;

  public PayrollTracker_Factory(Provider<BankClient> bankClientProvider) {
    this.bankClientProvider = bankClientProvider;
  }

  @Override
  public PayrollTracker get() {
    return newInstance(bankClientProvider.get());
  }

  public static PayrollTracker_Factory create(Provider<BankClient> bankClientProvider) {
    return new PayrollTracker_Factory(bankClientProvider);
  }

  public static PayrollTracker newInstance(BankClient bankClient) {
    return new PayrollTracker(bankClient);
  }
}
