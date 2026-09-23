package androidx.compose.foundation.shape;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final d a;

    static {
        c cVar = new c(50);
        a = new d(cVar, cVar, cVar, cVar);
    }

    public static final d a(float f) {
        b bVar = new b(f);
        return new d(bVar, bVar, bVar, bVar);
    }

    public static final d b() {
        return a;
    }
}
