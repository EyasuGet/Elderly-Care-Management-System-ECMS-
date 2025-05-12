package com.example.elderlycare2.presentation.screens;

import androidx.compose.foundation.layout.*;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.runtime.*;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.font.FontWeight;
import androidx.navigation.NavController;
import com.example.elderlycare2.R;
import com.example.elderlycare2.data.remote.response.NurseListResponse;
import com.example.elderlycare2.presentation.viewmodel.LoginViewModel;
import com.example.elderlycare2.presentation.viewmodel.NurseListViewModel;
import androidx.compose.material.icons.Icons;
import com.example.elderlycare2.presentation.state.NurseListEvent;
import java.net.URLEncoder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001aL\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a8\u0006\u000f"}, d2 = {"ElderCard", "", "elder", "Lcom/example/elderlycare2/data/remote/response/NurseListResponse;", "onElderClick", "Lkotlin/Function1;", "NurseListScreen", "navController", "Landroidx/navigation/NavController;", "loginViewModel", "Lcom/example/elderlycare2/presentation/viewmodel/LoginViewModel;", "nurseListViewModel", "Lcom/example/elderlycare2/presentation/viewmodel/NurseListViewModel;", "onProfileClick", "", "app_debug"})
public final class NurseListScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void NurseListScreen(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.presentation.viewmodel.LoginViewModel loginViewModel, @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.presentation.viewmodel.NurseListViewModel nurseListViewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onProfileClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.elderlycare2.data.remote.response.NurseListResponse, kotlin.Unit> onElderClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ElderCard(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.remote.response.NurseListResponse elder, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.elderlycare2.data.remote.response.NurseListResponse, kotlin.Unit> onElderClick) {
    }
}