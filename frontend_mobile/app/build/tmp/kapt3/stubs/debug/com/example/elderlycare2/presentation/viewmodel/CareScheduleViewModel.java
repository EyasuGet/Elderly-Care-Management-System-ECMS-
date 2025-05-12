package com.example.elderlycare2.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import com.example.elderlycare2.data.remote.request.AddScheduleRequest;
import com.example.elderlycare2.data.remote.response.NurseListResponse;
import com.example.elderlycare2.data.repository.CareScheduleRepository;
import com.example.elderlycare2.presentation.state.CareScheduleEvent;
import com.example.elderlycare2.presentation.state.CareScheduleState;
import com.example.elderlycare2.utils.SessionManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0010H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/example/elderlycare2/presentation/viewmodel/CareScheduleViewModel;", "Landroidx/lifecycle/ViewModel;", "careScheduleRepository", "Lcom/example/elderlycare2/data/repository/CareScheduleRepository;", "sessionManager", "error/NonExistentClass", "(Lcom/example/elderlycare2/data/repository/CareScheduleRepository;Lerror/NonExistentClass;)V", "_careScheduleState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/elderlycare2/presentation/state/CareScheduleState;", "careScheduleState", "Lkotlinx/coroutines/flow/StateFlow;", "getCareScheduleState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lerror/NonExistentClass;", "fetchUserList", "", "handleEvent", "event", "Lcom/example/elderlycare2/presentation/state/CareScheduleEvent;", "handleSubmit", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class CareScheduleViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.elderlycare2.data.repository.CareScheduleRepository careScheduleRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.elderlycare2.presentation.state.CareScheduleState> _careScheduleState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.elderlycare2.presentation.state.CareScheduleState> careScheduleState = null;
    
    @javax.inject.Inject()
    public CareScheduleViewModel(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.repository.CareScheduleRepository careScheduleRepository, @org.jetbrains.annotations.NotNull()
    SessionManager sessionManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.elderlycare2.presentation.state.CareScheduleState> getCareScheduleState() {
        return null;
    }
    
    public final void handleEvent(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.presentation.state.CareScheduleEvent event) {
    }
    
    private final void handleSubmit() {
    }
    
    public final void fetchUserList() {
    }
}