package androidx.sqlite.driver;

import android.database.Cursor;
import androidx.media3.exoplayer.dash.manifest.t;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {
    public int[] A;
    public long[] B;
    public double[] C;
    public String[] D;
    public byte[][] E;
    public Cursor F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.sqlite.db.framework.b bVar, String str) {
        super(bVar, str);
        bVar.getClass();
        str.getClass();
        this.A = new int[0];
        this.B = new long[0];
        this.C = new double[0];
        this.D = new String[0];
        this.E = new byte[0][];
    }

    public static void x(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            t1.B(25, "column index out of range");
            throw null;
        }
    }

    public final Cursor A() {
        Cursor cursor = this.F;
        if (cursor != null) {
            return cursor;
        }
        t1.B(21, "no row");
        throw null;
    }

    @Override // androidx.sqlite.c
    public final String F(int i) {
        a();
        Cursor cursorA = A();
        x(cursorA, i);
        String string = cursorA.getString(i);
        string.getClass();
        return string;
    }

    @Override // androidx.sqlite.c
    public final boolean Q() {
        a();
        n();
        Cursor cursor = this.F;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        kotlinx.coroutines.future.a.u("Required value was null.");
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.z) {
            k();
            reset();
        }
        this.z = true;
    }

    @Override // androidx.sqlite.c
    public final void f(int i, long j) {
        a();
        g(1, i);
        this.A[i] = 1;
        this.B[i] = j;
    }

    public final void g(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.A;
        if (iArr.length < i3) {
            this.A = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.B;
            if (jArr.length < i3) {
                this.B = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.C;
            if (dArr.length < i3) {
                this.C = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.D;
            if (strArr.length < i3) {
                this.D = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.E;
        if (bArr.length < i3) {
            this.E = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // androidx.sqlite.c
    public final byte[] getBlob(int i) {
        a();
        Cursor cursorA = A();
        x(cursorA, i);
        byte[] blob = cursorA.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // androidx.sqlite.c
    public final int getColumnCount() {
        a();
        n();
        Cursor cursor = this.F;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // androidx.sqlite.c
    public final String getColumnName(int i) {
        a();
        n();
        Cursor cursor = this.F;
        if (cursor == null) {
            kotlinx.coroutines.future.a.u("Required value was null.");
            return null;
        }
        x(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // androidx.sqlite.c
    public final double getDouble(int i) {
        a();
        Cursor cursorA = A();
        x(cursorA, i);
        return cursorA.getDouble(i);
    }

    @Override // androidx.sqlite.c
    public final long getLong(int i) {
        a();
        Cursor cursorA = A();
        x(cursorA, i);
        return cursorA.getLong(i);
    }

    @Override // androidx.sqlite.c
    public final void h(byte[] bArr, int i) {
        a();
        g(4, i);
        this.A[i] = 4;
        this.E[i] = bArr;
    }

    @Override // androidx.sqlite.c
    public final boolean isNull(int i) {
        a();
        Cursor cursorA = A();
        x(cursorA, i);
        return cursorA.isNull(i);
    }

    @Override // androidx.sqlite.c
    public final void j(int i) {
        a();
        g(5, i);
        this.A[i] = 5;
    }

    @Override // androidx.sqlite.driver.f, androidx.sqlite.c
    public final void k() {
        a();
        this.A = new int[0];
        this.B = new long[0];
        this.C = new double[0];
        this.D = new String[0];
        this.E = new byte[0][];
    }

    public final void n() {
        if (this.F == null) {
            this.F = this.e.N(new t(this));
        }
    }

    @Override // androidx.sqlite.driver.f, androidx.sqlite.c
    public final void reset() {
        a();
        Cursor cursor = this.F;
        if (cursor != null) {
            cursor.close();
        }
        this.F = null;
    }

    @Override // androidx.sqlite.c
    public final void s(int i, String str) {
        str.getClass();
        a();
        g(3, i);
        this.A[i] = 3;
        this.D[i] = str;
    }

    @Override // androidx.sqlite.c
    public final void v(double d) {
        a();
        g(2, 6);
        this.A[6] = 2;
        this.C[6] = d;
    }
}
