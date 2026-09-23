package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {
    public final int B;
    public final int C;

    public e(byte[] bArr, int i, int i2) {
        super(bArr);
        f.c(i, i + i2, bArr.length);
        this.B = i;
        this.C = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final byte b(int i) {
        int i2 = this.C;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.y[this.B + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(androidx.privacysandbox.ads.adservices.java.internal.a.n(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(androidx.compose.runtime.j.g("Index > length: ", i, ", ", i2));
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final void e(byte[] bArr, int i) {
        System.arraycopy(this.y, this.B, bArr, 0, i);
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final int f() {
        return this.B;
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final byte h(int i) {
        return this.y[this.B + i];
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final int size() {
        return this.C;
    }
}
