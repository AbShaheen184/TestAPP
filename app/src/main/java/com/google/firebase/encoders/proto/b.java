package com.google.firebase.encoders.proto;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends OutputStream {
    public long e;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.e += (long) i2;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.e += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.e++;
    }
}
