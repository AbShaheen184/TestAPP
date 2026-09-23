package androidx.compose.material3;

import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e4 implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.ui.graphics.n0 A;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ androidx.compose.foundation.interaction.k y;
    public final /* synthetic */ u5 z;

    public e4(boolean z, androidx.compose.foundation.interaction.k kVar, u5 u5Var, androidx.compose.ui.graphics.n0 n0Var) {
        this.e = z;
        this.y = kVar;
        this.z = u5Var;
        this.A = n0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            b4.a.a(this.e, this.y, null, this.z, this.A, 0.0f, 0.0f, sVar, 100663296, Context.VERSION_ES6);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
