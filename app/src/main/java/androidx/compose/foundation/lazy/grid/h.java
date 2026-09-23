package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.b2;
import androidx.compose.foundation.gestures.w1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.compose.foundation.lazy.layout.m {
    public static final b2 e = new b2(4);
    public final u b = new u(this);
    public final androidx.appcompat.widget.x c = new androidx.appcompat.widget.x();
    public boolean d;

    public h(kotlin.jvm.functions.l lVar) {
        lVar.invoke(this);
    }

    public static void p(int i, h hVar, androidx.compose.runtime.internal.f fVar, kotlin.jvm.functions.l lVar) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        hVar.c.b(1, new f(null, lVar != null ? new g(lVar, 0, (byte) 0) : e, new w1(2), new androidx.compose.runtime.internal.f(true, -291643851, new androidx.compose.foundation.lazy.i(fVar, 1))));
        if (lVar != null) {
            hVar.d = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.m
    public final androidx.appcompat.widget.x k() {
        return this.c;
    }

    public final void q(int i, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.internal.f fVar) {
        this.c.b(i, new f(lVar, e, lVar2, fVar));
    }
}
