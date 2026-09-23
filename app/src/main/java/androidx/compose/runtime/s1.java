package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {
    public z a;
    public int b;
    public a c;
    public kotlin.jvm.functions.p d;
    public int e;
    public androidx.collection.f0 f;
    public androidx.collection.o0 g;

    public s1(z zVar) {
        this.a = zVar;
    }

    public final boolean a() {
        if (this.a != null) {
            a aVar = this.c;
            if (aVar != null ? aVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final s0 b(Object obj) {
        s0 s0VarS;
        z zVar = this.a;
        return (zVar == null || (s0VarS = zVar.s(this, obj)) == null) ? s0.e : s0VarS;
    }

    public final void c() {
        z zVar = this.a;
        if (zVar != null) {
            zVar.L = true;
            zVar.Q.k();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }

    public final void e(kotlin.jvm.functions.p pVar) {
        this.d = pVar;
    }
}
