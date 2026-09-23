package com.google.android.datatransport.runtime;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Closeable {
    public com.google.android.datatransport.runtime.scheduling.persistence.c A;
    public javax.inject.a B;
    public javax.inject.a C;
    public javax.inject.a e;
    public com.google.android.datatransport.runtime.backends.d y;
    public javax.inject.a z;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((com.google.android.datatransport.runtime.scheduling.persistence.g) this.B.get()).close();
    }
}
