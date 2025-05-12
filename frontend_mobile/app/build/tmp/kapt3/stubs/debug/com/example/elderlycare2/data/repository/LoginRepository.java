package com.example.elderlycare2.data.repository;

import com.example.elderlycare2.data.api.LoginApiService;
import com.example.elderlycare2.data.remote.request.LoginRequest;
import com.example.elderlycare2.data.remote.response.LoginResponse;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/elderlycare2/data/repository/LoginRepository;", "", "loginApiService", "Lcom/example/elderlycare2/data/api/LoginApiService;", "(Lcom/example/elderlycare2/data/api/LoginApiService;)V", "loginUser", "Lcom/example/elderlycare2/data/remote/response/LoginResponse;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LoginRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.elderlycare2.data.api.LoginApiService loginApiService = null;
    
    @javax.inject.Inject()
    public LoginRepository(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.api.LoginApiService loginApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loginUser(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.LoginResponse> $completion) {
        return null;
    }
}