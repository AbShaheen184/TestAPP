package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f implements RandomAccess {
    public final f e;
    public final int y;
    public final int z;

    public e(f fVar, int i, int i2) {
        this.e = fVar;
        this.y = i;
        c.b(i, i2, fVar.b());
        this.z = i2 - i;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.z;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.z;
        if (i < 0 || i >= i2) {
            com.google.firebase.platforminfo.b.l(androidx.compose.runtime.j.g("index: ", i, ", size: ", i2));
            return null;
        }
        return this.e.get(this.y + i);
    }

    @Override // kotlin.collections.f, java.util.List
    public final List subList(int i, int i2) {
        c.b(i, i2, this.z);
        int i3 = this.y;
        return new e(this.e, i + i3, i3 + i2);
    }
}
