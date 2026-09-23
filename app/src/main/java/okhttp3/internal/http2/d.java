package okhttp3.internal.http2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final okio.i d;
    public static final okio.i e;
    public static final okio.i f;
    public static final okio.i g;
    public static final okio.i h;
    public static final okio.i i;
    public final okio.i a;
    public final okio.i b;
    public final int c;

    static {
        okio.i iVar = okio.i.A;
        d = com.google.android.gms.measurement.internal.a0.g(":");
        e = com.google.android.gms.measurement.internal.a0.g(":status");
        f = com.google.android.gms.measurement.internal.a0.g(":method");
        g = com.google.android.gms.measurement.internal.a0.g(":path");
        h = com.google.android.gms.measurement.internal.a0.g(":scheme");
        i = com.google.android.gms.measurement.internal.a0.g(":authority");
    }

    public d(okio.i iVar, okio.i iVar2) {
        iVar.getClass();
        iVar2.getClass();
        this.a = iVar;
        this.b = iVar2;
        this.c = iVar2.f() + iVar.f() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.l.a(this.a, dVar.a) && kotlin.jvm.internal.l.a(this.b, dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.u() + ": " + this.b.u();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        this(com.google.android.gms.measurement.internal.a0.g(str), com.google.android.gms.measurement.internal.a0.g(str2));
        okio.i iVar = okio.i.A;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(okio.i iVar, String str) {
        this(iVar, com.google.android.gms.measurement.internal.a0.g(str));
        iVar.getClass();
        str.getClass();
        okio.i iVar2 = okio.i.A;
    }
}
