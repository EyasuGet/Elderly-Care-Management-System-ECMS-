package com.example.elderlycare2.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import com.example.elderlycare2.data.remote.request.ViewDetailRequest;
import com.example.elderlycare2.data.repository.LoginRepository;
import com.example.elderlycare2.data.repository.ViewDetailRepository;
import com.example.elderlycare2.presentation.state.ViewDetailEvent;
import com.example.elderlycare2.presentation.state.ViewDetailState;
import com.example.elderlycare2.utils.SessionManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\rH\u0002J\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fJ(\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\rH\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006$"}, d2 = {"Lcom/example/elderlycare2/presentation/viewmodel/ViewDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "loginRepository", "Lcom/example/elderlycare2/data/repository/LoginRepository;", "viewDetailRepository", "Lcom/example/elderlycare2/data/repository/ViewDetailRepository;", "sessionManager", "error/NonExistentClass", "(Lcom/example/elderlycare2/data/repository/LoginRepository;Lcom/example/elderlycare2/data/repository/ViewDetailRepository;Lerror/NonExistentClass;)V", "_viewDetailState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/elderlycare2/presentation/state/ViewDetailState;", "nurseName", "", "getNurseName", "()Ljava/lang/String;", "Lerror/NonExistentClass;", "userId", "getUserId", "userInfo", "getUserInfo", "()Lerror/NonExistentClass;", "viewDetailState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewDetailState", "()Lkotlinx/coroutines/flow/StateFlow;", "fetchElderDetail", "", "elderId", "handleEvent", "event", "Lcom/example/elderlycare2/presentation/state/ViewDetailEvent;", "updateVisitDetails", "heartRate", "bloodPressure", "sugarLevel", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ViewDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.elderlycare2.data.repository.LoginRepository loginRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.elderlycare2.data.repository.ViewDetailRepository viewDetailRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.elderlycare2.presentation.state.ViewDetailState> _viewDetailState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.elderlycare2.presentation.state.ViewDetailState> viewDetailState = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object userInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nurseName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userId = null;
    
    @javax.inject.Inject()
    public ViewDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.repository.LoginRepository loginRepository, @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.repository.ViewDetailRepository viewDetailRepository, @org.jetbrains.annotations.NotNull()
    SessionManager sessionManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.elderlycare2.presentation.state.ViewDetailState> getViewDetailState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getUserInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNurseName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void handleEvent(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.presentation.state.ViewDetailEvent event) {
    }
    
    private final void fetchElderDetail(java.lang.String elderId) {
    }
    
    private final void updateVisitDetails(java.lang.String elderId, java.lang.String heartRate, java.lang.String bloodPressure, java.lang.String sugarLevel) {
    }
}