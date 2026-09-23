package androidx.navigationevent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.collections.w;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final MutableStateFlow a;
    public final StateFlow b;
    public final MutableStateFlow c;
    public final StateFlow d;
    public final kotlin.collections.l e;
    public final kotlin.collections.l f;
    public e g;
    public int h;
    public g i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public final LinkedHashSet l;
    public boolean m;
    public boolean n;
    public boolean o;

    public h() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(i.m);
        this.a = MutableStateFlow;
        this.b = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new f());
        this.c = MutableStateFlow2;
        this.d = FlowKt.asStateFlow(MutableStateFlow2);
        this.e = new kotlin.collections.l();
        this.f = new kotlin.collections.l();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
        this.l = new LinkedHashSet();
    }

    public final void a(c cVar, g gVar, int i) {
        LinkedHashSet linkedHashSet;
        boolean z;
        cVar.getClass();
        if (gVar.a != null) {
            StringBuilder sb = new StringBuilder("Input '");
            sb.append(gVar);
            c cVar2 = gVar.a;
            sb.append("' is already added to dispatcher ");
            sb.append(cVar2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i != 0) {
            linkedHashSet = i != 1 ? this.j : this.k;
        } else {
            linkedHashSet = this.l;
        }
        linkedHashSet.add(gVar);
        gVar.a = cVar;
        ((f) this.d.getValue()).getClass();
        if (i != 0) {
            z = i != 1 ? this.o : this.m;
        } else {
            z = this.n;
        }
        gVar.b(z);
    }

    public final void b() {
        boolean z;
        boolean z2;
        f fVar;
        kotlin.collections.l lVar = this.e;
        if (lVar != null && lVar.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = lVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((e) it.next()).b) {
                z = true;
                break;
            }
        }
        kotlin.collections.l lVar2 = this.f;
        if (lVar2 != null && lVar2.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it2 = lVar2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            } else if (((e) it2.next()).b) {
                z2 = true;
                break;
            }
        }
        boolean z3 = z || z2;
        boolean z4 = this.n != z;
        boolean z5 = this.m != z2;
        boolean z6 = this.o != z3;
        LinkedHashSet linkedHashSet = this.l;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((g) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.k;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((g) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.j;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((g) it5.next()).b(z3);
            }
        }
        this.n = z;
        this.m = z2;
        this.o = z3;
        e eVarC = this.g;
        if (eVarC == null) {
            eVarC = c(0);
        }
        e eVarC2 = this.g;
        if (eVarC2 == null) {
            eVarC2 = c(0);
        }
        if (kotlin.jvm.internal.l.a(eVarC2, eVarC)) {
            if (eVarC2 == null) {
                fVar = new f();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = lVar.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((e) it6.next()).b;
                }
                Iterator<E> it7 = lVar2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((e) it7.next()).b;
                }
                n nVar = eVarC2.a;
                kotlin.collections.builders.b bVarG = q.g();
                p.t(bVarG, arrayList);
                bVarG.add(nVar);
                p.t(bVarG, w.e);
                fVar = new f(arrayList.size(), q.c(bVarG));
            }
            MutableStateFlow mutableStateFlow = this.c;
            if (kotlin.jvm.internal.l.a((f) mutableStateFlow.getValue(), fVar)) {
                return;
            }
            mutableStateFlow.setValue(fVar);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((g) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((g) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((g) it10.next()).getClass();
            }
        }
    }

    public final e c(int i) {
        Object next;
        Object next2;
        kotlin.collections.l lVar = this.f;
        kotlin.collections.l lVar2 = this.e;
        Object obj = null;
        if (i == -1) {
            Iterator it = lVar2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((e) next).b);
            e eVar = (e) next;
            if (eVar != null) {
                return eVar;
            }
            for (Object obj2 : lVar) {
                if (((e) obj2).b) {
                    obj = obj2;
                    break;
                }
            }
            return (e) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it2 = lVar2.iterator();
            while (it2.hasNext()) {
                ((e) it2.next()).getClass();
            }
            Iterator it3 = lVar.iterator();
            while (it3.hasNext()) {
                ((e) it3.next()).getClass();
            }
            return null;
        }
        Iterator it4 = lVar2.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((e) next2).b);
        e eVar2 = (e) next2;
        if (eVar2 != null) {
            return eVar2;
        }
        for (Object obj3 : lVar) {
            if (((e) obj3).b) {
                obj = obj3;
                break;
            }
        }
        return (e) obj;
    }
}
