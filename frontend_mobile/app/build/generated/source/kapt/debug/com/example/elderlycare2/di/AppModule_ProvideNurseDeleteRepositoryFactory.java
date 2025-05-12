package com.example.elderlycare2.di;

import com.example.elderlycare2.data.api.NurseApiService;
import com.example.elderlycare2.data.repository.NurseDeleteRepository;
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
public final class AppModule_ProvideNurseDeleteRepositoryFactory implements Factory<NurseDeleteRepository> {
  private final Provider<NurseApiService> nurseApiServiceProvider;

  public AppModule_ProvideNurseDeleteRepositoryFactory(
      Provider<NurseApiService> nurseApiServiceProvider) {
    this.nurseApiServiceProvider = nurseApiServiceProvider;
  }

  @Override
  public NurseDeleteRepository get() {
    return provideNurseDeleteRepository(nurseApiServiceProvider.get());
  }

  public static AppModule_ProvideNurseDeleteRepositoryFactory create(
      Provider<NurseApiService> nurseApiServiceProvider) {
    return new AppModule_ProvideNurseDeleteRepositoryFactory(nurseApiServiceProvider);
  }

  public static NurseDeleteRepository provideNurseDeleteRepository(
      NurseApiService nurseApiService) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNurseDeleteRepository(nurseApiService));
  }
}
