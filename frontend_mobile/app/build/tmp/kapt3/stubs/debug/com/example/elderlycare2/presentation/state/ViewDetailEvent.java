package com.example.elderlycare2.presentation.state;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/example/elderlycare2/presentation/state/ViewDetailEvent;", "", "()V", "FetchElderDetail", "OnBloodPressureChange", "OnHeartRateChange", "OnSugarLevelChange", "UpdateUserDetail", "Lcom/example/elderlycare2/presentation/state/ViewDetailEvent$FetchElderDetail;", "Lcom/example/elderlycare2/presentation/state/ViewDetailEvent$OnBloodPressureChange;", "Lcom/example/elderlycare2/presentation/state/ViewDetailEvent$OnHeartRateChange;", "Lcom/example/elderlycare2/presentation/state/ViewDetailEvent$OnSugarLevelChange;", "Lcom/example/elderlycare2/presentation/state/ViewDetailEvent$UpdateUserDetail;", "app_debug"})
public abstract class ViewDetailEvent {
    
    private ViewDetailEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/elderlycare2/presentation/state/ViewDetailEvent$FetchElderDetail;", "Lcom/example/elderlycare2/presentation/state/ViewDetailEvent;", "elderId", "", "(Ljava/lang/String;)V", "getElderId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class FetchElderDetail extends com.example.elderlycare2.presentation.state.ViewDetailEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String elderId = null;
        
        public FetchElderDetail(@org.jetbrains.annotations.NotNull()
        java.lang.String elderId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getElderId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.elderlycare2.presentation.state.ViewDetailEvent.FetchElderDetail copy(@org.jetbrains.annotations.NotNull()
        java.lang.String elderId) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/elderlycare2/presentation/state/ViewDetailEvent$OnBloodPressureChange;", "Lcom/example/elderlycare2/presentation/state/ViewDetailEvent;", "bloodPressure", "", "(Ljava/lang/String;)V", "getBloodPressure", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnBloodPressureChange extends com.example.elderlycare2.presentation.state.ViewDetailEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String bloodPressure = null;
        
        public OnBloodPressureChange(@org.jetbrains.annotations.NotNull()
        java.lang.String bloodPressure) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBloodPressure() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.elderlycare2.presentation.state.ViewDetailEvent.OnBloodPressureChange copy(@org.jetbrains.annotations.NotNull()
        java.lang.String bloodPressure) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/elderlycare2/presentation/state/ViewDetailEvent$OnHeartRateChange;", "Lcom/example/elderlycare2/presentation/state/ViewDetailEvent;", "heartRate", "", "(Ljava/lang/String;)V", "getHeartRate", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnHeartRateChange extends com.example.elderlycare2.presentation.state.ViewDetailEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String heartRate = null;
        
        public OnHeartRateChange(@org.jetbrains.annotations.NotNull()
        java.lang.String heartRate) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHeartRate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.elderlycare2.presentation.state.ViewDetailEvent.OnHeartRateChange copy(@org.jetbrains.annotations.NotNull()
        java.lang.String heartRate) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/elderlycare2/presentation/state/ViewDetailEvent$OnSugarLevelChange;", "Lcom/example/elderlycare2/presentation/state/ViewDetailEvent;", "sugarLevel", "", "(Ljava/lang/String;)V", "getSugarLevel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnSugarLevelChange extends com.example.elderlycare2.presentation.state.ViewDetailEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String sugarLevel = null;
        
        public OnSugarLevelChange(@org.jetbrains.annotations.NotNull()
        java.lang.String sugarLevel) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSugarLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.elderlycare2.presentation.state.ViewDetailEvent.OnSugarLevelChange copy(@org.jetbrains.annotations.NotNull()
        java.lang.String sugarLevel) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lcom/example/elderlycare2/presentation/state/ViewDetailEvent$UpdateUserDetail;", "Lcom/example/elderlycare2/presentation/state/ViewDetailEvent;", "elderId", "", "heartRate", "bloodPressure", "sugarLevel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBloodPressure", "()Ljava/lang/String;", "getElderId", "getHeartRate", "getSugarLevel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class UpdateUserDetail extends com.example.elderlycare2.presentation.state.ViewDetailEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String elderId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String heartRate = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String bloodPressure = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String sugarLevel = null;
        
        public UpdateUserDetail(@org.jetbrains.annotations.NotNull()
        java.lang.String elderId, @org.jetbrains.annotations.NotNull()
        java.lang.String heartRate, @org.jetbrains.annotations.NotNull()
        java.lang.String bloodPressure, @org.jetbrains.annotations.NotNull()
        java.lang.String sugarLevel) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getElderId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHeartRate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBloodPressure() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSugarLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.elderlycare2.presentation.state.ViewDetailEvent.UpdateUserDetail copy(@org.jetbrains.annotations.NotNull()
        java.lang.String elderId, @org.jetbrains.annotations.NotNull()
        java.lang.String heartRate, @org.jetbrains.annotations.NotNull()
        java.lang.String bloodPressure, @org.jetbrains.annotations.NotNull()
        java.lang.String sugarLevel) {
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