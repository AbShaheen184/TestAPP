package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements h, Serializable {
    public final int e;

    public m(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.internal.h
    public final int getArity() {
        return this.e;
    }

    public final String toString() {
        a0.a.getClass();
        return b0.a(this);
    }
}
