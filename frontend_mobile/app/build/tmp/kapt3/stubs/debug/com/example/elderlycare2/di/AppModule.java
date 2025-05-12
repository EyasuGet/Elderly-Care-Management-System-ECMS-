package com.example.elderlycare2.di;

import android.content.Context;
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
import com.example.elderlycare2.utils.SessionManager;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0012\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0007\u00a8\u0006)"}, d2 = {"Lcom/example/elderlycare2/di/AppModule;", "", "()V", "provideCareScheduleRepository", "Lcom/example/elderlycare2/data/repository/CareScheduleRepository;", "careScheduleApiService", "Lcom/example/elderlycare2/data/api/CareScheduleApiService;", "provideLoginRepository", "Lcom/example/elderlycare2/data/repository/LoginRepository;", "loginApiService", "Lcom/example/elderlycare2/data/api/LoginApiService;", "provideNurseDeleteRepository", "Lcom/example/elderlycare2/data/repository/NurseDeleteRepository;", "nurseApiService", "Lcom/example/elderlycare2/data/api/NurseApiService;", "provideNurseProfileRepository", "Lcom/example/elderlycare2/data/repository/NurseProfileRespository;", "nurseProfileApiService", "Lcom/example/elderlycare2/data/api/NurseProfileApiService;", "provideNurseRepository", "Lcom/example/elderlycare2/data/repository/NurseRepository;", "provideScheduleRepository", "Lcom/example/elderlycare2/data/repository/ScheduleRepository;", "scheduleApi", "Lcom/example/elderlycare2/data/api/ScheduleApi;", "provideSessionManager", "Lcom/example/elderlycare2/utils/SessionManager;", "context", "Landroid/content/Context;", "provideSignUpRepository", "Lcom/example/elderlycare2/data/repository/SignUpRepository;", "signUpApiService", "Lcom/example/elderlycare2/data/api/SignUpApiService;", "provideUserProfileRepository", "Lcom/example/elderlycare2/data/repository/UserProfileRepository;", "userProfileApi", "Lcom/example/elderlycare2/data/api/UserProfileApi;", "provideViewDetailRepository", "Lcom/example/elderlycare2/data/repository/ViewDetailRepository;", "viewDetailsApiService", "Lcom/example/elderlycare2/data/api/VisitDetailsApiService;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.elderlycare2.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.elderlycare2.utils.SessionManager provideSessionManager(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.elderlycare2.data.repository.SignUpRepository provideSignUpRepository(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.api.SignUpApiService signUpApiService) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.elderlycare2.data.repository.LoginRepository provideLoginRepository(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.api.LoginApiService loginApiService) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.elderlycare2.data.repository.NurseRepository provideNurseRepository(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.api.NurseApiService nurseApiService) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.elderlycare2.data.repository.ViewDetailRepository provideViewDetailRepository(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.api.VisitDetailsApiService viewDetailsApiService) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.elderlycare2.data.repository.NurseProfileRespository provideNurseProfileRepository(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.api.NurseProfileApiService nurseProfileApiService) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.elderlycare2.data.repository.CareScheduleRepository provideCareScheduleRepository(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.api.CareScheduleApiService careScheduleApiService) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.elderlycare2.data.repository.ScheduleRepository provideScheduleRepository(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.api.ScheduleApi scheduleApi) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.elderlycare2.data.repository.UserProfileRepository provideUserProfileRepository(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.api.UserProfileApi userProfileApi) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.elderlycare2.data.repository.NurseDeleteRepository provideNurseDeleteRepository(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.api.NurseApiService nurseApiService) {
        return null;
    }
}