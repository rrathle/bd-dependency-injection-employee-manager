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
public final class EmployeePaymentDistributor_Factory implements Factory<EmployeePaymentDistributor> {
  private final Provider<PayrollTracker> payrollTrackerProvider;

  public EmployeePaymentDistributor_Factory(Provider<PayrollTracker> payrollTrackerProvider) {
    this.payrollTrackerProvider = payrollTrackerProvider;
  }

  @Override
  public EmployeePaymentDistributor get() {
    return newInstance(payrollTrackerProvider.get());
  }

  public static EmployeePaymentDistributor_Factory create(
      Provider<PayrollTracker> payrollTrackerProvider) {
    return new EmployeePaymentDistributor_Factory(payrollTrackerProvider);
  }

  public static EmployeePaymentDistributor newInstance(PayrollTracker payrollTracker) {
    return new EmployeePaymentDistributor(payrollTracker);
  }
}
