package androidx.compose.ui.focus;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.compose.ui.q implements g {
    public kotlin.jvm.functions.l L;
    public c0 M;

    @Override // androidx.compose.ui.focus.g
    public final void Y(c0 c0Var) {
        if (kotlin.jvm.internal.l.a(this.M, c0Var)) {
            return;
        }
        this.M = c0Var;
        this.L.invoke(c0Var);
    }
}
