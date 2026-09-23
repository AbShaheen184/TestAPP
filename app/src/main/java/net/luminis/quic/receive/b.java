package net.luminis.quic.receive;

import androidx.work.p;
import com.appsalt.internal.y0;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public volatile DatagramSocket a;
    public final net.luminis.quic.log.a b;
    public final y0 c;
    public final net.luminis.quic.ack.a d;
    public final Thread e;
    public final LinkedBlockingQueue f;
    public volatile boolean g = false;

    public b(DatagramSocket datagramSocket, net.luminis.quic.log.a aVar, y0 y0Var, net.luminis.quic.ack.a aVar2) {
        this.a = datagramSocket;
        Objects.requireNonNull(aVar);
        this.b = aVar;
        this.c = y0Var;
        this.d = aVar2;
        Thread thread = new Thread(new p(this, 13), "receiver");
        this.e = thread;
        thread.setDaemon(true);
        this.f = new LinkedBlockingQueue();
        try {
            datagramSocket.getReceiveBufferSize();
        } catch (SocketException unused) {
        }
    }
}
