package com.example.elderlycare2.data.repository;

import com.example.elderlycare2.data.api.LoginApiService;
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
public final class LoginRepository_Factory implements Factory<LoginRepository> {
  private final Provider<LoginApiService> loginApiServiceProvider;

  public LoginRepository_Factory(Provider<LoginApiService> loginApiServiceProvider) {
    this.loginApiServiceProvider = loginApiServiceProvider;
  }

  @Override
  public LoginRepository get() {
    return newInstance(loginApiServiceProvider.get());
  }

  public static LoginRepository_Factory create(Provider<LoginApiService> loginApiServiceProvider) {
    return new LoginRepository_Factory(loginApiServiceProvider);
  }

  public static LoginRepository newInstance(LoginApiService loginApiService) {
    return new LoginRepository(loginApiService);
  }
}
