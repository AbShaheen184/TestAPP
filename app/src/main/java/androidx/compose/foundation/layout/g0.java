package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements u1 {
    public final int a;

    public g0(int i) {
        this.a = i;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int a(androidx.compose.ui.unit.c cVar) {
        return this.a;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int b(androidx.compose.ui.unit.c cVar, androidx.compose.ui.unit.m mVar) {
        return 0;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int c(androidx.compose.ui.unit.c cVar) {
        return 0;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int d(androidx.compose.ui.unit.c cVar, androidx.compose.ui.unit.m mVar) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && this.a == ((g0) obj).a;
    }

    public final int hashCode() {
        return this.a * 961;
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.o(this.a, ", right=0, bottom=0)", new StringBuilder("Insets(left=0, top="));
    }
}
