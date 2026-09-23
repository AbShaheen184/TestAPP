package org.msgpack.core.buffer;

import java.io.Closeable;
import java.io.Flushable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Closeable, Flushable {
    public final ArrayList e = new ArrayList();
    public MessageBuffer y;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }
}
