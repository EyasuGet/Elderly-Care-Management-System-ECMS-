package com.example.elderlycare2.di;

import com.example.elderlycare2.data.api.ScheduleApi;
import com.example.elderlycare2.data.repository.ScheduleRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideScheduleRepositoryFactory implements Factory<ScheduleRepository> {
  private final Provider<ScheduleApi> scheduleApiProvider;

  public AppModule_ProvideScheduleRepositoryFactory(Provider<ScheduleApi> scheduleApiProvider) {
    this.scheduleApiProvider = scheduleApiProvider;
  }

  @Override
  public ScheduleRepository get() {
    return provideScheduleRepository(scheduleApiProvider.get());
  }

  public static AppModule_ProvideScheduleRepositoryFactory create(
      Provider<ScheduleApi> scheduleApiProvider) {
    return new AppModule_ProvideScheduleRepositoryFactory(scheduleApiProvider);
  }

  public static ScheduleRepository provideScheduleRepository(ScheduleApi scheduleApi) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideScheduleRepository(scheduleApi));
  }
}
