package com.maxi.dogapi.error;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lcom/maxi/dogapi/error/ErrorViewWithWarning;", "Lcom/maxi/dogapi/error/ErrorView;", "warning", "Lcom/google/android/material/snackbar/Snackbar;", "getWarning", "()Lcom/google/android/material/snackbar/Snackbar;", "setWarning", "(Lcom/google/android/material/snackbar/Snackbar;)V", "dismissWarning", "", "showWarning", "root", "Landroid/view/View;", "app_debug"})
public abstract interface ErrorViewWithWarning extends com.maxi.dogapi.error.ErrorView {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.google.android.material.snackbar.Snackbar getWarning();
    
    public abstract void setWarning(@org.jetbrains.annotations.Nullable()
    com.google.android.material.snackbar.Snackbar p0);
    
    public abstract void showWarning(@org.jetbrains.annotations.NotNull()
    android.view.View root);
    
    public abstract void dismissWarning();
}