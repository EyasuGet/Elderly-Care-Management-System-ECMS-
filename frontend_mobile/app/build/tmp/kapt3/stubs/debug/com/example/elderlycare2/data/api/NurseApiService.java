package com.example.elderlycare2.data.api;

import com.example.elderlycare2.data.remote.response.NurseDeleteResponse;
import com.example.elderlycare2.data.remote.response.NurseListResponse;
import com.example.elderlycare2.data.remote.response.NurseListResponseWrapper;
import com.example.elderlycare2.data.remote.response.ViewDetailResponse;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00a7@\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/elderlycare2/data/api/NurseApiService;", "", "getUserList", "Lcom/example/elderlycare2/data/remote/response/NurseListResponseWrapper;", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nurseDeleteUser", "Lcom/example/elderlycare2/data/remote/response/NurseDeleteResponse;", "userId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "viewDetails", "", "Lcom/example/elderlycare2/data/remote/response/ViewDetailResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NurseApiService {
    
    @retrofit2.http.GET(value = "/nurse")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.NurseListResponseWrapper> $completion);
    
    @retrofit2.http.GET(value = "/nurse/user/{id}/details")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object viewDetails(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.elderlycare2.data.remote.response.ViewDetailResponse>> $completion);
    
    @retrofit2.http.DELETE(value = "/nurse/user/{id}/details/delete")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object nurseDeleteUser(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.NurseDeleteResponse> $completion);
}