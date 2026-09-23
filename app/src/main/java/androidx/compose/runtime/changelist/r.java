package androidx.compose.runtime.changelist;

import androidx.compose.runtime.c2;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.s1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends j0 {
    public static final r d;
    public static final r e;
    public static final r f;
    public static final r g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new r(i, 2, 0);
        int i2 = 1;
        e = new r(i2, i2, 1);
        f = new r(i, 2, 2);
        int i3 = 1;
        g = new r(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, k2 k2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        switch (this.c) {
            case 0:
                Object objInvoke = ((kotlin.jvm.functions.a) wVar.e(0)).invoke();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) wVar.e(1);
                int iD = wVar.d(0);
                aVar.getClass();
                k2Var.U(k2Var.c(aVar), objInvoke);
                cVar.m(iD, objInvoke);
                cVar.d(objInvoke);
                break;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) wVar.e(0);
                int iD2 = wVar.d(0);
                cVar.k();
                aVar2.getClass();
                cVar.c(iD2, k2Var.D(k2Var.c(aVar2)));
                break;
            case 2:
                Object objE = wVar.e(0);
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) wVar.e(1);
                int iD3 = wVar.d(0);
                if (objE instanceof c2) {
                    c2 c2Var = (c2) objE;
                    lVar.e.b(c2Var);
                    lVar.d.a(c2Var);
                }
                Object objK = k2Var.K(k2Var.c(aVar3), iD3, objE);
                if (objK instanceof c2) {
                    lVar.e((c2) objK);
                } else if (objK instanceof s1) {
                    ((s1) objK).c();
                }
                break;
            default:
                Object objE2 = wVar.e(0);
                int iD4 = wVar.d(0);
                if (objE2 instanceof c2) {
                    c2 c2Var2 = (c2) objE2;
                    lVar.e.b(c2Var2);
                    lVar.d.a(c2Var2);
                }
                Object objK2 = k2Var.K(k2Var.t, iD4, objE2);
                if (objK2 instanceof c2) {
                    lVar.e((c2) objK2);
                } else if (objK2 instanceof s1) {
                    ((s1) objK2).c();
                }
                break;
        }
    }

    @Override // androidx.compose.runtime.changelist.j0
    public androidx.compose.runtime.a b(androidx.compose.foundation.text.selection.w wVar) {
        switch (this.c) {
            case 0:
                return (androidx.compose.runtime.a) wVar.e(1);
            case 1:
                return (androidx.compose.runtime.a) wVar.e(0);
            default:
                return super.b(wVar);
        }
    }
}
