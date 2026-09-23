package kotlin.io.encoding;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final a c = new a(-1, false, false);
    public final boolean a;
    public final boolean b;

    static {
        new c(-1, true, false);
        new c(76, false, true);
        new c(64, false, true);
    }

    public c(int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z && z2) {
            kotlinx.coroutines.future.a.q("Failed requirement.");
            throw null;
        }
    }
}
