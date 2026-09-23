package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {
    public static final kotlin.collections.builders.f a;

    static {
        kotlin.collections.builders.f fVar = new kotlin.collections.builders.f();
        fVar.put(kotlin.jvm.internal.a0.a(String.class), y0.a);
        fVar.put(kotlin.jvm.internal.a0.a(Character.TYPE), m.a);
        fVar.put(kotlin.jvm.internal.a0.a(char[].class), l.c);
        fVar.put(kotlin.jvm.internal.a0.a(Double.TYPE), q.a);
        fVar.put(kotlin.jvm.internal.a0.a(double[].class), p.c);
        fVar.put(kotlin.jvm.internal.a0.a(Float.TYPE), v.a);
        fVar.put(kotlin.jvm.internal.a0.a(float[].class), u.c);
        fVar.put(kotlin.jvm.internal.a0.a(Long.TYPE), h0.a);
        fVar.put(kotlin.jvm.internal.a0.a(long[].class), g0.c);
        fVar.put(kotlin.jvm.internal.a0.a(kotlin.t.class), h1.a);
        fVar.put(kotlin.jvm.internal.a0.a(Integer.TYPE), b0.a);
        fVar.put(kotlin.jvm.internal.a0.a(int[].class), a0.c);
        fVar.put(kotlin.jvm.internal.a0.a(kotlin.r.class), e1.a);
        fVar.put(kotlin.jvm.internal.a0.a(Short.TYPE), x0.a);
        fVar.put(kotlin.jvm.internal.a0.a(short[].class), w0.c);
        fVar.put(kotlin.jvm.internal.a0.a(kotlin.w.class), k1.a);
        fVar.put(kotlin.jvm.internal.a0.a(Byte.TYPE), i.a);
        fVar.put(kotlin.jvm.internal.a0.a(byte[].class), h.c);
        fVar.put(kotlin.jvm.internal.a0.a(kotlin.p.class), b1.a);
        fVar.put(kotlin.jvm.internal.a0.a(Boolean.TYPE), f.a);
        fVar.put(kotlin.jvm.internal.a0.a(boolean[].class), e.c);
        fVar.put(kotlin.jvm.internal.a0.a(kotlin.y.class), l1.b);
        fVar.put(kotlin.jvm.internal.a0.a(Void.class), j0.a);
        try {
            kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.a0.a(kotlin.time.a.class);
            kotlin.time.g gVar = kotlin.time.a.y;
            fVar.put(eVarA, r.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            fVar.put(kotlin.jvm.internal.a0.a(kotlin.u.class), g1.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            fVar.put(kotlin.jvm.internal.a0.a(kotlin.s.class), d1.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            fVar.put(kotlin.jvm.internal.a0.a(kotlin.x.class), j1.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            fVar.put(kotlin.jvm.internal.a0.a(kotlin.q.class), a1.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            fVar.put(kotlin.jvm.internal.a0.a(kotlin.uuid.a.class), m1.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        a = fVar.b();
    }
}
