package androidx.media3.common;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public final o a;

    static {
        new SparseBooleanArray();
        _COROUTINE.a.A(!false);
        androidx.media3.common.util.i0.K(0);
    }

    public m0(o oVar) {
        this.a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            return this.a.equals(((m0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
