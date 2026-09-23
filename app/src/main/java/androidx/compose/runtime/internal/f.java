package androidx.compose.runtime.internal;

import androidx.compose.animation.core.v1;
import androidx.compose.foundation.gestures.g2;
import androidx.compose.runtime.s1;
import java.util.ArrayList;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;
import kotlin.jvm.functions.s;
import kotlin.jvm.functions.t;
import kotlin.jvm.functions.u;
import kotlin.jvm.functions.v;
import kotlin.jvm.functions.w;
import kotlin.jvm.internal.c0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements p, q, r, s, t, u, v, w, kotlin.jvm.functions.b, kotlin.jvm.functions.c, kotlin.jvm.functions.e, kotlin.jvm.functions.f, kotlin.jvm.functions.g, kotlin.jvm.functions.h, kotlin.jvm.functions.i, kotlin.jvm.functions.j, kotlin.jvm.functions.k, kotlin.jvm.functions.m, kotlin.jvm.functions.n {
    public s1 A;
    public ArrayList B;
    public final int e;
    public final boolean y;
    public Object z;

    public f(boolean z, int i, Object obj) {
        this.e = i;
        this.y = z;
        this.z = obj;
    }

    @Override // kotlin.jvm.functions.v
    public final /* bridge */ /* synthetic */ Object a(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, androidx.compose.runtime.s sVar, Integer num) {
        return g(obj, bool, obj2, obj3, obj4, sVar, num.intValue());
    }

    @Override // kotlin.jvm.functions.t
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return j(obj, obj2, obj3, obj4, (androidx.compose.runtime.s) obj5, ((Number) obj6).intValue());
    }

    @Override // kotlin.jvm.functions.w
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return l(obj, obj2, obj3, obj4, obj5, obj6, obj7, (androidx.compose.runtime.s) obj8, ((Number) obj9).intValue());
    }

    @Override // kotlin.jvm.functions.s
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return i(obj, obj2, obj3, (androidx.compose.runtime.s) obj4, ((Number) obj5).intValue());
    }

    public final Object e(int i, androidx.compose.runtime.s sVar) {
        sVar.c0(this.e);
        m(sVar);
        int iA = i | (sVar.f(this) ? k.a(2, 0) : k.a(1, 0));
        Object obj = this.z;
        obj.getClass();
        c0.c(2, obj);
        Object objInvoke = ((p) obj).invoke(sVar, Integer.valueOf(iA));
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new g2(2, this, f.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 1);
        }
        return objInvoke;
    }

    public final Object f(Object obj, androidx.compose.runtime.s sVar, int i) {
        sVar.c0(this.e);
        m(sVar);
        int iA = sVar.f(this) ? k.a(2, 1) : k.a(1, 1);
        Object obj2 = this.z;
        obj2.getClass();
        c0.c(3, obj2);
        Object objInvoke = ((q) obj2).invoke(obj, sVar, Integer.valueOf(iA | i));
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new v1(this, obj, i, 8);
        }
        return objInvoke;
    }

    public final Object g(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, androidx.compose.runtime.s sVar, int i) {
        sVar.c0(this.e);
        m(sVar);
        int iA = sVar.f(this) ? k.a(2, 6) : k.a(1, 6);
        Object obj5 = this.z;
        obj5.getClass();
        c0.c(8, obj5);
        Object objA = ((v) obj5).a(obj, bool, obj2, obj3, obj4, sVar, Integer.valueOf(i | iA));
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new d(this, obj, bool, obj2, obj3, obj4, i);
        }
        return objA;
    }

    public final Object h(Object obj, Object obj2, androidx.compose.runtime.s sVar, int i) {
        sVar.c0(this.e);
        m(sVar);
        int iA = sVar.f(this) ? k.a(2, 2) : k.a(1, 2);
        Object obj3 = this.z;
        obj3.getClass();
        c0.c(4, obj3);
        Object objInvoke = ((r) obj3).invoke(obj, obj2, sVar, Integer.valueOf(iA | i));
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.j(this, obj, obj2, i, 8);
        }
        return objInvoke;
    }

    public final Object i(Object obj, Object obj2, Object obj3, androidx.compose.runtime.s sVar, int i) {
        sVar.c0(this.e);
        m(sVar);
        int iA = sVar.f(this) ? k.a(2, 3) : k.a(1, 3);
        Object obj4 = this.z;
        obj4.getClass();
        c0.c(5, obj4);
        Object objD = ((s) obj4).d(obj, obj2, obj3, sVar, Integer.valueOf(iA | i));
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.material3.d(this, obj, obj2, obj3, i);
        }
        return objD;
    }

    @Override // kotlin.jvm.functions.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return e(((Number) obj2).intValue(), (androidx.compose.runtime.s) obj);
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, androidx.compose.runtime.s sVar, int i) {
        sVar.c0(this.e);
        m(sVar);
        int iA = sVar.f(this) ? k.a(2, 4) : k.a(1, 4);
        Object obj5 = this.z;
        obj5.getClass();
        c0.c(6, obj5);
        Object objB = ((t) obj5).b(obj, obj2, obj3, obj4, sVar, Integer.valueOf(iA | i));
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.animation.core.g2(this, obj, obj2, obj3, obj4, i);
        }
        return objB;
    }

    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, androidx.compose.runtime.s sVar, int i) {
        sVar.c0(this.e);
        m(sVar);
        int iA = sVar.f(this) ? k.a(2, 5) : k.a(1, 5);
        Object obj6 = this.z;
        obj6.getClass();
        c0.c(7, obj6);
        Object objK = ((f) ((u) obj6)).k(obj, obj2, obj3, obj4, obj5, sVar, Integer.valueOf(i | iA).intValue());
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new d(this, obj, obj2, obj3, obj4, obj5, i, 0);
        }
        return objK;
    }

    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, androidx.compose.runtime.s sVar, int i) {
        sVar.c0(this.e);
        m(sVar);
        int iA = sVar.f(this) ? k.a(2, 7) : k.a(1, 7);
        Object obj8 = this.z;
        obj8.getClass();
        c0.c(9, obj8);
        Object objC = ((w) obj8).c(obj, obj2, obj3, obj4, obj5, obj6, obj7, sVar, Integer.valueOf(i | iA));
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new e(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, i, 0);
        }
        return objC;
    }

    public final void m(androidx.compose.runtime.s sVar) {
        s1 s1VarB;
        if (!this.y || (s1VarB = sVar.B()) == null) {
            return;
        }
        sVar.getClass();
        s1VarB.b |= 1;
        if (k.d(this.A, s1VarB)) {
            this.A = s1VarB;
            return;
        }
        ArrayList arrayList = this.B;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.B = arrayList2;
            arrayList2.add(s1VarB);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (k.d((s1) arrayList.get(i), s1VarB)) {
                arrayList.set(i, s1VarB);
                return;
            }
        }
        arrayList.add(s1VarB);
    }

    @Override // kotlin.jvm.functions.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return f(obj, (androidx.compose.runtime.s) obj2, ((Number) obj3).intValue());
    }

    @Override // kotlin.jvm.functions.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return h(obj, obj2, (androidx.compose.runtime.s) obj3, ((Number) obj4).intValue());
    }
}
