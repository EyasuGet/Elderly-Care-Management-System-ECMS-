package com.example.elderlycare2.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import com.example.elderlycare2.data.remote.request.UserEditProfileRequest;
import com.example.elderlycare2.data.repository.UserProfileRepository;
import com.example.elderlycare2.presentation.state.UserEditProfileState;
import com.example.elderlycare2.presentation.state.UserEditProfileUiEvent;
import com.example.elderlycare2.utils.SessionManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0019H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001e"}, d2 = {"Lcom/example/elderlycare2/presentation/viewmodel/UserProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "userProfileRepository", "Lcom/example/elderlycare2/data/repository/UserProfileRepository;", "sessionManager", "error/NonExistentClass", "(Lcom/example/elderlycare2/data/repository/UserProfileRepository;Lerror/NonExistentClass;)V", "_userProfileState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/elderlycare2/presentation/state/UserEditProfileState;", "Lerror/NonExistentClass;", "userId", "", "getUserId", "()Ljava/lang/String;", "userInfo", "getUserInfo", "()Lerror/NonExistentClass;", "userName", "getUserName", "userProfileState", "Lkotlinx/coroutines/flow/StateFlow;", "getUserProfileState", "()Lkotlinx/coroutines/flow/StateFlow;", "fetchUserProfile", "", "handleEvent", "event", "Lcom/example/elderlycare2/presentation/state/UserEditProfileUiEvent;", "updateProfile", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class UserProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.elderlycare2.data.repository.UserProfileRepository userProfileRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.elderlycare2.presentation.state.UserEditProfileState> _userProfileState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.elderlycare2.presentation.state.UserEditProfileState> userProfileState = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object userInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userId = null;
    
    @javax.inject.Inject()
    public UserProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.repository.UserProfileRepository userProfileRepository, @org.jetbrains.annotations.NotNull()
    SessionManager sessionManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.elderlycare2.presentation.state.UserEditProfileState> getUserProfileState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getUserInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void handleEvent(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.presentation.state.UserEditProfileUiEvent event) {
    }
    
    private final void fetchUserProfile() {
    }
    
    private final void updateProfile() {
    }
}