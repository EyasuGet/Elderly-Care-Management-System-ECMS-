package com.example.elderlycare2.di;

import com.example.elderlycare2.data.api.LoginApiService;
import com.example.elderlycare2.data.repository.LoginRepository;
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
public final class AppModule_ProvideLoginRepositoryFactory implements Factory<LoginRepository> {
  private final Provider<LoginApiService> loginApiServiceProvider;

  public AppModule_ProvideLoginRepositoryFactory(
      Provider<LoginApiService> loginApiServiceProvider) {
    this.loginApiServiceProvider = loginApiServiceProvider;
  }

  @Override
  public LoginRepository get() {
    return provideLoginRepository(loginApiServiceProvider.get());
  }

  public static AppModule_ProvideLoginRepositoryFactory create(
      Provider<LoginApiService> loginApiServiceProvider) {
    return new AppModule_ProvideLoginRepositoryFactory(loginApiServiceProvider);
  }

  public static LoginRepository provideLoginRepository(LoginApiService loginApiService) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideLoginRepository(loginApiService));
  }
}
