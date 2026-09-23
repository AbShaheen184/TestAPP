package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.o1;
import androidx.compose.ui.layout.r0;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements r0 {
    public final t a;
    public final int b;
    public final boolean c;
    public final float d;
    public final r0 e;
    public final float f;
    public final boolean g;
    public final CoroutineScope h;
    public final androidx.compose.ui.unit.c i;
    public final long j;
    public final Object k;
    public final int l;
    public final int m;
    public final int n;
    public final o1 o;
    public final int p;
    public final int q;

    public s(t tVar, int i, boolean z, float f, r0 r0Var, float f2, boolean z2, CoroutineScope coroutineScope, androidx.compose.ui.unit.c cVar, long j, List list, int i2, int i3, int i4, o1 o1Var, int i5, int i6) {
        this.a = tVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = r0Var;
        this.f = f2;
        this.g = z2;
        this.h = coroutineScope;
        this.i = cVar;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = o1Var;
        this.p = i5;
        this.q = i6;
    }

    @Override // androidx.compose.ui.layout.r0
    public final int a() {
        return this.e.a();
    }

    @Override // androidx.compose.ui.layout.r0
    public final int b() {
        return this.e.b();
    }

    @Override // androidx.compose.ui.layout.r0
    public final Map c() {
        return this.e.c();
    }

    @Override // androidx.compose.ui.layout.r0
    public final void d() {
        this.e.d();
    }

    @Override // androidx.compose.ui.layout.r0
    public final kotlin.jvm.functions.l e() {
        return this.e.e();
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final s f(int i, boolean z) {
        t tVar;
        if (this.g) {
            return null;
        }
        ?? r15 = this.k;
        if (r15.isEmpty() || (tVar = this.a) == null) {
            return null;
        }
        int i2 = tVar.n;
        int i3 = this.b - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        t tVar2 = (t) kotlin.collections.p.B(r15);
        t tVar3 = (t) kotlin.collections.p.J(r15);
        if (tVar2.p || tVar3.p) {
            return null;
        }
        int i4 = tVar2.l;
        int i5 = this.m;
        int i6 = this.l;
        if (i < 0) {
            if (Math.min((i4 + tVar2.n) - i6, (tVar3.l + tVar3.n) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - tVar3.l) <= i) {
            return null;
        }
        int size = r15.size();
        for (int i7 = 0; i7 < size; i7++) {
            t tVar4 = (t) r15.get(i7);
            boolean z2 = tVar4.c;
            int[] iArr = tVar4.r;
            if (!tVar4.p) {
                tVar4.l += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    int i9 = i8 & 1;
                    if ((z2 && i9 != 0) || (!z2 && i9 == 0)) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = tVar4.b.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        tVar4.k.a(i10, tVar4.i);
                    }
                }
            }
        }
        return new s(this.a, i3, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, r15, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    public final long g() {
        r0 r0Var = this.e;
        return (((long) r0Var.b()) << 32) | (((long) r0Var.a()) & 4294967295L);
    }
}
