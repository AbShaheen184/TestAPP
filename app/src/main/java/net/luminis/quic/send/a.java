package net.luminis.quic.send;

import java.util.function.Consumer;
import net.luminis.quic.frame.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements i {
    public final n a;
    public final Consumer b;

    public a(n nVar, Consumer consumer) {
        this.a = nVar;
        this.b = consumer;
    }

    @Override // net.luminis.quic.send.i
    public final int a() {
        return this.a.d();
    }

    @Override // net.luminis.quic.send.i
    public final Consumer b() {
        return this.b;
    }

    @Override // net.luminis.quic.send.i
    public final n c(int i) {
        return this.a;
    }
}
