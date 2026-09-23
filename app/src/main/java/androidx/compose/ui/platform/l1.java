package androidx.compose.ui.platform;

import com.app.mlounge.emulator.LibretroCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l1 {
    public static final androidx.compose.runtime.x2 a = new androidx.compose.runtime.x2(j0.F);
    public static final androidx.compose.runtime.x2 b = new androidx.compose.runtime.x2(j0.G);
    public static final androidx.compose.runtime.x2 c = new androidx.compose.runtime.x2(j0.I);
    public static final androidx.compose.runtime.x2 d = new androidx.compose.runtime.x2(j0.H);
    public static final androidx.compose.runtime.x2 e = new androidx.compose.runtime.x2(j0.K);
    public static final androidx.compose.runtime.x2 f = new androidx.compose.runtime.x2(j0.J);
    public static final androidx.compose.runtime.x2 g = new androidx.compose.runtime.x2(j0.Q);
    public static final androidx.compose.runtime.x2 h = new androidx.compose.runtime.x2(j0.M);
    public static final androidx.compose.runtime.x2 i = new androidx.compose.runtime.x2(j0.N);
    public static final androidx.compose.runtime.x2 j = new androidx.compose.runtime.x2(j0.P);
    public static final androidx.compose.runtime.x2 k = new androidx.compose.runtime.x2(j0.O);
    public static final androidx.compose.runtime.x2 l = new androidx.compose.runtime.x2(j0.R);
    public static final androidx.compose.runtime.x2 m = new androidx.compose.runtime.x2(j0.S);
    public static final androidx.compose.runtime.x2 n = new androidx.compose.runtime.x2(j0.T);
    public static final androidx.compose.runtime.x2 o = new androidx.compose.runtime.x2(j0.X);
    public static final androidx.compose.runtime.x2 p = new androidx.compose.runtime.x2(j0.W);
    public static final androidx.compose.runtime.x2 q = new androidx.compose.runtime.x2(j0.Y);
    public static final androidx.compose.runtime.x2 r = new androidx.compose.runtime.x2(j0.Z);
    public static final androidx.compose.runtime.x2 s = new androidx.compose.runtime.x2(j0.a0);
    public static final androidx.compose.runtime.x2 t = new androidx.compose.runtime.x2(j0.b0);
    public static final androidx.compose.runtime.x2 u = new androidx.compose.runtime.x2(j0.U);
    public static final androidx.compose.runtime.d0 v = new androidx.compose.runtime.d0(j0.V);
    public static final androidx.compose.runtime.x2 w = new androidx.compose.runtime.x2(j0.L);

    public static final void a(androidx.compose.ui.node.m1 m1Var, u0 u0Var, kotlin.jvm.functions.p pVar, androidx.compose.runtime.s sVar, int i2) {
        sVar.c0(1925803616);
        int i3 = i2 | (sVar.f(m1Var) ? 4 : 2) | (sVar.f(u0Var) ? 32 : 16) | (sVar.h(pVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            u uVar = (u) m1Var;
            androidx.appcompat.widget.r rVarA = a.a(uVar.getAccessibilityManager());
            androidx.appcompat.widget.r rVarA2 = b.a(uVar.getAutofill());
            androidx.appcompat.widget.r rVarA3 = d.a(uVar.getAutofillManager());
            androidx.appcompat.widget.r rVarA4 = c.a(uVar.getAutofillTree());
            androidx.appcompat.widget.r rVarA5 = e.a(uVar.getClipboardManager());
            androidx.appcompat.widget.r rVarA6 = f.a(uVar.getClipboard());
            androidx.appcompat.widget.r rVarA7 = h.a(uVar.getDensity());
            androidx.appcompat.widget.r rVarA8 = i.a(uVar.getFocusOwner());
            androidx.appcompat.widget.r rVarA9 = j.a(uVar.getFontLoader());
            rVarA9.c = false;
            androidx.appcompat.widget.r rVarA10 = k.a(uVar.getFontFamilyResolver());
            rVarA10.c = false;
            androidx.compose.runtime.t.b(new androidx.appcompat.widget.r[]{rVarA, rVarA2, rVarA3, rVarA4, rVarA5, rVarA6, rVarA7, rVarA8, rVarA9, rVarA10, l.a(uVar.getHapticFeedBack()), m.a(uVar.getInputModeManager()), n.a(uVar.getLayoutDirection()), o.a(uVar.getTextInputService()), p.a(uVar.getSoftwareKeyboardController()), q.a(uVar.getTextToolbar()), r.a(u0Var), s.a(uVar.getViewConfiguration()), t.a(uVar.getWindowInfo()), u.a(uVar.getPointerIconService()), g.a(uVar.getGraphicsContext()), androidx.compose.runtime.retain.b.a.a(uVar.getRetainedValuesStore())}, pVar, sVar, ((i3 >> 3) & Token.ASSIGN_MOD) | 8);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.ui.layout.i1(m1Var, u0Var, pVar, i2, 2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
