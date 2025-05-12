package com.example.elderlycare2.di;

import com.example.elderlycare2.data.api.SignUpApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import retrofit2.Retrofit;

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
public final class NetworkModule_ProvideSignUpApiServiceFactory implements Factory<SignUpApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideSignUpApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public SignUpApiService get() {
    return provideSignUpApiService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideSignUpApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideSignUpApiServiceFactory(retrofitProvider);
  }

  public static SignUpApiService provideSignUpApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideSignUpApiService(retrofit));
  }
}
