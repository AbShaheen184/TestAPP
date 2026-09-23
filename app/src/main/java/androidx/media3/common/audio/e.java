package androidx.media3.common.audio;

import android.util.Log;
import com.caverock.androidsvg.h2;
import com.caverock.androidsvg.q0;
import com.caverock.androidsvg.u0;
import com.caverock.androidsvg.w0;
import com.caverock.androidsvg.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public int a;
    public boolean b = false;
    public Object c = com.caverock.androidsvg.d.y;

    public e(int i) {
        this.a = i;
    }

    public static int a(ArrayList arrayList, int i, w0 w0Var) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        u0 u0Var = w0Var.b;
        if (obj != u0Var) {
            return -1;
        }
        Iterator it = u0Var.getChildren().iterator();
        while (it.hasNext()) {
            if (((y0) it.next()) == w0Var) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static ArrayList c(com.caverock.androidsvg.c cVar) {
        ArrayList arrayList = new ArrayList();
        while (!cVar.q()) {
            String str = (String) cVar.d;
            String strSubstring = null;
            if (!cVar.q()) {
                int i = cVar.b;
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    cVar.b = i;
                } else {
                    int iH = cVar.h();
                    while (true) {
                        if ((iH < 65 || iH > 90) && (iH < 97 || iH > 122)) {
                            break;
                        }
                        iH = cVar.h();
                    }
                    strSubstring = str.substring(i, cVar.b);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(com.caverock.androidsvg.d.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!cVar.Q()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean f(com.caverock.androidsvg.m mVar, int i, ArrayList arrayList, int i2, w0 w0Var) {
        com.caverock.androidsvg.n nVar = (com.caverock.androidsvg.n) mVar.a.get(i);
        if (!i(nVar, w0Var)) {
            return false;
        }
        int i3 = nVar.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!h(mVar, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return h(mVar, i - 1, arrayList, i2);
        }
        int iA = a(arrayList, i2, w0Var);
        if (iA <= 0) {
            return false;
        }
        return f(mVar, i - 1, arrayList, i2, (w0) w0Var.b.getChildren().get(iA - 1));
    }

    public static boolean g(com.caverock.androidsvg.m mVar, w0 w0Var) {
        ArrayList arrayList = new ArrayList();
        Object obj = w0Var.b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((y0) obj).b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = mVar.a;
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        ArrayList arrayList3 = mVar.a;
        if (size2 == 1) {
            return i((com.caverock.androidsvg.n) arrayList3.get(0), w0Var);
        }
        return f(mVar, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, w0Var);
    }

    public static boolean h(com.caverock.androidsvg.m mVar, int i, ArrayList arrayList, int i2) {
        com.caverock.androidsvg.n nVar = (com.caverock.androidsvg.n) mVar.a.get(i);
        w0 w0Var = (w0) arrayList.get(i2);
        if (!i(nVar, w0Var)) {
            return false;
        }
        int i3 = nVar.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (h(mVar, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return h(mVar, i - 1, arrayList, i2 - 1);
        }
        int iA = a(arrayList, i2, w0Var);
        if (iA <= 0) {
            return false;
        }
        return f(mVar, i - 1, arrayList, i2, (w0) w0Var.b.getChildren().get(iA - 1));
    }

    public static boolean i(com.caverock.androidsvg.n nVar, w0 w0Var) {
        ArrayList arrayList;
        String str = nVar.b;
        if (str != null && !str.equals(w0Var.n().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<com.caverock.androidsvg.b> arrayList2 = nVar.c;
        if (arrayList2 != null) {
            for (com.caverock.androidsvg.b bVar : arrayList2) {
                String str2 = bVar.a;
                String str3 = bVar.c;
                if (str2.equals("id")) {
                    if (!str3.equals(w0Var.c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = w0Var.g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = nVar.d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((com.caverock.androidsvg.e) it.next()).a(w0Var)) {
                return false;
            }
        }
        return true;
    }

    public void b(androidx.compose.ui.graphics.vector.g gVar, com.caverock.androidsvg.c cVar) throws com.caverock.androidsvg.a {
        int iIntValue;
        char cCharAt;
        int iS;
        String strU = cVar.U();
        cVar.R();
        if (strU == null) {
            throw new com.caverock.androidsvg.a("Invalid '@' rule");
        }
        int i = 0;
        if (!this.b && strU.equals("media")) {
            ArrayList arrayListC = c(cVar);
            if (!cVar.m('{')) {
                throw new com.caverock.androidsvg.a("Invalid @media rule: missing rule set");
            }
            cVar.R();
            com.caverock.androidsvg.d dVar = (com.caverock.androidsvg.d) this.c;
            Iterator it = arrayListC.iterator();
            while (true) {
                if (!it.hasNext()) {
                    e(cVar);
                    break;
                }
                com.caverock.androidsvg.d dVar2 = (com.caverock.androidsvg.d) it.next();
                if (dVar2 == com.caverock.androidsvg.d.e || dVar2 == dVar) {
                    this.b = true;
                    gVar.h(e(cVar));
                    this.b = false;
                    break;
                }
            }
            if (!cVar.q() && !cVar.m('}')) {
                throw new com.caverock.androidsvg.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.b || !strU.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + strU + " rule");
            while (!cVar.q() && ((iIntValue = cVar.B().intValue()) != 59 || i != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i > 0 && (i = i - 1) == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String strT = null;
            if (!cVar.q()) {
                int i2 = cVar.b;
                if (cVar.n("url(")) {
                    cVar.R();
                    String strT2 = cVar.T();
                    if (strT2 == null) {
                        String str = (String) cVar.d;
                        StringBuilder sb = new StringBuilder();
                        while (!cVar.q() && (cCharAt = str.charAt(cVar.b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !androidx.compose.ui.text.android.selection.e.z(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                            cVar.b++;
                            if (cCharAt == '\\') {
                                if (!cVar.q()) {
                                    int i3 = cVar.b;
                                    cVar.b = i3 + 1;
                                    cCharAt = str.charAt(i3);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iS2 = com.caverock.androidsvg.c.S(cCharAt);
                                        if (iS2 != -1) {
                                            for (int i4 = 1; i4 <= 5 && !cVar.q() && (iS = com.caverock.androidsvg.c.S(str.charAt(cVar.b))) != -1; i4++) {
                                                cVar.b++;
                                                iS2 = (iS2 * 16) + iS;
                                            }
                                            sb.append((char) iS2);
                                        }
                                    }
                                }
                            }
                            sb.append(cCharAt);
                        }
                        strT2 = sb.length() == 0 ? null : sb.toString();
                    }
                    if (strT2 == null) {
                        cVar.b = i2;
                    } else {
                        cVar.R();
                        if (cVar.q() || cVar.n(")")) {
                            strT = strT2;
                        } else {
                            cVar.b = i2;
                        }
                    }
                }
            }
            if (strT == null) {
                strT = cVar.T();
            }
            if (strT == null) {
                throw new com.caverock.androidsvg.a("Invalid @import rule: expected string or url()");
            }
            cVar.R();
            c(cVar);
            if (!cVar.q() && !cVar.m(';')) {
                throw new com.caverock.androidsvg.a("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        cVar.R();
    }

    public boolean d(androidx.compose.ui.graphics.vector.g gVar, com.caverock.androidsvg.c cVar) throws com.caverock.androidsvg.a {
        ArrayList<com.caverock.androidsvg.m> arrayListV = cVar.V();
        if (arrayListV == null || arrayListV.isEmpty()) {
            return false;
        }
        if (!cVar.m('{')) {
            throw new com.caverock.androidsvg.a("Malformed rule block: expected '{'");
        }
        cVar.R();
        q0 q0Var = new q0();
        do {
            String strU = cVar.U();
            cVar.R();
            if (!cVar.m(':')) {
                throw new com.caverock.androidsvg.a("Expected ':'");
            }
            cVar.R();
            String str = (String) cVar.d;
            String strSubstring = null;
            if (!cVar.q()) {
                int i = cVar.b;
                int iCharAt = str.charAt(i);
                int i2 = i;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!androidx.compose.ui.text.android.selection.e.z(iCharAt)) {
                        i2 = cVar.b + 1;
                    }
                    iCharAt = cVar.h();
                }
                if (cVar.b > i) {
                    strSubstring = str.substring(i, i2);
                } else {
                    cVar.b = i;
                }
            }
            if (strSubstring == null) {
                throw new com.caverock.androidsvg.a("Expected property value");
            }
            cVar.R();
            if (cVar.m('!')) {
                cVar.R();
                if (!cVar.n("important")) {
                    throw new com.caverock.androidsvg.a("Malformed rule set: found unexpected '!'");
                }
                cVar.R();
            }
            cVar.m(';');
            h2.C(q0Var, strU, strSubstring);
            cVar.R();
            if (cVar.q()) {
                break;
            }
        } while (!cVar.m('}'));
        cVar.R();
        for (com.caverock.androidsvg.m mVar : arrayListV) {
            int i3 = this.a;
            com.caverock.androidsvg.l lVar = new com.caverock.androidsvg.l();
            lVar.a = mVar;
            lVar.b = q0Var;
            lVar.c = i3;
            gVar.f(lVar);
        }
        return true;
    }

    public androidx.compose.ui.graphics.vector.g e(com.caverock.androidsvg.c cVar) {
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(3);
        while (!cVar.q()) {
            try {
                if (!cVar.n("<!--") && !cVar.n("-->")) {
                    if (!cVar.m('@')) {
                        if (!d(gVar, cVar)) {
                            break;
                        }
                    } else {
                        b(gVar, cVar);
                    }
                }
            } catch (com.caverock.androidsvg.a e) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e.getMessage());
                return gVar;
            }
        }
        return gVar;
    }
}
