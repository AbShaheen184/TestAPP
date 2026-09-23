package androidx.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements a0 {
    public final androidx.compose.ui.input.pointer.util.c a;
    public final androidx.compose.ui.input.pointer.util.c b;
    public long c;

    public x(long j, long[] jArr, long[] jArr2) {
        _COROUTINE.a.o(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new androidx.compose.ui.input.pointer.util.c(length, 1);
            this.b = new androidx.compose.ui.input.pointer.util.c(length, 1);
        } else {
            int i = length + 1;
            androidx.compose.ui.input.pointer.util.c cVar = new androidx.compose.ui.input.pointer.util.c(i, 1);
            this.a = cVar;
            androidx.compose.ui.input.pointer.util.c cVar2 = new androidx.compose.ui.input.pointer.util.c(i, 1);
            this.b = cVar2;
            cVar.a(0L);
            cVar2.a(0L);
        }
        this.a.b(jArr);
        this.b.b(jArr2);
        this.c = j;
    }

    @Override // androidx.media3.extractor.a0
    public final boolean c() {
        return this.b.b > 0;
    }

    @Override // androidx.media3.extractor.a0
    public final z e(long j) {
        androidx.compose.ui.input.pointer.util.c cVar = this.b;
        if (cVar.b == 0) {
            b0 b0Var = b0.c;
            return new z(b0Var, b0Var);
        }
        int iC = androidx.media3.common.util.i0.c(cVar, j);
        long jD = cVar.d(iC);
        androidx.compose.ui.input.pointer.util.c cVar2 = this.a;
        b0 b0Var2 = new b0(jD, cVar2.d(iC));
        if (jD == j || iC == cVar.b - 1) {
            return new z(b0Var2, b0Var2);
        }
        int i = iC + 1;
        return new z(b0Var2, new b0(cVar.d(i), cVar2.d(i)));
    }

    @Override // androidx.media3.extractor.a0
    public final long g() {
        return this.c;
    }
}
