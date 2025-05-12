package com.example.elderlycare2.di;

import com.example.elderlycare2.data.api.UserProfileApi;
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
public final class NetworkModule_ProvideUserProfileApiFactory implements Factory<UserProfileApi> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideUserProfileApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public UserProfileApi get() {
    return provideUserProfileApi(retrofitProvider.get());
  }

  public static NetworkModule_ProvideUserProfileApiFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideUserProfileApiFactory(retrofitProvider);
  }

  public static UserProfileApi provideUserProfileApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideUserProfileApi(retrofit));
  }
}
