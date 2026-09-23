package androidx.compose.ui.text.platform;

import androidx.compose.runtime.j1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.emoji2.text.h {
    public final /* synthetic */ j1 e;
    public final /* synthetic */ com.google.firebase.platforminfo.d y;

    public h(j1 j1Var, com.google.firebase.platforminfo.d dVar) {
        this.e = j1Var;
        this.y = dVar;
    }

    @Override // androidx.emoji2.text.h
    public final void a() {
        this.y.e = k.a;
    }

    @Override // androidx.emoji2.text.h
    public final void b() {
        this.e.setValue(Boolean.TRUE);
        this.y.e = new l(true);
    }
}
