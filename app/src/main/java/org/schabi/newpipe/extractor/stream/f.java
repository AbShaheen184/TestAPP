package org.schabi.newpipe.extractor.stream;

import androidx.core.view.w0;
import androidx.room.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends org.schabi.newpipe.extractor.b {
    public int D;
    public List E;
    public List F;
    public String G;
    public String H;
    public int I;

    public static f b(org.schabi.newpipe.extractor.f fVar) throws org.schabi.newpipe.extractor.exceptions.d {
        String strL = fVar.l();
        int I = fVar.I();
        String strG = fVar.g();
        String strH = fVar.h();
        int iO = fVar.o();
        if (I == 1 || org.schabi.newpipe.extractor.utils.g.h(strL) || org.schabi.newpipe.extractor.utils.g.h(strG) || strH == null || iO == -1) {
            throw new org.schabi.newpipe.extractor.exceptions.d("Some important stream information was not given.");
        }
        f fVar2 = new f(((w0) fVar.c).y, strG, strL, fVar.i(), strH);
        List list = Collections.EMPTY_LIST;
        fVar2.E = list;
        fVar2.F = list;
        fVar2.G = "";
        fVar2.H = "";
        fVar2.I = I;
        fVar2.D = iO;
        org.schabi.newpipe.extractor.utils.b.b("Created {}", fVar2);
        return fVar2;
    }

    public static void c(f fVar, org.schabi.newpipe.extractor.f fVar2) {
        try {
            fVar2.Q();
        } catch (Exception e) {
            fVar.a(e);
        }
        try {
            fVar2.A();
        } catch (Exception e2) {
            fVar.a(e2);
        }
        try {
            fVar2.V();
        } catch (Exception e3) {
            fVar.a(e3);
        }
        try {
            fVar2.X();
        } catch (Exception e4) {
            fVar.a(e4);
        }
        try {
            fVar2.U();
        } catch (Exception e5) {
            fVar.a(e5);
        }
        try {
            fVar2.b0();
        } catch (Exception e6) {
            fVar.a(e6);
        }
        try {
            fVar2.W();
        } catch (Exception e7) {
            fVar.a(e7);
        }
        try {
            fVar2.K();
        } catch (Exception e8) {
            fVar.a(e8);
        }
        try {
            fVar2.L();
        } catch (Exception e9) {
            fVar.a(e9);
        }
        try {
            fVar2.J();
        } catch (Exception e10) {
            fVar.a(e10);
        }
        try {
            fVar2.s();
        } catch (Exception e11) {
            fVar.a(e11);
        }
        try {
            fVar2.a0();
        } catch (Exception e12) {
            fVar.a(e12);
        }
        try {
            fVar2.P();
        } catch (Exception e13) {
            fVar.a(e13);
        }
        try {
            fVar2.T();
        } catch (Exception e14) {
            fVar.a(e14);
        }
        try {
            fVar2.R();
        } catch (Exception e15) {
            fVar.a(e15);
        }
        try {
            fVar2.C();
        } catch (Exception e16) {
            fVar.a(e16);
        }
        try {
            fVar2.t();
        } catch (Exception e17) {
            fVar.a(e17);
        }
        try {
            fVar2.M();
        } catch (Exception e18) {
            fVar.a(e18);
        }
        try {
            fVar2.x();
        } catch (Exception e19) {
            fVar.a(e19);
        }
        try {
            fVar2.F();
        } catch (Exception e20) {
            fVar.a(e20);
        }
        try {
            fVar2.q();
        } catch (Exception e21) {
            fVar.a(e21);
        }
        try {
            fVar2.B();
        } catch (Exception e22) {
            fVar.a(e22);
        }
        try {
            fVar2.z();
        } catch (Exception e23) {
            fVar.a(e23);
        }
        try {
            fVar2.O();
        } catch (Exception e24) {
            fVar.a(e24);
        }
        try {
            fVar2.N();
        } catch (Exception e25) {
            fVar.a(e25);
        }
        try {
            fVar2.H();
        } catch (Exception e26) {
            fVar.a(e26);
        }
        try {
            fVar2.D();
        } catch (Exception e27) {
            fVar.a(e27);
        }
        try {
            fVar2.v();
        } catch (Exception e28) {
            fVar.a(e28);
        }
        try {
            androidx.emoji2.text.g gVarG = fVar2.G();
            if (gVarG == null) {
                List list = Collections.EMPTY_LIST;
                return;
            }
            fVar.C.addAll(gVarG.n());
            Collections.unmodifiableList((ArrayList) gVarG.b);
        } catch (Exception e29) {
            fVar.a(e29);
            List list2 = Collections.EMPTY_LIST;
        }
    }

    public static void d(f fVar, org.schabi.newpipe.extractor.f fVar2) throws org.schabi.newpipe.extractor.search.a, org.schabi.newpipe.extractor.exceptions.c {
        try {
            fVar.G = fVar2.r();
        } catch (Exception e) {
            fVar.a(new org.schabi.newpipe.extractor.exceptions.d("Couldn't get DASH manifest", e));
        }
        try {
            fVar.H = fVar2.w();
        } catch (Exception e2) {
            fVar.a(new org.schabi.newpipe.extractor.exceptions.d("Couldn't get HLS manifest", e2));
        }
        try {
            fVar.F = fVar2.p();
        } catch (org.schabi.newpipe.extractor.exceptions.c e3) {
            throw e3;
        } catch (Exception e4) {
            fVar.a(new org.schabi.newpipe.extractor.exceptions.d("Couldn't get audio streams", e4));
        }
        try {
            fVar.E = fVar2.Z();
        } catch (Exception e5) {
            fVar.a(new org.schabi.newpipe.extractor.exceptions.d("Couldn't get video streams", e5));
        }
        try {
            fVar2.Y();
        } catch (Exception e6) {
            fVar.a(new org.schabi.newpipe.extractor.exceptions.d("Couldn't get video only streams", e6));
        }
        if (fVar.E.isEmpty() && fVar.F.isEmpty() && org.schabi.newpipe.extractor.utils.g.h(fVar.G) && org.schabi.newpipe.extractor.utils.g.h(fVar.H)) {
            throw new org.schabi.newpipe.extractor.search.a("Could not get any stream. See error variable to get further details.");
        }
    }

    public static f e(w0 w0Var, String str) throws org.schabi.newpipe.extractor.exceptions.d {
        org.schabi.newpipe.extractor.utils.b.b("getInfo({service},{url})", w0Var, str);
        org.schabi.newpipe.extractor.f fVarF = w0Var.f(w0Var.g().f(str));
        org.schabi.newpipe.extractor.utils.b.b("getInfo({extractor})", fVarF);
        fVarF.d();
        try {
            f fVarB = b(fVarF);
            d(fVarB, fVarF);
            c(fVarB, fVarF);
            return fVarB;
        } catch (org.schabi.newpipe.extractor.exceptions.d e) {
            String strU = fVarF.u();
            if (org.schabi.newpipe.extractor.utils.g.h(strU)) {
                throw e;
            }
            throw new org.schabi.newpipe.extractor.exceptions.b(strU, e);
        }
    }

    @Override // org.schabi.newpipe.extractor.b
    public final String toString() {
        String str = this.A;
        int i = this.I;
        int i2 = this.D;
        StringBuilder sb = new StringBuilder();
        sb.append("f");
        sb.append("[serviceId=");
        sb.append(this.e);
        sb.append(", url='");
        sb.append(this.z);
        b0.i(sb, "', originalUrl='", str, "', id='", this.y);
        sb.append("', name='");
        sb.append(this.B);
        sb.append("', streamType=");
        sb.append(org.jsoup.a.i(i));
        sb.append(", ageLimit=");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }
}
