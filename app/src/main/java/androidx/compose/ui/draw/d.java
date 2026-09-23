package androidx.compose.ui.draw;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements androidx.compose.ui.unit.c {
    public a e = m.e;
    public i y;

    @Override // androidx.compose.ui.unit.c
    public final float U() {
        return this.e.a().U();
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.e.a().a();
    }

    public final i b(kotlin.jvm.functions.l lVar) {
        i iVar = new i();
        iVar.a = lVar;
        this.y = iVar;
        return iVar;
    }
}
