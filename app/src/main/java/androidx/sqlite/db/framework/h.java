package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class h implements androidx.sqlite.db.c {
    public final SQLiteProgram e;

    public h(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.e = sQLiteProgram;
    }

    @Override // androidx.sqlite.db.c
    public final void G(double d, int i) {
        this.e.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    @Override // androidx.sqlite.db.c
    public final void f(int i, long j) {
        this.e.bindLong(i, j);
    }

    @Override // androidx.sqlite.db.c
    public final void h(byte[] bArr, int i) {
        this.e.bindBlob(i, bArr);
    }

    @Override // androidx.sqlite.db.c
    public final void j(int i) {
        this.e.bindNull(i);
    }

    @Override // androidx.sqlite.db.c
    public final void k() {
        this.e.clearBindings();
    }

    @Override // androidx.sqlite.db.c
    public final void m(int i, String str) {
        str.getClass();
        this.e.bindString(i, str);
    }
}
