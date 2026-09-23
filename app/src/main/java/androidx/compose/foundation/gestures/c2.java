package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c2 {
    public static final w1 a = new w1(0);
    public static final y1 b = new y1();
    public static final x1 c = new x1();
    public static final z1 d = new z1();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(r2 r2Var, long j, kotlin.coroutines.jvm.internal.c cVar) {
        a2 a2Var;
        kotlin.jvm.internal.w wVar;
        r2 r2Var2;
        if (cVar instanceof a2) {
            a2Var = (a2) cVar;
            int i = a2Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                a2Var.A = i - Integer.MIN_VALUE;
            } else {
                a2Var = new a2(cVar);
            }
        } else {
            a2Var = new a2(cVar);
        }
        Object obj = a2Var.z;
        int i2 = a2Var.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            wVar = new kotlin.jvm.internal.w();
            androidx.compose.foundation.d dVar = new androidx.compose.foundation.d(r2Var, j, wVar, null, 2);
            a2Var.e = r2Var;
            a2Var.y = wVar;
            a2Var.A = 1;
            Object objF = r2Var.f(androidx.compose.foundation.j1.e, dVar, a2Var);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objF == aVar) {
                return aVar;
            }
            r2Var2 = r2Var;
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.jvm.internal.w wVar2 = a2Var.y;
            r2 r2Var3 = a2Var.e;
            kotlin.a.e(obj);
            wVar = wVar2;
            r2Var2 = r2Var3;
        }
        return new androidx.compose.ui.geometry.b(r2Var2.h(wVar.e));
    }

    public static androidx.compose.ui.r b(androidx.compose.foundation.text.h1 h1Var, o1 o1Var, boolean z, boolean z2, androidx.compose.foundation.interaction.k kVar) {
        return new v1(h1Var, o1Var, z, z2, kVar);
    }
}
