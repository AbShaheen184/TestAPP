package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.collection.h0;
import androidx.collection.j0;
import androidx.compose.foundation.text.input.internal.o;
import androidx.compose.foundation.text.m;
import androidx.compose.foundation.text.selection.t0;
import androidx.compose.foundation.text.selection.u0;
import androidx.compose.foundation.text.selection.v0;
import androidx.compose.ui.node.l;
import androidx.compose.ui.r;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final r a(r rVar, androidx.compose.foundation.contextmenu.f fVar) {
        return rVar.d(new b(fVar));
    }

    public static final androidx.compose.foundation.text.contextmenu.data.c b(androidx.compose.ui.node.j jVar) {
        androidx.compose.foundation.text.contextmenu.data.f fVar;
        androidx.compose.foundation.text.contextmenu.builder.a aVar = new androidx.compose.foundation.text.contextmenu.builder.a();
        l.y(jVar, d.a, new androidx.activity.compose.g(new androidx.activity.compose.g(aVar, 19), new androidx.compose.foundation.c(1, aVar, androidx.compose.foundation.text.contextmenu.builder.a.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 3)));
        j0 j0Var = new j0();
        j0 j0Var2 = aVar.a;
        Object[] objArr = j0Var2.a;
        int i = j0Var2.b;
        int i2 = 0;
        boolean z = true;
        androidx.compose.foundation.text.contextmenu.data.b bVar = null;
        while (true) {
            fVar = androidx.compose.foundation.text.contextmenu.data.f.b;
            if (i2 >= i) {
                break;
            }
            androidx.compose.foundation.text.contextmenu.data.b bVar2 = (androidx.compose.foundation.text.contextmenu.data.b) objArr[i2];
            if (!z || bVar2 != fVar) {
                if (bVar2 == fVar && bVar == fVar) {
                    z = false;
                } else {
                    if (bVar2 != fVar) {
                        j0 j0Var3 = aVar.b;
                        Object[] objArr2 = j0Var3.a;
                        int i3 = j0Var3.b;
                        int i4 = 0;
                        while (true) {
                            if (i4 < i3) {
                                if (((Boolean) ((kotlin.jvm.functions.l) objArr2[i4]).invoke(bVar2)).booleanValue()) {
                                    i4++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    j0Var.a(bVar2);
                    z = false;
                    bVar = bVar2;
                }
            }
            i2++;
        }
        if (((androidx.compose.foundation.text.contextmenu.data.b) (j0Var.h() ? null : j0Var.a[j0Var.b - 1])) == fVar) {
            j0Var.k(j0Var.b - 1);
        }
        h0 h0Var = j0Var.c;
        if (h0Var == null) {
            h0Var = new h0(j0Var, 0);
            j0Var.c = h0Var;
        }
        return new androidx.compose.foundation.text.contextmenu.data.c(h0Var);
    }

    public static final r c(t0 t0Var) {
        return new e(t0Var);
    }

    public static final r d(r rVar, o oVar, u0 u0Var, v0 v0Var, m mVar) {
        return rVar.d(new i(oVar, u0Var, v0Var, mVar));
    }
}
