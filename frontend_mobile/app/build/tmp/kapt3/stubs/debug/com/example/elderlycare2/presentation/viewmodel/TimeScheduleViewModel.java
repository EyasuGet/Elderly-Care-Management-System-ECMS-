package com.example.elderlycare2.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import com.example.elderlycare2.data.repository.ScheduleRepository;
import com.example.elderlycare2.presentation.state.TimeScheduleEvent;
import com.example.elderlycare2.presentation.state.TimeScheduleState;
import com.example.elderlycare2.utils.SessionManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/example/elderlycare2/presentation/viewmodel/TimeScheduleViewModel;", "Landroidx/lifecycle/ViewModel;", "scheduleRepository", "Lcom/example/elderlycare2/data/repository/ScheduleRepository;", "sessionManager", "error/NonExistentClass", "(Lcom/example/elderlycare2/data/repository/ScheduleRepository;Lerror/NonExistentClass;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/elderlycare2/presentation/state/TimeScheduleState;", "Lerror/NonExistentClass;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "fetchTasks", "", "onEvent", "event", "Lcom/example/elderlycare2/presentation/state/TimeScheduleEvent;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class TimeScheduleViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.elderlycare2.data.repository.ScheduleRepository scheduleRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.elderlycare2.presentation.state.TimeScheduleState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.elderlycare2.presentation.state.TimeScheduleState> state = null;
    
    @javax.inject.Inject()
    public TimeScheduleViewModel(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.repository.ScheduleRepository scheduleRepository, @org.jetbrains.annotations.NotNull()
    SessionManager sessionManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.elderlycare2.presentation.state.TimeScheduleState> getState() {
        return null;
    }
    
    private final void onEvent(com.example.elderlycare2.presentation.state.TimeScheduleEvent event) {
    }
    
    private final void fetchTasks() {
    }
}