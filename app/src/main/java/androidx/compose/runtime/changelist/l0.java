package androidx.compose.runtime.changelist;

import androidx.compose.runtime.k2;
import java.util.Arrays;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends org.jsoup.helper.n {
    public int m;
    public int o;
    public int q;
    public j0[] l = new j0[16];
    public int[] n = new int[16];
    public Object[] p = new Object[16];

    public final void S() {
        this.m = 0;
        this.o = 0;
        Arrays.fill(this.p, 0, this.q, (Object) null);
        this.q = 0;
    }

    public final void T(androidx.compose.runtime.c cVar, k2 k2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        if (V()) {
            androidx.compose.foundation.text.selection.w wVar = new androidx.compose.foundation.text.selection.w(this);
            l0 l0Var = (l0) wVar.e;
            while (true) {
                j0 j0Var = l0Var.l[wVar.b];
                androidx.compose.runtime.a aVarB = j0Var.b(wVar);
                androidx.compose.runtime.c cVar2 = cVar;
                k2 k2Var2 = k2Var;
                androidx.compose.runtime.internal.l lVar2 = lVar;
                k0 k0Var2 = k0Var;
                try {
                    j0Var.a(wVar, cVar2, k2Var2, lVar2, k0Var2);
                    int i = wVar.b;
                    int i2 = l0Var.m;
                    if (i < i2) {
                        j0 j0Var2 = l0Var.l[i];
                        wVar.c += j0Var2.a;
                        wVar.d += j0Var2.b;
                        int i3 = i + 1;
                        wVar.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        cVar = cVar2;
                        k2Var = k2Var2;
                        lVar = lVar2;
                        k0Var = k0Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (k0Var2 == null) {
                        throw th;
                    }
                    coil3.network.g.G(th, new androidx.compose.foundation.gestures.g(6, aVarB, k2Var2, k0Var2));
                    throw th;
                }
            }
        }
        S();
    }

    public final boolean U() {
        return this.m == 0;
    }

    public final boolean V() {
        return this.m != 0;
    }

    public final void W(j0 j0Var) {
        int i = this.m;
        j0[] j0VarArr = this.l;
        int length = j0VarArr.length;
        int i2 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i == length) {
            j0[] j0VarArr2 = new j0[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(j0VarArr, 0, j0VarArr2, 0, i);
            this.l = j0VarArr2;
        }
        int i3 = this.o;
        int i4 = j0Var.a;
        int i5 = j0Var.b;
        int i6 = i3 + i4;
        int[] iArr = this.n;
        int length2 = iArr.length;
        if (i6 > length2) {
            int i7 = (length2 > 1024 ? 1024 : length2) + length2;
            if (i7 >= i6) {
                i6 = i7;
            }
            int[] iArr2 = new int[i6];
            kotlin.collections.o.e(0, 0, length2, iArr, iArr2);
            this.n = iArr2;
        }
        int i8 = this.q + i5;
        Object[] objArr = this.p;
        int length3 = objArr.length;
        if (i8 > length3) {
            if (length3 <= 1024) {
                i2 = length3;
            }
            int i9 = i2 + length3;
            if (i9 >= i8) {
                i8 = i9;
            }
            Object[] objArr2 = new Object[i8];
            System.arraycopy(objArr, 0, objArr2, 0, length3);
            this.p = objArr2;
        }
        j0[] j0VarArr3 = this.l;
        int i10 = this.m;
        this.m = i10 + 1;
        j0VarArr3[i10] = j0Var;
        this.o += j0Var.a;
        this.q += i5;
    }
}
