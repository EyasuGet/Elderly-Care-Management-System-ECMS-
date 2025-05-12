package com.example.elderlycare2.navigation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/elderlycare2/navigation/NavigationRoutes;", "", "()V", "ELDER_DETAILS", "", "Login", "NURSE_HOME", "NURSE_PROFILE", "NURSE_TASK", "SignUp", "USER_HOME", "USER_PROFILE", "landing", "app_debug"})
public final class NavigationRoutes {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SignUp = "sign_up";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String Login = "login";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String landing = "landing";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NURSE_HOME = "nurse/home";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NURSE_TASK = "nurse/task";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NURSE_PROFILE = "nurse/profile";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ELDER_DETAILS = "nurse/user/{elderId}/{elderName}/{elderEmail}/details";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_PROFILE = "user/profile";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_HOME = "user_home";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.elderlycare2.navigation.NavigationRoutes INSTANCE = null;
    
    private NavigationRoutes() {
        super();
    }
}