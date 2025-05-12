package com.example.elderlycare2.data.api;

import com.example.elderlycare2.data.remote.request.ViewDetailRequest;
import com.example.elderlycare2.data.remote.response.ViewDetailResponse;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import retrofit2.http.Path;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0007J,\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/example/elderlycare2/data/api/VisitDetailsApiService;", "", "getVisitDetails", "Lcom/example/elderlycare2/data/remote/response/ViewDetailResponse;", "token", "", "userId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateVisitDetails", "viewDetails", "Lcom/example/elderlycare2/data/remote/request/ViewDetailRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/example/elderlycare2/data/remote/request/ViewDetailRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface VisitDetailsApiService {
    
    @retrofit2.http.GET(value = "/nurse/user/{id}/details")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getVisitDetails(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.ViewDetailResponse> $completion);
    
    @retrofit2.http.PUT(value = "/nurse/user/{id}/details")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateVisitDetails(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.remote.request.ViewDetailRequest viewDetails, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.ViewDetailResponse> $completion);
}