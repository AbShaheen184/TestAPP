package androidx.compose.runtime.changelist;

import androidx.compose.runtime.k2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public final int a;
    public final int b;

    public /* synthetic */ j0(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public abstract void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, k2 k2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var);

    public androidx.compose.runtime.a b(androidx.compose.foundation.text.selection.w wVar) {
        return null;
    }

    public final String toString() {
        String strC = kotlin.jvm.internal.a0.a(getClass()).c();
        return strC == null ? "" : strC;
    }

    public j0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
