package okio;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlin.collections.f implements RandomAccess {
    public final i[] e;
    public final int[] y;

    public v(i[] iVarArr, int[] iArr) {
        this.e = iVarArr;
        this.y = iArr;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.e.length;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.e[i];
    }

    @Override // kotlin.collections.f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
