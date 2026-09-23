package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final l2 a;
    public final Object b;
    public final n c;
    public final androidx.compose.runtime.j1 d;
    public final androidx.compose.runtime.j1 e;
    public final u0 f;
    public final k1 g;
    public final s h;
    public final s i;
    public final s j;
    public final s k;

    public d(Object obj, l2 l2Var, Object obj2) {
        this.a = l2Var;
        this.b = obj2;
        n nVar = new n(l2Var, obj, null, 60);
        this.c = nVar;
        this.d = androidx.compose.runtime.t.r(Boolean.FALSE);
        this.e = androidx.compose.runtime.t.r(obj);
        this.f = new u0();
        this.g = new k1(obj2);
        s sVar = nVar.z;
        boolean z = sVar instanceof o;
        s sVar2 = z ? e.e : sVar instanceof p ? e.f : sVar instanceof q ? e.g : e.h;
        this.h = sVar2;
        s sVar3 = z ? e.a : sVar instanceof p ? e.b : sVar instanceof q ? e.c : e.d;
        this.i = sVar3;
        this.j = sVar2;
        this.k = sVar3;
    }

    public static final Object a(d dVar, Object obj) {
        l2 l2Var = dVar.a;
        s sVar = dVar.k;
        s sVar2 = dVar.j;
        if (!kotlin.jvm.internal.l.a(sVar2, dVar.h) || !kotlin.jvm.internal.l.a(sVar, dVar.i)) {
            s sVar3 = (s) l2Var.a.invoke(obj);
            int iB = sVar3.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (sVar3.a(i) < sVar2.a(i) || sVar3.a(i) > sVar.a(i)) {
                    sVar3.e(i, kotlin.collections.i0.c(sVar3.a(i), sVar2.a(i), sVar.a(i)));
                    z = true;
                }
            }
            if (z) {
                return l2Var.b.invoke(sVar3);
            }
        }
        return obj;
    }

    public static final void b(d dVar) {
        n nVar = dVar.c;
        nVar.z.d();
        nVar.A = Long.MIN_VALUE;
        dVar.d.setValue(Boolean.FALSE);
    }

    public static Object c(d dVar, Object obj, m mVar, kotlin.coroutines.jvm.internal.i iVar, int i) {
        if ((i & 2) != 0) {
            mVar = dVar.g;
        }
        m mVar2 = mVar;
        Object objInvoke = dVar.a.b.invoke(dVar.c.z);
        Object objD = dVar.d();
        l2 l2Var = dVar.a;
        return u0.a(dVar.f, new b(dVar, objInvoke, new t1(mVar2, l2Var, objD, obj, (s) l2Var.a.invoke(objInvoke)), dVar.c.A, null), iVar);
    }

    public final Object d() {
        return this.c.y.getValue();
    }

    public final Object e(Object obj, kotlin.coroutines.d dVar) {
        Object objA = u0.a(this.f, new c(this, obj, null), dVar);
        return objA == kotlin.coroutines.intrinsics.a.e ? objA : kotlin.y.a;
    }

    public /* synthetic */ d(Object obj, l2 l2Var, Object obj2, int i) {
        this(obj, l2Var, (i & 4) != 0 ? null : obj2);
    }
}
