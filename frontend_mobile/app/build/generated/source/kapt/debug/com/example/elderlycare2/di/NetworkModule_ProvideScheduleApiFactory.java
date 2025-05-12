package com.example.elderlycare2.di;

import com.example.elderlycare2.data.api.ScheduleApi;
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
public final class NetworkModule_ProvideScheduleApiFactory implements Factory<ScheduleApi> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideScheduleApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ScheduleApi get() {
    return provideScheduleApi(retrofitProvider.get());
  }

  public static NetworkModule_ProvideScheduleApiFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideScheduleApiFactory(retrofitProvider);
  }

  public static ScheduleApi provideScheduleApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideScheduleApi(retrofit));
  }
}
