package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends l {
    public final byte[] f;

    public m(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f = bArr;
    }

    @Override // com.google.android.gms.common.l
    public final byte[] I() {
        return this.f;
    }
}
