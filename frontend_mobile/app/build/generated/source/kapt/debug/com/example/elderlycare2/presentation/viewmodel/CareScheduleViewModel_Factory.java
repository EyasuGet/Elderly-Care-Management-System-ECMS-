package com.example.elderlycare2.presentation.viewmodel;

import com.example.elderlycare2.data.repository.CareScheduleRepository;
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
public final class CareScheduleViewModel_Factory implements Factory<CareScheduleViewModel> {
  private final Provider<CareScheduleRepository> careScheduleRepositoryProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public CareScheduleViewModel_Factory(
      Provider<CareScheduleRepository> careScheduleRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.careScheduleRepositoryProvider = careScheduleRepositoryProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  @Override
  public CareScheduleViewModel get() {
    return newInstance(careScheduleRepositoryProvider.get(), sessionManagerProvider.get());
  }

  public static CareScheduleViewModel_Factory create(
      Provider<CareScheduleRepository> careScheduleRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new CareScheduleViewModel_Factory(careScheduleRepositoryProvider, sessionManagerProvider);
  }

  public static CareScheduleViewModel newInstance(CareScheduleRepository careScheduleRepository,
      SessionManager sessionManager) {
    return new CareScheduleViewModel(careScheduleRepository, sessionManager);
  }
}
