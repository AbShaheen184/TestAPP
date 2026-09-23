package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.collection.v;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {
    public final /* synthetic */ int A;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.A) {
            case 0:
                int i = this.z;
                this.z = i + 2;
                Object[] objArr = this.e;
                return new v(1, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.z;
                this.z = i2 + 2;
                return this.e[i2];
            default:
                int i3 = this.z;
                this.z = i3 + 2;
                return this.e[i3 + 1];
        }
    }
}
