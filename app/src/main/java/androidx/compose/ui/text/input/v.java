package androidx.compose.ui.text.input;

import kotlin.collections.i0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements g {
    public final androidx.compose.ui.text.g a;
    public final int b;

    public v(String str, int i) {
        this.a = new androidx.compose.ui.text.g(str);
        this.b = i;
    }

    @Override // androidx.compose.ui.text.input.g
    public final void a(h hVar) {
        int i = hVar.A;
        androidx.compose.ui.text.g gVar = this.a;
        if (i != -1) {
            int i2 = hVar.B;
            String str = gVar.y;
            String str2 = gVar.y;
            hVar.e(i, i2, str);
            if (str2.length() > 0) {
                hVar.f(i, str2.length() + i);
            }
        } else {
            int i3 = hVar.y;
            int i4 = hVar.z;
            String str3 = gVar.y;
            String str4 = gVar.y;
            hVar.e(i3, i4, str3);
            if (str4.length() > 0) {
                hVar.f(i3, str4.length() + i3);
            }
        }
        int i5 = hVar.y;
        int i6 = hVar.z;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.b;
        int iD = i0.d(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - gVar.y.length(), 0, ((androidx.compose.ui.text.android.selection.e) hVar.C).s());
        hVar.g(iD, iD);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.l.a(this.a.y, vVar.a.y) && this.b == vVar.b;
    }

    public final int hashCode() {
        return (this.a.y.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.y);
        sb.append("', newCursorPosition=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, this.b, ')');
    }
}
