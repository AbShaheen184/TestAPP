package net.luminis.tls.engine.impl;

import androidx.emoji2.text.r;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.XECPublicKey;
import javax.crypto.KeyAgreement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements net.luminis.tls.a {
    public static final Charset u = Charset.forName("ISO-8859-1");
    public static final String v = "tls13 ";
    public final MessageDigest a;
    public final androidx.media3.exoplayer.hls.c b;
    public final byte[] c;
    public final short d;
    public final short e;
    public boolean f;
    public PublicKey g;
    public PrivateKey h;
    public final byte[] i;
    public byte[] j;
    public byte[] k;
    public byte[] l;
    public byte[] m;
    public byte[] n;
    public byte[] o;
    public byte[] p;
    public byte[] q;
    public final e r;
    public byte[] s;
    public byte[] t;

    /* JADX WARN: Multi-variable type inference failed */
    public c(e eVar, byte[] bArr, int i, int i2) {
        this.i = bArr;
        this.r = eVar;
        this.d = (short) i;
        int i3 = (short) i2;
        this.e = i3;
        StringBuilder sb = new StringBuilder("SHA-");
        int i4 = i3 * 8;
        sb.append(i4);
        String string = sb.toString();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(string);
            this.a = messageDigest;
            this.b = new androidx.media3.exoplayer.hls.c(new r(androidx.privacysandbox.ads.adservices.java.internal.a.n(i4, "HmacSHA"), false), 14);
            byte[] bArrDigest = messageDigest.digest(new byte[0]);
            this.c = bArrDigest;
            net.luminis.tls.util.a.a(bArrDigest);
            a(bArr == null ? new byte[i3] : bArr);
        } catch (NoSuchAlgorithmException unused) {
            org.mozilla.javascript.c.b(androidx.privacysandbox.ads.adservices.java.internal.a.r("Missing ", string, " support"));
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(byte[] bArr) {
        int i = this.e;
        byte[] bArrX = this.b.x(new byte[i], bArr);
        this.j = bArrX;
        net.luminis.tls.util.a.a(bArrX);
        byte[] bArrC = c(this.j, "res binder", this.c, i);
        this.k = bArrC;
        net.luminis.tls.util.a.a(bArrC);
    }

    public final void b() {
        KeyAgreement keyAgreement;
        try {
            PublicKey publicKey = this.g;
            if (publicKey instanceof ECPublicKey) {
                keyAgreement = KeyAgreement.getInstance("ECDH");
            } else {
                if (!(publicKey instanceof XECPublicKey)) {
                    throw new RuntimeException("Unsupported key type");
                }
                keyAgreement = KeyAgreement.getInstance("XDH");
            }
            keyAgreement.init(this.h);
            keyAgreement.doPhase(this.g, true);
            byte[] bArrGenerateSecret = keyAgreement.generateSecret();
            this.s = bArrGenerateSecret;
            net.luminis.tls.util.a.a(bArrGenerateSecret);
        } catch (InvalidKeyException e) {
            e = e;
            com.google.firebase.platforminfo.b.p(e, "Unsupported crypto: ");
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            com.google.firebase.platforminfo.b.p(e, "Unsupported crypto: ");
        }
    }

    public final byte[] c(byte[] bArr, String str, byte[] bArr2, short s) {
        String str2 = v;
        int length = str2.length() + 3;
        Charset charset = u;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + str.getBytes(charset).length + 1 + bArr2.length);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.put((byte) (str2.length() + str.getBytes().length));
        byteBufferAllocate.put(str2.getBytes(charset));
        byteBufferAllocate.put(str.getBytes(charset));
        byteBufferAllocate.put((byte) bArr2.length);
        byteBufferAllocate.put(bArr2);
        return this.b.w(bArr, byteBufferAllocate.array(), s);
    }
}
