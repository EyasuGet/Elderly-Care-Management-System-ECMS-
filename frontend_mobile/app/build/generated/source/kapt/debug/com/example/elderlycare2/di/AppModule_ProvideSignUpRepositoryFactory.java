package com.example.elderlycare2.di;

import com.example.elderlycare2.data.api.SignUpApiService;
import com.example.elderlycare2.data.repository.SignUpRepository;
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
public final class AppModule_ProvideSignUpRepositoryFactory implements Factory<SignUpRepository> {
  private final Provider<SignUpApiService> signUpApiServiceProvider;

  public AppModule_ProvideSignUpRepositoryFactory(
      Provider<SignUpApiService> signUpApiServiceProvider) {
    this.signUpApiServiceProvider = signUpApiServiceProvider;
  }

  @Override
  public SignUpRepository get() {
    return provideSignUpRepository(signUpApiServiceProvider.get());
  }

  public static AppModule_ProvideSignUpRepositoryFactory create(
      Provider<SignUpApiService> signUpApiServiceProvider) {
    return new AppModule_ProvideSignUpRepositoryFactory(signUpApiServiceProvider);
  }

  public static SignUpRepository provideSignUpRepository(SignUpApiService signUpApiService) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSignUpRepository(signUpApiService));
  }
}
