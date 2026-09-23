package org.schabi.newpipe.extractor;

import androidx.core.view.w0;
import androidx.work.j0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends j0 {
    public /* synthetic */ f(w0 w0Var, org.schabi.newpipe.extractor.linkhandler.a aVar) {
        super(w0Var, aVar);
    }

    public long A() {
        return 0L;
    }

    public List D() {
        return Collections.EMPTY_LIST;
    }

    public abstract e E(k kVar);

    public androidx.emoji2.text.g G() {
        return null;
    }

    public void H() {
        List list = Collections.EMPTY_LIST;
    }

    public abstract int I();

    public void J() {
        List list = Collections.EMPTY_LIST;
    }

    public void M() {
        List list = Collections.EMPTY_LIST;
    }

    public List O() {
        return Collections.EMPTY_LIST;
    }

    public String P() {
        return null;
    }

    public abstract List Q();

    public long S(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        String strI;
        String strI2;
        String strI3 = "";
        try {
            String strI4 = org.schabi.newpipe.extractor.utils.b.i(str, 1, i());
            if (strI4.isEmpty()) {
                return 0L;
            }
            try {
                strI = org.schabi.newpipe.extractor.utils.b.i("(\\d+)s", 1, strI4);
                try {
                    strI2 = org.schabi.newpipe.extractor.utils.b.i("(\\d+)m", 1, strI4);
                    try {
                        strI3 = org.schabi.newpipe.extractor.utils.b.i("(\\d+)h", 1, strI4);
                    } catch (Exception unused) {
                        try {
                            if (strI.isEmpty() && strI2.isEmpty()) {
                                strI = org.schabi.newpipe.extractor.utils.b.i("t=(\\d+)", 1, strI4);
                            }
                        } catch (org.schabi.newpipe.extractor.exceptions.f e) {
                            org.mozilla.javascript.typedarrays.c.d("Could not get timestamp.", e);
                            return 0L;
                        }
                    }
                } catch (Exception unused2) {
                    strI2 = "";
                }
            } catch (Exception unused3) {
                strI = "";
                strI2 = strI;
            }
            int i = 0;
            int i2 = strI.isEmpty() ? 0 : Integer.parseInt(strI);
            int i3 = strI2.isEmpty() ? 0 : Integer.parseInt(strI2);
            if (!strI3.isEmpty()) {
                i = Integer.parseInt(strI3);
            }
            return (((long) i) * 3600) + (((long) i3) * 60) + ((long) i2);
        } catch (org.schabi.newpipe.extractor.utils.e unused4) {
            return -2L;
        }
    }

    public List U() {
        return Collections.EMPTY_LIST;
    }

    public abstract String V();

    public abstract String X();

    public abstract List Y();

    public abstract List Z();

    public int o() {
        return 0;
    }

    public abstract List p();

    public String r() {
        return "";
    }

    public abstract org.schabi.newpipe.extractor.stream.c s();

    public String u() {
        return null;
    }

    public void v() {
        List list = Collections.EMPTY_LIST;
    }

    public String w() {
        return "";
    }

    public abstract e y();

    public void B() {
    }

    public void C() {
    }

    public void F() {
    }

    public void K() {
    }

    public void L() {
    }

    public void N() {
    }

    public void R() {
    }

    public void T() {
    }

    public void W() {
    }

    public void a0() {
    }

    public void b0() {
    }

    public void q() {
    }

    public void t() {
    }

    public void x() {
    }

    public void z() {
    }
}
