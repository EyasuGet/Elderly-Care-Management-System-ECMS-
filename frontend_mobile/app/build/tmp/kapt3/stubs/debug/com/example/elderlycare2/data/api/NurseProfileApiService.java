package com.example.elderlycare2.data.api;

import com.example.elderlycare2.data.remote.request.NurseProfileRequest;
import com.example.elderlycare2.data.remote.response.NurseProfileResponse;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/elderlycare2/data/api/NurseProfileApiService;", "", "getNurseProfile", "Lcom/example/elderlycare2/data/remote/response/NurseProfileResponse;", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateNurseProfile", "nurseProfile", "Lcom/example/elderlycare2/data/remote/request/NurseProfileRequest;", "(Ljava/lang/String;Lcom/example/elderlycare2/data/remote/request/NurseProfileRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NurseProfileApiService {
    
    @retrofit2.http.GET(value = "/nurse/profile")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNurseProfile(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.NurseProfileResponse> $completion);
    
    @retrofit2.http.PUT(value = "/nurse/profile")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateNurseProfile(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.remote.request.NurseProfileRequest nurseProfile, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.NurseProfileResponse> $completion);
}