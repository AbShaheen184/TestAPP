package androidx.core.util;

import androidx.constraintlayout.core.d;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d {
    public final Object c;

    public b() {
        super(12);
        this.c = new Object();
    }

    @Override // androidx.constraintlayout.core.d
    public final Object a() {
        Object objA;
        synchronized (this.c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // androidx.constraintlayout.core.d
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
