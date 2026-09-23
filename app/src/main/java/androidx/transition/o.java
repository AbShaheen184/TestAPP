package androidx.transition;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {
    public final /* synthetic */ androidx.collection.f a;
    public final /* synthetic */ p b;

    public o(p pVar, androidx.collection.f fVar) {
        this.b = pVar;
        this.a = fVar;
    }

    @Override // androidx.transition.j
    public final void d(m mVar) {
        ((ArrayList) this.a.get(this.b.y)).remove(mVar);
        mVar.w(this);
    }
}
