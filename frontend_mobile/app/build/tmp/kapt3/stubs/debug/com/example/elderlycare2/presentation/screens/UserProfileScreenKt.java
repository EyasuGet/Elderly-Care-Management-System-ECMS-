package com.example.elderlycare2.presentation.screens;

import androidx.compose.foundation.layout.*;
import androidx.compose.material3.*;
import androidx.compose.runtime.*;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.navigation.NavHostController;
import com.example.elderlycare2.R;
import com.example.elderlycare2.navigation.NavigationRoutes;
import com.example.elderlycare2.presentation.state.UserEditProfileUiEvent;
import com.example.elderlycare2.presentation.viewmodel.UserProfileViewModel;
import com.example.elderlycare2.presentation.viewmodel.LoginViewModel;
import com.example.elderlycare2.presentation.state.LoginEvent;
import com.example.elderlycare2.ui.theme.BackgroundColor;
import com.example.elderlycare2.ui.theme.BackgroundColor1;
import com.example.elderlycare2.ui.theme.BackgroundColoruser;
import com.example.elderlycare2.ui.theme.BorderFocusedColor;
import com.example.elderlycare2.ui.theme.BorderUnfocusedColor;
import com.example.elderlycare2.ui.theme.ButtonTextColor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a2\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007\u00a8\u0006\u0012"}, d2 = {"ProfileField", "", "label", "", "value", "onValueChange", "Lkotlin/Function1;", "isEditing", "", "UserProfileScreen", "navController", "Landroidx/navigation/NavHostController;", "userProfileViewModel", "Lcom/example/elderlycare2/presentation/viewmodel/UserProfileViewModel;", "loginViewModel", "Lcom/example/elderlycare2/presentation/viewmodel/LoginViewModel;", "onLogoutClick", "Lkotlin/Function0;", "app_debug"})
public final class UserProfileScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void UserProfileScreen(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.presentation.viewmodel.UserProfileViewModel userProfileViewModel, @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.presentation.viewmodel.LoginViewModel loginViewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLogoutClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ProfileField(@org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange, boolean isEditing) {
    }
}