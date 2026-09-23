package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.collection.a0;
import androidx.collection.o0;
import androidx.compose.ui.focus.e0;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.semantics.u;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends l implements androidx.compose.ui.semantics.o, androidx.compose.ui.focus.j {
    public final androidx.compose.ui.spatial.b A;
    public final String B;
    public final Rect C = new Rect();
    public final AutofillId D;
    public final a0 E;
    public boolean F;
    public final r e;
    public final u y;
    public final androidx.compose.ui.platform.u z;

    public d(r rVar, u uVar, androidx.compose.ui.platform.u uVar2, androidx.compose.ui.spatial.b bVar, String str) {
        this.e = rVar;
        this.y = uVar;
        this.z = uVar2;
        this.A = bVar;
        this.B = str;
        uVar2.setImportantForAutofill(1);
        r rVarR = coil3.svg.internal.a.r(uVar2);
        AutofillId autofillId = rVarR != null ? (AutofillId) rVarR.a : null;
        if (autofillId == null) {
            throw androidx.compose.runtime.j.a("Required value was null.");
        }
        this.D = autofillId;
        this.E = new a0();
    }

    public final void a(SparseArray sparseArray) {
        androidx.compose.ui.semantics.n nVarX;
        kotlin.jvm.functions.l lVar;
        kotlin.jvm.functions.l lVar2;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueB = androidx.collection.g.b(sparseArray.get(iKeyAt));
            f0 f0Var = (f0) this.y.c.b(iKeyAt);
            if (f0Var != null && (nVarX = f0Var.x()) != null) {
                o0 o0Var = nVarX.e;
                Object objG = o0Var.g(androidx.compose.ui.semantics.m.g);
                if (objG == null) {
                    objG = null;
                }
                androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) objG;
                if (aVar != null && (lVar2 = (kotlin.jvm.functions.l) aVar.b) != null) {
                }
                Object objG2 = o0Var.g(androidx.compose.ui.semantics.m.h);
                androidx.compose.ui.semantics.a aVar2 = (androidx.compose.ui.semantics.a) (objG2 != null ? objG2 : null);
                if (aVar2 != null && (lVar = (kotlin.jvm.functions.l) aVar2.b) != null) {
                }
            }
        }
    }

    @Override // androidx.compose.ui.focus.j
    public final void b(e0 e0Var, e0 e0Var2) {
        f0 f0VarV;
        androidx.compose.ui.semantics.n nVarX;
        f0 f0VarV2;
        androidx.compose.ui.semantics.n nVarX2;
        if (e0Var != null && (f0VarV2 = androidx.compose.ui.node.l.v(e0Var)) != null && (nVarX2 = f0VarV2.x()) != null) {
            o0 o0Var = nVarX2.e;
            if (o0Var.b(androidx.compose.ui.semantics.m.g) || o0Var.b(androidx.compose.ui.semantics.m.h)) {
                this.e.g(this.z, f0VarV2.y);
            }
        }
        if (e0Var2 == null || (f0VarV = androidx.compose.ui.node.l.v(e0Var2)) == null || (nVarX = f0VarV.x()) == null) {
            return;
        }
        o0 o0Var2 = nVarX.e;
        if (o0Var2.b(androidx.compose.ui.semantics.m.g) || o0Var2.b(androidx.compose.ui.semantics.m.h)) {
            int i = f0VarV.y;
            this.A.a.u(i, new b(this, i));
        }
    }
}
