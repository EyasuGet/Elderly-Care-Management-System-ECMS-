package com.example.elderlycare2.presentation.screens;

import androidx.compose.foundation.layout.*;
import androidx.compose.material3.*;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.navigation.NavController;
import com.example.elderlycare2.R;
import com.example.elderlycare2.presentation.state.LoginEvent;
import com.example.elderlycare2.presentation.viewmodel.LoginViewModel;
import com.example.elderlycare2.ui.theme.BackgroundColor;
import com.example.elderlycare2.ui.theme.BorderFocusedColor;
import com.example.elderlycare2.ui.theme.BorderUnfocusedColor;
import com.example.elderlycare2.ui.theme.ButtonTextColor;
import com.example.elderlycare2.ui.theme.PrimaryColor;
import com.example.elderlycare2.ui.theme.TextColor;
import com.example.elderlycare2.ui.theme.TextFieldBackground;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a[\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\nH\u0007\u001a>\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u00a8\u0006\u0016"}, d2 = {"LoginScreen", "", "onForgotPassword", "Lkotlin/Function0;", "onSignUpClick", "loginViewModel", "Lcom/example/elderlycare2/presentation/viewmodel/LoginViewModel;", "navController", "Landroidx/navigation/NavController;", "onLoginSuccess", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "role", "LoginTextField", "label", "placeholder", "value", "isPassword", "", "onValueChange", "app_debug"})
public final class LoginScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void LoginScreen(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onForgotPassword, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSignUpClick, @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.presentation.viewmodel.LoginViewModel loginViewModel, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onLoginSuccess) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void LoginTextField(@org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.lang.String placeholder, @org.jetbrains.annotations.NotNull()
    java.lang.String value, boolean isPassword, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange) {
    }
}