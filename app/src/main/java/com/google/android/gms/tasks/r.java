package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Executor {
    public static final /* synthetic */ r y = new r(1);
    public final /* synthetic */ int e;

    public /* synthetic */ r(int i) {
        this.e = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
