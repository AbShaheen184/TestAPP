package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class g extends f {
    public int m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (d dVar : this.k) {
            dVar.a(dVar);
        }
    }
}
