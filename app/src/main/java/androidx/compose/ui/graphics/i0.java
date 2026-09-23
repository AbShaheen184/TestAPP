package androidx.compose.ui.graphics;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends a0 {
    public final androidx.compose.ui.geometry.d f;
    public final j g;

    public i0(androidx.compose.ui.geometry.d dVar) {
        j jVarA;
        this.f = dVar;
        if (_COROUTINE.a.W(dVar)) {
            jVarA = null;
        } else {
            jVarA = l.a();
            j.b(jVarA, dVar);
        }
        this.g = jVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            return this.f.equals(((i0) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // androidx.compose.ui.graphics.a0
    public final androidx.compose.ui.geometry.c m() {
        androidx.compose.ui.geometry.d dVar = this.f;
        return new androidx.compose.ui.geometry.c(dVar.a, dVar.b, dVar.c, dVar.d);
    }
}
