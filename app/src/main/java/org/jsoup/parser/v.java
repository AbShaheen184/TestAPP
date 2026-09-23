package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum v extends b0 {
    public v() {
        super("InHeadNoscript", 4);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(q0 q0Var, b bVar) {
        if (q0Var.b()) {
            bVar.z(this);
            return true;
        }
        if (q0Var.e() && ((n0) q0Var).l().equals("html")) {
            return b0.D.f(q0Var, bVar);
        }
        boolean zD = q0Var.d();
        u uVar = b0.A;
        if (zD && ((m0) q0Var).l().equals("noscript")) {
            bVar.l();
            bVar.l = uVar;
            return true;
        }
        if (b0.a(q0Var) || q0Var.a() || (q0Var.e() && org.jsoup.internal.k.d(((n0) q0Var).l(), a0.f))) {
            return uVar.f(q0Var, bVar);
        }
        if (q0Var.d() && ((m0) q0Var).l().equals("br")) {
            bVar.z(this);
            i0 i0Var = new i0();
            String string = q0Var.toString();
            com.google.android.material.internal.k kVar = i0Var.d;
            kVar.C();
            kVar.y = string;
            bVar.I(i0Var, false);
            return true;
        }
        if ((q0Var.e() && org.jsoup.internal.k.d(((n0) q0Var).l(), a0.H)) || q0Var.d()) {
            bVar.z(this);
            return false;
        }
        bVar.z(this);
        i0 i0Var2 = new i0();
        String string2 = q0Var.toString();
        com.google.android.material.internal.k kVar2 = i0Var2.d;
        kVar2.C();
        kVar2.y = string2;
        bVar.I(i0Var2, false);
        return true;
    }
}
