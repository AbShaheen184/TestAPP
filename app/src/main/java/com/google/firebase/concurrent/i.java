package com.google.firebase.concurrent;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Executor {
    public static final i e;
    public static final Handler y;
    public static final /* synthetic */ i[] z;

    static {
        i iVar = new i("INSTANCE", 0);
        e = iVar;
        z = new i[]{iVar};
        y = new Handler(Looper.getMainLooper());
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) z.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y.post(runnable);
    }
}
