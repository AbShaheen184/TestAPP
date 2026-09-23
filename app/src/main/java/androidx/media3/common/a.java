package androidx.media3.common;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final int a;
    public final int b;
    public final Uri[] c;
    public final c0[] d;
    public final int[] e;
    public final long[] f;
    public final String[] g;
    public final b[] h;

    static {
        androidx.compose.runtime.j.A(0, 1, 2, 3, 4);
        androidx.compose.runtime.j.A(5, 6, 7, 8, 9);
        androidx.media3.common.util.i0.K(10);
        androidx.media3.common.util.i0.K(11);
    }

    public a(int i, int i2, int[] iArr, c0[] c0VarArr, long[] jArr, String[] strArr, b[] bVarArr) {
        Uri uri;
        int i3 = 0;
        _COROUTINE.a.o(iArr.length == c0VarArr.length);
        _COROUTINE.a.o(iArr.length == bVarArr.length);
        this.a = i;
        this.b = i2;
        this.e = iArr;
        this.d = c0VarArr;
        this.f = jArr;
        this.c = new Uri[c0VarArr.length];
        while (true) {
            Uri[] uriArr = this.c;
            if (i3 >= uriArr.length) {
                this.g = strArr;
                this.h = bVarArr;
                return;
            }
            c0 c0Var = c0VarArr[i3];
            if (c0Var == null) {
                uri = null;
            } else {
                y yVar = c0Var.b;
                yVar.getClass();
                uri = yVar.a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.e;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f, aVar.f) && Arrays.equals(this.g, aVar.g) && Arrays.equals(this.h, aVar.h);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        int i2 = (int) 0;
        return (Arrays.hashCode(this.h) + ((((((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + ((i + i2) * 31)) * 31)) * 31)) * 31) + i2) * 961) + Arrays.hashCode(this.g)) * 31)) * 31;
    }
}
