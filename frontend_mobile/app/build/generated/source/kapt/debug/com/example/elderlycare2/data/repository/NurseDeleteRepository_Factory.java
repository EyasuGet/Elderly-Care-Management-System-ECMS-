package com.example.elderlycare2.data.repository;

import com.example.elderlycare2.data.api.NurseApiService;
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
public final class NurseDeleteRepository_Factory implements Factory<NurseDeleteRepository> {
  private final Provider<NurseApiService> nurseApiServiceProvider;

  public NurseDeleteRepository_Factory(Provider<NurseApiService> nurseApiServiceProvider) {
    this.nurseApiServiceProvider = nurseApiServiceProvider;
  }

  @Override
  public NurseDeleteRepository get() {
    return newInstance(nurseApiServiceProvider.get());
  }

  public static NurseDeleteRepository_Factory create(
      Provider<NurseApiService> nurseApiServiceProvider) {
    return new NurseDeleteRepository_Factory(nurseApiServiceProvider);
  }

  public static NurseDeleteRepository newInstance(NurseApiService nurseApiService) {
    return new NurseDeleteRepository(nurseApiService);
  }
}
