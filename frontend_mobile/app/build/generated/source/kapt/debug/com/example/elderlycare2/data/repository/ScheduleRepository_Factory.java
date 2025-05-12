package com.example.elderlycare2.data.repository;

import com.example.elderlycare2.data.api.ScheduleApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ScheduleRepository_Factory implements Factory<ScheduleRepository> {
  private final Provider<ScheduleApi> scheduleApiProvider;

  public ScheduleRepository_Factory(Provider<ScheduleApi> scheduleApiProvider) {
    this.scheduleApiProvider = scheduleApiProvider;
  }

  @Override
  public ScheduleRepository get() {
    return newInstance(scheduleApiProvider.get());
  }

  public static ScheduleRepository_Factory create(Provider<ScheduleApi> scheduleApiProvider) {
    return new ScheduleRepository_Factory(scheduleApiProvider);
  }

  public static ScheduleRepository newInstance(ScheduleApi scheduleApi) {
    return new ScheduleRepository(scheduleApi);
  }
}
