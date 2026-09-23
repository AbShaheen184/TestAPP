package org.jsoup.nodes;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.parser.d0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o implements Cloneable {
    public static final List z = Collections.EMPTY_LIST;
    public j e;
    public int y;

    public abstract void B(org.jsoup.internal.b bVar, f fVar);

    public final g C() {
        for (o oVar = this; oVar != null; oVar = oVar.e) {
            if (oVar instanceof g) {
                return (g) oVar;
            }
        }
        return null;
    }

    public abstract j D();

    public final o E() {
        if (this.e == null || I() <= 0) {
            return null;
        }
        return (o) ((ArrayList) this.e.o()).get(this.y - 1);
    }

    public final void F() {
        j jVar = this.e;
        if (jVar != null) {
            jVar.G(this);
        }
    }

    public void G(o oVar) {
        org.jsoup.helper.n.z(oVar.e == this);
        j jVar = (j) this;
        if (jVar.B.e) {
            ((ArrayList) o()).remove(oVar.y);
        } else {
            ((ArrayList) o()).remove(oVar);
        }
        jVar.B.e = false;
        oVar.e = null;
    }

    public final void H(j jVar) {
        org.jsoup.helper.n.D(jVar);
        if (this.e == null) {
            this.e = jVar.e;
        }
        org.jsoup.helper.n.D(this.e);
        j jVar2 = this.e;
        jVar2.getClass();
        org.jsoup.helper.n.z(this.e == jVar2);
        if (this == jVar) {
            return;
        }
        j jVar3 = jVar.e;
        if (jVar3 != null) {
            jVar3.G(jVar);
        }
        int I = I();
        ((ArrayList) jVar2.o()).set(I, jVar);
        jVar.e = jVar2;
        jVar.y = I;
        this.e = null;
        jVar2.B.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int I() {
        i iVar;
        j jVar = this.e;
        if (jVar != null) {
            i iVar2 = jVar.B;
            if (!iVar2.e) {
                int size = iVar2.size();
                int i = 0;
                while (true) {
                    iVar = jVar.B;
                    if (i >= size) {
                        break;
                    }
                    ((o) iVar.get(i)).y = i;
                    i++;
                }
                iVar.e = true;
            }
        }
        return this.y;
    }

    public String b(String str) {
        org.jsoup.helper.n.A(str);
        if (!r() || f().m(str) == -1) {
            return "";
        }
        String strH = h();
        String strI = f().i(str);
        Pattern pattern = org.jsoup.internal.k.d;
        String strReplaceAll = pattern.matcher(strH).replaceAll("");
        String strReplaceAll2 = pattern.matcher(strI).replaceAll("");
        try {
            try {
                return org.jsoup.internal.k.m(new URL(strReplaceAll), strReplaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(strReplaceAll2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return org.jsoup.internal.k.c.matcher(strReplaceAll2).find() ? strReplaceAll2 : "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i, o... oVarArr) {
        i iVar;
        org.jsoup.helper.n.D(oVarArr);
        if (oVarArr.length == 0) {
            return;
        }
        List listO = o();
        j jVarD = oVarArr[0].D();
        if (jVarD != null && jVarD.B.size() == oVarArr.length) {
            List listO2 = jVarD.o();
            int length = oVarArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    int size = jVarD.B.size();
                    int i3 = 0;
                    while (true) {
                        iVar = jVarD.B;
                        if (i3 >= size) {
                            break;
                        }
                        ((o) iVar.get(i3)).e = null;
                        i3++;
                    }
                    iVar.clear();
                    listO.addAll(i, Arrays.asList(oVarArr));
                    int length2 = oVarArr.length;
                    while (true) {
                        int i4 = length2 - 1;
                        if (length2 <= 0) {
                            ((j) this).B.e = false;
                            return;
                        } else {
                            oVarArr[i4].e = (j) this;
                            length2 = i4;
                        }
                    }
                } else if (oVarArr[i2] != ((ArrayList) listO2).get(i2)) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        for (o oVar : oVarArr) {
            if (oVar == null) {
                throw new org.jsoup.helper.o("Array must not contain any null objects");
            }
        }
        for (o oVar2 : oVarArr) {
            oVar2.getClass();
            j jVar = oVar2.e;
            if (jVar != null) {
                jVar.G(oVar2);
            }
            oVar2.e = (j) this;
        }
        listO.addAll(i, Arrays.asList(oVarArr));
        ((j) this).B.e = false;
    }

    public String d(String str) {
        org.jsoup.helper.n.D(str);
        if (!r()) {
            return "";
        }
        String strI = f().i(str);
        if (strI.length() > 0) {
            return strI;
        }
        return str.startsWith("abs:") ? b(str.substring(4)) : "";
    }

    public void e(String str, String str2) {
        g gVarC = C();
        d0 d0Var = gVarC != null ? gVarC.H.z : d0.c;
        d0Var.getClass();
        String strTrim = str.trim();
        if (!d0Var.b) {
            strTrim = org.jsoup.internal.b.c(strTrim);
        }
        b bVarF = f();
        int iM = bVarF.m(strTrim);
        if (iM == -1) {
            bVarF.c(strTrim, str2);
            return;
        }
        bVarF.z[iM] = str2;
        if (bVarF.y[iM].equals(strTrim)) {
            return;
        }
        bVarF.y[iM] = strTrim;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract b f();

    public abstract String h();

    public final o i(int i) {
        return (o) o().get(i);
    }

    public abstract int j();

    public final List k() {
        if (j() == 0) {
            return z;
        }
        List listO = o();
        ArrayList arrayList = new ArrayList(listO.size());
        arrayList.addAll(listO);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // 
    public o l() {
        o oVarM = m(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(oVarM);
        while (!linkedList.isEmpty()) {
            o oVar = (o) linkedList.remove();
            int iJ = oVar.j();
            for (int i = 0; i < iJ; i++) {
                List listO = oVar.o();
                o oVarM2 = ((o) listO.get(i)).m(oVar);
                listO.set(i, oVarM2);
                linkedList.add(oVarM2);
            }
        }
        return oVarM;
    }

    public o m(o oVar) {
        g gVarC;
        try {
            o oVar2 = (o) super.clone();
            oVar2.e = (j) oVar;
            oVar2.y = oVar == null ? 0 : I();
            if (oVar == null && !(this instanceof g) && (gVarC = C()) != null) {
                g gVar = new g(gVarC.A.e, gVarC.h(), gVarC.H);
                b bVar = gVarC.C;
                if (bVar != null) {
                    gVar.C = bVar.clone();
                }
                gVar.G = gVarC.G.clone();
                oVar2.e = gVar;
                ((ArrayList) gVar.o()).add(oVar2);
            }
            return oVar2;
        } catch (CloneNotSupportedException e) {
            kotlinx.coroutines.future.a.l(e);
            return null;
        }
    }

    public abstract List o();

    public final o p() {
        if (j() == 0) {
            return null;
        }
        return (o) o().get(0);
    }

    public final boolean q(String str) {
        org.jsoup.helper.n.D(str);
        if (!r()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (f().m(strSubstring) != -1 && !b(strSubstring).isEmpty()) {
                return true;
            }
        }
        return f().m(str) != -1;
    }

    public abstract boolean r();

    public final boolean s(String str) {
        return y().equals(str);
    }

    public final j t() {
        o oVarU = this;
        do {
            oVarU = oVarU.u();
            if (oVarU == null) {
                return null;
            }
        } while (!(oVarU instanceof j));
        return (j) oVarU;
    }

    public String toString() {
        return z();
    }

    public final o u() {
        j jVar = this.e;
        if (jVar == null) {
            return null;
        }
        List listO = jVar.o();
        int I = I() + 1;
        ArrayList arrayList = (ArrayList) listO;
        if (arrayList.size() > I) {
            return (o) arrayList.get(I);
        }
        return null;
    }

    public abstract String v();

    public abstract String w();

    public String y() {
        return v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.datatransport.runtime.j] */
    /* JADX WARN: Type inference failed for: r3v3, types: [org.jsoup.select.u] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.datatransport.runtime.j, org.jsoup.nodes.q] */
    public String z() {
        ?? jVar;
        StringBuilder sbB = org.jsoup.internal.k.b();
        org.jsoup.internal.b bVarE = org.jsoup.internal.b.e(sbB);
        g gVarC = C();
        if (gVarC == null) {
            gVarC = new g("http://www.w3.org/1999/xhtml", "");
        }
        f fVar = gVarC.G;
        fVar.getClass();
        if (fVar.z) {
            jVar = new q(26, this, bVarE, fVar);
            jVar.C = false;
            for (o oVar = this; oVar != null; oVar = oVar.e) {
                if ((oVar instanceof j) && ((j) oVar).A.b(64)) {
                    jVar.C = true;
                    break;
                }
            }
        } else {
            jVar = new com.google.android.datatransport.runtime.j(26, this, bVarE, fVar);
        }
        jVar.j(this);
        return org.jsoup.internal.k.l(sbB);
    }
}
