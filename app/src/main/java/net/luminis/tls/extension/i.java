package net.luminis.tls.extension;

import java.security.PublicKey;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class i {
    public net.luminis.tls.f a;
    public final PublicKey b;

    public i(net.luminis.tls.f fVar, PublicKey publicKey) {
        this.a = fVar;
        this.b = publicKey;
    }

    public PublicKey a() {
        return this.b;
    }
}
