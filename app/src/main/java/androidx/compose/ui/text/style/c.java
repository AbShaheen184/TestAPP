package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.t;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o {
    public final long a;

    public c(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        androidx.compose.ui.text.internal.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // androidx.compose.ui.text.style.o
    public final float a() {
        return t.d(this.a);
    }

    @Override // androidx.compose.ui.text.style.o
    public final long b() {
        return this.a;
    }

    @Override // androidx.compose.ui.text.style.o
    public final androidx.compose.ui.graphics.p c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && t.c(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        int i = t.j;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) t.i(this.a)) + ')';
    }
}
