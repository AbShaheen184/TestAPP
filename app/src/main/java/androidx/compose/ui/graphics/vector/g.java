package androidx.compose.ui.graphics.vector;

import com.google.common.collect.a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements androidx.media3.exoplayer.text.a {
    public final /* synthetic */ int a;
    public ArrayList b;

    public g(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new ArrayList();
                new HashMap();
                new HashMap();
                break;
            case 2:
                this.b = new ArrayList();
                break;
            case 3:
                this.b = null;
                break;
            case 4:
                this.b = new ArrayList(20);
                break;
            default:
                this.b = new ArrayList(32);
                break;
        }
    }

    public void A(float f) {
        this.b.add(new a0(f));
    }

    @Override // androidx.media3.exoplayer.text.a
    public long a(long j) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((androidx.media3.extractor.text.a) arrayList.get(0)).b) {
            return ((androidx.media3.extractor.text.a) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            androidx.media3.extractor.text.a aVar = (androidx.media3.extractor.text.a) arrayList.get(i);
            long j2 = aVar.b;
            long j3 = aVar.b;
            if (j < j2) {
                long j4 = ((androidx.media3.extractor.text.a) arrayList.get(i - 1)).d;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((androidx.media3.extractor.text.a) com.google.common.collect.q.k(arrayList)).d;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // androidx.media3.exoplayer.text.a
    public com.google.common.collect.h0 b(long j) {
        int iQ = q(j);
        if (iQ == 0) {
            com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
            return a1.B;
        }
        androidx.media3.extractor.text.a aVar = (androidx.media3.extractor.text.a) this.b.get(iQ - 1);
        long j2 = aVar.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return aVar.a;
        }
        com.google.common.collect.e0 e0Var2 = com.google.common.collect.h0.y;
        return a1.B;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // androidx.media3.exoplayer.text.a
    public boolean c(androidx.media3.extractor.text.a aVar, long j) {
        boolean z;
        ArrayList arrayList = this.b;
        long j2 = aVar.b;
        _COROUTINE.a.o(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = aVar.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((androidx.media3.extractor.text.a) arrayList.get(size)).b) {
                arrayList.add(size + 1, aVar);
                return z;
            }
            if (((androidx.media3.extractor.text.a) arrayList.get(size)).b <= j) {
                z = false;
            }
        }
        arrayList.add(0, aVar);
        return z;
    }

    @Override // androidx.media3.exoplayer.text.a
    public void clear() {
        this.b.clear();
    }

    @Override // androidx.media3.exoplayer.text.a
    public long d(long j) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() || j < ((androidx.media3.extractor.text.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((androidx.media3.extractor.text.a) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                androidx.media3.extractor.text.a aVar = (androidx.media3.extractor.text.a) arrayList.get(i - 1);
                long j3 = aVar.d;
                return (j3 == -9223372036854775807L || j3 > j) ? aVar.b : j3;
            }
        }
        androidx.media3.extractor.text.a aVar2 = (androidx.media3.extractor.text.a) com.google.common.collect.q.k(arrayList);
        long j4 = aVar2.d;
        return (j4 == -9223372036854775807L || j < j4) ? aVar2.b : j4;
    }

    @Override // androidx.media3.exoplayer.text.a
    public void e(long j) {
        ArrayList arrayList = this.b;
        int iQ = q(j);
        if (iQ == 0) {
            return;
        }
        long j2 = ((androidx.media3.extractor.text.a) arrayList.get(iQ - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iQ--;
        }
        arrayList.subList(0, iQ).clear();
    }

    public void f(com.caverock.androidsvg.l lVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        int i = 0;
        while (true) {
            int size = this.b.size();
            ArrayList arrayList = this.b;
            if (i >= size) {
                arrayList.add(lVar);
                return;
            } else {
                if (((com.caverock.androidsvg.l) arrayList.get(i)).a.b > lVar.a.b) {
                    this.b.add(i, lVar);
                    return;
                }
                i++;
            }
        }
    }

    public void g(String str, String str2) {
        str.getClass();
        str2.getClass();
        kotlin.collections.builders.c.G(str);
        kotlin.collections.builders.c.H(str2, str);
        kotlin.collections.builders.c.E(this, str, str2);
    }

    public void h(g gVar) {
        if (gVar.b == null) {
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList(gVar.b.size());
        }
        Iterator it = gVar.b.iterator();
        while (it.hasNext()) {
            f((com.caverock.androidsvg.l) it.next());
        }
    }

    public void i(String str) {
        int iG = kotlin.text.k.G(str, ':', 1, 4);
        if (iG != -1) {
            kotlin.collections.builders.c.E(this, str.substring(0, iG), str.substring(iG + 1));
        } else if (str.charAt(0) == ':') {
            kotlin.collections.builders.c.E(this, "", str.substring(1));
        } else {
            kotlin.collections.builders.c.E(this, "", str);
        }
    }

    public void j(String str, String str2) {
        str.getClass();
        str2.getClass();
        kotlin.collections.builders.c.G(str);
        kotlin.collections.builders.c.E(this, str, str2);
    }

    public okhttp3.r k() {
        return new okhttp3.r((String[]) this.b.toArray(new String[0]));
    }

    public void l() {
        this.b.add(k.c);
    }

    public void m(float f, float f2, float f3, float f4, float f5, float f6) {
        this.b.add(new l(f, f2, f3, f4, f5, f6));
    }

    public void n(float f, float f2, float f3, float f4, float f5, float f6) {
        this.b.add(new t(f, f2, f3, f4, f5, f6));
    }

    public String o(String str) {
        str.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size() - 2;
        int iD = dagger.hilt.android.internal.a.d(size, 0, -2);
        if (iD > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == iD) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    public List p() {
        ArrayList arrayList;
        if (this.b.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.b) {
            arrayList = new ArrayList(this.b);
        }
        return arrayList;
    }

    public int q(long j) {
        ArrayList arrayList = this.b;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((androidx.media3.extractor.text.a) arrayList.get(i)).b) {
                return i;
            }
        }
        return arrayList.size();
    }

    public void r(float f) {
        this.b.add(new m(f));
    }

    public void s(float f) {
        this.b.add(new u(f));
    }

    public void t(float f, float f2) {
        this.b.add(new n(f, f2));
    }

    public String toString() {
        switch (this.a) {
            case 3:
                if (this.b == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    sb.append(((com.caverock.androidsvg.l) it.next()).toString());
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(float f, float f2) {
        this.b.add(new v(f, f2));
    }

    public void v(float f, float f2) {
        this.b.add(new o(f, f2));
    }

    public void w(float f, float f2, float f3, float f4) {
        this.b.add(new q(f, f2, f3, f4));
    }

    public void x(float f, float f2, float f3, float f4) {
        this.b.add(new y(f, f2, f3, f4));
    }

    public void y(String str) {
        str.getClass();
        ArrayList arrayList = this.b;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void z(float f) {
        this.b.add(new b0(f));
    }
}
