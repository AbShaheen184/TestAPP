package kotlin.collections;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends f implements RandomAccess {
    public final /* synthetic */ byte[] e;

    public m(byte[] bArr) {
        this.e = bArr;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.e.length;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001f A[RETURN] */
    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Byte)) {
            return false;
        }
        byte bByteValue = ((Number) obj).byteValue();
        byte[] bArr = this.e;
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            if (bByteValue == bArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Byte.valueOf(this.e[i]);
    }

    @Override // kotlin.collections.f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Byte)) {
            return -1;
        }
        byte bByteValue = ((Number) obj).byteValue();
        byte[] bArr = this.e;
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (bByteValue == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final boolean isEmpty() {
        return this.e.length == 0;
    }

    @Override // kotlin.collections.f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Byte) {
            byte bByteValue = ((Number) obj).byteValue();
            byte[] bArr = this.e;
            int length = bArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (bByteValue == bArr[length]) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        }
        return -1;
    }
}
