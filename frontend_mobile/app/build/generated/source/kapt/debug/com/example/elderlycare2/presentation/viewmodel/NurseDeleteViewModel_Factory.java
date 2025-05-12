package com.example.elderlycare2.presentation.viewmodel;

import com.example.elderlycare2.data.repository.NurseDeleteRepository;
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
public final class NurseDeleteViewModel_Factory implements Factory<NurseDeleteViewModel> {
  private final Provider<NurseDeleteRepository> nurseDeleteRepositoryProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public NurseDeleteViewModel_Factory(Provider<NurseDeleteRepository> nurseDeleteRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.nurseDeleteRepositoryProvider = nurseDeleteRepositoryProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  @Override
  public NurseDeleteViewModel get() {
    return newInstance(nurseDeleteRepositoryProvider.get(), sessionManagerProvider.get());
  }

  public static NurseDeleteViewModel_Factory create(
      Provider<NurseDeleteRepository> nurseDeleteRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new NurseDeleteViewModel_Factory(nurseDeleteRepositoryProvider, sessionManagerProvider);
  }

  public static NurseDeleteViewModel newInstance(NurseDeleteRepository nurseDeleteRepository,
      SessionManager sessionManager) {
    return new NurseDeleteViewModel(nurseDeleteRepository, sessionManager);
  }
}
