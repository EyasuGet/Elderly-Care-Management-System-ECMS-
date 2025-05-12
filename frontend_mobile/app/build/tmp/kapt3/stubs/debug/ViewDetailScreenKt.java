
import androidx.compose.foundation.layout.*;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.*;
import androidx.compose.runtime.*;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.navigation.NavController;
import com.example.elderlycare2.R;
import com.example.elderlycare2.presentation.state.ViewDetailEvent;
import com.example.elderlycare2.presentation.viewmodel.LoginViewModel;
import com.example.elderlycare2.presentation.viewmodel.ViewDetailViewModel;
import com.example.elderlycare2.presentation.viewmodel.NurseDeleteViewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001aD\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007\u001a.\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u00a8\u0006\u001b"}, d2 = {"UpdateVitalDialog", "", "title", "", "initialValue", "unit", "onDismiss", "Lkotlin/Function0;", "onUpdate", "Lkotlin/Function1;", "ViewDetailScreen", "navController", "Landroidx/navigation/NavController;", "elderId", "elderName", "elderEmail", "viewModel", "Lcom/example/elderlycare2/presentation/viewmodel/ViewDetailViewModel;", "nurseDeleteViewModel", "Lcom/example/elderlycare2/presentation/viewmodel/NurseDeleteViewModel;", "loginViewModel", "Lcom/example/elderlycare2/presentation/viewmodel/LoginViewModel;", "VitalCard", "value", "imageRes", "", "onUpdateClick", "app_debug"})
public final class ViewDetailScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void ViewDetailScreen(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    java.lang.String elderId, @org.jetbrains.annotations.NotNull()
    java.lang.String elderName, @org.jetbrains.annotations.NotNull()
    java.lang.String elderEmail, @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.presentation.viewmodel.ViewDetailViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.presentation.viewmodel.NurseDeleteViewModel nurseDeleteViewModel, @org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.presentation.viewmodel.LoginViewModel loginViewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void VitalCard(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String value, int imageRes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onUpdateClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void UpdateVitalDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String initialValue, @org.jetbrains.annotations.NotNull()
    java.lang.String unit, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onUpdate) {
    }
}