package androidx.compose.foundation.gestures;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    public final l0 a;
    public u0 b;
    public x0 c;
    public w0 d;
    public v0 e;
    public com.imsdk.a f;
    public com.google.firebase.platforminfo.d g;
    public long h = 9205357640488583168L;
    public d3 i;
    public final a1 j;
    public final a1 k;
    public long l;

    public z0(l0 l0Var) {
        this.a = l0Var;
        a1 a1Var = new a1();
        a1Var.b = new ArrayList();
        this.j = a1Var;
        a1 a1Var2 = new a1();
        a1Var2.b = new ArrayList();
        this.k = a1Var2;
        this.l = 0L;
    }

    public static void c(z0 z0Var, androidx.compose.ui.input.indirect.b bVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        l0 l0Var = z0Var.a;
        w0 w0Var = z0Var.d;
        if (w0Var == null) {
            w0Var = new w0();
            w0Var.o = null;
            w0Var.p = Long.MAX_VALUE;
            w0Var.q = false;
            z0Var.d = w0Var;
        }
        w0Var.o = bVar;
        w0Var.p = j;
        d3 d3Var = z0Var.i;
        o1 o1Var = l0Var.N;
        if (d3Var == null) {
            z0Var.i = new d3(o1Var);
        } else {
            d3Var.z = o1Var;
            d3Var.y = j2;
        }
        w0Var.q = false;
        z0Var.f = w0Var;
    }

    public final void a() {
        u0 u0Var = this.b;
        t0 t0Var = t0.z;
        if (u0Var == null) {
            u0Var = new u0();
            u0Var.o = t0Var;
            u0Var.p = false;
            this.b = u0Var;
        }
        u0Var.o = t0Var;
        u0Var.p = false;
        this.f = u0Var;
    }

    public final void b(androidx.compose.ui.input.indirect.b bVar, long j, d3 d3Var) {
        v0 v0Var = this.e;
        if (v0Var == null) {
            v0Var = new v0();
            v0Var.o = null;
            v0Var.p = Long.MAX_VALUE;
            this.e = v0Var;
        }
        v0Var.o = bVar;
        v0Var.p = j;
        d3Var.y = 0L;
        this.f = v0Var;
    }

    public final com.google.firebase.platforminfo.d d() {
        com.google.firebase.platforminfo.d dVar = this.g;
        if (dVar != null) {
            return dVar;
        }
        kotlinx.coroutines.future.a.q("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(androidx.compose.ui.input.indirect.b bVar, androidx.compose.ui.input.indirect.a aVar, long j) {
        l0 l0Var = this.a;
        long jE = androidx.compose.ui.node.l.u(l0Var).E(0L);
        if (!androidx.compose.ui.geometry.b.b(this.h, 9205357640488583168L) && !androidx.compose.ui.geometry.b.b(jE, this.h)) {
            this.l = androidx.compose.ui.geometry.b.e(this.l, androidx.compose.ui.geometry.b.d(jE, this.h));
        }
        this.h = jE;
        o1 o1Var = l0Var.N;
        o1Var.getClass();
        n0 n0Var = o0.a;
        if (Math.abs(Float.intBitsToFloat((int) (o1Var == o1.e ? j & 4294967295L : j >> 32))) > 2.0f) {
            kotlin.math.a.f(d(), bVar, l0Var.N, aVar, this.j, this.l);
            a1 a1Var = this.k;
            ArrayList arrayList = a1Var.b;
            if (arrayList.size() == 3) {
                int i = a1Var.a;
                a1Var.a = i + 1;
                arrayList.set(i, new androidx.compose.ui.geometry.b(j));
            } else {
                arrayList.add(new androidx.compose.ui.geometry.b(j));
            }
            if (a1Var.a == 3) {
                a1Var.a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.b) arrayList.get(i2)).a >> 32))));
            }
            float fV = (float) kotlin.collections.p.v(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.b) arrayList.get(i3)).a & 4294967295L))));
            }
            l0Var.X0(new u((((long) Float.floatToRawIntBits((float) kotlin.collections.p.v(arrayList3))) & 4294967295L) | (((long) Float.floatToRawIntBits(fV)) << 32), true));
        }
    }

    public final void f(androidx.compose.ui.input.indirect.b bVar, androidx.compose.ui.input.indirect.b bVar2, androidx.compose.ui.input.indirect.a aVar, long j) {
        if (this.g == null) {
            this.g = new com.google.firebase.platforminfo.d(15);
        }
        this.l = 0L;
        com.google.firebase.platforminfo.d dVarD = d();
        l0 l0Var = this.a;
        kotlin.math.a.f(dVarD, bVar, l0Var.N, aVar, this.j, this.l);
        long jD = androidx.compose.ui.geometry.b.d(kotlin.math.a.C(bVar2, l0Var.N, aVar), j);
        if (((Boolean) l0Var.O.invoke(new androidx.compose.ui.input.pointer.d0(1))).booleanValue()) {
            this.h = androidx.compose.ui.node.l.u(l0Var).E(0L);
            l0Var.X0(new v(jD));
        }
        a1 a1Var = this.k;
        a1Var.a = 0;
        a1Var.b.clear();
    }
}
