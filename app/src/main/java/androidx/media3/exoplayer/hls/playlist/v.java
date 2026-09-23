package androidx.media3.exoplayer.hls.playlist;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final androidx.media3.common.r a;
    public final String b;
    public final String c;

    public v(androidx.media3.common.r rVar, String str, String str2) {
        androidx.media3.common.q qVarA = rVar.a();
        qVarA.a = null;
        qVarA.k = null;
        this.a = new androidx.media3.common.r(qVarA);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Objects.equals(this.a, vVar.a) && Objects.equals(this.b, vVar.b) && Objects.equals(this.c, vVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
