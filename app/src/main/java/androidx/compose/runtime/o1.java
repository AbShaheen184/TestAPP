package androidx.compose.runtime;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final androidx.collection.z e;
    public final kotlin.o f;

    public o1(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            p1.a("Invalid start index");
        }
        this.d = new ArrayList();
        androidx.collection.z zVar = new androidx.collection.z();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            u0 u0Var = (u0) this.a.get(i3);
            int i4 = u0Var.c;
            int i5 = u0Var.d;
            zVar.h(i4, new n0(i3, i2, i5));
            i2 += i5;
        }
        this.e = zVar;
        this.f = new kotlin.o(new n1(this, 0));
    }

    public final boolean a(int i, int i2) {
        int i3;
        androidx.collection.z zVar = this.e;
        n0 n0Var = (n0) zVar.b(i);
        if (n0Var == null) {
            return false;
        }
        int i4 = n0Var.b;
        int i5 = i2 - n0Var.c;
        n0Var.c = i2;
        if (i5 == 0) {
            return true;
        }
        Object[] objArr = zVar.c;
        long[] jArr = zVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        n0 n0Var2 = (n0) objArr[(i6 << 3) + i8];
                        if (n0Var2.b >= i4 && !n0Var2.equals(n0Var) && (i3 = n0Var2.b + i5) >= 0) {
                            n0Var2.b = i3;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }
}
