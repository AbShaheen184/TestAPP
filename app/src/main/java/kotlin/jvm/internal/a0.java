package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static final b0 a;

    static {
        b0 b0Var = null;
        try {
            b0Var = (b0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (b0Var == null) {
            b0Var = new b0();
        }
        a = b0Var;
    }

    public static e a(Class cls) {
        a.getClass();
        return new e(cls);
    }
}
