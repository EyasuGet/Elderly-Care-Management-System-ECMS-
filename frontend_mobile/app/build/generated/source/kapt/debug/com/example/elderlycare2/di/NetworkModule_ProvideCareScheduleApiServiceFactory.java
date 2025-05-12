package com.example.elderlycare2.di;

import com.example.elderlycare2.data.api.CareScheduleApiService;
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
public final class NetworkModule_ProvideCareScheduleApiServiceFactory implements Factory<CareScheduleApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideCareScheduleApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public CareScheduleApiService get() {
    return provideCareScheduleApiService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideCareScheduleApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideCareScheduleApiServiceFactory(retrofitProvider);
  }

  public static CareScheduleApiService provideCareScheduleApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideCareScheduleApiService(retrofit));
  }
}
