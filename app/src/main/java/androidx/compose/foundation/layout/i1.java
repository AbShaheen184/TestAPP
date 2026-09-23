package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {
    public static final e0 a = new e0(c0.y, 1.0f);
    public static final e0 b;
    public static final e0 c;
    public static final w1 d;
    public static final w1 e;
    public static final w1 f;
    public static final w1 g;

    static {
        c0 c0Var = c0.e;
        b = new e0(c0Var, 1.0f);
        c0 c0Var2 = c0.z;
        c = new e0(c0Var2, 1.0f);
        androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
        int i = 2;
        d = new w1(c0Var, new androidx.compose.animation.core.g0(iVar, i), iVar);
        androidx.compose.ui.i iVar2 = androidx.compose.ui.c.G;
        e = new w1(c0Var, new androidx.compose.animation.core.g0(iVar2, i), iVar2);
        androidx.compose.ui.j jVar = androidx.compose.ui.c.B;
        int i2 = 3;
        f = new w1(c0Var2, new androidx.compose.animation.core.g0(jVar, i2), jVar);
        androidx.compose.ui.j jVar2 = androidx.compose.ui.c.e;
        g = new w1(c0Var2, new androidx.compose.animation.core.g0(jVar2, i2), jVar2);
    }

    public static final androidx.compose.ui.r a(androidx.compose.ui.r rVar, float f2, float f3) {
        return rVar.d(new p1(f2, f3));
    }

    public static /* synthetic */ androidx.compose.ui.r b(androidx.compose.ui.r rVar, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(rVar, f2, f3);
    }

    public static final androidx.compose.ui.r c(androidx.compose.ui.r rVar, float f2) {
        return rVar.d(f2 == 1.0f ? b : new e0(c0.e, f2));
    }

    public static androidx.compose.ui.r d(androidx.compose.ui.r rVar) {
        return rVar.d(c);
    }

    public static final androidx.compose.ui.r e(androidx.compose.ui.r rVar, float f2) {
        return rVar.d(f2 == 1.0f ? a : new e0(c0.y, f2));
    }

    public static final androidx.compose.ui.r g(androidx.compose.ui.r rVar, float f2) {
        return rVar.d(new h1(0.0f, f2, 0.0f, f2, 5));
    }

    public static final androidx.compose.ui.r h(androidx.compose.ui.r rVar, float f2, float f3) {
        return rVar.d(new h1(0.0f, f2, 0.0f, f3, 5));
    }

    public static /* synthetic */ androidx.compose.ui.r i(androidx.compose.ui.r rVar, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        }
        return h(rVar, f2, f3);
    }

    public static final androidx.compose.ui.r j(androidx.compose.ui.r rVar, float f2) {
        return rVar.d(new h1(f2, f2, f2, f2, false));
    }

    public static final androidx.compose.ui.r k(androidx.compose.ui.r rVar, float f2, float f3) {
        return rVar.d(new h1(f2, f3, f2, f3, false));
    }

    public static androidx.compose.ui.r l(androidx.compose.ui.r rVar, float f2, float f3, float f4, float f5, int i) {
        return rVar.d(new h1(f2, (i & 2) != 0 ? Float.NaN : f3, (i & 4) != 0 ? Float.NaN : f4, (i & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final androidx.compose.ui.r m(androidx.compose.ui.r rVar, float f2) {
        return rVar.d(new h1(f2, f2, f2, f2, true));
    }

    public static final androidx.compose.ui.r n(androidx.compose.ui.r rVar, float f2, float f3) {
        return rVar.d(new h1(f2, f3, f2, f3, true));
    }

    public static final androidx.compose.ui.r o(androidx.compose.ui.r rVar, float f2, float f3, float f4, float f5) {
        return rVar.d(new h1(f2, f3, f4, f5, true));
    }

    public static /* synthetic */ androidx.compose.ui.r p(androidx.compose.ui.r rVar, float f2, float f3, float f4, int i) {
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        }
        return o(rVar, f2, f3, f4, Float.NaN);
    }

    public static final androidx.compose.ui.r q(androidx.compose.ui.r rVar, float f2) {
        return rVar.d(new h1(f2, 0.0f, f2, 0.0f, 10));
    }

    public static androidx.compose.ui.r r(androidx.compose.ui.r rVar, float f2) {
        return rVar.d(new h1(Float.NaN, 0.0f, f2, 0.0f, 10));
    }

    public static androidx.compose.ui.r s(androidx.compose.ui.r rVar) {
        w1 w1Var;
        androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
        if (kotlin.jvm.internal.l.a(iVar, iVar)) {
            w1Var = d;
        } else if (kotlin.jvm.internal.l.a(iVar, androidx.compose.ui.c.G)) {
            w1Var = e;
        } else {
            w1Var = new w1(c0.e, new androidx.compose.animation.core.g0(iVar, 2), iVar);
        }
        return rVar.d(w1Var);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static androidx.compose.ui.r t(androidx.compose.ui.r rVar) {
        w1 w1Var;
        androidx.compose.ui.j jVar = androidx.compose.ui.c.B;
        if (jVar.equals(jVar)) {
            w1Var = f;
        } else if (jVar.equals(androidx.compose.ui.c.e)) {
            w1Var = g;
        } else {
            w1Var = new w1(c0.z, new androidx.compose.animation.core.g0(jVar, 3), jVar);
        }
        return rVar.d(w1Var);
    }
}
