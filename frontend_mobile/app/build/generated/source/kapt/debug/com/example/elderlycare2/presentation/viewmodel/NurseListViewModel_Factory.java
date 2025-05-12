package com.example.elderlycare2.presentation.viewmodel;

import com.example.elderlycare2.data.repository.NurseRepository;
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
public final class NurseListViewModel_Factory implements Factory<NurseListViewModel> {
  private final Provider<NurseRepository> nurseListRepositoryProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public NurseListViewModel_Factory(Provider<NurseRepository> nurseListRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.nurseListRepositoryProvider = nurseListRepositoryProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  @Override
  public NurseListViewModel get() {
    return newInstance(nurseListRepositoryProvider.get(), sessionManagerProvider.get());
  }

  public static NurseListViewModel_Factory create(
      Provider<NurseRepository> nurseListRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new NurseListViewModel_Factory(nurseListRepositoryProvider, sessionManagerProvider);
  }

  public static NurseListViewModel newInstance(NurseRepository nurseListRepository,
      SessionManager sessionManager) {
    return new NurseListViewModel(nurseListRepository, sessionManager);
  }
}
