package kotlin.coroutines;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements i {
    private final kotlin.jvm.functions.l safeCast;
    private final i topmostKey;

    public b(i iVar, kotlin.jvm.functions.l lVar) {
        iVar.getClass();
        this.safeCast = lVar;
        this.topmostKey = iVar instanceof b ? ((b) iVar).topmostKey : iVar;
    }

    public final boolean isSubKey$kotlin_stdlib(i iVar) {
        iVar.getClass();
        return iVar == this || this.topmostKey == iVar;
    }

    public final Object tryCast$kotlin_stdlib(h hVar) {
        hVar.getClass();
        return (h) this.safeCast.invoke(hVar);
    }
}
