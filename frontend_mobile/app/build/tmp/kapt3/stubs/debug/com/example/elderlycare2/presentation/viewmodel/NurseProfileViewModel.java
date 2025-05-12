package com.example.elderlycare2.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import com.example.elderlycare2.data.remote.request.NurseProfileRequest;
import com.example.elderlycare2.data.repository.NurseProfileRespository;
import com.example.elderlycare2.presentation.state.NurseProfileEvent;
import com.example.elderlycare2.presentation.state.NurseProfileState;
import com.example.elderlycare2.utils.SessionManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0019H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0013\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001e"}, d2 = {"Lcom/example/elderlycare2/presentation/viewmodel/NurseProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "nurseProfileRepository", "Lcom/example/elderlycare2/data/repository/NurseProfileRespository;", "sessionManager", "error/NonExistentClass", "(Lcom/example/elderlycare2/data/repository/NurseProfileRespository;Lerror/NonExistentClass;)V", "_nurseProfileState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/elderlycare2/presentation/state/NurseProfileState;", "nurseName", "", "getNurseName", "()Ljava/lang/String;", "nurseProfileState", "Lkotlinx/coroutines/flow/StateFlow;", "getNurseProfileState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lerror/NonExistentClass;", "userId", "getUserId", "userInfo", "getUserInfo", "()Lerror/NonExistentClass;", "fetchNurseProfile", "", "handleEvent", "event", "Lcom/example/elderlycare2/presentation/state/NurseProfileEvent;", "updateProfile", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class NurseProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.elderlycare2.data.repository.NurseProfileRespository nurseProfileRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.elderlycare2.presentation.state.NurseProfileState> _nurseProfileState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.elderlycare2.presentation.state.NurseProfileState> nurseProfileState = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object userInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nurseName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userId = null;
    
    @javax.inject.Inject()
    public NurseProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.repository.NurseProfileRespository nurseProfileRepository, @org.jetbrains.annotations.NotNull()
    SessionManager sessionManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.elderlycare2.presentation.state.NurseProfileState> getNurseProfileState() {
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
    com.example.elderlycare2.presentation.state.NurseProfileEvent event) {
    }
    
    private final void fetchNurseProfile() {
    }
    
    private final void updateProfile() {
    }
}