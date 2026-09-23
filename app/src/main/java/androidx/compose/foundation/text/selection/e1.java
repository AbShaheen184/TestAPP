package androidx.compose.foundation.text.selection;

import android.os.Build;
import androidx.compose.foundation.v1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e1 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.ui.unit.c y;
    public final /* synthetic */ androidx.compose.runtime.a1 z;

    public /* synthetic */ e1(androidx.compose.ui.unit.c cVar, androidx.compose.runtime.a1 a1Var, int i) {
        this.e = i;
        this.y = cVar;
        this.z = a1Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                g1 g1Var = new g1(0, (kotlin.jvm.functions.a) obj);
                e1 e1Var = new e1(this.y, this.z, 1);
                if (androidx.compose.foundation.i1.a()) {
                    return androidx.compose.foundation.i1.a() ? new androidx.compose.foundation.f1(g1Var, e1Var, Build.VERSION.SDK_INT == 28 ? v1.b : v1.c) : androidx.compose.ui.o.b;
                }
                com.google.firebase.platforminfo.b.n("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                androidx.compose.ui.unit.h hVar = (androidx.compose.ui.unit.h) obj;
                float fB = androidx.compose.ui.unit.h.b(hVar.a);
                androidx.compose.ui.unit.c cVar = this.y;
                this.z.setValue(new androidx.compose.ui.unit.l((((long) cVar.i0(fB)) << 32) | (((long) cVar.i0(androidx.compose.ui.unit.h.a(hVar.a))) & 4294967295L)));
                return kotlin.y.a;
        }
    }
}
