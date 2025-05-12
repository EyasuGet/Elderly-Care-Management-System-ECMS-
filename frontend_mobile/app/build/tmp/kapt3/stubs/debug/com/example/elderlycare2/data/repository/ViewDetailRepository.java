package com.example.elderlycare2.data.repository;

import com.example.elderlycare2.data.api.VisitDetailsApiService;
import com.example.elderlycare2.data.remote.request.ViewDetailRequest;
import com.example.elderlycare2.data.remote.response.ViewDetailResponse;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\nJ&\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/elderlycare2/data/repository/ViewDetailRepository;", "", "visitDetailsApiService", "Lcom/example/elderlycare2/data/api/VisitDetailsApiService;", "(Lcom/example/elderlycare2/data/api/VisitDetailsApiService;)V", "getVisitDetails", "Lcom/example/elderlycare2/data/remote/response/ViewDetailResponse;", "token", "", "elderId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateVisitDetails", "viewDetails", "Lcom/example/elderlycare2/data/remote/request/ViewDetailRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/example/elderlycare2/data/remote/request/ViewDetailRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ViewDetailRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.elderlycare2.data.api.VisitDetailsApiService visitDetailsApiService = null;
    
    @javax.inject.Inject()
    public ViewDetailRepository(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.api.VisitDetailsApiService visitDetailsApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getVisitDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String elderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.ViewDetailResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateVisitDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String elderId, @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.remote.request.ViewDetailRequest viewDetails, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elderlycare2.data.remote.response.ViewDetailResponse> $completion) {
        return null;
    }
}