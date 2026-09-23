package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.j1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public final Object a;
    public final j0 b;
    public int d;
    public h0 e;
    public boolean f;
    public int c = -1;
    public final j1 g = androidx.compose.runtime.t.r(null);

    public h0(Object obj, j0 j0Var) {
        this.a = obj;
        this.b = j0Var;
    }

    public final h0 a() {
        if (this.f) {
            androidx.compose.foundation.internal.b.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.e.add(this);
            h0 h0Var = (h0) this.g.getValue();
            if (h0Var != null) {
                h0Var.a();
            } else {
                h0Var = null;
            }
            this.e = h0Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            androidx.compose.foundation.internal.b.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.e.remove(this);
            h0 h0Var = this.e;
            if (h0Var != null) {
                h0Var.b();
            }
            this.e = null;
        }
    }
}
