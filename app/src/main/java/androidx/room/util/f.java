package androidx.room.util;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {
    public final String A;
    public final int e;
    public final int y;
    public final String z;

    public f(String str, int i, String str2, int i2) {
        str.getClass();
        str2.getClass();
        this.e = i;
        this.y = i2;
        this.z = str;
        this.A = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        fVar.getClass();
        int i = this.e - fVar.e;
        return i == 0 ? this.y - fVar.y : i;
    }
}
