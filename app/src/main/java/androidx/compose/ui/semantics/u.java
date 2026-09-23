package androidx.compose.ui.semantics;

import androidx.collection.j0;
import androidx.compose.ui.node.f0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public final f0 a;
    public final f b;
    public final androidx.collection.n c;
    public final j0 d = new j0(2);

    public u(f0 f0Var, f fVar, androidx.collection.z zVar) {
        this.a = f0Var;
        this.b = fVar;
        this.c = zVar;
    }

    public final s a() {
        return new s(this.b, false, this.a, new n());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    public final void b(f0 f0Var, n nVar) {
        String str;
        String str2;
        androidx.compose.ui.state.a aVar;
        androidx.compose.ui.state.a aVar2;
        androidx.compose.ui.autofill.q qVar;
        androidx.compose.ui.autofill.q qVar2;
        j0 j0Var = this.d;
        Object[] objArr = j0Var.a;
        int i = j0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            androidx.compose.ui.autofill.d dVar = (androidx.compose.ui.autofill.d) ((o) objArr[i2]);
            androidx.compose.ui.autofill.r rVar = dVar.e;
            androidx.compose.ui.platform.u uVar = dVar.z;
            n nVarX = f0Var.x();
            int i3 = f0Var.y;
            if (nVar != null) {
                Object objG = nVar.e.g(w.E);
                if (objG == null) {
                    objG = null;
                }
                androidx.compose.ui.text.g gVar = (androidx.compose.ui.text.g) objG;
                if (gVar != null) {
                    str = gVar.y;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            if (nVarX != null) {
                Object objG2 = nVarX.e.g(w.E);
                if (objG2 == null) {
                    objG2 = null;
                }
                androidx.compose.ui.text.g gVar2 = (androidx.compose.ui.text.g) objG2;
                if (gVar2 != null) {
                    str2 = gVar2.y;
                } else {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            if (str != str2) {
                if (str == null) {
                    rVar.h(uVar, i3, true);
                } else if (str2 == null) {
                    rVar.h(uVar, i3, false);
                } else if (kotlin.jvm.internal.l.a((androidx.compose.ui.autofill.e) v.d(nVarX, w.r), androidx.compose.ui.autofill.n.a)) {
                    rVar.e(uVar, i3, androidx.compose.ui.autofill.i.a(str2));
                }
            }
            if (nVar != null) {
                Object objG3 = nVar.e.g(w.J);
                if (objG3 == null) {
                    objG3 = null;
                }
                aVar = (androidx.compose.ui.state.a) objG3;
            } else {
                aVar = null;
            }
            if (nVarX != null) {
                Object objG4 = nVarX.e.g(w.J);
                if (objG4 == null) {
                    objG4 = null;
                }
                aVar2 = (androidx.compose.ui.state.a) objG4;
            } else {
                aVar2 = null;
            }
            if (aVar != aVar2) {
                if (aVar == null) {
                    rVar.h(uVar, i3, true);
                } else if (aVar2 == null) {
                    rVar.h(uVar, i3, false);
                } else if (kotlin.jvm.internal.l.a((androidx.compose.ui.autofill.e) v.d(nVarX, w.r), androidx.compose.ui.autofill.n.b)) {
                    int iOrdinal = aVar2.ordinal();
                    Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        rVar.e(uVar, i3, androidx.compose.ui.autofill.i.b(bool.booleanValue()));
                    }
                }
            }
            if (nVar != null) {
                Object objG5 = nVar.e.g(w.s);
                if (objG5 == null) {
                    objG5 = null;
                }
                qVar = (androidx.compose.ui.autofill.q) objG5;
            } else {
                qVar = null;
            }
            if (nVarX != null) {
                Object objG6 = nVarX.e.g(w.s);
                if (objG6 == null) {
                    objG6 = null;
                }
                qVar2 = (androidx.compose.ui.autofill.q) objG6;
            } else {
                qVar2 = null;
            }
            if (!kotlin.jvm.internal.l.a(qVar, qVar2)) {
                if (qVar == null) {
                    rVar.h(uVar, i3, true);
                } else if (qVar2 == null) {
                    rVar.h(uVar, i3, false);
                } else {
                    rVar.e(uVar, i3, ((androidx.compose.ui.autofill.g) qVar2).a);
                }
            }
            boolean z = nVar != null && nVar.e.b(w.q);
            boolean z2 = nVarX != null && nVarX.e.b(w.q);
            if (z != z2) {
                androidx.collection.a0 a0Var = dVar.E;
                if (z2) {
                    a0Var.a(i3);
                } else {
                    a0Var.e(i3);
                }
            }
        }
    }
}
