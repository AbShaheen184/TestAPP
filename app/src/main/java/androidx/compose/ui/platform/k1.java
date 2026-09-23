package androidx.compose.ui.platform;

import com.app.mlounge.MainActivity;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends a {
    public final androidx.compose.runtime.j1 F;
    public boolean G;

    public k1(MainActivity mainActivity) {
        super(mainActivity);
        this.F = androidx.compose.runtime.t.r(null);
    }

    @Override // androidx.compose.ui.platform.a
    public final void a(int i, androidx.compose.runtime.s sVar) {
        sVar.c0(420213850);
        int i2 = (sVar.h(this) ? 4 : 2) | i;
        if (sVar.T(i2 & 1, (i2 & 3) != 2)) {
            kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) this.F.getValue();
            if (pVar == null) {
                sVar.b0(-1238823553);
            } else {
                sVar.b0(98585282);
                pVar.invoke(sVar, 0);
            }
            sVar.p(false);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.animation.f(this, i, 4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return k1.class.getName();
    }

    @Override // androidx.compose.ui.platform.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.G;
    }

    public final void setContent(kotlin.jvm.functions.p pVar) {
        this.G = true;
        this.F.setValue(pVar);
        if (isAttachedToWindow()) {
            c();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
