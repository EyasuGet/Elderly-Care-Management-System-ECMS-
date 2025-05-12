package com.example.elderlycare2.presentation.state;

import com.example.elderlycare2.data.remote.response.NurseListResponse;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/example/elderlycare2/presentation/state/NurseListEvent;", "", "()V", "FetchElderList", "NavigateToElderDetail", "OnElderClick", "Lcom/example/elderlycare2/presentation/state/NurseListEvent$FetchElderList;", "Lcom/example/elderlycare2/presentation/state/NurseListEvent$NavigateToElderDetail;", "Lcom/example/elderlycare2/presentation/state/NurseListEvent$OnElderClick;", "app_debug"})
public abstract class NurseListEvent {
    
    private NurseListEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/elderlycare2/presentation/state/NurseListEvent$FetchElderList;", "Lcom/example/elderlycare2/presentation/state/NurseListEvent;", "()V", "app_debug"})
    public static final class FetchElderList extends com.example.elderlycare2.presentation.state.NurseListEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.elderlycare2.presentation.state.NurseListEvent.FetchElderList INSTANCE = null;
        
        private FetchElderList() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/elderlycare2/presentation/state/NurseListEvent$NavigateToElderDetail;", "Lcom/example/elderlycare2/presentation/state/NurseListEvent;", "elderId", "", "(I)V", "getElderId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class NavigateToElderDetail extends com.example.elderlycare2.presentation.state.NurseListEvent {
        private final int elderId = 0;
        
        public NavigateToElderDetail(int elderId) {
        }
        
        public final int getElderId() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.elderlycare2.presentation.state.NurseListEvent.NavigateToElderDetail copy(int elderId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/elderlycare2/presentation/state/NurseListEvent$OnElderClick;", "Lcom/example/elderlycare2/presentation/state/NurseListEvent;", "elder", "Lcom/example/elderlycare2/data/remote/response/NurseListResponse;", "(Lcom/example/elderlycare2/data/remote/response/NurseListResponse;)V", "getElder", "()Lcom/example/elderlycare2/data/remote/response/NurseListResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnElderClick extends com.example.elderlycare2.presentation.state.NurseListEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.example.elderlycare2.data.remote.response.NurseListResponse elder = null;
        
        public OnElderClick(@org.jetbrains.annotations.NotNull()
        com.example.elderlycare2.data.remote.response.NurseListResponse elder) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.elderlycare2.data.remote.response.NurseListResponse getElder() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.elderlycare2.data.remote.response.NurseListResponse component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.elderlycare2.presentation.state.NurseListEvent.OnElderClick copy(@org.jetbrains.annotations.NotNull()
        com.example.elderlycare2.data.remote.response.NurseListResponse elder) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}