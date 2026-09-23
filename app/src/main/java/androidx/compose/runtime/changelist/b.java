package androidx.compose.runtime.changelist;

import androidx.compose.runtime.g2;
import androidx.compose.runtime.q0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final androidx.compose.runtime.s a;
    public a b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final q0 d = new q0();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public b(androidx.compose.runtime.s sVar, a aVar) {
        this.a = sVar;
        this.b = aVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            l0 l0Var = this.b.l;
            l0Var.W(h0.c);
            l0Var.n[l0Var.o - l0Var.l[l0Var.m - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        a aVar = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        aVar.getClass();
        if (size != 0) {
            l0 l0Var2 = aVar.l;
            l0Var2.W(k.c);
            okhttp3.internal.platform.android.g.w(l0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                l0 l0Var = this.b.l;
                l0Var.W(z.c);
                int i3 = l0Var.o - l0Var.l[l0Var.m - 1].a;
                int[] iArr = l0Var.n;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                l0 l0Var2 = this.b.l;
                l0Var2.W(v.c);
                int i6 = l0Var2.o - l0Var2.l[l0Var2.m - 1].a;
                int[] iArr2 = l0Var2.n;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        g2 g2Var = this.a.G;
        int i = z ? g2Var.i : g2Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            androidx.compose.runtime.u.a("Tried to seek backward");
        }
        if (i2 > 0) {
            l0 l0Var = this.b.l;
            l0Var.W(d.c);
            l0Var.n[l0Var.o - l0Var.l[l0Var.m - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                androidx.compose.runtime.u.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
