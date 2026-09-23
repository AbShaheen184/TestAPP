package net.luminis.tls.handshake;

import net.luminis.tls.h;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e {
    public h a;
    public byte[] b;
    public byte[] c;

    @Override // net.luminis.tls.handshake.e
    public final byte[] a() {
        return this.c;
    }

    @Override // net.luminis.tls.handshake.e
    public final net.luminis.tls.e b() {
        return net.luminis.tls.e.certificate_verify;
    }
}
