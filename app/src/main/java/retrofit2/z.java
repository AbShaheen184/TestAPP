package retrofit2;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements d {
    public final okhttp3.y A;
    public final m B;
    public volatile boolean C;
    public okhttp3.internal.connection.m D;
    public Throwable E;
    public boolean F;
    public final q0 e;
    public final Object y;
    public final Object[] z;

    public z(q0 q0Var, Object obj, Object[] objArr, okhttp3.y yVar, m mVar) {
        this.e = q0Var;
        this.y = obj;
        this.z = objArr;
        this.A = yVar;
        this.B = mVar;
    }

    @Override // retrofit2.d
    public final boolean A() {
        boolean z = true;
        if (this.C) {
            return true;
        }
        synchronized (this) {
            try {
                okhttp3.internal.connection.m mVar = this.D;
                if (mVar == null || !mVar.N) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // retrofit2.d
    public final synchronized okhttp3.b0 N() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return b().y;
    }

    public final okhttp3.internal.connection.m a() {
        com.google.android.material.shape.y yVar;
        okhttp3.s sVarC;
        q0 q0Var = this.e;
        z0[] z0VarArr = q0Var.k;
        Object[] objArr = this.z;
        int length = objArr.length;
        if (length != z0VarArr.length) {
            kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.o(z0VarArr.length, ")", androidx.privacysandbox.ads.adservices.java.internal.a.v("Argument count (", length, ") doesn't match expected count (")));
            return null;
        }
        o0 o0Var = new o0(q0Var.d, q0Var.c, q0Var.e, q0Var.f, q0Var.g, q0Var.h, q0Var.i, q0Var.j);
        if (q0Var.l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            z0VarArr[i].a(o0Var, objArr[i]);
        }
        com.google.android.material.shape.y yVar2 = o0Var.d;
        if (yVar2 != null) {
            sVarC = yVar2.c();
        } else {
            String str = o0Var.c;
            okhttp3.s sVar = o0Var.b;
            sVar.getClass();
            str.getClass();
            try {
                yVar = new com.google.android.material.shape.y(1);
                yVar.f(sVar, str);
            } catch (IllegalArgumentException unused) {
                yVar = null;
            }
            sVarC = yVar != null ? yVar.c() : null;
            if (sVarC == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(sVar);
                org.mozilla.javascript.typedarrays.c.e(sb, ", Relative: ", o0Var.c);
                return null;
            }
        }
        okhttp3.e0 n0Var = o0Var.k;
        if (n0Var == null) {
            com.google.android.material.internal.k kVar = o0Var.j;
            if (kVar != null) {
                n0Var = new okhttp3.p((ArrayList) kVar.y, (ArrayList) kVar.z);
            } else {
                com.google.android.datatransport.runtime.j jVar = o0Var.i;
                if (jVar != null) {
                    ArrayList arrayList2 = (ArrayList) jVar.A;
                    if (arrayList2.isEmpty()) {
                        kotlinx.coroutines.future.a.u("Multipart body must have at least one part.");
                        return null;
                    }
                    n0Var = new okhttp3.w((okio.i) jVar.y, (okhttp3.u) jVar.z, okhttp3.internal.g.j(arrayList2));
                } else if (o0Var.h) {
                    int i2 = okhttp3.e0.a;
                    long j = 0;
                    okhttp3.internal.e.a(j, j, j);
                    n0Var = new okhttp3.d0(null, 0, new byte[0]);
                }
            }
        }
        okhttp3.u uVar = o0Var.g;
        androidx.compose.ui.graphics.vector.g gVar = o0Var.f;
        if (uVar != null) {
            if (n0Var != null) {
                n0Var = new n0(n0Var, uVar);
            } else {
                gVar.g("Content-Type", uVar.a);
            }
        }
        okhttp3.a0 a0Var = o0Var.e;
        a0Var.getClass();
        a0Var.a = sVarC;
        a0Var.c = gVar.k().d();
        a0Var.c(o0Var.a, n0Var);
        a0Var.e = a0Var.e.j(kotlin.jvm.internal.a0.a(u.class), new u(q0Var.a, this.y, q0Var.b, arrayList));
        okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
        okhttp3.y yVar3 = this.A;
        yVar3.getClass();
        return new okhttp3.internal.connection.m(yVar3, b0Var, false);
    }

    public final okhttp3.internal.connection.m b() throws IOException {
        okhttp3.internal.connection.m mVar = this.D;
        if (mVar != null) {
            return mVar;
        }
        Throwable th = this.E;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            okhttp3.internal.connection.m mVarA = a();
            this.D = mVarA;
            return mVarA;
        } catch (IOException | Error | RuntimeException e) {
            z0.q(e);
            this.E = e;
            throw e;
        }
    }

    public final r0 c(okhttp3.g0 g0Var) throws IOException {
        okhttp3.j0 j0Var = g0Var.D;
        okhttp3.f0 f0VarN = g0Var.n();
        f0VarN.g = new y(j0Var.x(), j0Var.n());
        okhttp3.g0 g0VarA = f0VarN.a();
        boolean z = g0VarA.N;
        int i = g0VarA.A;
        if (i < 200 || i >= 300) {
            try {
                okio.f fVar = new okio.f();
                j0Var.P().O(fVar);
                okhttp3.i0 i0Var = new okhttp3.i0(j0Var.x(), j0Var.n(), fVar);
                if (z) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                r0 r0Var = new r0(g0VarA, null, i0Var);
                j0Var.close();
                return r0Var;
            } catch (Throwable th) {
                j0Var.close();
                throw th;
            }
        }
        if (i == 204 || i == 205) {
            j0Var.close();
            if (z) {
                return new r0(g0VarA, null, null);
            }
            kotlinx.coroutines.future.a.q("rawResponse must be successful response");
            return null;
        }
        x xVar = new x(j0Var);
        try {
            Object objC = this.B.c(xVar);
            if (z) {
                return new r0(g0VarA, objC, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = xVar.B;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // retrofit2.d
    public final void cancel() {
        okhttp3.internal.connection.m mVar;
        this.C = true;
        synchronized (this) {
            mVar = this.D;
        }
        if (mVar != null) {
            mVar.cancel();
        }
    }

    public final Object clone() {
        return new z(this.e, this.y, this.z, this.A, this.B);
    }

    @Override // retrofit2.d
    public final void x(g gVar) {
        okhttp3.internal.connection.m mVar;
        Throwable th;
        synchronized (this) {
            try {
                if (this.F) {
                    throw new IllegalStateException("Already executed.");
                }
                this.F = true;
                mVar = this.D;
                th = this.E;
                if (mVar == null && th == null) {
                    try {
                        okhttp3.internal.connection.m mVarA = a();
                        this.D = mVarA;
                        mVar = mVarA;
                    } catch (Throwable th2) {
                        th = th2;
                        z0.q(th);
                        this.E = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            gVar.e(this, th);
            return;
        }
        if (this.C) {
            mVar.cancel();
        }
        mVar.d(new com.google.android.material.internal.k(29, this, gVar, false));
    }

    @Override // retrofit2.d
    public final d clone() {
        return new z(this.e, this.y, this.z, this.A, this.B);
    }
}
