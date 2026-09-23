package androidx.room.coroutines;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements androidx.sqlite.c {
    public final androidx.sqlite.c e;

    public f(androidx.sqlite.c cVar) {
        this.e = cVar;
    }

    @Override // androidx.sqlite.c
    public final String F(int i) {
        return this.e.F(i);
    }

    @Override // androidx.sqlite.c
    public final boolean Q() {
        return this.e.Q();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        androidx.sqlite.c cVar = this.e;
        cVar.reset();
        cVar.k();
    }

    @Override // androidx.sqlite.c
    public final void f(int i, long j) {
        this.e.f(i, j);
    }

    @Override // androidx.sqlite.c
    public final byte[] getBlob(int i) {
        return this.e.getBlob(i);
    }

    @Override // androidx.sqlite.c
    public final int getColumnCount() {
        return this.e.getColumnCount();
    }

    @Override // androidx.sqlite.c
    public final String getColumnName(int i) {
        return this.e.getColumnName(i);
    }

    @Override // androidx.sqlite.c
    public final double getDouble(int i) {
        return this.e.getDouble(i);
    }

    @Override // androidx.sqlite.c
    public final long getLong(int i) {
        return this.e.getLong(i);
    }

    @Override // androidx.sqlite.c
    public final void h(byte[] bArr, int i) {
        this.e.h(bArr, i);
    }

    @Override // androidx.sqlite.c
    public final boolean isNull(int i) {
        return this.e.isNull(i);
    }

    @Override // androidx.sqlite.c
    public final void j(int i) {
        this.e.j(i);
    }

    @Override // androidx.sqlite.c
    public final void k() {
        this.e.k();
    }

    @Override // androidx.sqlite.c
    public final void reset() {
        this.e.reset();
    }

    @Override // androidx.sqlite.c
    public final void s(int i, String str) {
        str.getClass();
        this.e.s(i, str);
    }

    @Override // androidx.sqlite.c
    public final boolean u() {
        return this.e.u();
    }

    @Override // androidx.sqlite.c
    public final void v(double d) {
        this.e.v(d);
    }
}
