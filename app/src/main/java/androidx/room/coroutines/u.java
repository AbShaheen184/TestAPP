package androidx.room.coroutines;

import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements androidx.sqlite.c {
    public final androidx.sqlite.c e;
    public final long y;
    public final /* synthetic */ a0 z;

    public u(a0 a0Var, androidx.sqlite.c cVar) {
        cVar.getClass();
        this.z = a0Var;
        this.e = cVar;
        this.y = t1.r();
    }

    @Override // androidx.sqlite.c
    public final String F(int i) {
        if (this.z.e) {
            t1.B(21, "Statement is recycled");
            throw null;
        }
        if (this.y == t1.r()) {
            return this.e.F(i);
        }
        t1.B(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.c
    public final boolean Q() {
        if (this.z.e) {
            t1.B(21, "Statement is recycled");
            throw null;
        }
        if (this.y == t1.r()) {
            return this.e.Q();
        }
        t1.B(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.z.e) {
            t1.B(21, "Statement is recycled");
            throw null;
        }
        if (this.y == t1.r()) {
            this.e.close();
        } else {
            t1.B(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final void f(int i, long j) {
        if (this.z.e) {
            t1.B(21, "Statement is recycled");
            throw null;
        }
        if (this.y == t1.r()) {
            this.e.f(i, j);
        } else {
            t1.B(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final byte[] getBlob(int i) {
        if (this.z.e) {
            t1.B(21, "Statement is recycled");
            throw null;
        }
        if (this.y == t1.r()) {
            return this.e.getBlob(i);
        }
        t1.B(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.c
    public final int getColumnCount() {
        if (this.z.e) {
            t1.B(21, "Statement is recycled");
            throw null;
        }
        if (this.y == t1.r()) {
            return this.e.getColumnCount();
        }
        t1.B(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.c
    public final String getColumnName(int i) {
        if (this.z.e) {
            t1.B(21, "Statement is recycled");
            throw null;
        }
        if (this.y == t1.r()) {
            return this.e.getColumnName(i);
        }
        t1.B(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.c
    public final double getDouble(int i) {
        if (this.z.e) {
            t1.B(21, "Statement is recycled");
            throw null;
        }
        if (this.y == t1.r()) {
            return this.e.getDouble(i);
        }
        t1.B(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.c
    public final long getLong(int i) {
        if (this.z.e) {
            t1.B(21, "Statement is recycled");
            throw null;
        }
        if (this.y == t1.r()) {
            return this.e.getLong(i);
        }
        t1.B(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.c
    public final void h(byte[] bArr, int i) {
        if (this.z.e) {
            t1.B(21, "Statement is recycled");
            throw null;
        }
        if (this.y == t1.r()) {
            this.e.h(bArr, i);
        } else {
            t1.B(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final boolean isNull(int i) {
        if (this.z.e) {
            t1.B(21, "Statement is recycled");
            throw null;
        }
        if (this.y == t1.r()) {
            return this.e.isNull(i);
        }
        t1.B(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.c
    public final void j(int i) {
        if (this.z.e) {
            t1.B(21, "Statement is recycled");
            throw null;
        }
        if (this.y == t1.r()) {
            this.e.j(i);
        } else {
            t1.B(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final void k() {
        if (this.z.e) {
            t1.B(21, "Statement is recycled");
            throw null;
        }
        if (this.y == t1.r()) {
            this.e.k();
        } else {
            t1.B(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final void reset() {
        if (this.z.e) {
            t1.B(21, "Statement is recycled");
            throw null;
        }
        if (this.y == t1.r()) {
            this.e.reset();
        } else {
            t1.B(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final void s(int i, String str) {
        str.getClass();
        if (this.z.e) {
            t1.B(21, "Statement is recycled");
            throw null;
        }
        if (this.y == t1.r()) {
            this.e.s(i, str);
        } else {
            t1.B(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final void v(double d) {
        if (this.z.e) {
            t1.B(21, "Statement is recycled");
            throw null;
        }
        if (this.y == t1.r()) {
            this.e.v(d);
        } else {
            t1.B(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
