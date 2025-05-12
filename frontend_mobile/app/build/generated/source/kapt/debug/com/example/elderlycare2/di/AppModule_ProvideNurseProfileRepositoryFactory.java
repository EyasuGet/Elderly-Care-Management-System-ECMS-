package com.example.elderlycare2.di;

import com.example.elderlycare2.data.api.NurseProfileApiService;
import com.example.elderlycare2.data.repository.NurseProfileRespository;
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
public final class AppModule_ProvideNurseProfileRepositoryFactory implements Factory<NurseProfileRespository> {
  private final Provider<NurseProfileApiService> nurseProfileApiServiceProvider;

  public AppModule_ProvideNurseProfileRepositoryFactory(
      Provider<NurseProfileApiService> nurseProfileApiServiceProvider) {
    this.nurseProfileApiServiceProvider = nurseProfileApiServiceProvider;
  }

  @Override
  public NurseProfileRespository get() {
    return provideNurseProfileRepository(nurseProfileApiServiceProvider.get());
  }

  public static AppModule_ProvideNurseProfileRepositoryFactory create(
      Provider<NurseProfileApiService> nurseProfileApiServiceProvider) {
    return new AppModule_ProvideNurseProfileRepositoryFactory(nurseProfileApiServiceProvider);
  }

  public static NurseProfileRespository provideNurseProfileRepository(
      NurseProfileApiService nurseProfileApiService) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNurseProfileRepository(nurseProfileApiService));
  }
}
