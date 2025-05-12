package com.example.elderlycare2.data.repository;

import com.example.elderlycare2.data.api.VisitDetailsApiService;
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
public final class ViewDetailRepository_Factory implements Factory<ViewDetailRepository> {
  private final Provider<VisitDetailsApiService> visitDetailsApiServiceProvider;

  public ViewDetailRepository_Factory(
      Provider<VisitDetailsApiService> visitDetailsApiServiceProvider) {
    this.visitDetailsApiServiceProvider = visitDetailsApiServiceProvider;
  }

  @Override
  public ViewDetailRepository get() {
    return newInstance(visitDetailsApiServiceProvider.get());
  }

  public static ViewDetailRepository_Factory create(
      Provider<VisitDetailsApiService> visitDetailsApiServiceProvider) {
    return new ViewDetailRepository_Factory(visitDetailsApiServiceProvider);
  }

  public static ViewDetailRepository newInstance(VisitDetailsApiService visitDetailsApiService) {
    return new ViewDetailRepository(visitDetailsApiService);
  }
}
