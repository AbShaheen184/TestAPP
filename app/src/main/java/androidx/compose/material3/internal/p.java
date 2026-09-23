package androidx.compose.material3.internal;

import androidx.compose.foundation.text.selection.g1;
import androidx.compose.material3.k5;
import androidx.compose.material3.k6;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.j1;
import java.util.Collection;
import java.util.Iterator;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final g1 a;
    public final kotlin.jvm.functions.a b;
    public final androidx.activity.w c;
    public final kotlin.jvm.functions.l d;
    public final j1 g;
    public final f1 k;
    public final j1 l;
    public final j1 m;
    public final m n;
    public final g0 e = new g0();
    public final androidx.compose.foundation.text.input.internal.o f = new androidx.compose.foundation.text.input.internal.o(this);
    public final androidx.compose.runtime.g0 h = androidx.compose.runtime.t.k(new j(this, 0));
    public final androidx.compose.runtime.g0 i = androidx.compose.runtime.t.k(new j(this, 1));
    public final f1 j = new f1(Float.NaN);

    public p(k5 k5Var, g1 g1Var, kotlin.jvm.functions.a aVar, androidx.activity.w wVar, kotlin.jvm.functions.l lVar) {
        this.a = g1Var;
        this.b = aVar;
        this.c = wVar;
        this.d = lVar;
        this.g = androidx.compose.runtime.t.r(k5Var);
        androidx.compose.runtime.t.j(androidx.compose.runtime.f.D, new j(this, 2));
        this.k = new f1(0.0f);
        this.l = androidx.compose.runtime.t.r(null);
        this.m = androidx.compose.runtime.t.r(new h0(kotlin.collections.x.e));
        this.n = new m(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(androidx.compose.foundation.j1 j1Var, n nVar, kotlin.coroutines.jvm.internal.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i = kVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.z = i - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object obj = kVar.e;
        int i2 = kVar.z;
        kotlin.jvm.functions.l lVar = this.d;
        f1 f1Var = this.j;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                g0 g0Var = this.e;
                androidx.compose.foundation.text.contextmenu.internal.h hVar = new androidx.compose.foundation.text.contextmenu.internal.h(this, nVar, null, 2);
                kVar.z = 1;
                g0Var.getClass();
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new f0(j1Var, g0Var, hVar, null), kVar);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objCoroutineScope == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
            Object objA = d().a(f1Var.g());
            if (objA != null && Math.abs(f1Var.g() - d().d(objA)) <= 0.5f && ((Boolean) lVar.invoke(objA)).booleanValue()) {
                g(objA);
            }
            return kotlin.y.a;
        } catch (Throwable th) {
            Object objA2 = d().a(f1Var.g());
            if (objA2 != null && Math.abs(f1Var.g() - d().d(objA2)) <= 0.5f && ((Boolean) lVar.invoke(objA2)).booleanValue()) {
                g(objA2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object b(Object obj, androidx.compose.foundation.j1 j1Var, kotlin.jvm.functions.r rVar, kotlin.coroutines.jvm.internal.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i = lVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar.z = i - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        l lVar2 = lVar;
        Object obj2 = lVar2.e;
        int i2 = lVar2.z;
        kotlin.jvm.functions.l lVar3 = this.d;
        kotlin.coroutines.d dVar = null;
        f1 f1Var = this.j;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj2);
                if (d().a.containsKey(obj)) {
                    g0 g0Var = this.e;
                    k6 k6Var = new k6(this, obj, rVar, dVar, 1);
                    lVar2.z = 1;
                    g0Var.getClass();
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new f0(j1Var, g0Var, k6Var, null), lVar2);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objCoroutineScope == aVar) {
                        return aVar;
                    }
                } else {
                    g(obj);
                }
                return kotlin.y.a;
            }
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj2);
            h(null);
            Object objA = d().a(f1Var.g());
            if (objA != null && Math.abs(f1Var.g() - d().d(objA)) <= 0.5f && ((Boolean) lVar3.invoke(objA)).booleanValue()) {
                g(objA);
            }
            return kotlin.y.a;
        } catch (Throwable th) {
            h(null);
            Object objA2 = d().a(f1Var.g());
            if (objA2 != null && Math.abs(f1Var.g() - d().d(objA2)) <= 0.5f && ((Boolean) lVar3.invoke(objA2)).booleanValue()) {
                g(objA2);
            }
            throw th;
        }
    }

    public final Object c(float f, float f2, Object obj) {
        h0 h0VarD = d();
        float fD = h0VarD.d(obj);
        float fFloatValue = ((Number) this.b.invoke()).floatValue();
        if (fD != f && !Float.isNaN(fD)) {
            g1 g1Var = this.a;
            if (fD < f) {
                if (f2 >= fFloatValue) {
                    Object objB = h0VarD.b(f, true);
                    objB.getClass();
                    return objB;
                }
                Object objB2 = h0VarD.b(f, true);
                objB2.getClass();
                if (f >= Math.abs(Math.abs(((Number) g1Var.invoke(Float.valueOf(Math.abs(h0VarD.d(objB2) - fD)))).floatValue()) + fD)) {
                    return objB2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    Object objB3 = h0VarD.b(f, false);
                    objB3.getClass();
                    return objB3;
                }
                Object objB4 = h0VarD.b(f, false);
                objB4.getClass();
                float fAbs = Math.abs(fD - Math.abs(((Number) g1Var.invoke(Float.valueOf(Math.abs(fD - h0VarD.d(objB4))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    public final h0 d() {
        return (h0) this.m.getValue();
    }

    public final float e(float f) {
        Float fValueOf;
        f1 f1Var = this.j;
        float fG = (Float.isNaN(f1Var.g()) ? 0.0f : f1Var.g()) + f;
        float fC = d().c();
        Collection collectionValues = d().a.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return kotlin.collections.i0.c(fG, fC, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    public final float f() {
        f1 f1Var = this.j;
        if (!Float.isNaN(f1Var.g())) {
            return f1Var.g();
        }
        kotlinx.coroutines.future.a.u("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public final void g(Object obj) {
        this.g.setValue(obj);
    }

    public final void h(Object obj) {
        this.l.setValue(obj);
    }
}
