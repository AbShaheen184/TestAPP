package kotlinx.serialization.json;

import com.app.mlounge.ui.viewmodel.q0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements kotlinx.serialization.a {
    public static final k a = new k();
    public static final kotlinx.serialization.descriptors.g b;

    static {
        kotlinx.serialization.descriptors.g gVar;
        kotlinx.serialization.descriptors.e[] eVarArr = new kotlinx.serialization.descriptors.e[0];
        q0 q0Var = new q0(16);
        if (!kotlin.text.k.J("kotlinx.serialization.json.JsonElement")) {
            kotlinx.serialization.descriptors.i iVar = kotlinx.serialization.descriptors.i.b;
            kotlinx.serialization.descriptors.c cVar = kotlinx.serialization.descriptors.c.b;
            if (cVar.equals(iVar)) {
                kotlinx.coroutines.future.a.q("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            } else {
                kotlinx.serialization.descriptors.a aVar = new kotlinx.serialization.descriptors.a("kotlinx.serialization.json.JsonElement");
                q0Var.invoke(aVar);
                gVar = new kotlinx.serialization.descriptors.g("kotlinx.serialization.json.JsonElement", cVar, aVar.b.size(), kotlin.collections.o.C(eVarArr), aVar);
            }
            b = gVar;
        }
        kotlinx.coroutines.future.a.q("Blank serial names are prohibited");
        gVar = null;
        b = gVar;
    }

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        return kotlin.comparisons.a.b(bVar).K();
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        i iVar = (i) obj;
        iVar.getClass();
        kotlin.comparisons.a.a(nVar);
        if (iVar instanceof w) {
            nVar.p(x.a, iVar);
            return;
        }
        if (iVar instanceof s) {
            nVar.p(u.a, iVar);
        } else if (iVar instanceof d) {
            nVar.p(f.a, iVar);
        } else {
            coil3.g.a();
        }
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
