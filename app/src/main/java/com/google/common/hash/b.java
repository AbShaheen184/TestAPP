package com.google.common.hash;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final char[] e = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof b) {
            byte[] bArr = ((a) this).y;
            int length = bArr.length * 8;
            byte[] bArr2 = ((a) ((b) obj)).y;
            if (length == bArr2.length * 8) {
                if (bArr.length != bArr2.length) {
                    z = false;
                } else {
                    z = true;
                    for (int i = 0; i < bArr.length; i++) {
                        z &= bArr[i] == bArr2[i];
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((a) this).y;
        if (bArr.length * 8 < 32) {
            int i = bArr[0] & 255;
            for (int i2 = 1; i2 < bArr.length; i2++) {
                i |= (bArr[i2] & 255) << (i2 * 8);
            }
            return i;
        }
        boolean z = bArr.length >= 4;
        int length = bArr.length;
        if (z) {
            return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        }
        kotlinx.coroutines.future.a.u(_COROUTINE.b.B("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        return 0;
    }

    public final String toString() {
        byte[] bArr = ((a) this).y;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = e;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
