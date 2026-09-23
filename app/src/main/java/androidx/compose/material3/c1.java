package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    public static final c1 a = new c1();

    public final void a(com.google.firebase.messaging.n nVar, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        sVar.c0(1565826668);
        int i2 = (sVar.f(nVar) ? 4 : 2) | i;
        if (sVar.T(i2 & 1, (i2 & 3) != 2)) {
            sVar2 = sVar;
            com.google.firebase.crashlytics.internal.model.t1.a((kotlin.jvm.functions.a) nVar.y, (androidx.compose.ui.window.w) nVar.A, androidx.compose.runtime.internal.k.c(1163527043, new b1(nVar, 0), sVar), sVar2, 384, 0);
        } else {
            sVar2 = sVar;
            sVar2.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.f(this, nVar, i, 10);
        }
    }
}
