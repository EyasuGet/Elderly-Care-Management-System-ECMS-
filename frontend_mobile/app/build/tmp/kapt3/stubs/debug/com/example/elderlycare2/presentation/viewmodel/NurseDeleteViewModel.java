package com.example.elderlycare2.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import com.example.elderlycare2.data.remote.response.NurseDeleteResponse;
import com.example.elderlycare2.data.repository.NurseDeleteRepository;
import com.example.elderlycare2.presentation.state.NurseDeleteEvent;
import com.example.elderlycare2.presentation.state.NurseDeleteState;
import com.example.elderlycare2.presentation.state.NurseListEvent;
import com.example.elderlycare2.presentation.state.NurseProfileEvent;
import com.example.elderlycare2.utils.SessionManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/example/elderlycare2/presentation/viewmodel/NurseDeleteViewModel;", "Landroidx/lifecycle/ViewModel;", "nurseDeleteRepository", "Lcom/example/elderlycare2/data/repository/NurseDeleteRepository;", "sessionManager", "error/NonExistentClass", "(Lcom/example/elderlycare2/data/repository/NurseDeleteRepository;Lerror/NonExistentClass;)V", "_nurseDeleteState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/elderlycare2/presentation/state/NurseDeleteState;", "nurseDeleteState", "Lkotlinx/coroutines/flow/StateFlow;", "getNurseDeleteState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lerror/NonExistentClass;", "deleteUser", "", "userId", "", "handleEvent", "event", "Lcom/example/elderlycare2/presentation/state/NurseDeleteEvent;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class NurseDeleteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.elderlycare2.data.repository.NurseDeleteRepository nurseDeleteRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.elderlycare2.presentation.state.NurseDeleteState> _nurseDeleteState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.elderlycare2.presentation.state.NurseDeleteState> nurseDeleteState = null;
    
    @javax.inject.Inject()
    public NurseDeleteViewModel(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.repository.NurseDeleteRepository nurseDeleteRepository, @org.jetbrains.annotations.NotNull()
    SessionManager sessionManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.elderlycare2.presentation.state.NurseDeleteState> getNurseDeleteState() {
        return null;
    }
    
    public final void handleEvent(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.presentation.state.NurseDeleteEvent event) {
    }
    
    private final void deleteUser(java.lang.String userId) {
    }
}