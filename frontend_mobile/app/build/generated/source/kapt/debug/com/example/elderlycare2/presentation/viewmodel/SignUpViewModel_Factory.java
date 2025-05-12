package com.example.elderlycare2.presentation.viewmodel;

import com.example.elderlycare2.data.repository.SignUpRepository;
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
public final class SignUpViewModel_Factory implements Factory<SignUpViewModel> {
  private final Provider<SignUpRepository> signUpRepositoryProvider;

  public SignUpViewModel_Factory(Provider<SignUpRepository> signUpRepositoryProvider) {
    this.signUpRepositoryProvider = signUpRepositoryProvider;
  }

  @Override
  public SignUpViewModel get() {
    return newInstance(signUpRepositoryProvider.get());
  }

  public static SignUpViewModel_Factory create(
      Provider<SignUpRepository> signUpRepositoryProvider) {
    return new SignUpViewModel_Factory(signUpRepositoryProvider);
  }

  public static SignUpViewModel newInstance(SignUpRepository signUpRepository) {
    return new SignUpViewModel(signUpRepository);
  }
}
