package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public o a;
    public t b;

    public final void a(v vVar, n nVar) {
        o oVarA = nVar.a();
        o oVar = this.a;
        oVar.getClass();
        if (oVarA.compareTo(oVar) < 0) {
            oVar = oVarA;
        }
        this.a = oVar;
        this.b.g(vVar, nVar);
        this.a = oVarA;
    }
}
