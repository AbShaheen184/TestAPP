package androidx.compose.foundation.layout;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements e {
    public final /* synthetic */ int a;

    public /* synthetic */ t(int i) {
        this.a = i;
    }

    public static final a b(int i, String str) {
        WeakHashMap weakHashMap = v1.w;
        return new a(i, str);
    }

    public static final r1 d(int i, String str) {
        WeakHashMap weakHashMap = v1.w;
        return new r1(new p0(0, 0, 0, 0), str);
    }

    public static androidx.compose.ui.r e(androidx.compose.ui.r rVar, androidx.compose.ui.j jVar) {
        return rVar.d(new l(jVar));
    }

    public static v1 f(androidx.compose.runtime.s sVar) {
        View view = (View) sVar.j(androidx.compose.ui.platform.m0.f);
        v1 v1VarG = g(view);
        boolean zH = sVar.h(v1VarG) | sVar.h(view);
        Object objQ = sVar.Q();
        if (zH || objQ == androidx.compose.runtime.n.a) {
            objQ = new androidx.activity.compose.h(16, v1VarG, view);
            sVar.l0(objQ);
        }
        androidx.compose.runtime.l0.b(v1VarG, (kotlin.jvm.functions.l) objQ, sVar);
        return v1VarG;
    }

    public static v1 g(View view) {
        v1 v1Var;
        WeakHashMap weakHashMap = v1.w;
        synchronized (weakHashMap) {
            try {
                Object v1Var2 = weakHashMap.get(view);
                if (v1Var2 == null) {
                    v1Var2 = new v1(view);
                    weakHashMap.put(view, v1Var2);
                }
                v1Var = (v1) v1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return v1Var;
    }

    @Override // androidx.compose.foundation.layout.e
    public void c(androidx.compose.ui.unit.c cVar, int i, int[] iArr, androidx.compose.ui.unit.m mVar, int[] iArr2) {
        switch (this.a) {
            case 1:
                h.b(iArr, iArr2, false);
                break;
            case 2:
                h.c(i, iArr, iArr2, false);
                break;
            case 3:
                if (mVar != androidx.compose.ui.unit.m.e) {
                    h.b(iArr, iArr2, true);
                } else {
                    h.c(i, iArr, iArr2, false);
                }
                break;
            default:
                if (mVar != androidx.compose.ui.unit.m.e) {
                    h.c(i, iArr, iArr2, true);
                } else {
                    h.b(iArr, iArr2, false);
                }
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "AbsoluteArrangement#Left";
            case 2:
                return "AbsoluteArrangement#Right";
            case 3:
                return "Arrangement#End";
            case 4:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
