package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.y1;
import androidx.compose.runtime.j1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements y1 {
    public final e2 a;
    public androidx.compose.ui.e b;
    public final j1 c = androidx.compose.runtime.t.r(new androidx.compose.ui.unit.l(0));
    public final androidx.collection.o0 d;

    public v(e2 e2Var, androidx.compose.ui.e eVar) {
        this.a = e2Var;
        this.b = eVar;
        long[] jArr = androidx.collection.w0.a;
        this.d = new androidx.collection.o0();
    }

    @Override // androidx.compose.animation.core.y1
    public final Object b() {
        return this.a.f().b();
    }

    @Override // androidx.compose.animation.core.y1
    public final Object c() {
        return this.a.f().c();
    }
}
