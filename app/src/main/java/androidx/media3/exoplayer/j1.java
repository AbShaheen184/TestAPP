package androidx.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    public static final j1 b;
    public final com.google.common.collect.k0 a;

    static {
        com.google.firebase.platforminfo.d dVar = new com.google.firebase.platforminfo.d();
        dVar.e = com.google.common.collect.k0.k(2, 1, 5);
        b = new j1(dVar);
    }

    public j1(com.google.firebase.platforminfo.d dVar) {
        this.a = (com.google.common.collect.k0) dVar.e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j1) && this.a.equals(((j1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
