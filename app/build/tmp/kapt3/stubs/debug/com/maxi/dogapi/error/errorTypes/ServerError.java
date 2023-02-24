package com.maxi.dogapi.error.errorTypes;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0019\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\r"}, d2 = {"Lcom/maxi/dogapi/error/errorTypes/ServerError;", "Lcom/maxi/dogapi/error/ErrorView;", "()V", "describeContents", "", "setupView", "", "erroView", "Lcom/maxi/dogapi/error/errorTypes/SGErrorView;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class ServerError implements com.maxi.dogapi.error.ErrorView {
    public static final android.os.Parcelable.Creator<com.maxi.dogapi.error.errorTypes.ServerError> CREATOR = null;
    
    @java.lang.Override()
    public void setupView(@org.jetbrains.annotations.NotNull()
    com.maxi.dogapi.error.errorTypes.SGErrorView erroView) {
    }
    
    public ServerError() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.maxi.dogapi.error.errorTypes.ServerError> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.maxi.dogapi.error.errorTypes.ServerError[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.maxi.dogapi.error.errorTypes.ServerError createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}