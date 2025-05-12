package com.example.elderlycare2.di;

import com.example.elderlycare2.data.api.VisitDetailsApiService;
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
public final class NetworkModule_ProvideVisitDetailsApiServiceFactory implements Factory<VisitDetailsApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideVisitDetailsApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public VisitDetailsApiService get() {
    return provideVisitDetailsApiService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideVisitDetailsApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideVisitDetailsApiServiceFactory(retrofitProvider);
  }

  public static VisitDetailsApiService provideVisitDetailsApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideVisitDetailsApiService(retrofit));
  }
}
