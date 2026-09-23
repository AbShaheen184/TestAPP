package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.l1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends f {
    @Override // androidx.compose.ui.input.pointer.f
    public final void N0(s sVar) {
        t tVar = (t) androidx.compose.ui.node.l.h(this, l1.u);
        if (tVar != null) {
            ((androidx.compose.ui.platform.r) tVar).a = sVar;
        }
    }

    @Override // androidx.compose.ui.input.pointer.f
    public final boolean P0(int i) {
        return i == 3 || i == 4;
    }

    @Override // androidx.compose.ui.node.z1
    public final /* bridge */ /* synthetic */ Object i() {
        return "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }
}
