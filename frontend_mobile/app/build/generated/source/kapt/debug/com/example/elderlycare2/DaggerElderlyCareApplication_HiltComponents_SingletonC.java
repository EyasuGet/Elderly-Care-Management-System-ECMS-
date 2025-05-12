package com.example.elderlycare2;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.example.elderlycare2.data.api.CareScheduleApiService;
import com.example.elderlycare2.data.api.LoginApiService;
import com.example.elderlycare2.data.api.NurseApiService;
import com.example.elderlycare2.data.api.NurseProfileApiService;
import com.example.elderlycare2.data.api.ScheduleApi;
import com.example.elderlycare2.data.api.SignUpApiService;
import com.example.elderlycare2.data.api.UserProfileApi;
import com.example.elderlycare2.data.api.VisitDetailsApiService;
import com.example.elderlycare2.data.repository.CareScheduleRepository;
import com.example.elderlycare2.data.repository.LoginRepository;
import com.example.elderlycare2.data.repository.NurseDeleteRepository;
import com.example.elderlycare2.data.repository.NurseProfileRespository;
import com.example.elderlycare2.data.repository.NurseRepository;
import com.example.elderlycare2.data.repository.ScheduleRepository;
import com.example.elderlycare2.data.repository.SignUpRepository;
import com.example.elderlycare2.data.repository.UserProfileRepository;
import com.example.elderlycare2.data.repository.ViewDetailRepository;
import com.example.elderlycare2.di.AppModule_ProvideCareScheduleRepositoryFactory;
import com.example.elderlycare2.di.AppModule_ProvideLoginRepositoryFactory;
import com.example.elderlycare2.di.AppModule_ProvideNurseDeleteRepositoryFactory;
import com.example.elderlycare2.di.AppModule_ProvideNurseProfileRepositoryFactory;
import com.example.elderlycare2.di.AppModule_ProvideNurseRepositoryFactory;
import com.example.elderlycare2.di.AppModule_ProvideScheduleRepositoryFactory;
import com.example.elderlycare2.di.AppModule_ProvideSessionManagerFactory;
import com.example.elderlycare2.di.AppModule_ProvideSignUpRepositoryFactory;
import com.example.elderlycare2.di.AppModule_ProvideUserProfileRepositoryFactory;
import com.example.elderlycare2.di.AppModule_ProvideViewDetailRepositoryFactory;
import com.example.elderlycare2.di.NetworkModule_ProvideCareScheduleApiServiceFactory;
import com.example.elderlycare2.di.NetworkModule_ProvideLoggingInterceptorFactory;
import com.example.elderlycare2.di.NetworkModule_ProvideLoginApiServiceFactory;
import com.example.elderlycare2.di.NetworkModule_ProvideNurseApiServiceFactory;
import com.example.elderlycare2.di.NetworkModule_ProvideNurseProfileApiServiceFactory;
import com.example.elderlycare2.di.NetworkModule_ProvideOkHttpClientFactory;
import com.example.elderlycare2.di.NetworkModule_ProvideRetrofitFactory;
import com.example.elderlycare2.di.NetworkModule_ProvideScheduleApiFactory;
import com.example.elderlycare2.di.NetworkModule_ProvideSignUpApiServiceFactory;
import com.example.elderlycare2.di.NetworkModule_ProvideUserProfileApiFactory;
import com.example.elderlycare2.di.NetworkModule_ProvideVisitDetailsApiServiceFactory;
import com.example.elderlycare2.presentation.viewmodel.CareScheduleViewModel;
import com.example.elderlycare2.presentation.viewmodel.CareScheduleViewModel_HiltModules;
import com.example.elderlycare2.presentation.viewmodel.CareScheduleViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.CareScheduleViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.LoginViewModel;
import com.example.elderlycare2.presentation.viewmodel.LoginViewModel_HiltModules;
import com.example.elderlycare2.presentation.viewmodel.LoginViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.LoginViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.NurseDeleteViewModel;
import com.example.elderlycare2.presentation.viewmodel.NurseDeleteViewModel_HiltModules;
import com.example.elderlycare2.presentation.viewmodel.NurseDeleteViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.NurseDeleteViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.NurseListViewModel;
import com.example.elderlycare2.presentation.viewmodel.NurseListViewModel_HiltModules;
import com.example.elderlycare2.presentation.viewmodel.NurseListViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.NurseListViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.NurseProfileViewModel;
import com.example.elderlycare2.presentation.viewmodel.NurseProfileViewModel_HiltModules;
import com.example.elderlycare2.presentation.viewmodel.NurseProfileViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.NurseProfileViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.SignUpViewModel;
import com.example.elderlycare2.presentation.viewmodel.SignUpViewModel_HiltModules;
import com.example.elderlycare2.presentation.viewmodel.SignUpViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.SignUpViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.TimeScheduleViewModel;
import com.example.elderlycare2.presentation.viewmodel.TimeScheduleViewModel_HiltModules;
import com.example.elderlycare2.presentation.viewmodel.TimeScheduleViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.TimeScheduleViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.UserProfileViewModel;
import com.example.elderlycare2.presentation.viewmodel.UserProfileViewModel_HiltModules;
import com.example.elderlycare2.presentation.viewmodel.UserProfileViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.UserProfileViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.ViewDetailViewModel;
import com.example.elderlycare2.presentation.viewmodel.ViewDetailViewModel_HiltModules;
import com.example.elderlycare2.presentation.viewmodel.ViewDetailViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.example.elderlycare2.presentation.viewmodel.ViewDetailViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.example.elderlycare2.utils.SessionManager;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

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
public final class DaggerElderlyCareApplication_HiltComponents_SingletonC {
  private DaggerElderlyCareApplication_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public ElderlyCareApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements ElderlyCareApplication_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private SavedStateHandleHolder savedStateHandleHolder;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ActivityRetainedCBuilder savedStateHandleHolder(
        SavedStateHandleHolder savedStateHandleHolder) {
      this.savedStateHandleHolder = Preconditions.checkNotNull(savedStateHandleHolder);
      return this;
    }

    @Override
    public ElderlyCareApplication_HiltComponents.ActivityRetainedC build() {
      Preconditions.checkBuilderRequirement(savedStateHandleHolder, SavedStateHandleHolder.class);
      return new ActivityRetainedCImpl(singletonCImpl, savedStateHandleHolder);
    }
  }

  private static final class ActivityCBuilder implements ElderlyCareApplication_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public ElderlyCareApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements ElderlyCareApplication_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public ElderlyCareApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements ElderlyCareApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public ElderlyCareApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements ElderlyCareApplication_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public ElderlyCareApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements ElderlyCareApplication_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public ElderlyCareApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements ElderlyCareApplication_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public ElderlyCareApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends ElderlyCareApplication_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends ElderlyCareApplication_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends ElderlyCareApplication_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends ElderlyCareApplication_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Map<Class<?>, Boolean> getViewModelKeys() {
      return LazyClassKeyMap.<Boolean>of(MapBuilder.<String, Boolean>newMapBuilder(9).put(CareScheduleViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, CareScheduleViewModel_HiltModules.KeyModule.provide()).put(LoginViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, LoginViewModel_HiltModules.KeyModule.provide()).put(NurseDeleteViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, NurseDeleteViewModel_HiltModules.KeyModule.provide()).put(NurseListViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, NurseListViewModel_HiltModules.KeyModule.provide()).put(NurseProfileViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, NurseProfileViewModel_HiltModules.KeyModule.provide()).put(SignUpViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, SignUpViewModel_HiltModules.KeyModule.provide()).put(TimeScheduleViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, TimeScheduleViewModel_HiltModules.KeyModule.provide()).put(UserProfileViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, UserProfileViewModel_HiltModules.KeyModule.provide()).put(ViewDetailViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, ViewDetailViewModel_HiltModules.KeyModule.provide()).build());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends ElderlyCareApplication_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    Provider<CareScheduleViewModel> careScheduleViewModelProvider;

    Provider<LoginViewModel> loginViewModelProvider;

    Provider<NurseDeleteViewModel> nurseDeleteViewModelProvider;

    Provider<NurseListViewModel> nurseListViewModelProvider;

    Provider<NurseProfileViewModel> nurseProfileViewModelProvider;

    Provider<SignUpViewModel> signUpViewModelProvider;

    Provider<TimeScheduleViewModel> timeScheduleViewModelProvider;

    Provider<UserProfileViewModel> userProfileViewModelProvider;

    Provider<ViewDetailViewModel> viewDetailViewModelProvider;

    ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        SavedStateHandle savedStateHandleParam, ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.careScheduleViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.loginViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.nurseDeleteViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.nurseListViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.nurseProfileViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.signUpViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
      this.timeScheduleViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 6);
      this.userProfileViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 7);
      this.viewDetailViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 8);
    }

    @Override
    public Map<Class<?>, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
      return LazyClassKeyMap.<javax.inject.Provider<ViewModel>>of(MapBuilder.<String, javax.inject.Provider<ViewModel>>newMapBuilder(9).put(CareScheduleViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (careScheduleViewModelProvider))).put(LoginViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (loginViewModelProvider))).put(NurseDeleteViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (nurseDeleteViewModelProvider))).put(NurseListViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (nurseListViewModelProvider))).put(NurseProfileViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (nurseProfileViewModelProvider))).put(SignUpViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (signUpViewModelProvider))).put(TimeScheduleViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (timeScheduleViewModelProvider))).put(UserProfileViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (userProfileViewModelProvider))).put(ViewDetailViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (viewDetailViewModelProvider))).build());
    }

    @Override
    public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
      return Collections.<Class<?>, Object>emptyMap();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.example.elderlycare2.presentation.viewmodel.CareScheduleViewModel
          return (T) new CareScheduleViewModel(singletonCImpl.provideCareScheduleRepositoryProvider.get(), singletonCImpl.provideSessionManagerProvider.get());

          case 1: // com.example.elderlycare2.presentation.viewmodel.LoginViewModel
          return (T) new LoginViewModel(singletonCImpl.provideLoginRepositoryProvider.get(), singletonCImpl.provideSessionManagerProvider.get());

          case 2: // com.example.elderlycare2.presentation.viewmodel.NurseDeleteViewModel
          return (T) new NurseDeleteViewModel(singletonCImpl.provideNurseDeleteRepositoryProvider.get(), singletonCImpl.provideSessionManagerProvider.get());

          case 3: // com.example.elderlycare2.presentation.viewmodel.NurseListViewModel
          return (T) new NurseListViewModel(singletonCImpl.provideNurseRepositoryProvider.get(), singletonCImpl.provideSessionManagerProvider.get());

          case 4: // com.example.elderlycare2.presentation.viewmodel.NurseProfileViewModel
          return (T) new NurseProfileViewModel(singletonCImpl.provideNurseProfileRepositoryProvider.get(), singletonCImpl.provideSessionManagerProvider.get());

          case 5: // com.example.elderlycare2.presentation.viewmodel.SignUpViewModel
          return (T) new SignUpViewModel(singletonCImpl.provideSignUpRepositoryProvider.get());

          case 6: // com.example.elderlycare2.presentation.viewmodel.TimeScheduleViewModel
          return (T) new TimeScheduleViewModel(singletonCImpl.provideScheduleRepositoryProvider.get(), singletonCImpl.provideSessionManagerProvider.get());

          case 7: // com.example.elderlycare2.presentation.viewmodel.UserProfileViewModel
          return (T) new UserProfileViewModel(singletonCImpl.provideUserProfileRepositoryProvider.get(), singletonCImpl.provideSessionManagerProvider.get());

          case 8: // com.example.elderlycare2.presentation.viewmodel.ViewDetailViewModel
          return (T) new ViewDetailViewModel(singletonCImpl.provideLoginRepositoryProvider.get(), singletonCImpl.provideViewDetailRepositoryProvider.get(), singletonCImpl.provideSessionManagerProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends ElderlyCareApplication_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    ActivityRetainedCImpl(SingletonCImpl singletonCImpl,
        SavedStateHandleHolder savedStateHandleHolderParam) {
      this.singletonCImpl = singletonCImpl;

      initialize(savedStateHandleHolderParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends ElderlyCareApplication_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends ElderlyCareApplication_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    Provider<HttpLoggingInterceptor> provideLoggingInterceptorProvider;

    Provider<OkHttpClient> provideOkHttpClientProvider;

    Provider<Retrofit> provideRetrofitProvider;

    Provider<CareScheduleApiService> provideCareScheduleApiServiceProvider;

    Provider<CareScheduleRepository> provideCareScheduleRepositoryProvider;

    Provider<SessionManager> provideSessionManagerProvider;

    Provider<LoginApiService> provideLoginApiServiceProvider;

    Provider<LoginRepository> provideLoginRepositoryProvider;

    Provider<NurseApiService> provideNurseApiServiceProvider;

    Provider<NurseDeleteRepository> provideNurseDeleteRepositoryProvider;

    Provider<NurseRepository> provideNurseRepositoryProvider;

    Provider<NurseProfileApiService> provideNurseProfileApiServiceProvider;

    Provider<NurseProfileRespository> provideNurseProfileRepositoryProvider;

    Provider<SignUpApiService> provideSignUpApiServiceProvider;

    Provider<SignUpRepository> provideSignUpRepositoryProvider;

    Provider<ScheduleApi> provideScheduleApiProvider;

    Provider<ScheduleRepository> provideScheduleRepositoryProvider;

    Provider<UserProfileApi> provideUserProfileApiProvider;

    Provider<UserProfileRepository> provideUserProfileRepositoryProvider;

    Provider<VisitDetailsApiService> provideVisitDetailsApiServiceProvider;

    Provider<ViewDetailRepository> provideViewDetailRepositoryProvider;

    SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideLoggingInterceptorProvider = DoubleCheck.provider(new SwitchingProvider<HttpLoggingInterceptor>(singletonCImpl, 4));
      this.provideOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonCImpl, 3));
      this.provideRetrofitProvider = DoubleCheck.provider(new SwitchingProvider<Retrofit>(singletonCImpl, 2));
      this.provideCareScheduleApiServiceProvider = DoubleCheck.provider(new SwitchingProvider<CareScheduleApiService>(singletonCImpl, 1));
      this.provideCareScheduleRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<CareScheduleRepository>(singletonCImpl, 0));
      this.provideSessionManagerProvider = DoubleCheck.provider(new SwitchingProvider<SessionManager>(singletonCImpl, 5));
      this.provideLoginApiServiceProvider = DoubleCheck.provider(new SwitchingProvider<LoginApiService>(singletonCImpl, 7));
      this.provideLoginRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<LoginRepository>(singletonCImpl, 6));
      this.provideNurseApiServiceProvider = DoubleCheck.provider(new SwitchingProvider<NurseApiService>(singletonCImpl, 9));
      this.provideNurseDeleteRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<NurseDeleteRepository>(singletonCImpl, 8));
      this.provideNurseRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<NurseRepository>(singletonCImpl, 10));
      this.provideNurseProfileApiServiceProvider = DoubleCheck.provider(new SwitchingProvider<NurseProfileApiService>(singletonCImpl, 12));
      this.provideNurseProfileRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<NurseProfileRespository>(singletonCImpl, 11));
      this.provideSignUpApiServiceProvider = DoubleCheck.provider(new SwitchingProvider<SignUpApiService>(singletonCImpl, 14));
      this.provideSignUpRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<SignUpRepository>(singletonCImpl, 13));
      this.provideScheduleApiProvider = DoubleCheck.provider(new SwitchingProvider<ScheduleApi>(singletonCImpl, 16));
      this.provideScheduleRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<ScheduleRepository>(singletonCImpl, 15));
      this.provideUserProfileApiProvider = DoubleCheck.provider(new SwitchingProvider<UserProfileApi>(singletonCImpl, 18));
      this.provideUserProfileRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<UserProfileRepository>(singletonCImpl, 17));
      this.provideVisitDetailsApiServiceProvider = DoubleCheck.provider(new SwitchingProvider<VisitDetailsApiService>(singletonCImpl, 20));
      this.provideViewDetailRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<ViewDetailRepository>(singletonCImpl, 19));
    }

    @Override
    public void injectElderlyCareApplication(ElderlyCareApplication elderlyCareApplication) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.example.elderlycare2.data.repository.CareScheduleRepository
          return (T) AppModule_ProvideCareScheduleRepositoryFactory.provideCareScheduleRepository(singletonCImpl.provideCareScheduleApiServiceProvider.get());

          case 1: // com.example.elderlycare2.data.api.CareScheduleApiService
          return (T) NetworkModule_ProvideCareScheduleApiServiceFactory.provideCareScheduleApiService(singletonCImpl.provideRetrofitProvider.get());

          case 2: // retrofit2.Retrofit
          return (T) NetworkModule_ProvideRetrofitFactory.provideRetrofit(singletonCImpl.provideOkHttpClientProvider.get());

          case 3: // okhttp3.OkHttpClient
          return (T) NetworkModule_ProvideOkHttpClientFactory.provideOkHttpClient(singletonCImpl.provideLoggingInterceptorProvider.get());

          case 4: // okhttp3.logging.HttpLoggingInterceptor
          return (T) NetworkModule_ProvideLoggingInterceptorFactory.provideLoggingInterceptor();

          case 5: // com.example.elderlycare2.utils.SessionManager
          return (T) AppModule_ProvideSessionManagerFactory.provideSessionManager(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 6: // com.example.elderlycare2.data.repository.LoginRepository
          return (T) AppModule_ProvideLoginRepositoryFactory.provideLoginRepository(singletonCImpl.provideLoginApiServiceProvider.get());

          case 7: // com.example.elderlycare2.data.api.LoginApiService
          return (T) NetworkModule_ProvideLoginApiServiceFactory.provideLoginApiService(singletonCImpl.provideRetrofitProvider.get());

          case 8: // com.example.elderlycare2.data.repository.NurseDeleteRepository
          return (T) AppModule_ProvideNurseDeleteRepositoryFactory.provideNurseDeleteRepository(singletonCImpl.provideNurseApiServiceProvider.get());

          case 9: // com.example.elderlycare2.data.api.NurseApiService
          return (T) NetworkModule_ProvideNurseApiServiceFactory.provideNurseApiService(singletonCImpl.provideRetrofitProvider.get());

          case 10: // com.example.elderlycare2.data.repository.NurseRepository
          return (T) AppModule_ProvideNurseRepositoryFactory.provideNurseRepository(singletonCImpl.provideNurseApiServiceProvider.get());

          case 11: // com.example.elderlycare2.data.repository.NurseProfileRespository
          return (T) AppModule_ProvideNurseProfileRepositoryFactory.provideNurseProfileRepository(singletonCImpl.provideNurseProfileApiServiceProvider.get());

          case 12: // com.example.elderlycare2.data.api.NurseProfileApiService
          return (T) NetworkModule_ProvideNurseProfileApiServiceFactory.provideNurseProfileApiService(singletonCImpl.provideRetrofitProvider.get());

          case 13: // com.example.elderlycare2.data.repository.SignUpRepository
          return (T) AppModule_ProvideSignUpRepositoryFactory.provideSignUpRepository(singletonCImpl.provideSignUpApiServiceProvider.get());

          case 14: // com.example.elderlycare2.data.api.SignUpApiService
          return (T) NetworkModule_ProvideSignUpApiServiceFactory.provideSignUpApiService(singletonCImpl.provideRetrofitProvider.get());

          case 15: // com.example.elderlycare2.data.repository.ScheduleRepository
          return (T) AppModule_ProvideScheduleRepositoryFactory.provideScheduleRepository(singletonCImpl.provideScheduleApiProvider.get());

          case 16: // com.example.elderlycare2.data.api.ScheduleApi
          return (T) NetworkModule_ProvideScheduleApiFactory.provideScheduleApi(singletonCImpl.provideRetrofitProvider.get());

          case 17: // com.example.elderlycare2.data.repository.UserProfileRepository
          return (T) AppModule_ProvideUserProfileRepositoryFactory.provideUserProfileRepository(singletonCImpl.provideUserProfileApiProvider.get());

          case 18: // com.example.elderlycare2.data.api.UserProfileApi
          return (T) NetworkModule_ProvideUserProfileApiFactory.provideUserProfileApi(singletonCImpl.provideRetrofitProvider.get());

          case 19: // com.example.elderlycare2.data.repository.ViewDetailRepository
          return (T) AppModule_ProvideViewDetailRepositoryFactory.provideViewDetailRepository(singletonCImpl.provideVisitDetailsApiServiceProvider.get());

          case 20: // com.example.elderlycare2.data.api.VisitDetailsApiService
          return (T) NetworkModule_ProvideVisitDetailsApiServiceFactory.provideVisitDetailsApiService(singletonCImpl.provideRetrofitProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
