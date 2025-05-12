package com.example.elderlycare2.presentation.viewmodel;

import com.example.elderlycare2.data.repository.ScheduleRepository;
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
public final class TimeScheduleViewModel_Factory implements Factory<TimeScheduleViewModel> {
  private final Provider<ScheduleRepository> scheduleRepositoryProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public TimeScheduleViewModel_Factory(Provider<ScheduleRepository> scheduleRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.scheduleRepositoryProvider = scheduleRepositoryProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  @Override
  public TimeScheduleViewModel get() {
    return newInstance(scheduleRepositoryProvider.get(), sessionManagerProvider.get());
  }

  public static TimeScheduleViewModel_Factory create(
      Provider<ScheduleRepository> scheduleRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new TimeScheduleViewModel_Factory(scheduleRepositoryProvider, sessionManagerProvider);
  }

  public static TimeScheduleViewModel newInstance(ScheduleRepository scheduleRepository,
      SessionManager sessionManager) {
    return new TimeScheduleViewModel(scheduleRepository, sessionManager);
  }
}
