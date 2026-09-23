package com.google.android.gms.internal.measurement;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Closeable {
    public static final androidx.compose.ui.platform.q0 y = new androidx.compose.ui.platform.q0(2);
    public int e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.e;
        if (i > 0) {
            this.e = i - 1;
        } else {
            kotlinx.coroutines.future.a.o("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
