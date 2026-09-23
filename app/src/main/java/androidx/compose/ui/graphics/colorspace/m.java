package androidx.compose.ui.graphics.colorspace;

import kotlin.collections.i0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements i {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ m(q qVar, int i) {
        this.a = i;
        this.b = qVar;
    }

    @Override // androidx.compose.ui.graphics.colorspace.i
    public final double a(double d) {
        switch (this.a) {
            case 0:
                q qVar = this.b;
                return i0.b(qVar.k.a(d), qVar.e, qVar.f);
            default:
                q qVar2 = this.b;
                return qVar2.n.a(i0.b(d, qVar2.e, qVar2.f));
        }
    }
}
