package net.luminis.quic.send;

import java.util.function.Consumer;
import java.util.function.Function;
import net.luminis.quic.frame.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements i {
    public int a;
    public Function b;
    public Consumer c;

    @Override // net.luminis.quic.send.i
    public final int a() {
        return this.a;
    }

    @Override // net.luminis.quic.send.i
    public final Consumer b() {
        return this.c;
    }

    @Override // net.luminis.quic.send.i
    public final n c(int i) {
        return (n) this.b.apply(Integer.valueOf(i));
    }
}
