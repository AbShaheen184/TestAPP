package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {
    public final androidx.compose.foundation.text.input.internal.o a;
    public m0 b;
    public final l1 c = new l1(this, 2);
    public final l1 d = new l1(this, 0);
    public final l1 e = new l1(this, 1);

    public m1(androidx.compose.foundation.text.input.internal.o oVar) {
        this.a = oVar;
    }

    public final m0 a() {
        m0 m0Var = this.b;
        if (m0Var != null) {
            return m0Var;
        }
        kotlinx.coroutines.future.a.q("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
