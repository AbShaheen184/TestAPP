package org.jsoup.parser;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l3 {
    public e0 a;
    public a b;
    public s0 c;
    public org.jsoup.nodes.g d;
    public ArrayList e;
    public String f;
    public q0 g;
    public d0 h;
    public g0 i;
    public n0 j;
    public final m0 k = new m0(3, this);

    public abstract List a();

    public final org.jsoup.nodes.j b() {
        int size = this.e.size();
        return size > 0 ? (org.jsoup.nodes.j) this.e.get(size - 1) : this.d;
    }

    public final boolean c(String str) {
        org.jsoup.nodes.j jVarB;
        if (this.e.size() == 0 || (jVarB = b()) == null) {
            return false;
        }
        f0 f0Var = jVarB.A;
        return f0Var.z.equals(str) && f0Var.e.equals("http://www.w3.org/1999/xhtml");
    }

    public int d() {
        return 512;
    }

    public String e() {
        return "http://www.w3.org/1999/xhtml";
    }

    public abstract d0 f();

    public g0 g() {
        return new g0(g0.d, null);
    }

    public final void h(String str, Object... objArr) {
        c0 c0Var = this.a.y;
        if (c0Var.b()) {
            c0Var.add(new androidx.media3.exoplayer.dash.manifest.u(this.b, str, objArr));
        }
    }

    public void i(Reader reader, String str, e0 e0Var) {
        org.jsoup.helper.n.E(str, "baseUri");
        org.jsoup.nodes.g gVar = new org.jsoup.nodes.g(e0Var.e.e(), str);
        this.d = gVar;
        gVar.H = e0Var;
        this.a = e0Var;
        this.h = e0Var.z;
        a aVar = new a(reader);
        this.b = aVar;
        c0 c0Var = e0Var.y;
        c0Var.getClass();
        aVar.G = null;
        c0Var.getClass();
        this.c = new s0(this);
        this.e = new ArrayList(32);
        this.i = e0Var.b();
        n0 n0Var = new n0(2, this);
        this.j = n0Var;
        this.g = n0Var;
        this.f = str;
    }

    public abstract void j();

    public abstract l3 k();

    public org.jsoup.nodes.j l() {
        return (org.jsoup.nodes.j) this.e.remove(this.e.size() - 1);
    }

    public abstract boolean m(q0 q0Var);

    public final boolean n(String str) {
        q0 q0Var = this.g;
        m0 m0Var = this.k;
        if (q0Var == m0Var) {
            m0 m0Var2 = new m0(3, this);
            m0Var2.j(str);
            return m(m0Var2);
        }
        m0Var.f();
        m0Var.j(str);
        return m(m0Var);
    }

    public final void o(String str) {
        n0 n0Var = this.j;
        if (this.g == n0Var) {
            n0 n0Var2 = new n0(2, this);
            n0Var2.j(str);
            m(n0Var2);
        } else {
            n0Var.f();
            n0Var.j(str);
            m(n0Var);
        }
    }

    public final void p() {
        while (true) {
            if (this.g.a == 7) {
                ArrayList arrayList = this.e;
                if (arrayList == null) {
                    break;
                } else if (arrayList.isEmpty()) {
                    this.e = null;
                } else {
                    l();
                }
            } else {
                s0 s0Var = this.c;
                i0 i0Var = s0Var.k;
                while (!s0Var.e) {
                    s0Var.c.f(s0Var, s0Var.a);
                }
                boolean zT = i0Var.d.t();
                q0 q0Var = i0Var;
                if (!zT) {
                    s0Var.e = false;
                    q0Var = s0Var.d;
                }
                this.g = q0Var;
                m(q0Var);
                q0Var.f();
            }
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.close();
        this.b = null;
        this.c = null;
        this.e = null;
    }

    public final f0 q(n0 n0Var) {
        return this.i.d(n0Var.d.F(), n0Var.e, e(), this.h.a);
    }
}
