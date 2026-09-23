package androidx.compose.runtime.internal;

import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.z;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final StackTraceElement[] a = new StackTraceElement[0];
    public static final m b = new m(0, new long[0], new Object[0]);

    public static final int a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final f c(int i, kotlin.d dVar, s sVar) {
        Object objQ = sVar.Q();
        if (objQ == androidx.compose.runtime.n.a) {
            objQ = new f(true, i, dVar);
            sVar.l0(objQ);
        }
        f fVar = (f) objQ;
        if (!kotlin.jvm.internal.l.a(fVar.z, dVar)) {
            boolean z = fVar.z == null;
            fVar.z = dVar;
            if (!z && fVar.y) {
                s1 s1Var = fVar.A;
                if (s1Var != null) {
                    z zVar = s1Var.a;
                    if (zVar != null) {
                        zVar.s(s1Var, null);
                    }
                    fVar.A = null;
                }
                ArrayList arrayList = fVar.B;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        s1 s1Var2 = (s1) arrayList.get(i2);
                        z zVar2 = s1Var2.a;
                        if (zVar2 != null) {
                            zVar2.s(s1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return fVar;
    }

    public static final boolean d(s1 s1Var, s1 s1Var2) {
        return s1Var == null || !s1Var.a() || s1Var.equals(s1Var2) || kotlin.jvm.internal.l.a(s1Var.c, s1Var2.c);
    }
}
