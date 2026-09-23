package net.luminis.quic.send;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Consumer {
    public final /* synthetic */ androidx.emoji2.text.f a;
    public final /* synthetic */ int b;

    public /* synthetic */ c(androidx.emoji2.text.f fVar, int i) {
        this.a = fVar;
        this.b = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((g[]) this.a.b)[androidx.constraintlayout.core.g.e(com.google.android.datatransport.runtime.a.d(this.b))] = null;
    }
}
