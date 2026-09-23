package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class l extends com.google.gson.m {
    public static final l a = new l();

    private l() {
    }

    public static com.google.gson.g d(int i, com.google.gson.stream.a aVar) {
        int iE = androidx.constraintlayout.core.g.e(i);
        if (iE == 5) {
            return new com.google.gson.k(aVar.l0());
        }
        if (iE == 6) {
            return new com.google.gson.k(new com.google.gson.internal.j(aVar.l0()));
        }
        if (iE == 7) {
            return new com.google.gson.k(Boolean.valueOf(aVar.d0()));
        }
        if (iE == 8) {
            aVar.j0();
            return com.google.gson.i.e;
        }
        kotlinx.coroutines.future.a.u("Unexpected token: ".concat(com.google.android.datatransport.runtime.a.x(i)));
        return null;
    }

    public static void e(com.google.gson.g gVar, com.google.gson.stream.b bVar) throws IOException {
        if (gVar == null || (gVar instanceof com.google.gson.i)) {
            bVar.Y();
            return;
        }
        boolean z = gVar instanceof com.google.gson.k;
        if (z) {
            if (!z) {
                com.google.firebase.platforminfo.b.k(gVar, "Not a JSON Primitive: ");
                return;
            }
            com.google.gson.k kVar = (com.google.gson.k) gVar;
            Serializable serializable = kVar.e;
            if (serializable instanceof Number) {
                bVar.g0(kVar.k());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.i0(kVar.b());
                return;
            } else {
                bVar.h0(kVar.h());
                return;
            }
        }
        if (gVar instanceof com.google.gson.f) {
            bVar.g();
            Iterator it = gVar.d().e.iterator();
            while (it.hasNext()) {
                e((com.google.gson.g) it.next(), bVar);
            }
            bVar.A();
            return;
        }
        if (!(gVar instanceof com.google.gson.j)) {
            androidx.transition.k.l(gVar.getClass(), "Couldn't write ");
            return;
        }
        bVar.n();
        Iterator it2 = ((com.google.gson.internal.l) gVar.e().e.entrySet()).iterator();
        while (((com.google.gson.internal.k) it2).hasNext()) {
            com.google.gson.internal.m mVarC = ((com.google.gson.internal.k) it2).c();
            bVar.N((String) mVarC.getKey());
            e((com.google.gson.g) mVarC.getValue(), bVar);
        }
        bVar.L();
    }

    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        com.google.gson.g fVar;
        com.google.gson.g fVar2;
        if (aVar instanceof n) {
            n nVar = (n) aVar;
            int iN0 = nVar.n0();
            if (iN0 == 5 || iN0 == 2 || iN0 == 4 || iN0 == 10) {
                com.google.firebase.platforminfo.b.e(com.google.android.datatransport.runtime.a.x(iN0), " when reading a JsonElement.", "Unexpected ");
                return null;
            }
            com.google.gson.g gVar = (com.google.gson.g) nVar.A0();
            nVar.t0();
            return gVar;
        }
        int iN1 = aVar.n0();
        int iE = androidx.constraintlayout.core.g.e(iN1);
        if (iE == 0) {
            aVar.a();
            fVar = new com.google.gson.f();
        } else if (iE != 2) {
            fVar = null;
        } else {
            aVar.g();
            fVar = new com.google.gson.j();
        }
        if (fVar == null) {
            return d(iN1, aVar);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.a0()) {
                String strH0 = fVar instanceof com.google.gson.j ? aVar.h0() : null;
                int iN2 = aVar.n0();
                int iE2 = androidx.constraintlayout.core.g.e(iN2);
                if (iE2 == 0) {
                    aVar.a();
                    fVar2 = new com.google.gson.f();
                } else if (iE2 != 2) {
                    fVar2 = null;
                } else {
                    aVar.g();
                    fVar2 = new com.google.gson.j();
                }
                boolean z = fVar2 != null;
                if (fVar2 == null) {
                    fVar2 = d(iN2, aVar);
                }
                if (fVar instanceof com.google.gson.f) {
                    ((com.google.gson.f) fVar).e.add(fVar2);
                } else {
                    ((com.google.gson.j) fVar).i(strH0, fVar2);
                }
                if (z) {
                    arrayDeque.addLast(fVar);
                    fVar = fVar2;
                }
            } else {
                if (fVar instanceof com.google.gson.f) {
                    aVar.A();
                } else {
                    aVar.L();
                }
                if (arrayDeque.isEmpty()) {
                    return fVar;
                }
                fVar = (com.google.gson.g) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.m
    public final /* bridge */ /* synthetic */ void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        e((com.google.gson.g) obj, bVar);
    }
}
