package com.example.elderlycare2.di;

import com.example.elderlycare2.data.api.CareScheduleApiService;
import com.example.elderlycare2.data.repository.CareScheduleRepository;
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
public final class AppModule_ProvideCareScheduleRepositoryFactory implements Factory<CareScheduleRepository> {
  private final Provider<CareScheduleApiService> careScheduleApiServiceProvider;

  public AppModule_ProvideCareScheduleRepositoryFactory(
      Provider<CareScheduleApiService> careScheduleApiServiceProvider) {
    this.careScheduleApiServiceProvider = careScheduleApiServiceProvider;
  }

  @Override
  public CareScheduleRepository get() {
    return provideCareScheduleRepository(careScheduleApiServiceProvider.get());
  }

  public static AppModule_ProvideCareScheduleRepositoryFactory create(
      Provider<CareScheduleApiService> careScheduleApiServiceProvider) {
    return new AppModule_ProvideCareScheduleRepositoryFactory(careScheduleApiServiceProvider);
  }

  public static CareScheduleRepository provideCareScheduleRepository(
      CareScheduleApiService careScheduleApiService) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideCareScheduleRepository(careScheduleApiService));
  }
}
