package com.example.elderlycare2.data.repository;

import com.example.elderlycare2.data.api.NurseProfileApiService;
import com.example.elderlycare2.data.remote.request.NurseProfileRequest;
import com.example.elderlycare2.data.remote.response.NurseProfileResponse;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/elderlycare2/data/repository/NurseProfileRespository;", "", "nurseProfileApiService", "Lcom/example/elderlycare2/data/api/NurseProfileApiService;", "(Lcom/example/elderlycare2/data/api/NurseProfileApiService;)V", "getNurseProfile", "Lcom/example/elderlycare2/data/remote/response/NurseProfileResponse;", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateNurseProfile", "nurseProfile", "Lcom/example/elderlycare2/data/remote/request/NurseProfileRequest;", "(Ljava/lang/String;Lcom/example/elderlycare2/data/remote/request/NurseProfileRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NurseProfileRespository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.elderlycare2.data.api.NurseProfileApiService nurseProfileApiService = null;
    
    @javax.inject.Inject()
    public NurseProfileRespository(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.api.NurseProfileApiService nurseProfileApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNurseProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.NurseProfileResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateNurseProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.remote.request.NurseProfileRequest nurseProfile, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.NurseProfileResponse> $completion) {
        return null;
    }
}