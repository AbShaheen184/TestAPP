package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable, Serializable {
    public static final d A;
    public static final f z = new f(v.b);
    public int e = 0;
    public final byte[] y;

    static {
        A = b.a() ? new d(1) : new d(0);
    }

    public f(byte[] bArr) {
        bArr.getClass();
        this.y = bArr;
    }

    public static int c(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            com.google.firebase.platforminfo.b.l(androidx.privacysandbox.ads.adservices.java.internal.a.q("Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            com.google.firebase.platforminfo.b.l(androidx.compose.runtime.j.g("Beginning index larger than ending index: ", i, ", ", i2));
            return 0;
        }
        com.google.firebase.platforminfo.b.l(androidx.compose.runtime.j.g("End index: ", i2, " >= ", i3));
        return 0;
    }

    public static f d(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange;
        c(i, i + i2, bArr.length);
        switch (A.a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i2];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i2);
                break;
        }
        return new f(bArrCopyOfRange);
    }

    public byte b(int i) {
        return this.y[i];
    }

    public void e(byte[] bArr, int i) {
        System.arraycopy(this.y, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f) || size() != ((f) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof f)) {
            return obj.equals(this);
        }
        f fVar = (f) obj;
        int i = this.e;
        int i2 = fVar.e;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > fVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > fVar.size()) {
            StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Ran off end of other: 0, ", size, ", ");
            sbV.append(fVar.size());
            throw new IllegalArgumentException(sbV.toString());
        }
        byte[] bArr = fVar.y;
        int iF = f() + size;
        int iF2 = f();
        int iF3 = fVar.f();
        while (iF2 < iF) {
            if (this.y[iF2] != bArr[iF3]) {
                return false;
            }
            iF2++;
            iF3++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public byte h(int i) {
        return this.y[i];
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iF = f();
        int i2 = size;
        for (int i3 = iF; i3 < iF + size; i3++) {
            i2 = (i2 * 31) + this.y[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.e = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this);
    }

    public int size() {
        return this.y.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = _COROUTINE.b.o(this);
        } else {
            int iC = c(0, 47, size());
            strConcat = _COROUTINE.b.o(iC == 0 ? z : new e(this.y, f(), iC)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, strConcat, "\">");
    }
}
