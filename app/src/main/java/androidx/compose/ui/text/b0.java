package androidx.compose.ui.text;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements androidx.compose.runtime.saveable.k {
    public final /* synthetic */ kotlin.jvm.functions.p e;
    public final /* synthetic */ kotlin.jvm.functions.l y;

    public b0(kotlin.jvm.functions.p pVar, kotlin.jvm.functions.l lVar) {
        this.e = pVar;
        this.y = lVar;
    }

    @Override // androidx.compose.runtime.saveable.k
    public final Object a(androidx.compose.runtime.saveable.c cVar, Object obj) {
        return this.e.invoke(cVar, obj);
    }

    @Override // androidx.compose.runtime.saveable.k
    public final Object b(Object obj) {
        return this.y.invoke(obj);
    }
}
