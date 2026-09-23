package androidx.compose.ui;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface p extends r {
    @Override // androidx.compose.ui.r
    default Object a(Object obj, kotlin.jvm.functions.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // androidx.compose.ui.r
    default boolean b(kotlin.jvm.functions.l lVar) {
        return ((Boolean) lVar.invoke(this)).booleanValue();
    }
}
