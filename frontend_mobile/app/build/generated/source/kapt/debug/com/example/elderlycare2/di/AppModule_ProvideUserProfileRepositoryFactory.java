package com.example.elderlycare2.di;

import com.example.elderlycare2.data.api.UserProfileApi;
import com.example.elderlycare2.data.repository.UserProfileRepository;
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
public final class AppModule_ProvideUserProfileRepositoryFactory implements Factory<UserProfileRepository> {
  private final Provider<UserProfileApi> userProfileApiProvider;

  public AppModule_ProvideUserProfileRepositoryFactory(
      Provider<UserProfileApi> userProfileApiProvider) {
    this.userProfileApiProvider = userProfileApiProvider;
  }

  @Override
  public UserProfileRepository get() {
    return provideUserProfileRepository(userProfileApiProvider.get());
  }

  public static AppModule_ProvideUserProfileRepositoryFactory create(
      Provider<UserProfileApi> userProfileApiProvider) {
    return new AppModule_ProvideUserProfileRepositoryFactory(userProfileApiProvider);
  }

  public static UserProfileRepository provideUserProfileRepository(UserProfileApi userProfileApi) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideUserProfileRepository(userProfileApi));
  }
}
