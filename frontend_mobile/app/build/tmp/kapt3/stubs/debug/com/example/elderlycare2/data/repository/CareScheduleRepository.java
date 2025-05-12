package com.example.elderlycare2.data.repository;

import com.example.elderlycare2.data.api.CareScheduleApiService;
import com.example.elderlycare2.data.remote.request.AddScheduleRequest;
import com.example.elderlycare2.data.remote.response.AddScheduleResponse;
import com.example.elderlycare2.data.remote.response.NurseListResponse;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/elderlycare2/data/repository/CareScheduleRepository;", "", "careScheduleApiService", "Lcom/example/elderlycare2/data/api/CareScheduleApiService;", "(Lcom/example/elderlycare2/data/api/CareScheduleApiService;)V", "addSchedule", "Lcom/example/elderlycare2/data/remote/response/AddScheduleResponse;", "token", "", "addScheduleRequest", "Lcom/example/elderlycare2/data/remote/request/AddScheduleRequest;", "(Ljava/lang/String;Lcom/example/elderlycare2/data/remote/request/AddScheduleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUserList", "", "Lcom/example/elderlycare2/data/remote/response/NurseListResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CareScheduleRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.elderlycare2.data.api.CareScheduleApiService careScheduleApiService = null;
    
    @javax.inject.Inject()
    public CareScheduleRepository(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.api.CareScheduleApiService careScheduleApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addSchedule(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.remote.request.AddScheduleRequest addScheduleRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.AddScheduleResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchUserList(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.elderlycare2.data.remote.response.NurseListResponse>> $completion) {
        return null;
    }
}