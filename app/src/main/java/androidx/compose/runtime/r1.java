package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r1 {
    public final w0 a;

    public r1(kotlin.jvm.functions.a aVar) {
        this.a = new w0(aVar);
    }

    public abstract androidx.appcompat.widget.r a(Object obj);

    public z2 b() {
        return this.a;
    }

    public final z2 c(androidx.appcompat.widget.r rVar, z2 z2Var) {
        k0 k0Var;
        z2 z2Var2 = null;
        z2Var2 = null;
        z2Var2 = null;
        z2Var2 = null;
        z2Var2 = null;
        z2Var2 = null;
        if (z2Var instanceof k0) {
            if (rVar.b) {
                k0Var = (k0) z2Var;
                k0Var.a.setValue(rVar.b());
            }
        } else if (z2Var instanceof y2) {
            if ((rVar.a || rVar.f != null) && !rVar.b) {
                y2 y2Var = (y2) z2Var;
                if (kotlin.jvm.internal.l.a(rVar.b(), y2Var.a)) {
                    z2Var2 = y2Var;
                }
            }
        } else if (z2Var instanceof e0) {
            rVar.getClass();
        }
        if (z2Var2 != null) {
            z2Var2 = k0Var;
            return z2Var2;
        }
        if (!rVar.b) {
            z2Var2 = k0Var;
            return new y2(rVar.b());
        }
        Object obj = rVar.f;
        f fVar = (f) rVar.e;
        if (fVar == null) {
            z2Var2 = k0Var;
            fVar = f.D;
        }
        z2Var2 = k0Var;
        return new k0(new j1(obj, fVar));
    }
}
