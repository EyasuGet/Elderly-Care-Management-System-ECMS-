package com.example.elderlycare2.data.repository;

import com.example.elderlycare2.data.api.NurseApiService;
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
public final class NurseRepository_Factory implements Factory<NurseRepository> {
  private final Provider<NurseApiService> nurseApiServiceProvider;

  public NurseRepository_Factory(Provider<NurseApiService> nurseApiServiceProvider) {
    this.nurseApiServiceProvider = nurseApiServiceProvider;
  }

  @Override
  public NurseRepository get() {
    return newInstance(nurseApiServiceProvider.get());
  }

  public static NurseRepository_Factory create(Provider<NurseApiService> nurseApiServiceProvider) {
    return new NurseRepository_Factory(nurseApiServiceProvider);
  }

  public static NurseRepository newInstance(NurseApiService nurseApiService) {
    return new NurseRepository(nurseApiService);
  }
}
