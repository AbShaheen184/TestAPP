package androidx.compose.material3.internal;

import androidx.compose.animation.core.k2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static final k2 a;
    public static final k2 b;
    public static final k2 c;

    static {
        androidx.compose.animation.core.v vVar = new androidx.compose.animation.core.v(0.4f, 0.0f, 0.6f, 1.0f);
        a = new k2(120, 0, androidx.compose.animation.core.a0.a);
        b = new k2(150, 0, vVar);
        c = new k2(120, 0, vVar);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
  0x0009: PHI (r1v1 androidx.compose.animation.core.k2) = 
  (r1v0 androidx.compose.animation.core.k2)
  (r1v0 androidx.compose.animation.core.k2)
  (r1v0 androidx.compose.animation.core.k2)
  (r1v2 androidx.compose.animation.core.k2)
  (r1v2 androidx.compose.animation.core.k2)
  (r1v2 androidx.compose.animation.core.k2)
  (r1v2 androidx.compose.animation.core.k2)
 binds: [B:18:0x0020, B:21:0x0025, B:27:0x0031, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object a(androidx.compose.animation.core.d dVar, float f, androidx.compose.foundation.interaction.i iVar, androidx.compose.foundation.interaction.i iVar2, kotlin.coroutines.jvm.internal.i iVar3) {
        k2 k2Var;
        k2 k2Var2 = null;
        if (iVar2 != null) {
            boolean z = iVar2 instanceof androidx.compose.foundation.interaction.m;
            k2Var = a;
            if (z || (iVar2 instanceof androidx.compose.foundation.interaction.b) || (iVar2 instanceof androidx.compose.foundation.interaction.g) || (iVar2 instanceof androidx.compose.foundation.interaction.d)) {
                k2Var2 = k2Var;
            }
        } else if (iVar != null) {
            boolean z2 = iVar instanceof androidx.compose.foundation.interaction.m;
            k2Var = b;
            if (z2 || (iVar instanceof androidx.compose.foundation.interaction.b)) {
                k2Var2 = k2Var;
            } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                k2Var2 = c;
            } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                k2Var2 = k2Var;
            }
        }
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (k2Var2 != null) {
            Object objC = androidx.compose.animation.core.d.c(dVar, new androidx.compose.ui.unit.f(f), k2Var2, iVar3, 12);
            if (objC == aVar) {
                return objC;
            }
        } else {
            Object objE = dVar.e(new androidx.compose.ui.unit.f(f), iVar3);
            if (objE == aVar) {
                return objE;
            }
        }
        return kotlin.y.a;
    }
}
