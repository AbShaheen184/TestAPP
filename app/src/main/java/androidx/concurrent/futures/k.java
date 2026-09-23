package androidx.concurrent.futures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends h {
    public final /* synthetic */ l E;

    public k(l lVar) {
        this.E = lVar;
    }

    @Override // androidx.concurrent.futures.h
    public final String j() {
        i iVar = (i) this.E.e.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.a + "]";
    }
}
