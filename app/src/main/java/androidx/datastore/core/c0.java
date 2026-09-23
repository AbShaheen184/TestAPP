package androidx.datastore.core;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class c0 implements a {
    public final File a;
    public final x0 b;
    public final AtomicBoolean c;

    public c0(File file, x0 x0Var) {
        x0Var.getClass();
        this.a = file;
        this.b = x0Var;
        this.c = new AtomicBoolean(false);
    }

    @Override // androidx.datastore.core.a
    public final void close() {
        this.c.set(true);
    }
}
