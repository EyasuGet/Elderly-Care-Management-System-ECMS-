package com.example.elderlycare2.presentation.viewmodel;

import dagger.hilt.android.lifecycle.HiltViewModel;
import androidx.lifecycle.ViewModel;
import javax.inject.Inject;
import kotlinx.coroutines.flow.StateFlow;
import com.example.elderlycare2.data.repository.SignUpRepository;
import com.example.elderlycare2.presentation.state.SignUpState;
import com.example.elderlycare2.presentation.state.SignUpEvent;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J \u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J \u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u001c\u0010\u0017\u001a\u00020\r2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0019H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lcom/example/elderlycare2/presentation/viewmodel/SignUpViewModel;", "Landroidx/lifecycle/ViewModel;", "signUpRepository", "Lcom/example/elderlycare2/data/repository/SignUpRepository;", "(Lcom/example/elderlycare2/data/repository/SignUpRepository;)V", "_signupState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/elderlycare2/presentation/state/SignUpState;", "signupState", "Lkotlinx/coroutines/flow/StateFlow;", "getSignupState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearSignupResults", "", "handleEvent", "event", "Lcom/example/elderlycare2/presentation/state/SignUpEvent;", "signUpNurse", "email", "", "password", "name", "signUpUser", "updateState", "update", "Lkotlin/Function1;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SignUpViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.elderlycare2.data.repository.SignUpRepository signUpRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.elderlycare2.presentation.state.SignUpState> _signupState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.elderlycare2.presentation.state.SignUpState> signupState = null;
    
    @javax.inject.Inject()
    public SignUpViewModel(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.repository.SignUpRepository signUpRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.elderlycare2.presentation.state.SignUpState> getSignupState() {
        return null;
    }
    
    public final void handleEvent(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.presentation.state.SignUpEvent event) {
    }
    
    private final void signUpUser(java.lang.String email, java.lang.String password, java.lang.String name) {
    }
    
    private final void signUpNurse(java.lang.String email, java.lang.String password, java.lang.String name) {
    }
    
    private final void clearSignupResults() {
    }
    
    private final void updateState(kotlin.jvm.functions.Function1<? super com.example.elderlycare2.presentation.state.SignUpState, com.example.elderlycare2.presentation.state.SignUpState> update) {
    }
}