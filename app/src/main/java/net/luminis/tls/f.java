package net.luminis.tls;

import com.app.mlounge.emulator.LibretroCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public enum f {
    secp256r1(23),
    secp384r1(24),
    secp521r1(25),
    x25519(29),
    x448(30),
    /* JADX INFO: Fake field, exist only in values array */
    ffdhe2048(LibretroCore.SCREEN_WIDTH),
    /* JADX INFO: Fake field, exist only in values array */
    ffdhe3072(257),
    /* JADX INFO: Fake field, exist only in values array */
    ffdhe4096(258),
    /* JADX INFO: Fake field, exist only in values array */
    ffdhe6144(259),
    /* JADX INFO: Fake field, exist only in values array */
    ffdhe8192(260);

    public final short e;

    f(int i) {
        this.e = (short) i;
    }
}
