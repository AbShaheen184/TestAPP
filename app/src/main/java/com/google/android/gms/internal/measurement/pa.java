package com.google.android.gms.internal.measurement;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pa implements ThreadFactory {
    public static final /* synthetic */ pa a = new pa();

    @Override // java.util.concurrent.ThreadFactory
    public final /* synthetic */ Thread newThread(Runnable runnable) {
        Object obj = na.j;
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
