package com.example.elderlycare2.presentation.viewmodel;

import com.example.elderlycare2.data.repository.LoginRepository;
import com.example.elderlycare2.utils.SessionManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<LoginRepository> loginRepositoryProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public LoginViewModel_Factory(Provider<LoginRepository> loginRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.loginRepositoryProvider = loginRepositoryProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(loginRepositoryProvider.get(), sessionManagerProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<LoginRepository> loginRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new LoginViewModel_Factory(loginRepositoryProvider, sessionManagerProvider);
  }

  public static LoginViewModel newInstance(LoginRepository loginRepository,
      SessionManager sessionManager) {
    return new LoginViewModel(loginRepository, sessionManager);
  }
}
