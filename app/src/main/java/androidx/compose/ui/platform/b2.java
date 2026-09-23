package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends androidx.lifecycle.s0 {
    public final androidx.collection.z b;

    public b2() {
        androidx.collection.z zVar = androidx.collection.o.a;
        this.b = new androidx.collection.z();
    }

    @Override // androidx.lifecycle.s0
    public final void d() {
        androidx.collection.z zVar = this.b;
        int[] iArr = zVar.b;
        Object[] objArr = zVar.c;
        long[] jArr = zVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8;
                int i3 = 8 - ((~(i - length)) >>> 31);
                int i4 = 0;
                while (i4 < i3) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        int i6 = iArr[i5];
                        androidx.collection.j0 j0Var = (androidx.collection.j0) objArr[i5];
                        Object[] objArr2 = j0Var.a;
                        int i7 = j0Var.b;
                        int i8 = 0;
                        while (i8 < i7) {
                            a2 a2Var = (a2) objArr2[i8];
                            int i9 = i2;
                            androidx.compose.runtime.g gVar = a2Var.d;
                            if (gVar != null) {
                                gVar.cancel();
                            }
                            a2Var.d = null;
                            androidx.compose.runtime.retain.c cVar = (androidx.compose.runtime.retain.c) a2Var.a.y;
                            cVar.y = true;
                            cVar.e = false;
                            cVar.a();
                            i8++;
                            i2 = i9;
                        }
                    }
                    int i10 = i2;
                    j >>= i10;
                    i4++;
                    i2 = i10;
                }
                if (i3 != i2) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
