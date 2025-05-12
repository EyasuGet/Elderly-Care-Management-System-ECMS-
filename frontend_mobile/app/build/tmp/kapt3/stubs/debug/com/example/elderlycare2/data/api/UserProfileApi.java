package com.example.elderlycare2.data.api;

import com.example.elderlycare2.data.remote.request.UserEditProfileRequest;
import com.example.elderlycare2.data.remote.response.UserProfileResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/elderlycare2/data/api/UserProfileApi;", "", "getUserProfile", "Lcom/example/elderlycare2/data/remote/response/UserProfileResponse;", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserProfile", "request", "Lcom/example/elderlycare2/data/remote/request/UserEditProfileRequest;", "(Lcom/example/elderlycare2/data/remote/request/UserEditProfileRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UserProfileApi {
    
    @retrofit2.http.GET(value = "user/profile")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserProfile(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.UserProfileResponse> $completion);
    
    @retrofit2.http.PUT(value = "user/profile")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUserProfile(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.remote.request.UserEditProfileRequest request, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.UserProfileResponse> $completion);
}