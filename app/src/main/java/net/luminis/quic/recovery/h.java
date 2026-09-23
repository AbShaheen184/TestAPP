package net.luminis.quic.recovery;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final net.luminis.quic.log.a a;
    public volatile int f;
    public volatile int c = Integer.MAX_VALUE;
    public volatile int d = -1;
    public volatile int e = -1;
    public volatile int b = 500;
    public volatile int g = 25;

    public h(net.luminis.quic.log.a aVar) {
        this.a = aVar;
    }

    public final int a() {
        return this.e == -1 ? this.b / 4 : this.e;
    }

    public final int b() {
        return this.d == -1 ? this.b : this.d;
    }
}
