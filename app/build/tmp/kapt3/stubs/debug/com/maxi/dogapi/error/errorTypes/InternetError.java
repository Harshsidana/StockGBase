package com.maxi.dogapi.error.errorTypes;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0019\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/maxi/dogapi/error/errorTypes/InternetError;", "Lcom/maxi/dogapi/error/ErrorViewWithWarning;", "showWarning", "", "(Z)V", "warning", "Lcom/google/android/material/snackbar/Snackbar;", "getWarning$annotations", "()V", "getWarning", "()Lcom/google/android/material/snackbar/Snackbar;", "setWarning", "(Lcom/google/android/material/snackbar/Snackbar;)V", "describeContents", "", "dismissWarning", "", "setupView", "erroView", "Lcom/maxi/dogapi/error/errorTypes/SGErrorView;", "root", "Landroid/view/View;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class InternetError implements com.maxi.dogapi.error.ErrorViewWithWarning {
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.snackbar.Snackbar warning;
    private final boolean showWarning = false;
    public static final android.os.Parcelable.Creator<com.maxi.dogapi.error.errorTypes.InternetError> CREATOR = null;
    
    @kotlinx.android.parcel.IgnoredOnParcel()
    @java.lang.Override()
    @java.lang.Deprecated()
    public static void getWarning$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.google.android.material.snackbar.Snackbar getWarning() {
        return null;
    }
    
    @java.lang.Override()
    public void setWarning(@org.jetbrains.annotations.Nullable()
    com.google.android.material.snackbar.Snackbar p0) {
    }
    
    @java.lang.Override()
    public void setupView(@org.jetbrains.annotations.NotNull()
    com.maxi.dogapi.error.errorTypes.SGErrorView erroView) {
    }
    
    @java.lang.Override()
    public void showWarning(@org.jetbrains.annotations.NotNull()
    android.view.View root) {
    }
    
    @java.lang.Override()
    public void dismissWarning() {
    }
    
    public InternetError(boolean showWarning) {
        super();
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.maxi.dogapi.error.errorTypes.InternetError> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.maxi.dogapi.error.errorTypes.InternetError[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.maxi.dogapi.error.errorTypes.InternetError createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}