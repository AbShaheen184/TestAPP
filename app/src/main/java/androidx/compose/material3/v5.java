package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v5 implements androidx.compose.ui.graphics.u, kotlin.jvm.internal.g {
    public final /* synthetic */ androidx.compose.foundation.lazy.n e;

    public v5(androidx.compose.foundation.lazy.n nVar) {
        this.e = nVar;
    }

    @Override // androidx.compose.ui.graphics.u
    public final /* synthetic */ long a() {
        return ((androidx.compose.ui.graphics.t) this.e.invoke()).a;
    }

    @Override // kotlin.jvm.internal.g
    public final kotlin.d b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof androidx.compose.ui.graphics.u) || !(obj instanceof kotlin.jvm.internal.g)) {
            return false;
        }
        return this.e.equals(((kotlin.jvm.internal.g) obj).b());
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
