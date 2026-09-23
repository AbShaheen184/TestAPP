package androidx.compose.material3;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j5 {
    public final kotlin.jvm.functions.l a;
    public final androidx.compose.material3.internal.p c;
    public androidx.compose.animation.core.m b = g5.b;
    public androidx.compose.animation.core.b0 d = androidx.compose.animation.core.e.m();
    public androidx.compose.animation.core.b0 e = androidx.compose.animation.core.e.m();

    public j5(kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, k5 k5Var, kotlin.jvm.functions.l lVar) {
        this.a = lVar;
        this.c = new androidx.compose.material3.internal.p(k5Var, new androidx.compose.foundation.text.selection.g1(4, aVar), aVar2, new androidx.activity.w(this, 20), lVar);
    }

    public static Object a(j5 j5Var, k5 k5Var, androidx.compose.animation.core.b0 b0Var, kotlin.coroutines.jvm.internal.i iVar) {
        Object objB = j5Var.c.b(k5Var, androidx.compose.foundation.j1.e, new i5(j5Var, j5Var.c.k.g(), b0Var, null), iVar);
        return objB == kotlin.coroutines.intrinsics.a.e ? objB : kotlin.y.a;
    }

    public final Object b(kotlin.coroutines.jvm.internal.i iVar) {
        Object objA;
        kotlin.jvm.functions.l lVar = this.a;
        k5 k5Var = k5.y;
        return (((Boolean) lVar.invoke(k5Var)).booleanValue() && (objA = a(this, k5Var, this.d, iVar)) == kotlin.coroutines.intrinsics.a.e) ? objA : kotlin.y.a;
    }

    public final Object c(kotlin.coroutines.jvm.internal.i iVar) {
        Object objA;
        kotlin.jvm.functions.l lVar = this.a;
        k5 k5Var = k5.e;
        return (((Boolean) lVar.invoke(k5Var)).booleanValue() && (objA = a(this, k5Var, this.e, iVar)) == kotlin.coroutines.intrinsics.a.e) ? objA : kotlin.y.a;
    }

    public final boolean d() {
        return this.c.g.getValue() != k5.e;
    }

    public final Object e(kotlin.coroutines.jvm.internal.i iVar) {
        Object objA;
        kotlin.jvm.functions.l lVar = this.a;
        k5 k5Var = k5.z;
        return (((Boolean) lVar.invoke(k5Var)).booleanValue() && (objA = a(this, k5Var, this.e, iVar)) == kotlin.coroutines.intrinsics.a.e) ? objA : kotlin.y.a;
    }

    public final Object f(kotlin.coroutines.jvm.internal.i iVar) {
        Object objA;
        Map map = this.c.d().a;
        k5 k5Var = k5.z;
        if (!map.containsKey(k5Var)) {
            k5Var = k5.y;
        }
        return (((Boolean) this.a.invoke(k5Var)).booleanValue() && (objA = a(this, k5Var, this.d, iVar)) == kotlin.coroutines.intrinsics.a.e) ? objA : kotlin.y.a;
    }
}
