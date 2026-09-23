package net.luminis.quic.recovery;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final Long a;
    public final net.luminis.quic.packet.g b;
    public final Consumer c;
    public boolean d;
    public boolean e;

    public b(Long l, net.luminis.quic.packet.g gVar, Consumer consumer) {
        this.a = l;
        this.b = gVar;
        this.c = consumer;
    }

    public final synchronized boolean a() {
        return (this.e || this.d) ? false : true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Packet ");
        net.luminis.quic.packet.g gVar = this.b;
        sb.append(com.google.android.datatransport.runtime.a.w(gVar.k()).charAt(0));
        sb.append("|");
        sb.append(gVar.l().longValue() >= 0 ? gVar.l() : ".");
        sb.append("| |");
        sb.append(gVar.n());
        sb.append("|");
        if (this.e) {
            str = "Acked";
        } else {
            str = this.d ? "Lost" : "Inflight";
        }
        sb.append(str);
        return sb.toString();
    }
}
