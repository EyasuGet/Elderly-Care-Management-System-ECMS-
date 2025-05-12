package com.example.elderlycare2.data.repository;

import com.example.elderlycare2.data.api.UserProfileApi;
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
public final class UserProfileRepository_Factory implements Factory<UserProfileRepository> {
  private final Provider<UserProfileApi> userProfileApiProvider;

  public UserProfileRepository_Factory(Provider<UserProfileApi> userProfileApiProvider) {
    this.userProfileApiProvider = userProfileApiProvider;
  }

  @Override
  public UserProfileRepository get() {
    return newInstance(userProfileApiProvider.get());
  }

  public static UserProfileRepository_Factory create(
      Provider<UserProfileApi> userProfileApiProvider) {
    return new UserProfileRepository_Factory(userProfileApiProvider);
  }

  public static UserProfileRepository newInstance(UserProfileApi userProfileApi) {
    return new UserProfileRepository(userProfileApi);
  }
}
