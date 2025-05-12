package com.example.elderlycare2.data.api;

import com.example.elderlycare2.data.remote.request.LoginRequest;
import com.example.elderlycare2.data.remote.response.LoginResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/elderlycare2/data/api/LoginApiService;", "", "loginUser", "Lretrofit2/Response;", "Lcom/example/elderlycare2/data/remote/response/LoginResponse;", "loginRequest", "Lcom/example/elderlycare2/data/remote/request/LoginRequest;", "(Lcom/example/elderlycare2/data/remote/request/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface LoginApiService {
    
    @retrofit2.http.POST(value = "auth/login")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loginUser(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.remote.request.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.elderlycare2.data.remote.response.LoginResponse>> $completion);
}