package main;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BankClientModule_ProvideBankClientFactory implements Factory<BankClient> {
  private final BankClientModule module;

  public BankClientModule_ProvideBankClientFactory(BankClientModule module) {
    this.module = module;
  }

  @Override
  public BankClient get() {
    return provideBankClient(module);
  }

  public static BankClientModule_ProvideBankClientFactory create(BankClientModule module) {
    return new BankClientModule_ProvideBankClientFactory(module);
  }

  public static BankClient provideBankClient(BankClientModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideBankClient());
  }
}
