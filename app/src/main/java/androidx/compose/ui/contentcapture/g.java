package androidx.compose.ui.contentcapture;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final int a;
    public final long b;
    public final h c;
    public final com.google.firebase.platforminfo.d d;

    public g(int i, long j, h hVar, com.google.firebase.platforminfo.d dVar) {
        this.a = i;
        this.b = j;
        this.c = hVar;
        this.d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b && this.c == gVar.c && l.a(this.d, gVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        com.google.firebase.platforminfo.d dVar = this.d;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
