package com.maxi.dogapi.interceptor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/maxi/dogapi/interceptor/WifiService;", "", "()V", "connectivityManager", "Landroid/net/ConnectivityManager;", "wifiManager", "Landroid/net/wifi/WifiManager;", "initializeWithApplicationContext", "", "context", "Landroid/content/Context;", "isOnline", "", "Companion", "app_debug"})
public final class WifiService {
    private android.net.wifi.WifiManager wifiManager;
    private android.net.ConnectivityManager connectivityManager;
    @org.jetbrains.annotations.NotNull()
    private static final com.maxi.dogapi.interceptor.WifiService instance = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.maxi.dogapi.interceptor.WifiService.Companion Companion = null;
    
    public final void initializeWithApplicationContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public final boolean isOnline() {
        return false;
    }
    
    public WifiService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/maxi/dogapi/interceptor/WifiService$Companion;", "", "()V", "instance", "Lcom/maxi/dogapi/interceptor/WifiService;", "getInstance", "()Lcom/maxi/dogapi/interceptor/WifiService;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.maxi.dogapi.interceptor.WifiService getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}