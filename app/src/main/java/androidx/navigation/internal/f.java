package androidx.navigation.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.collection.z0;
import androidx.compose.animation.core.i0;
import androidx.compose.material3.j2;
import androidx.lifecycle.o;
import androidx.lifecycle.x0;
import androidx.media3.exoplayer.source.t0;
import androidx.navigation.b0;
import androidx.navigation.compose.r;
import androidx.navigation.j;
import androidx.navigation.k;
import androidx.navigation.k0;
import androidx.navigation.l0;
import androidx.navigation.m;
import androidx.navigation.s;
import androidx.navigation.t;
import androidx.navigation.v;
import androidx.navigation.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.l;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.collections.w;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.x;
import kotlin.sequences.n;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final MutableSharedFlow A;
    public final y a;
    public final k b;
    public v c;
    public Bundle d;
    public Bundle[] e;
    public final l f = new l();
    public final MutableStateFlow g;
    public final StateFlow h;
    public final MutableStateFlow i;
    public final StateFlow j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public final LinkedHashMap n;
    public androidx.lifecycle.v o;
    public m p;
    public final ArrayList q;
    public o r;
    public final d s;
    public final l0 t;
    public final LinkedHashMap u;
    public kotlin.jvm.functions.l v;
    public j2 w;
    public final LinkedHashMap x;
    public int y;
    public final ArrayList z;

    public f(y yVar, k kVar) {
        this.a = yVar;
        this.b = kVar;
        w wVar = w.e;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(wVar);
        this.g = MutableStateFlow;
        this.h = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(wVar);
        this.i = MutableStateFlow2;
        this.j = FlowKt.asStateFlow(MutableStateFlow2);
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.q = new ArrayList();
        this.r = o.y;
        this.s = new d(this, 0);
        this.t = new l0();
        this.u = new LinkedHashMap();
        this.x = new LinkedHashMap();
        this.z = new ArrayList();
        this.A = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
    }

    public static t e(int i, t tVar, t tVar2, boolean z) {
        if (tVar.y.a == i && (tVar2 == null || (tVar.equals(tVar2) && kotlin.jvm.internal.l.a(tVar.z, tVar2.z)))) {
            return tVar;
        }
        v vVar = tVar instanceof v ? (v) tVar : null;
        if (vVar == null) {
            vVar = tVar.z;
            vVar.getClass();
        }
        return vVar.C.B(i, vVar, tVar2, z);
    }

    public static /* synthetic */ void q(f fVar, androidx.navigation.i iVar) {
        fVar.p(iVar, false, new l());
    }

    public final void a(t tVar, Bundle bundle, androidx.navigation.i iVar, List list) {
        Object objPrevious;
        Object objPrevious2;
        androidx.media3.exoplayer.mediacodec.g gVar = this.a.c;
        t tVar2 = iVar.y;
        boolean z = tVar2 instanceof androidx.navigation.compose.m;
        l lVar = this.f;
        if (!z) {
            while (!lVar.isEmpty() && (((androidx.navigation.i) lVar.last()).y instanceof androidx.navigation.compose.m) && n(((androidx.navigation.i) lVar.last()).y.y.a, true, false)) {
            }
        }
        l<androidx.navigation.i> lVar2 = new l();
        Object obj = null;
        if (tVar instanceof v) {
            t tVar3 = tVar2;
            do {
                tVar3.getClass();
                tVar3 = tVar3.z;
                if (tVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!kotlin.jvm.internal.l.a(((androidx.navigation.i) objPrevious2).y, tVar3));
                    androidx.navigation.i iVarJ = (androidx.navigation.i) objPrevious2;
                    if (iVarJ == null) {
                        iVarJ = com.google.android.material.shape.f.j(gVar, tVar3, bundle, i(), this.p);
                    }
                    lVar2.addFirst(iVarJ);
                    if (!lVar.isEmpty() && ((androidx.navigation.i) lVar.last()).y == tVar3) {
                        q(this, (androidx.navigation.i) lVar.last());
                    }
                }
                if (tVar3 == null) {
                    break;
                }
            } while (tVar3 != tVar);
        }
        t tVar4 = lVar2.isEmpty() ? tVar2 : ((androidx.navigation.i) lVar2.first()).y;
        while (tVar4 != null && d(tVar4.y.a, tVar4) != tVar4) {
            tVar4 = tVar4.z;
            if (tVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!kotlin.jvm.internal.l.a(((androidx.navigation.i) objPrevious).y, tVar4));
                androidx.navigation.i iVarJ2 = (androidx.navigation.i) objPrevious;
                if (iVarJ2 == null) {
                    iVarJ2 = com.google.android.material.shape.f.j(gVar, tVar4, tVar4.b(bundle2), i(), this.p);
                }
                lVar2.addFirst(iVarJ2);
            }
        }
        if (!lVar2.isEmpty()) {
            tVar2 = ((androidx.navigation.i) lVar2.first()).y;
        }
        while (!lVar.isEmpty() && (((androidx.navigation.i) lVar.last()).y instanceof v)) {
            t tVar5 = ((androidx.navigation.i) lVar.last()).y;
            tVar5.getClass();
            if (((z0) ((v) tVar5).C.A).c(tVar2.y.a) != null) {
                break;
            } else {
                q(this, (androidx.navigation.i) lVar.last());
            }
        }
        androidx.navigation.i iVar2 = (androidx.navigation.i) lVar.f();
        if (iVar2 == null) {
            iVar2 = (androidx.navigation.i) lVar2.f();
        }
        if (!kotlin.jvm.internal.l.a(iVar2 != null ? iVar2.y : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                t tVar6 = ((androidx.navigation.i) objPrevious3).y;
                v vVar = this.c;
                vVar.getClass();
                if (kotlin.jvm.internal.l.a(tVar6, vVar)) {
                    obj = objPrevious3;
                    break;
                }
            }
            androidx.navigation.i iVarJ3 = (androidx.navigation.i) obj;
            if (iVarJ3 == null) {
                v vVar2 = this.c;
                vVar2.getClass();
                v vVar3 = this.c;
                vVar3.getClass();
                iVarJ3 = com.google.android.material.shape.f.j(gVar, vVar2, vVar3.b(bundle), i(), this.p);
            }
            lVar2.addFirst(iVarJ3);
        }
        for (androidx.navigation.i iVar3 : lVar2) {
            Object obj2 = this.u.get(this.t.b(iVar3.y.e));
            if (obj2 == null) {
                kotlinx.coroutines.future.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder("NavigatorBackStack for "), tVar.e, " should already be created"));
                return;
            }
            ((androidx.navigation.l) obj2).a(iVar3);
        }
        lVar.addAll(lVar2);
        lVar.addLast(iVar);
        for (androidx.navigation.i iVar4 : p.N(lVar2, iVar)) {
            v vVar4 = iVar4.y.z;
            if (vVar4 != null) {
                k(iVar4, f(vVar4.y.a));
            }
        }
    }

    public final boolean b() {
        l lVar;
        while (true) {
            lVar = this.f;
            if (lVar.isEmpty() || !(((androidx.navigation.i) lVar.last()).y instanceof v)) {
                break;
            }
            q(this, (androidx.navigation.i) lVar.last());
        }
        androidx.navigation.i iVar = (androidx.navigation.i) lVar.i();
        ArrayList arrayList = this.z;
        if (iVar != null) {
            arrayList.add(iVar);
        }
        this.y++;
        u();
        int i = this.y - 1;
        this.y = i;
        if (i == 0) {
            ArrayList<androidx.navigation.i> arrayListC0 = p.c0(arrayList);
            arrayList.clear();
            for (androidx.navigation.i iVar2 : arrayListC0) {
                Iterator it = p.b0(this.q).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        androidx.transition.k.h();
                        return false;
                    }
                    t tVar = iVar2.y;
                    iVar2.E.a();
                    throw null;
                }
                this.A.tryEmit(iVar2);
            }
            this.g.tryEmit(new ArrayList(lVar));
            this.i.tryEmit(r());
        }
        return iVar != null;
    }

    public final boolean c(ArrayList arrayList, t tVar, boolean z, boolean z2) {
        f fVar;
        boolean z3;
        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        l lVar = new l();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                fVar = this;
                z3 = z2;
                break;
            }
            k0 k0Var = (k0) it.next();
            kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
            androidx.navigation.i iVar = (androidx.navigation.i) this.f.last();
            fVar = this;
            z3 = z2;
            j2 j2Var = new j2(vVar2, vVar, fVar, z3, lVar);
            k0Var.getClass();
            iVar.getClass();
            fVar.w = j2Var;
            k0Var.e(iVar, z3);
            fVar.w = null;
            if (!vVar2.e) {
                break;
            }
            z2 = z3;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = fVar.m;
            if (!z) {
                final int i = 0;
                kotlin.sequences.f fVar2 = new kotlin.sequences.f(new n(kotlin.sequences.k.L(tVar, new r(2)), new kotlin.jvm.functions.l(this) { // from class: androidx.navigation.internal.e
                    public final /* synthetic */ f y;

                    {
                        this.y = this;
                    }

                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        t tVar2 = (t) obj;
                        switch (i) {
                            case 0:
                                tVar2.getClass();
                                zContainsKey = this.y.m.containsKey(Integer.valueOf(tVar2.y.a));
                                break;
                            default:
                                tVar2.getClass();
                                zContainsKey = this.y.m.containsKey(Integer.valueOf(tVar2.y.a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 0));
                while (fVar2.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((t) fVar2.next()).y.a);
                    j jVar = (j) lVar.f();
                    linkedHashMap.put(numValueOf, jVar != null ? (String) jVar.a.y : null);
                }
            }
            if (!lVar.isEmpty()) {
                com.google.android.gms.cloudmessaging.n nVar = ((j) lVar.first()).a;
                final int i2 = 1;
                kotlin.sequences.f fVar3 = new kotlin.sequences.f(new n(kotlin.sequences.k.L(d(nVar.e, null), new r(3)), new kotlin.jvm.functions.l(this) { // from class: androidx.navigation.internal.e
                    public final /* synthetic */ f y;

                    {
                        this.y = this;
                    }

                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        t tVar2 = (t) obj;
                        switch (i2) {
                            case 0:
                                tVar2.getClass();
                                zContainsKey = this.y.m.containsKey(Integer.valueOf(tVar2.y.a));
                                break;
                            default:
                                tVar2.getClass();
                                zContainsKey = this.y.m.containsKey(Integer.valueOf(tVar2.y.a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 0));
                while (fVar3.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((t) fVar3.next()).y.a), (String) nVar.y);
                }
                if (linkedHashMap.values().contains((String) nVar.y)) {
                    fVar.n.put((String) nVar.y, lVar);
                }
            }
        }
        fVar.b.invoke();
        return vVar.e;
    }

    public final t d(int i, t tVar) {
        t tVar2;
        v vVar = this.c;
        if (vVar == null) {
            return null;
        }
        if (vVar.y.a == i) {
            if (tVar == null) {
                return vVar;
            }
            if (kotlin.jvm.internal.l.a(vVar, tVar) && tVar.z == null) {
                return this.c;
            }
        }
        androidx.navigation.i iVar = (androidx.navigation.i) this.f.i();
        if (iVar == null || (tVar2 = iVar.y) == null) {
            tVar2 = this.c;
            tVar2.getClass();
        }
        return e(i, tVar2, tVar, false);
    }

    public final androidx.navigation.i f(int i) {
        Object objPrevious;
        l lVar = this.f;
        ListIterator<E> listIterator = lVar.listIterator(lVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((androidx.navigation.i) objPrevious).y.y.a != i);
        androidx.navigation.i iVar = (androidx.navigation.i) objPrevious;
        if (iVar != null) {
            return iVar;
        }
        StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        sbV.append(g());
        throw new IllegalArgumentException(sbV.toString().toString());
    }

    public final t g() {
        androidx.navigation.i iVar = (androidx.navigation.i) this.f.i();
        if (iVar != null) {
            return iVar.y;
        }
        return null;
    }

    public final v h() {
        v vVar = this.c;
        if (vVar != null) {
            vVar.getClass();
            return vVar;
        }
        kotlinx.coroutines.future.a.u("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final o i() {
        return this.o == null ? o.z : this.r;
    }

    public final v j() {
        t tVar;
        androidx.navigation.i iVar = (androidx.navigation.i) this.f.i();
        if (iVar == null || (tVar = iVar.y) == null) {
            tVar = this.c;
            tVar.getClass();
        }
        v vVar = tVar instanceof v ? (v) tVar : null;
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = tVar.z;
        vVar2.getClass();
        return vVar2;
    }

    public final void k(androidx.navigation.i iVar, androidx.navigation.i iVar2) {
        this.k.put(iVar, iVar2);
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap.get(iVar2) == null) {
            linkedHashMap.put(iVar2, new a());
        }
        Object obj = linkedHashMap.get(iVar2);
        obj.getClass();
        ((a) obj).a.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[LOOP:7: B:75:0x01e0->B:124:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:52:0x011c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0129 A[LOOP:4: B:53:0x0121->B:55:0x0129, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0182  */
    /* JADX WARN: Code duplicated, block: B:61:0x018e  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01be  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e6 A[Catch: all -> 0x01fb, TryCatch #0 {all -> 0x01fb, blocks: (B:74:0x01cc, B:75:0x01e0, B:77:0x01e6, B:79:0x01f6, B:83:0x01fe), top: B:105:0x01cc }] */
    /* JADX WARN: Code duplicated, block: B:89:0x020d  */
    public final void l(t tVar, Bundle bundle, b0 b0Var) {
        boolean z;
        boolean z2;
        int iNextIndex;
        t tVar2;
        l<androidx.navigation.i> lVar;
        k0 k0VarB;
        t tVar3;
        androidx.navigation.l lVarB;
        ListIterator listIterator;
        int iNextIndex2;
        v vVar;
        boolean zN;
        tVar.getClass();
        Iterator it = this.u.values().iterator();
        while (it.hasNext()) {
            ((androidx.navigation.l) it.next()).d = true;
        }
        kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
        if (b0Var == null) {
            z = false;
        } else {
            String str = b0Var.h;
            if (str != null) {
                zN = o(str, b0Var.d, b0Var.e);
            } else {
                int i = b0Var.c;
                if (i != -1) {
                    zN = n(i, b0Var.d, b0Var.e);
                } else {
                    z = false;
                }
            }
            z = zN;
        }
        Bundle bundleB = tVar.b(bundle);
        if (b0Var != null && b0Var.b && this.m.containsKey(Integer.valueOf(tVar.y.a))) {
            vVar2.e = s(tVar.y.a, bundleB, b0Var);
            z2 = false;
        } else {
            if (b0Var == null || !b0Var.a) {
                z2 = false;
            } else {
                androidx.navigation.i iVar = (androidx.navigation.i) this.f.i();
                l lVar2 = this.f;
                ListIterator listIterator2 = lVar2.listIterator(lVar2.b());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        if (((androidx.navigation.i) listIterator2.previous()).y == tVar) {
                            iNextIndex = listIterator2.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    z2 = false;
                } else if (tVar instanceof v) {
                    int i2 = v.D;
                    List listO = kotlin.sequences.k.O(new n(kotlin.sequences.k.L((v) tVar, new androidx.compose.ui.text.y(25)), new r(4), 1));
                    if (this.f.z - iNextIndex == listO.size()) {
                        l lVar3 = this.f;
                        List listSubList = lVar3.subList(iNextIndex, lVar3.z);
                        ArrayList arrayList = new ArrayList(kotlin.collections.r.p(listSubList, 10));
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((androidx.navigation.i) it2.next()).y.y.a));
                        }
                        if (arrayList.equals(listO)) {
                            lVar = new l();
                            while (q.h(this.f) >= iNextIndex) {
                                androidx.navigation.i iVar2 = (androidx.navigation.i) p.S(this.f);
                                t(iVar2);
                                androidx.navigation.i iVar3 = new androidx.navigation.i(iVar2.e, iVar2.y, iVar2.y.b(bundle), iVar2.A, iVar2.B, iVar2.C, iVar2.D);
                                c cVar = iVar3.E;
                                o oVar = iVar2.A;
                                cVar.getClass();
                                oVar.getClass();
                                cVar.d = oVar;
                                c cVar2 = iVar3.E;
                                o oVar2 = iVar2.E.k;
                                cVar2.getClass();
                                oVar2.getClass();
                                cVar2.k = oVar2;
                                cVar2.b();
                                lVar.addFirst(iVar3);
                            }
                            for (androidx.navigation.i iVar4 : lVar) {
                                vVar = iVar4.y.z;
                                if (vVar != null) {
                                    k(iVar4, f(vVar.y.a));
                                }
                                this.f.addLast(iVar4);
                            }
                            for (androidx.navigation.i iVar5 : lVar) {
                                k0VarB = this.t.b(iVar5.y.e);
                                tVar3 = iVar5.y;
                                if (tVar3 == null) {
                                    tVar3 = null;
                                }
                                if (tVar3 == null) {
                                    k0VarB.c(tVar3);
                                    lVarB = k0VarB.b();
                                    synchronized (lVarB.a) {
                                        try {
                                            ArrayList arrayListC0 = p.c0((Collection) lVarB.e.getValue());
                                            listIterator = arrayListC0.listIterator(arrayListC0.size());
                                            while (true) {
                                                if (listIterator.hasPrevious()) {
                                                    if (kotlin.jvm.internal.l.a(((androidx.navigation.i) listIterator.previous()).C, iVar5.C)) {
                                                        iNextIndex2 = listIterator.nextIndex();
                                                        break;
                                                    }
                                                } else {
                                                    iNextIndex2 = -1;
                                                    break;
                                                }
                                            }
                                            arrayListC0.set(iNextIndex2, iVar5);
                                            lVarB.b.setValue(arrayListC0);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                            z2 = true;
                        }
                    }
                    z2 = false;
                } else if (iVar == null || (tVar2 = iVar.y) == null || tVar.y.a != tVar2.y.a) {
                    z2 = false;
                } else {
                    lVar = new l();
                    while (q.h(this.f) >= iNextIndex) {
                        androidx.navigation.i iVar6 = (androidx.navigation.i) p.S(this.f);
                        t(iVar6);
                        androidx.navigation.i iVar7 = new androidx.navigation.i(iVar6.e, iVar6.y, iVar6.y.b(bundle), iVar6.A, iVar6.B, iVar6.C, iVar6.D);
                        c cVar3 = iVar7.E;
                        o oVar3 = iVar6.A;
                        cVar3.getClass();
                        oVar3.getClass();
                        cVar3.d = oVar3;
                        c cVar4 = iVar7.E;
                        o oVar4 = iVar6.E.k;
                        cVar4.getClass();
                        oVar4.getClass();
                        cVar4.k = oVar4;
                        cVar4.b();
                        lVar.addFirst(iVar7);
                    }
                    while (r0.hasNext()) {
                        vVar = iVar4.y.z;
                        if (vVar != null) {
                            k(iVar4, f(vVar.y.a));
                        }
                        this.f.addLast(iVar4);
                    }
                    while (r0.hasNext()) {
                        k0VarB = this.t.b(iVar5.y.e);
                        tVar3 = iVar5.y;
                        if (tVar3 == null) {
                            tVar3 = null;
                        }
                        if (tVar3 == null) {
                            k0VarB.c(tVar3);
                            lVarB = k0VarB.b();
                            synchronized (lVarB.a) {
                                ArrayList arrayListC1 = p.c0((Collection) lVarB.e.getValue());
                                listIterator = arrayListC1.listIterator(arrayListC1.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        if (kotlin.jvm.internal.l.a(((androidx.navigation.i) listIterator.previous()).C, iVar5.C)) {
                                            iNextIndex2 = listIterator.nextIndex();
                                            break;
                                        }
                                    } else {
                                        iNextIndex2 = -1;
                                        break;
                                    }
                                }
                                arrayListC1.set(iNextIndex2, iVar5);
                                lVarB.b.setValue(arrayListC1);
                            }
                        }
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                androidx.navigation.i iVarJ = com.google.android.material.shape.f.j(this.a.c, tVar, bundleB, i(), this.p);
                k0 k0VarB2 = this.t.b(tVar.e);
                List listJ = q.j(iVarJ);
                this.v = new i0(vVar2, this, tVar, bundleB, 5);
                k0VarB2.d(listJ, b0Var);
                this.v = null;
            }
        }
        this.b.invoke();
        Iterator it3 = this.u.values().iterator();
        while (it3.hasNext()) {
            ((androidx.navigation.l) it3.next()).d = false;
        }
        if (z || vVar2.e || z2) {
            b();
        } else {
            u();
        }
    }

    public final void m(String str, b0 b0Var) {
        str.getClass();
        if (this.c == null) {
            kotlinx.coroutines.future.a.i("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", this, 46);
            return;
        }
        v vVarJ = j();
        s sVarF = vVarJ.f(str, true, vVarJ);
        if (sVarF == null) {
            com.google.firebase.platforminfo.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.x("Navigation destination that matches route ", str, " cannot be found in the navigation graph "), this.c);
            return;
        }
        t tVar = sVarF.e;
        Bundle bundleB = tVar.b(sVarF.y);
        if (bundleB == null) {
            bundleB = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
        }
        int i = t.B;
        String str2 = (String) tVar.y.e;
        Uri uri = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        uri.getClass();
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleB.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        l(tVar, bundleB, b0Var);
    }

    public final boolean n(int i, boolean z, boolean z2) {
        t tVar;
        androidx.appcompat.widget.o oVar;
        l lVar = this.f;
        if (lVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = p.U(lVar).iterator();
        do {
            if (!it.hasNext()) {
                tVar = null;
                break;
            }
            tVar = ((androidx.navigation.i) it.next()).y;
            String str = tVar.e;
            oVar = tVar.y;
            k0 k0VarB = this.t.b(str);
            if (z || oVar.a != i) {
                arrayList.add(k0VarB);
            }
        } while (oVar.a != i);
        if (tVar != null) {
            return c(arrayList, tVar, z, z2);
        }
        int i2 = t.B;
        Log.i("NavController", "Ignoring popBackStack to destination " + androidx.navigation.f.a(this.a.c, i) + " as it was not found on the current back stack");
        return false;
    }

    public final boolean o(String str, boolean z, boolean z2) {
        Object objPrevious;
        boolean z3;
        str.getClass();
        l lVar = this.f;
        if (lVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = lVar.listIterator(lVar.b());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            androidx.navigation.i iVar = (androidx.navigation.i) objPrevious;
            t tVar = iVar.y;
            Bundle bundleA = iVar.E.a();
            tVar.getClass();
            androidx.appcompat.widget.o oVar = tVar.y;
            oVar.getClass();
            if (kotlin.jvm.internal.l.a((String) oVar.e, str)) {
                z3 = true;
            } else {
                s sVarG = oVar.g(str);
                if (((t) oVar.b).equals(sVarG != null ? sVarG.e : null)) {
                    Bundle bundle = sVarG.y;
                    if (bundleA != null && bundle != null) {
                        Set<String> setKeySet = bundle.keySet();
                        setKeySet.getClass();
                        Iterator<T> it = setKeySet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                String str2 = (String) it.next();
                                str2.getClass();
                                if (bundleA.containsKey(str2)) {
                                    androidx.navigation.g gVar = (androidx.navigation.g) sVarG.e.c().get(str2);
                                    androidx.navigation.i0 i0Var = gVar != null ? gVar.a : null;
                                    Object objA = i0Var != null ? i0Var.a(str2, bundle) : null;
                                    Object objA2 = i0Var != null ? i0Var.a(str2, bundleA) : null;
                                    if (i0Var == null || i0Var.f(objA, objA2)) {
                                    }
                                }
                            } else {
                                z3 = true;
                            }
                        }
                    }
                }
                z3 = false;
            }
            if (z || !z3) {
                arrayList.add(this.t.b(iVar.y.e));
            }
        } while (!z3);
        androidx.navigation.i iVar2 = (androidx.navigation.i) objPrevious;
        t tVar2 = iVar2 != null ? iVar2.y : null;
        if (tVar2 != null) {
            return c(arrayList, tVar2, z, z2);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
        return false;
    }

    public final void p(androidx.navigation.i iVar, boolean z, l lVar) {
        m mVar;
        StateFlow stateFlow;
        Set set;
        iVar.getClass();
        l lVar2 = this.f;
        androidx.navigation.i iVar2 = (androidx.navigation.i) lVar2.last();
        if (!kotlin.jvm.internal.l.a(iVar2, iVar)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(iVar.y);
            t tVar = iVar2.y;
            sb.append(", which is not the top of the back stack (");
            sb.append(tVar);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        p.S(lVar2);
        androidx.navigation.l lVar3 = (androidx.navigation.l) this.u.get(this.t.b(iVar2.y.e));
        boolean z2 = true;
        if ((lVar3 == null || (stateFlow = lVar3.f) == null || (set = (Set) stateFlow.getValue()) == null || !set.contains(iVar2)) && !this.l.containsKey(iVar2)) {
            z2 = false;
        }
        o oVar = iVar2.E.j.d;
        o oVar2 = o.z;
        if (oVar.compareTo(oVar2) >= 0) {
            if (z) {
                iVar2.a(oVar2);
                lVar.addFirst(new j(iVar2));
            }
            if (z2) {
                iVar2.a(oVar2);
            } else {
                iVar2.a(o.e);
                t(iVar2);
            }
        }
        if (z || z2 || (mVar = this.p) == null) {
            return;
        }
        String str = iVar2.C;
        str.getClass();
        x0 x0Var = (x0) mVar.b.remove(str);
        if (x0Var != null) {
            x0Var.a();
        }
    }

    public final ArrayList r() {
        o oVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.u.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            oVar = o.A;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((androidx.navigation.l) it.next()).f.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                androidx.navigation.i iVar = (androidx.navigation.i) obj;
                if (!arrayList.contains(iVar) && iVar.E.k.compareTo(oVar) < 0) {
                    arrayList2.add(obj);
                }
            }
            p.t(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f) {
            androidx.navigation.i iVar2 = (androidx.navigation.i) obj2;
            if (!arrayList.contains(iVar2) && iVar2.E.k.compareTo(oVar) >= 0) {
                arrayList3.add(obj2);
            }
        }
        p.t(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((androidx.navigation.i) obj3).y instanceof v)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean s(int i, Bundle bundle, b0 b0Var) {
        t tVarH;
        androidx.navigation.i iVar;
        t tVar;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.m;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l.a((String) it.next(), str)) {
                it.remove();
            }
        }
        l<j> lVar = (l) c0.b(this.n).remove(str);
        androidx.media3.exoplayer.mediacodec.g gVar = this.a.c;
        ArrayList arrayList = new ArrayList();
        androidx.navigation.i iVar2 = (androidx.navigation.i) this.f.i();
        if (iVar2 == null || (tVarH = iVar2.y) == null) {
            tVarH = h();
        }
        if (lVar != null) {
            for (j jVar : lVar) {
                com.google.android.gms.cloudmessaging.n nVar = jVar.a;
                com.google.android.gms.cloudmessaging.n nVar2 = jVar.a;
                t tVarE = e(nVar.e, tVarH, null, true);
                if (tVarE == null) {
                    int i2 = t.B;
                    t0.i("Restore State failed: destination ", androidx.navigation.f.a(gVar, nVar2.e), " cannot be found from the current destination ", tVarH);
                    return false;
                }
                o oVarI = i();
                m mVar = this.p;
                gVar.getClass();
                oVarI.getClass();
                Bundle bundle3 = (Bundle) nVar2.z;
                if (bundle3 != null) {
                    Context context = gVar.e;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String str2 = (String) nVar2.y;
                Bundle bundle4 = (Bundle) nVar2.A;
                str2.getClass();
                arrayList.add(new androidx.navigation.i(gVar, tVarE, bundle2, oVarI, mVar, str2, bundle4));
                tVarH = tVarE;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<androidx.navigation.i> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((androidx.navigation.i) obj).y instanceof v)) {
                arrayList3.add(obj);
            }
        }
        for (androidx.navigation.i iVar3 : arrayList3) {
            List list = (List) p.K(arrayList2);
            if (kotlin.jvm.internal.l.a((list == null || (iVar = (androidx.navigation.i) p.J(list)) == null || (tVar = iVar.y) == null) ? null : tVar.e, iVar3.y.e)) {
                list.add(iVar3);
            } else {
                arrayList2.add(q.l(iVar3));
            }
        }
        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        for (List list2 : arrayList2) {
            k0 k0VarB = this.t.b(((androidx.navigation.i) p.B(list2)).y.e);
            ArrayList arrayList4 = arrayList;
            this.v = new androidx.activity.compose.c(vVar, arrayList4, new x(), this, bundle, 4);
            k0VarB.d(list2, b0Var);
            this.v = null;
            arrayList = arrayList4;
        }
        return vVar.e;
    }

    public final void t(androidx.navigation.i iVar) {
        iVar.getClass();
        androidx.navigation.i iVar2 = (androidx.navigation.i) this.k.remove(iVar);
        if (iVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.l;
        a aVar = (a) linkedHashMap.get(iVar2);
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            androidx.navigation.l lVar = (androidx.navigation.l) this.u.get(this.t.b(iVar2.y.e));
            if (lVar != null) {
                lVar.c(iVar2);
            }
            linkedHashMap.remove(iVar2);
        }
    }

    public final void u() {
        a aVar;
        StateFlow stateFlow;
        Set set;
        ArrayList<androidx.navigation.i> arrayListC0 = p.c0(this.f);
        if (arrayListC0.isEmpty()) {
            return;
        }
        ArrayList arrayListL = q.l(((androidx.navigation.i) p.J(arrayListC0)).y);
        ArrayList arrayList = new ArrayList();
        if (p.J(arrayListL) instanceof androidx.navigation.compose.m) {
            Iterator it = p.U(arrayListC0).iterator();
            while (it.hasNext()) {
                t tVar = ((androidx.navigation.i) it.next()).y;
                arrayList.add(tVar);
                if (!(tVar instanceof androidx.navigation.compose.m) && !(tVar instanceof v)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (androidx.navigation.i iVar : p.U(arrayListC0)) {
            o oVar = iVar.E.k;
            t tVar2 = iVar.y;
            t tVar3 = (t) p.D(arrayListL);
            o oVar2 = o.B;
            o oVar3 = o.A;
            if (tVar3 != null && tVar3.y.a == tVar2.y.a) {
                if (oVar != oVar2) {
                    androidx.navigation.l lVar = (androidx.navigation.l) this.u.get(this.t.b(iVar.y.e));
                    if (kotlin.jvm.internal.l.a((lVar == null || (stateFlow = lVar.f) == null || (set = (Set) stateFlow.getValue()) == null) ? null : Boolean.valueOf(set.contains(iVar)), Boolean.TRUE) || ((aVar = (a) this.l.get(iVar)) != null && aVar.a.get() == 0)) {
                        map.put(iVar, oVar3);
                    } else {
                        map.put(iVar, oVar2);
                    }
                }
                t tVar4 = (t) p.D(arrayList);
                if (tVar4 != null && tVar4.y.a == tVar2.y.a) {
                    p.R(arrayList);
                }
                p.R(arrayListL);
                v vVar = tVar2.z;
                if (vVar != null) {
                    arrayListL.add(vVar);
                }
            } else if (arrayList.isEmpty() || tVar2.y.a != ((t) p.B(arrayList)).y.a) {
                iVar.a(o.z);
            } else {
                t tVar5 = (t) p.R(arrayList);
                if (oVar == oVar2) {
                    iVar.a(oVar3);
                } else if (oVar != oVar3) {
                    map.put(iVar, oVar3);
                }
                v vVar2 = tVar5.z;
                if (vVar2 != null && !arrayList.contains(vVar2)) {
                    arrayList.add(vVar2);
                }
            }
        }
        for (androidx.navigation.i iVar2 : arrayListC0) {
            o oVar4 = (o) map.get(iVar2);
            if (oVar4 != null) {
                iVar2.a(oVar4);
            } else {
                iVar2.E.b();
            }
        }
    }
}
