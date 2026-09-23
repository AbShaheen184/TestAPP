package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {
    public static final byte[] a;
    public static final ByteBuffer b;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        b = ByteBuffer.wrap(bArr);
        t.f(bArr, 0, 0, false);
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
