package androidx.compose.ui.text.input;

import kotlin.collections.i0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements g {
    public final int a;
    public final int b;

    public u(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // androidx.compose.ui.text.input.g
    public final void a(h hVar) {
        boolean z = hVar.A != -1;
        androidx.compose.ui.text.android.selection.e eVar = (androidx.compose.ui.text.android.selection.e) hVar.C;
        if (z) {
            hVar.A = -1;
            hVar.B = -1;
        }
        int iD = i0.d(this.a, 0, eVar.s());
        int iD2 = i0.d(this.b, 0, eVar.s());
        if (iD != iD2) {
            if (iD < iD2) {
                hVar.f(iD, iD2);
            } else {
                hVar.f(iD2, iD);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && this.b == uVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, this.b, ')');
    }
}
