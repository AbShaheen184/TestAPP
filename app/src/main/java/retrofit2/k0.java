package retrofit2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {
    public static final androidx.core.provider.l a;
    public static final a b;
    public static final a c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            a = null;
            b = new a(7);
            c = new a(6);
        } else if (property.equals("Dalvik")) {
            a = new androidx.core.provider.l();
            b = new l0(7);
            c = new c(6);
        } else {
            a = null;
            b = new m0(7);
            c = new c(6);
        }
    }
}
