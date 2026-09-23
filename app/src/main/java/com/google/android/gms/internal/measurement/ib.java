package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ib implements Closeable {
    public final Inflater e = new Inflater(true);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.end();
    }
}
