package com.example.elderlycare2.data.repository;

import com.example.elderlycare2.data.api.NurseApiService;
import com.example.elderlycare2.data.remote.response.NurseDeleteResponse;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/elderlycare2/data/repository/NurseDeleteRepository;", "", "nurseApiService", "Lcom/example/elderlycare2/data/api/NurseApiService;", "(Lcom/example/elderlycare2/data/api/NurseApiService;)V", "nurseDeleteUser", "Lcom/example/elderlycare2/data/remote/response/NurseDeleteResponse;", "token", "", "userId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NurseDeleteRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.elderlycare2.data.api.NurseApiService nurseApiService = null;
    
    @javax.inject.Inject()
    public NurseDeleteRepository(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.api.NurseApiService nurseApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object nurseDeleteUser(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.NurseDeleteResponse> $completion) {
        return null;
    }
}