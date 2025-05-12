package com.example.elderlycare2.data.repository;

import com.example.elderlycare2.data.api.SignUpApiService;
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
public final class SignUpRepository_Factory implements Factory<SignUpRepository> {
  private final Provider<SignUpApiService> signUpApiServiceProvider;

  public SignUpRepository_Factory(Provider<SignUpApiService> signUpApiServiceProvider) {
    this.signUpApiServiceProvider = signUpApiServiceProvider;
  }

  @Override
  public SignUpRepository get() {
    return newInstance(signUpApiServiceProvider.get());
  }

  public static SignUpRepository_Factory create(
      Provider<SignUpApiService> signUpApiServiceProvider) {
    return new SignUpRepository_Factory(signUpApiServiceProvider);
  }

  public static SignUpRepository newInstance(SignUpApiService signUpApiService) {
    return new SignUpRepository(signUpApiService);
  }
}
