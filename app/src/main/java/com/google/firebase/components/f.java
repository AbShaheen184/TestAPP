package com.google.firebase.components;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements com.google.firebase.inject.b {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // com.google.firebase.inject.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                return ExecutorsRegistrar.a();
            case 3:
                n nVar = ExecutorsRegistrar.a;
                return new com.google.firebase.concurrent.e(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new com.google.firebase.concurrent.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                n nVar2 = ExecutorsRegistrar.a;
                return new com.google.firebase.concurrent.e(Executors.newCachedThreadPool(new com.google.firebase.concurrent.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            default:
                n nVar3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new com.google.firebase.concurrent.a("Firebase Scheduler", 0, null));
        }
    }
}
