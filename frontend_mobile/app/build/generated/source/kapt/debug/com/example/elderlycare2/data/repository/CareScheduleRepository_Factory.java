package com.example.elderlycare2.data.repository;

import com.example.elderlycare2.data.api.CareScheduleApiService;
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
public final class CareScheduleRepository_Factory implements Factory<CareScheduleRepository> {
  private final Provider<CareScheduleApiService> careScheduleApiServiceProvider;

  public CareScheduleRepository_Factory(
      Provider<CareScheduleApiService> careScheduleApiServiceProvider) {
    this.careScheduleApiServiceProvider = careScheduleApiServiceProvider;
  }

  @Override
  public CareScheduleRepository get() {
    return newInstance(careScheduleApiServiceProvider.get());
  }

  public static CareScheduleRepository_Factory create(
      Provider<CareScheduleApiService> careScheduleApiServiceProvider) {
    return new CareScheduleRepository_Factory(careScheduleApiServiceProvider);
  }

  public static CareScheduleRepository newInstance(CareScheduleApiService careScheduleApiService) {
    return new CareScheduleRepository(careScheduleApiService);
  }
}
