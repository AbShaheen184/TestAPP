package androidx.arch.core.internal;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {
    public final HashMap B = new HashMap();

    @Override // androidx.arch.core.internal.f
    public final c b(Object obj) {
        return (c) this.B.get(obj);
    }

    @Override // androidx.arch.core.internal.f
    public final Object c(Object obj) {
        Object objC = super.c(obj);
        this.B.remove(obj);
        return objC;
    }
}
