package com.google.firebase.crashlytics.internal.metadata;

import com.google.android.gms.measurement.internal.z;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements k {
    public static final z c = new z(23);
    public final Object a;
    public Object b;

    public f(com.google.firebase.crashlytics.internal.persistence.c cVar) {
        this.a = cVar;
        this.b = c;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.k
    public void a(j jVar, int i) throws IOException {
        int[] iArr = (int[]) this.b;
        try {
            jVar.read((byte[]) this.a, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            jVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.a = bArr;
        this.b = iArr;
    }
}
