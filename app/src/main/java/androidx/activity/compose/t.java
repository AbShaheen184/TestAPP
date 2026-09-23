package androidx.activity.compose;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends androidx.activity.result.c {
    public final a a;

    public t(a aVar) {
        this.a = aVar;
    }

    @Override // androidx.activity.result.c
    public final void a(Object obj) throws Exception {
        androidx.activity.result.g gVar = this.a.a;
        if (gVar != null) {
            gVar.a(obj);
        } else {
            kotlinx.coroutines.future.a.u("Launcher has not been initialized");
        }
    }
}
