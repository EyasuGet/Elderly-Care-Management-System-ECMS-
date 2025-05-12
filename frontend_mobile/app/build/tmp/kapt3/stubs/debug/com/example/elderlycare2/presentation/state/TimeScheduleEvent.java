package com.example.elderlycare2.presentation.state;

import com.example.elderlycare2.data.remote.response.TaskResponse;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/elderlycare2/presentation/state/TimeScheduleEvent;", "", "()V", "FetchQueues", "Lcom/example/elderlycare2/presentation/state/TimeScheduleEvent$FetchQueues;", "app_debug"})
public abstract class TimeScheduleEvent {
    
    private TimeScheduleEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/elderlycare2/presentation/state/TimeScheduleEvent$FetchQueues;", "Lcom/example/elderlycare2/presentation/state/TimeScheduleEvent;", "()V", "app_debug"})
    public static final class FetchQueues extends com.example.elderlycare2.presentation.state.TimeScheduleEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.elderlycare2.presentation.state.TimeScheduleEvent.FetchQueues INSTANCE = null;
        
        private FetchQueues() {
        }
    }
}