package com.example.elderlycare2.presentation.viewmodel;

import com.example.elderlycare2.data.repository.LoginRepository;
import com.example.elderlycare2.data.repository.ViewDetailRepository;
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
public final class ViewDetailViewModel_Factory implements Factory<ViewDetailViewModel> {
  private final Provider<LoginRepository> loginRepositoryProvider;

  private final Provider<ViewDetailRepository> viewDetailRepositoryProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public ViewDetailViewModel_Factory(Provider<LoginRepository> loginRepositoryProvider,
      Provider<ViewDetailRepository> viewDetailRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.loginRepositoryProvider = loginRepositoryProvider;
    this.viewDetailRepositoryProvider = viewDetailRepositoryProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  @Override
  public ViewDetailViewModel get() {
    return newInstance(loginRepositoryProvider.get(), viewDetailRepositoryProvider.get(), sessionManagerProvider.get());
  }

  public static ViewDetailViewModel_Factory create(
      Provider<LoginRepository> loginRepositoryProvider,
      Provider<ViewDetailRepository> viewDetailRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new ViewDetailViewModel_Factory(loginRepositoryProvider, viewDetailRepositoryProvider, sessionManagerProvider);
  }

  public static ViewDetailViewModel newInstance(LoginRepository loginRepository,
      ViewDetailRepository viewDetailRepository, SessionManager sessionManager) {
    return new ViewDetailViewModel(loginRepository, viewDetailRepository, sessionManager);
  }
}
