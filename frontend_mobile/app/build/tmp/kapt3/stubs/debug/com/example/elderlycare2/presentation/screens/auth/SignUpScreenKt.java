package com.example.elderlycare2.presentation.screens.auth;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.navigation.NavController;
import com.example.elderlycare2.presentation.state.SignUpEvent;
import com.example.elderlycare2.presentation.viewmodel.SignUpViewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a&\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u001a(\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u001a6\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0014H\u0007\u001a\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0006H\u0007\u00a8\u0006\u0016"}, d2 = {"RoleSelection", "", "signUpViewModel", "Lcom/example/elderlycare2/presentation/viewmodel/SignUpViewModel;", "RoleToggleButton", "text", "", "selected", "", "onClick", "Lkotlin/Function0;", "SignUpScreen", "navController", "Landroidx/navigation/NavController;", "onLoginClick", "SignUpTextField", "label", "value", "isPassword", "onValueChange", "Lkotlin/Function1;", "TextFieldLabel", "app_debug"})
public final class SignUpScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void SignUpScreen(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.presentation.viewmodel.SignUpViewModel signUpViewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoginClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void RoleToggleButton(@org.jetbrains.annotations.NotNull()
    java.lang.String text, boolean selected, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TextFieldLabel(@org.jetbrains.annotations.NotNull()
    java.lang.String label) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SignUpTextField(@org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.lang.String value, boolean isPassword, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void RoleSelection(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.presentation.viewmodel.SignUpViewModel signUpViewModel) {
    }
}