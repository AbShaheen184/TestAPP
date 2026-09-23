package net.luminis.tls.extension;

import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i {
    public final ECPublicKey c;

    public h(net.luminis.tls.f fVar, ECPublicKey eCPublicKey) {
        super(fVar, eCPublicKey);
        this.a = fVar;
        this.c = eCPublicKey;
    }

    @Override // net.luminis.tls.extension.i
    public final PublicKey a() {
        return this.c;
    }
}
