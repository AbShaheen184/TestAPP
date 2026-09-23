package kotlinx.serialization.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends a {
    public final kotlinx.serialization.a a;

    public n(kotlinx.serialization.a aVar) {
        this.a = aVar;
    }

    @Override // kotlinx.serialization.a
    public void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        int iH = h(obj);
        kotlinx.serialization.descriptors.e eVarD = d();
        eVarD.getClass();
        kotlinx.serialization.json.internal.n nVarA = nVar.a(eVarD);
        Iterator itG = g(obj);
        for (int i = 0; i < iH; i++) {
            nVarA.o(d(), i, this.a, itG.next());
        }
        nVarA.s(eVarD);
    }

    @Override // kotlinx.serialization.internal.a
    public void j(kotlinx.serialization.encoding.a aVar, int i, Object obj) {
        m(i, obj, aVar.w(d(), i, this.a, null));
    }

    public abstract void m(int i, Object obj, Object obj2);
}
