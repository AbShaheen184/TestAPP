package androidx.compose.foundation.text.selection;

import android.os.Build;
import android.os.Trace;
import androidx.appcompat.widget.c2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ a(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.e = i;
        this.z = obj;
        this.y = z;
        this.A = obj2;
        this.B = obj3;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.z;
                androidx.compose.ui.graphics.g gVar = (androidx.compose.ui.graphics.g) this.A;
                androidx.compose.ui.graphics.m mVar = (androidx.compose.ui.graphics.m) this.B;
                androidx.compose.ui.node.h0 h0Var = (androidx.compose.ui.node.h0) obj;
                h0Var.b();
                androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
                if (((Boolean) aVar.invoke()).booleanValue()) {
                    if (this.y) {
                        long jK0 = bVar.k0();
                        c2 c2Var = bVar.y;
                        long jG = c2Var.G();
                        c2Var.v().f();
                        try {
                            ((com.google.firebase.platforminfo.d) c2Var.y).n(-1.0f, 1.0f, jK0);
                            bVar.f(gVar, mVar);
                        } finally {
                            androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var, jG);
                        }
                    } else {
                        bVar.f(gVar, mVar);
                    }
                }
                return kotlin.y.a;
            default:
                androidx.work.x xVar = (androidx.work.x) this.z;
                String str = (String) this.A;
                androidx.work.impl.h0 h0Var2 = (androidx.work.impl.h0) this.B;
                Throwable th = (Throwable) obj;
                if (th instanceof androidx.work.impl.w) {
                    xVar.stop(((androidx.work.impl.w) th).e);
                }
                if (this.y && str != null) {
                    androidx.work.a0 a0Var = h0Var2.f.m;
                    int iHashCode = h0Var2.a.hashCode();
                    a0Var.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        androidx.tracing.a.b(iHashCode, kotlin.math.a.S(str));
                    } else {
                        String strS = kotlin.math.a.S(str);
                        try {
                            if (kotlin.math.a.H == null) {
                                kotlin.math.a.H = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                            }
                            kotlin.math.a.H.invoke(null, Long.valueOf(kotlin.math.a.E), strS, Integer.valueOf(iHashCode));
                        } catch (Exception e) {
                            kotlin.math.a.u(e, "asyncTraceEnd");
                        }
                    }
                    break;
                }
                return kotlin.y.a;
        }
    }
}
