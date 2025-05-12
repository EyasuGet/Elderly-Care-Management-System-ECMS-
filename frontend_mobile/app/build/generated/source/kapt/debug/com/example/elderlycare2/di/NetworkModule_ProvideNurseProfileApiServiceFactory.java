package com.example.elderlycare2.di;

import com.example.elderlycare2.data.api.NurseProfileApiService;
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
public final class NetworkModule_ProvideNurseProfileApiServiceFactory implements Factory<NurseProfileApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideNurseProfileApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public NurseProfileApiService get() {
    return provideNurseProfileApiService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideNurseProfileApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideNurseProfileApiServiceFactory(retrofitProvider);
  }

  public static NurseProfileApiService provideNurseProfileApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideNurseProfileApiService(retrofit));
  }
}
