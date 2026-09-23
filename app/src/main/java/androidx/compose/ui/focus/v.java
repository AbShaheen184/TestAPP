package androidx.compose.ui.focus;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements kotlin.jvm.internal.g {
    public final /* synthetic */ kotlin.jvm.functions.l e;

    public v(kotlin.jvm.functions.l lVar) {
        this.e = lVar;
    }

    @Override // kotlin.jvm.internal.g
    public final kotlin.d b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.e, ((kotlin.jvm.internal.g) obj).b());
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
