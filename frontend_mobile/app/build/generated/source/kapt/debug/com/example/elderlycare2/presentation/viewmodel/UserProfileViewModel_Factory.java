package com.example.elderlycare2.presentation.viewmodel;

import com.example.elderlycare2.data.repository.UserProfileRepository;
import com.example.elderlycare2.utils.SessionManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class UserProfileViewModel_Factory implements Factory<UserProfileViewModel> {
  private final Provider<UserProfileRepository> userProfileRepositoryProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public UserProfileViewModel_Factory(Provider<UserProfileRepository> userProfileRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.userProfileRepositoryProvider = userProfileRepositoryProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  @Override
  public UserProfileViewModel get() {
    return newInstance(userProfileRepositoryProvider.get(), sessionManagerProvider.get());
  }

  public static UserProfileViewModel_Factory create(
      Provider<UserProfileRepository> userProfileRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new UserProfileViewModel_Factory(userProfileRepositoryProvider, sessionManagerProvider);
  }

  public static UserProfileViewModel newInstance(UserProfileRepository userProfileRepository,
      SessionManager sessionManager) {
    return new UserProfileViewModel(userProfileRepository, sessionManager);
  }
}
