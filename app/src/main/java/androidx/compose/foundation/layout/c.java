package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g {
    public final /* synthetic */ int a = 1;

    @Override // androidx.compose.foundation.layout.g
    public final void b(int i, androidx.compose.ui.layout.s0 s0Var, int[] iArr, int[] iArr2) {
        switch (this.a) {
            case 0:
                h.c(i, iArr, iArr2, false);
                break;
            default:
                h.b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
