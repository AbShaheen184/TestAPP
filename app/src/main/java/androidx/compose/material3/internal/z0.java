package androidx.compose.material3.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z0 implements kotlin.jvm.internal.g {
    public final /* synthetic */ kotlin.jvm.internal.r e;

    public z0(kotlin.jvm.internal.r rVar) {
        this.e = rVar;
    }

    public final float a() {
        return ((Number) this.e.invoke()).floatValue();
    }

    @Override // kotlin.jvm.internal.g
    public final kotlin.d b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0)) {
            return false;
        }
        return this.e.equals(((kotlin.jvm.internal.g) obj).b());
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
