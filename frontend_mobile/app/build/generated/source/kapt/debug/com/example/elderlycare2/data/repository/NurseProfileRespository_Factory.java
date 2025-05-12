package com.example.elderlycare2.data.repository;

import com.example.elderlycare2.data.api.NurseProfileApiService;
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
public final class NurseProfileRespository_Factory implements Factory<NurseProfileRespository> {
  private final Provider<NurseProfileApiService> nurseProfileApiServiceProvider;

  public NurseProfileRespository_Factory(
      Provider<NurseProfileApiService> nurseProfileApiServiceProvider) {
    this.nurseProfileApiServiceProvider = nurseProfileApiServiceProvider;
  }

  @Override
  public NurseProfileRespository get() {
    return newInstance(nurseProfileApiServiceProvider.get());
  }

  public static NurseProfileRespository_Factory create(
      Provider<NurseProfileApiService> nurseProfileApiServiceProvider) {
    return new NurseProfileRespository_Factory(nurseProfileApiServiceProvider);
  }

  public static NurseProfileRespository newInstance(NurseProfileApiService nurseProfileApiService) {
    return new NurseProfileRespository(nurseProfileApiService);
  }
}
