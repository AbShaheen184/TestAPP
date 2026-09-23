package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.w1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.compose.foundation.lazy.layout.m {
    public final androidx.appcompat.widget.x b = new androidx.appcompat.widget.x();

    public j(kotlin.jvm.functions.l lVar) {
        lVar.invoke(this);
    }

    public static void p(j jVar, androidx.compose.runtime.internal.f fVar, int i) {
        String str = (i & 1) != 0 ? null : "..";
        jVar.b.b(1, new h(str != null ? new androidx.activity.compose.g(str, 7) : null, new w1(2), new androidx.compose.runtime.internal.f(true, -857469575, new i(fVar, 0))));
    }

    @Override // androidx.compose.foundation.lazy.layout.m
    public final androidx.appcompat.widget.x k() {
        return this.b;
    }

    public final void q(int i, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.internal.f fVar) {
        this.b.b(i, new h(lVar, lVar2, fVar));
    }
}
