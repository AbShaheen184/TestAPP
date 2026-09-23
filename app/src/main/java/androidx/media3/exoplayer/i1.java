package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public Object e;
    public Object f;

    public static void b(a aVar) {
        int i = aVar.E;
        if (i == 2) {
            _COROUTINE.a.A(i == 2);
            aVar.E = 1;
            aVar.v();
        }
    }

    public static boolean h(a aVar) {
        return aVar.E != 0;
    }

    public static void l(a aVar, long j) {
        aVar.K = true;
        if (aVar instanceof androidx.media3.exoplayer.text.e) {
            androidx.media3.exoplayer.text.e eVar = (androidx.media3.exoplayer.text.e) aVar;
            _COROUTINE.a.A(eVar.K);
            eVar.h0 = j;
        }
    }

    public void a(a aVar, h hVar) {
        _COROUTINE.a.A(((a) this.e) == aVar || ((a) this.f) == aVar);
        if (h(aVar)) {
            if (aVar == hVar.z) {
                hVar.A = null;
                hVar.z = null;
                hVar.B = true;
            }
            b(aVar);
            _COROUTINE.a.A(aVar.E == 1);
            aVar.z.p();
            aVar.E = 0;
            aVar.F = null;
            aVar.G = null;
            aVar.K = false;
            aVar.p();
            aVar.N = null;
        }
    }

    public int c() {
        boolean zH = h((a) this.e);
        a aVar = (a) this.f;
        return (zH ? 1 : 0) + ((aVar == null || !h(aVar)) ? 0 : 1);
    }

    public a d(p0 p0Var) {
        androidx.media3.exoplayer.source.x0 x0Var;
        if (p0Var != null && (x0Var = p0Var.c[this.c]) != null) {
            a aVar = (a) this.e;
            if (aVar.F == x0Var) {
                return aVar;
            }
            a aVar2 = (a) this.f;
            if (aVar2 != null && aVar2.F == x0Var) {
                return aVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003a  */
    public boolean e(p0 p0Var, a aVar) {
        p0 p0Var2;
        int i = this.c;
        if (aVar != null) {
            androidx.media3.exoplayer.source.x0 x0Var = p0Var.c[i];
            androidx.media3.exoplayer.source.x0 x0Var2 = aVar.F;
            if (x0Var2 != null) {
                if (x0Var2 != x0Var) {
                    p0Var2 = p0Var.m;
                    if (p0Var2 != null || p0Var2.c[i] != aVar.F) {
                    }
                } else if (x0Var != null && !aVar.l()) {
                    p0 p0Var3 = p0Var.m;
                    if (!p0Var.g.h || p0Var3 == null || !p0Var3.e || (!(aVar instanceof androidx.media3.exoplayer.text.e) && !(aVar instanceof androidx.media3.exoplayer.metadata.b) && aVar.J < p0Var3.e())) {
                        p0Var2 = p0Var.m;
                        return p0Var2 != null ? false : false;
                    }
                }
            }
        }
        return true;
    }

    public boolean f() {
        int i = this.d;
        return i == 2 || i == 4 || i == 3;
    }

    public boolean g() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return h((a) this.e);
        }
        a aVar = (a) this.f;
        aVar.getClass();
        return aVar.E != 0;
    }

    public void i(boolean z) {
        if (z) {
            if (this.a) {
                a aVar = (a) this.e;
                _COROUTINE.a.A(aVar.E == 0);
                aVar.z.p();
                aVar.t();
                this.a = false;
                return;
            }
            return;
        }
        if (this.b) {
            a aVar2 = (a) this.f;
            aVar2.getClass();
            _COROUTINE.a.A(aVar2.E == 0);
            aVar2.z.p();
            aVar2.t();
            this.b = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int j(a aVar, p0 p0Var, androidx.media3.exoplayer.trackselection.t tVar, h hVar) {
        int i;
        a aVar2 = (a) this.e;
        int i2 = this.c;
        if (aVar == null || aVar.E == 0 || (aVar == aVar2 && ((i = this.d) == 2 || i == 4))) {
            return 1;
        }
        if (aVar == ((a) this.f) && this.d == 3) {
            return 1;
        }
        byte b = aVar.F != p0Var.c[i2];
        boolean zB = tVar.b(i2);
        if (!zB || b != false) {
            if (!aVar.K) {
                androidx.media3.exoplayer.trackselection.q qVar = tVar.c[i2];
                int length = qVar != null ? qVar.length() : 0;
                androidx.media3.common.r[] rVarArr = new androidx.media3.common.r[length];
                for (int i3 = 0; i3 < length; i3++) {
                    qVar.getClass();
                    rVarArr[i3] = qVar.g(i3);
                }
                androidx.media3.exoplayer.source.x0 x0Var = p0Var.c[i2];
                x0Var.getClass();
                aVar.A(rVarArr, x0Var, p0Var.e(), p0Var.p, p0Var.g.a);
                return 3;
            }
            if (!aVar.m()) {
                return 0;
            }
            a(aVar, hVar);
            if (!zB || f()) {
                i(aVar == aVar2);
                return 1;
            }
        }
        return 1;
    }

    public void k() {
        if (!h((a) this.e)) {
            i(true);
        }
        a aVar = (a) this.f;
        if (aVar == null || aVar.E != 0) {
            return;
        }
        i(false);
    }

    public void m() {
        int i;
        a aVar = (a) this.e;
        int i2 = aVar.E;
        if (i2 == 1 && this.d != 4) {
            _COROUTINE.a.A(i2 == 1);
            aVar.E = 2;
            aVar.u();
            return;
        }
        a aVar2 = (a) this.f;
        if (aVar2 == null || (i = aVar2.E) != 1 || this.d == 3) {
            return;
        }
        _COROUTINE.a.A(i == 1);
        aVar2.E = 2;
        aVar2.u();
    }
}
