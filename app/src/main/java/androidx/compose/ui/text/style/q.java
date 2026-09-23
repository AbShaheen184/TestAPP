package androidx.compose.ui.text.style;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final q c = new q(coil3.svg.internal.a.x(0), coil3.svg.internal.a.x(0));
    public final long a;
    public final long b;

    public q(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return androidx.compose.ui.unit.o.a(this.a, qVar.a) && androidx.compose.ui.unit.o.a(this.b, qVar.b);
    }

    public final int hashCode() {
        androidx.compose.ui.unit.p[] pVarArr = androidx.compose.ui.unit.o.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) androidx.compose.ui.unit.o.d(this.a)) + ", restLine=" + ((Object) androidx.compose.ui.unit.o.d(this.b)) + ')';
    }
}
