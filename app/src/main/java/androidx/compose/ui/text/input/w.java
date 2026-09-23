package androidx.compose.ui.text.input;

import kotlin.collections.i0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements g {
    public final int a;
    public final int b;

    public w(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // androidx.compose.ui.text.input.g
    public final void a(h hVar) {
        int iD = i0.d(this.a, 0, ((androidx.compose.ui.text.android.selection.e) hVar.C).s());
        int iD2 = i0.d(this.b, 0, ((androidx.compose.ui.text.android.selection.e) hVar.C).s());
        if (iD < iD2) {
            hVar.g(iD, iD2);
        } else {
            hVar.g(iD2, iD);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.a == wVar.a && this.b == wVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, this.b, ')');
    }
}
