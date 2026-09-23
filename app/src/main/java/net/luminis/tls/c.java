package net.luminis.tls;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public enum c {
    TLS_AES_128_GCM_SHA256(4865),
    TLS_AES_256_GCM_SHA384(4866),
    TLS_CHACHA20_POLY1305_SHA256(4867),
    /* JADX INFO: Fake field, exist only in values array */
    TLS_AES_128_CCM_SHA256(4868),
    /* JADX INFO: Fake field, exist only in values array */
    TLS_AES_128_CCM_8_SHA256(4869);

    public final short e;

    c(int i) {
        this.e = (short) i;
    }
}
