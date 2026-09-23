package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends androidx.compose.ui.q implements androidx.compose.ui.node.w {
    public kotlin.jvm.functions.q L;

    @Override // androidx.compose.ui.node.w
    public final r0 c(s0 s0Var, p0 p0Var, long j) {
        return (r0) this.L.invoke(s0Var, p0Var, new androidx.compose.ui.unit.a(j));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.L + ')';
    }
}
