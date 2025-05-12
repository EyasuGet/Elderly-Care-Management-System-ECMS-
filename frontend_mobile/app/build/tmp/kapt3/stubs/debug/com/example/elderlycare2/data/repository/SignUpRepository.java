package com.example.elderlycare2.data.repository;

import com.example.elderlycare2.data.api.SignUpApiService;
import com.example.elderlycare2.data.remote.request.SignUpRequest;
import com.example.elderlycare2.data.remote.response.SignUpResponse;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u000bJ&\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/elderlycare2/data/repository/SignUpRepository;", "", "signUpApiService", "Lcom/example/elderlycare2/data/api/SignUpApiService;", "(Lcom/example/elderlycare2/data/api/SignUpApiService;)V", "signUpNurse", "Lcom/example/elderlycare2/data/remote/response/SignUpResponse;", "email", "", "password", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUpUser", "app_debug"})
public final class SignUpRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.elderlycare2.data.api.SignUpApiService signUpApiService = null;
    
    @javax.inject.Inject()
    public SignUpRepository(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.api.SignUpApiService signUpApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signUpUser(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.SignUpResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signUpNurse(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.SignUpResponse> $completion) {
        return null;
    }
}