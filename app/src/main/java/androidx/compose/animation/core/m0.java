package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public final Float a;
    public z b;

    public m0(Float f, z zVar) {
        this.a = f;
        this.b = zVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return m0Var.a.equals(this.a) && kotlin.jvm.internal.l.a(m0Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.d(0, this.a.hashCode() * 31, 31);
    }
}
