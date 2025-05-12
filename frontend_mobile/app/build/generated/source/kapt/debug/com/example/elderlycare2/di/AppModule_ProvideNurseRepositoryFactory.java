package com.example.elderlycare2.di;

import com.example.elderlycare2.data.api.NurseApiService;
import com.example.elderlycare2.data.repository.NurseRepository;
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
public final class AppModule_ProvideNurseRepositoryFactory implements Factory<NurseRepository> {
  private final Provider<NurseApiService> nurseApiServiceProvider;

  public AppModule_ProvideNurseRepositoryFactory(
      Provider<NurseApiService> nurseApiServiceProvider) {
    this.nurseApiServiceProvider = nurseApiServiceProvider;
  }

  @Override
  public NurseRepository get() {
    return provideNurseRepository(nurseApiServiceProvider.get());
  }

  public static AppModule_ProvideNurseRepositoryFactory create(
      Provider<NurseApiService> nurseApiServiceProvider) {
    return new AppModule_ProvideNurseRepositoryFactory(nurseApiServiceProvider);
  }

  public static NurseRepository provideNurseRepository(NurseApiService nurseApiService) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNurseRepository(nurseApiService));
  }
}
