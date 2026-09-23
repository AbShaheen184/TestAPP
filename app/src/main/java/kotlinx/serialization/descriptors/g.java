package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a0;
import kotlin.collections.c0;
import kotlin.collections.i0;
import kotlin.collections.n;
import kotlin.collections.p;
import kotlin.collections.r;
import kotlin.collections.w;
import kotlin.collections.z;
import kotlin.jvm.internal.l;
import kotlin.k;
import kotlin.o;
import kotlinx.serialization.internal.j;
import kotlinx.serialization.internal.m0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e, j {
    public final String a;
    public final i0 b;
    public final int c;
    public final HashSet d;
    public final String[] e;
    public final e[] f;
    public final List[] g;
    public final boolean[] h;
    public final Map i;
    public final e[] j;
    public final o k;

    public g(String str, i0 i0Var, int i, List list, a aVar) {
        this.a = str;
        this.b = i0Var;
        this.c = i;
        ArrayList arrayList = aVar.b;
        arrayList.getClass();
        HashSet hashSet = new HashSet(c0.j(r.p(arrayList, 12)));
        p.Z(arrayList, hashSet);
        this.d = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.e = strArr;
        this.f = m0.c(aVar.d);
        this.g = (List[]) aVar.e.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f;
        arrayList2.getClass();
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.h = zArr;
        strArr.getClass();
        n nVar = new n(new androidx.navigation.internal.h(strArr, 26), 1);
        ArrayList arrayList3 = new ArrayList(r.p(nVar, 10));
        Iterator it2 = nVar.iterator();
        while (true) {
            a0 a0Var = (a0) it2;
            if (!a0Var.y.hasNext()) {
                this.i = c0.n(arrayList3);
                this.j = m0.c(list);
                this.k = new o(new androidx.navigation.internal.h(this, 28));
                return;
            }
            z zVar = (z) a0Var.next();
            arrayList3.add(new k(zVar.b, Integer.valueOf(zVar.a)));
        }
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String a() {
        return this.a;
    }

    @Override // kotlinx.serialization.internal.j
    public final Set b() {
        return this.d;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final i0 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            e eVar = (e) obj;
            if (this.a.equals(eVar.a()) && Arrays.equals(this.j, ((g) obj).j)) {
                int iF = eVar.f();
                int i = this.c;
                if (i == iF) {
                    for (int i2 = 0; i2 < i; i2++) {
                        e[] eVarArr = this.f;
                        if (l.a(eVarArr[i2].a(), eVar.i(i2).a()) && l.a(eVarArr[i2].e(), eVar.i(i2).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int f() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String g(int i) {
        return this.e[i];
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List getAnnotations() {
        return w.e;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List h(int i) {
        return this.g[i];
    }

    public final int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.e
    public final e i(int i) {
        return this.f[i];
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean j(int i) {
        return this.h[i];
    }

    public final String toString() {
        return p.I(i0.n(0, this.c), ", ", this.a.concat("("), ")", new f(this, 0), 24);
    }
}
