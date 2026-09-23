package com.google.common.io;

import com.app.mlounge.emulator.LibretroCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d {
    public final char[] f;

    public b(a aVar) {
        super(aVar, (Character) null);
        this.f = new char[512];
        char[] cArr = aVar.b;
        _COROUTINE.a.o(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | LibretroCore.SCREEN_WIDTH] = cArr[i & 15];
        }
    }

    @Override // com.google.common.io.d
    public final void c(StringBuilder sb, byte[] bArr, int i) {
        _COROUTINE.a.x(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | LibretroCore.SCREEN_WIDTH]);
        }
    }
}
