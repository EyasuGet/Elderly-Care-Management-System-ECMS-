package com.example.elderlycare2.data.api;

import com.example.elderlycare2.data.remote.request.SignUpRequest;
import com.example.elderlycare2.data.remote.response.SignUpResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/elderlycare2/data/api/SignUpApiService;", "", "signUpNurse", "Lretrofit2/Response;", "Lcom/example/elderlycare2/data/remote/response/SignUpResponse;", "signUpRequest", "Lcom/example/elderlycare2/data/remote/request/SignUpRequest;", "(Lcom/example/elderlycare2/data/remote/request/SignUpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUpUser", "app_debug"})
public abstract interface SignUpApiService {
    
    @retrofit2.http.POST(value = "auth/user/signup")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signUpUser(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.remote.request.SignUpRequest signUpRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.elderlycare2.data.remote.response.SignUpResponse>> $completion);
    
    @retrofit2.http.POST(value = "nurse/signup")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signUpNurse(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.remote.request.SignUpRequest signUpRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.elderlycare2.data.remote.response.SignUpResponse>> $completion);
}