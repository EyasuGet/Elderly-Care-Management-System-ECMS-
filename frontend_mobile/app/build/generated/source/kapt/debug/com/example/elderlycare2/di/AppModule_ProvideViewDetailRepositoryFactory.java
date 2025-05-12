package com.example.elderlycare2.di;

import com.example.elderlycare2.data.api.VisitDetailsApiService;
import com.example.elderlycare2.data.repository.ViewDetailRepository;
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
public final class AppModule_ProvideViewDetailRepositoryFactory implements Factory<ViewDetailRepository> {
  private final Provider<VisitDetailsApiService> viewDetailsApiServiceProvider;

  public AppModule_ProvideViewDetailRepositoryFactory(
      Provider<VisitDetailsApiService> viewDetailsApiServiceProvider) {
    this.viewDetailsApiServiceProvider = viewDetailsApiServiceProvider;
  }

  @Override
  public ViewDetailRepository get() {
    return provideViewDetailRepository(viewDetailsApiServiceProvider.get());
  }

  public static AppModule_ProvideViewDetailRepositoryFactory create(
      Provider<VisitDetailsApiService> viewDetailsApiServiceProvider) {
    return new AppModule_ProvideViewDetailRepositoryFactory(viewDetailsApiServiceProvider);
  }

  public static ViewDetailRepository provideViewDetailRepository(
      VisitDetailsApiService viewDetailsApiService) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideViewDetailRepository(viewDetailsApiService));
  }
}
