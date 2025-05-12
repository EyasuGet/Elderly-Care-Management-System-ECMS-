package com.example.elderlycare2.data.api;

import com.example.elderlycare2.data.remote.request.AddScheduleRequest;
import com.example.elderlycare2.data.remote.response.AddScheduleResponse;
import com.example.elderlycare2.data.remote.response.NurseListResponseWrapper;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/example/elderlycare2/data/api/CareScheduleApiService;", "", "addSchedule", "Lcom/example/elderlycare2/data/remote/response/AddScheduleResponse;", "token", "", "schedule", "Lcom/example/elderlycare2/data/remote/request/AddScheduleRequest;", "(Ljava/lang/String;Lcom/example/elderlycare2/data/remote/request/AddScheduleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUserList", "Lcom/example/elderlycare2/data/remote/response/NurseListResponseWrapper;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CareScheduleApiService {
    
    @retrofit2.http.POST(value = "/nurse/addTask")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addSchedule(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.remote.request.AddScheduleRequest schedule, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.AddScheduleResponse> $completion);
    
    @retrofit2.http.GET(value = "/nurse")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchUserList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.NurseListResponseWrapper> $completion);
}