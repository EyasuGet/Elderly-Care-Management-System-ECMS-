package com.example.elderlycare2.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import com.example.elderlycare2.data.repository.LoginRepository;
import com.example.elderlycare2.presentation.state.LoginEvent;
import com.example.elderlycare2.presentation.state.LoginState;
import com.example.elderlycare2.presentation.state.SignUpState;
import com.example.elderlycare2.utils.SessionManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u0006\u0010\u0019\u001a\u00020\u0010R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/example/elderlycare2/presentation/viewmodel/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "loginRepository", "Lcom/example/elderlycare2/data/repository/LoginRepository;", "sessionManager", "error/NonExistentClass", "(Lcom/example/elderlycare2/data/repository/LoginRepository;Lerror/NonExistentClass;)V", "_loginState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/elderlycare2/presentation/state/LoginState;", "loginState", "Lkotlinx/coroutines/flow/StateFlow;", "getLoginState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lerror/NonExistentClass;", "clearLoginResults", "", "fetchRole", "", "handleEvent", "event", "Lcom/example/elderlycare2/presentation/state/LoginEvent;", "handleLogin", "email", "password", "logout", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.elderlycare2.data.repository.LoginRepository loginRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.elderlycare2.presentation.state.LoginState> _loginState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.elderlycare2.presentation.state.LoginState> loginState = null;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.repository.LoginRepository loginRepository, @org.jetbrains.annotations.NotNull()
    SessionManager sessionManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.elderlycare2.presentation.state.LoginState> getLoginState() {
        return null;
    }
    
    public final void handleEvent(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.presentation.state.LoginEvent event) {
    }
    
    private final void handleLogin(java.lang.String email, java.lang.String password) {
    }
    
    private final void clearLoginResults() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fetchRole() {
        return null;
    }
    
    public final void logout() {
    }
}