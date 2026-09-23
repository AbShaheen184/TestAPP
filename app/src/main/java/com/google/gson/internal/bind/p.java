package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends com.google.gson.stream.b {
    public static final o O = new o();
    public static final com.google.gson.k P = new com.google.gson.k("closed");
    public final ArrayList L;
    public String M;
    public com.google.gson.g N;

    public p() {
        super(O);
        this.L = new ArrayList();
        this.N = com.google.gson.i.e;
    }

    @Override // com.google.gson.stream.b
    public final void A() {
        ArrayList arrayList = this.L;
        if (arrayList.isEmpty() || this.M != null) {
            org.mozilla.javascript.c.a();
        } else if (k0() instanceof com.google.gson.f) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            org.mozilla.javascript.c.a();
        }
    }

    @Override // com.google.gson.stream.b
    public final void L() {
        ArrayList arrayList = this.L;
        if (arrayList.isEmpty() || this.M != null) {
            org.mozilla.javascript.c.a();
        } else if (k0() instanceof com.google.gson.j) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            org.mozilla.javascript.c.a();
        }
    }

    @Override // com.google.gson.stream.b
    public final void N(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.L.isEmpty() || this.M != null) {
            kotlinx.coroutines.future.a.u("Did not expect a name");
        } else if (k0() instanceof com.google.gson.j) {
            this.M = str;
        } else {
            kotlinx.coroutines.future.a.u("Please begin an object before writing a name.");
        }
    }

    @Override // com.google.gson.stream.b
    public final com.google.gson.stream.b Y() {
        l0(com.google.gson.i.e);
        return this;
    }

    @Override // com.google.gson.stream.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.L;
        if (arrayList.isEmpty()) {
            arrayList.add(P);
        } else {
            kotlinx.coroutines.future.a.w("Incomplete document");
        }
    }

    @Override // com.google.gson.stream.b
    public final void d0(double d) {
        if (this.E == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            l0(new com.google.gson.k(Double.valueOf(d)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    @Override // com.google.gson.stream.b
    public final void e0(long j) {
        l0(new com.google.gson.k(Long.valueOf(j)));
    }

    @Override // com.google.gson.stream.b
    public final void f0(Boolean bool) {
        if (bool == null) {
            l0(com.google.gson.i.e);
        } else {
            l0(new com.google.gson.k(bool));
        }
    }

    @Override // com.google.gson.stream.b
    public final void g() {
        com.google.gson.f fVar = new com.google.gson.f();
        l0(fVar);
        this.L.add(fVar);
    }

    @Override // com.google.gson.stream.b
    public final void g0(Number number) {
        if (number == null) {
            l0(com.google.gson.i.e);
            return;
        }
        if (this.E != 1) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                com.google.firebase.platforminfo.b.f(number, "JSON forbids NaN and infinities: ");
                return;
            }
        }
        l0(new com.google.gson.k(number));
    }

    @Override // com.google.gson.stream.b
    public final void h0(String str) {
        if (str == null) {
            l0(com.google.gson.i.e);
        } else {
            l0(new com.google.gson.k(str));
        }
    }

    @Override // com.google.gson.stream.b
    public final void i0(boolean z) {
        l0(new com.google.gson.k(Boolean.valueOf(z)));
    }

    public final com.google.gson.g k0() {
        return (com.google.gson.g) androidx.privacysandbox.ads.adservices.java.internal.a.l(1, this.L);
    }

    public final void l0(com.google.gson.g gVar) {
        if (this.M != null) {
            if (!(gVar instanceof com.google.gson.i) || this.H) {
                ((com.google.gson.j) k0()).i(this.M, gVar);
            }
            this.M = null;
            return;
        }
        if (this.L.isEmpty()) {
            this.N = gVar;
            return;
        }
        com.google.gson.g gVarK0 = k0();
        if (gVarK0 instanceof com.google.gson.f) {
            ((com.google.gson.f) gVarK0).e.add(gVar);
        } else {
            org.mozilla.javascript.c.a();
        }
    }

    @Override // com.google.gson.stream.b
    public final void n() {
        com.google.gson.j jVar = new com.google.gson.j();
        l0(jVar);
        this.L.add(jVar);
    }

    @Override // com.google.gson.stream.b, java.io.Flushable
    public final void flush() {
    }
}
