package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends g implements kotlin.jvm.internal.h {
    private final int arity;

    public h(int i, kotlin.coroutines.d dVar) {
        super(dVar);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        a0.a.getClass();
        return b0.a(this);
    }
}
