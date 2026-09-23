package androidx.compose.foundation.lazy;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements androidx.compose.foundation.lazy.layout.r {
    public final kotlin.jvm.functions.l a;
    public final kotlin.jvm.functions.l b;
    public final androidx.compose.runtime.internal.f c;

    public h(kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.internal.f fVar) {
        this.a = lVar;
        this.b = lVar2;
        this.c = fVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.r
    public final kotlin.jvm.functions.l a() {
        return this.b;
    }

    @Override // androidx.compose.foundation.lazy.layout.r
    public final kotlin.jvm.functions.l getKey() {
        return this.a;
    }
}
