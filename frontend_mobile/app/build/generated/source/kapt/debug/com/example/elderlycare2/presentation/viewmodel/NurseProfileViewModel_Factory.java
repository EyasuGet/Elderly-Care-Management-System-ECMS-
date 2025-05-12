package com.example.elderlycare2.presentation.viewmodel;

import com.example.elderlycare2.data.repository.NurseProfileRespository;
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
public final class NurseProfileViewModel_Factory implements Factory<NurseProfileViewModel> {
  private final Provider<NurseProfileRespository> nurseProfileRepositoryProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public NurseProfileViewModel_Factory(
      Provider<NurseProfileRespository> nurseProfileRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.nurseProfileRepositoryProvider = nurseProfileRepositoryProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  @Override
  public NurseProfileViewModel get() {
    return newInstance(nurseProfileRepositoryProvider.get(), sessionManagerProvider.get());
  }

  public static NurseProfileViewModel_Factory create(
      Provider<NurseProfileRespository> nurseProfileRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new NurseProfileViewModel_Factory(nurseProfileRepositoryProvider, sessionManagerProvider);
  }

  public static NurseProfileViewModel newInstance(NurseProfileRespository nurseProfileRepository,
      SessionManager sessionManager) {
    return new NurseProfileViewModel(nurseProfileRepository, sessionManager);
  }
}
