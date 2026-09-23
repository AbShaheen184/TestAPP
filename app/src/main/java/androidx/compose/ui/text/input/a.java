package androidx.compose.ui.text.input;

import kotlin.collections.i0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g {
    public final androidx.compose.ui.text.g a;
    public final int b;

    public a(String str, int i) {
        this(new androidx.compose.ui.text.g(str), i);
    }

    @Override // androidx.compose.ui.text.input.g
    public final void a(h hVar) {
        int i = hVar.A;
        androidx.compose.ui.text.g gVar = this.a;
        if (i != -1) {
            hVar.e(i, hVar.B, gVar.y);
        } else {
            hVar.e(hVar.y, hVar.z, gVar.y);
        }
        int i2 = hVar.y;
        int i3 = hVar.z;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int iD = i0.d(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - gVar.y.length(), 0, ((androidx.compose.ui.text.android.selection.e) hVar.C).s());
        hVar.g(iD, iD);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.l.a(this.a.y, aVar.a.y) && this.b == aVar.b;
    }

    public final int hashCode() {
        return (this.a.y.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.y);
        sb.append("', newCursorPosition=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, this.b, ')');
    }

    public a(androidx.compose.ui.text.g gVar, int i) {
        this.a = gVar;
        this.b = i;
    }
}
