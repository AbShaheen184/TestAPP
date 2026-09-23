package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends r1 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public d0(kotlin.jvm.functions.l lVar) {
        super(new c0(0));
        this.c = new e0(lVar);
    }

    @Override // androidx.compose.runtime.r1
    public final androidx.appcompat.widget.r a(Object obj) {
        switch (this.b) {
            case 0:
                return new androidx.appcompat.widget.r(this, obj, obj == null, null, true);
            default:
                return new androidx.appcompat.widget.r(this, obj, obj == null, (f) this.c, true);
        }
    }

    @Override // androidx.compose.runtime.r1
    public z2 b() {
        switch (this.b) {
            case 0:
                return (e0) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(kotlin.jvm.functions.a aVar) {
        super(aVar);
        f fVar = f.D;
        this.c = fVar;
    }
}
