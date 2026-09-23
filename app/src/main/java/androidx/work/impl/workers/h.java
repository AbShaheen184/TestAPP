package androidx.work.impl.workers;

import androidx.compose.material3.r;
import androidx.work.impl.model.i;
import androidx.work.impl.model.j;
import androidx.work.impl.model.l;
import androidx.work.impl.model.p;
import androidx.work.impl.model.v;
import androidx.work.y;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final String a = y.g("DiagnosticsWrkr");

    public static final String a(l lVar, v vVar, i iVar, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            j jVarQ = coil3.svg.internal.a.q(pVar);
            String str = pVar.a;
            iVar.getClass();
            String str2 = jVarQ.a;
            int i = jVarQ.b;
            str2.getClass();
            androidx.work.impl.model.g gVar = (androidx.work.impl.model.g) okhttp3.internal.platform.android.g.t(iVar.a, true, false, new androidx.work.impl.model.h(str2, i, 0));
            Integer numValueOf = gVar != null ? Integer.valueOf(gVar.c) : null;
            lVar.getClass();
            str.getClass();
            String strI = kotlin.collections.p.I((List) okhttp3.internal.platform.android.g.t(lVar.a, true, false, new r(str, 10)), ",", null, null, null, 62);
            vVar.getClass();
            String strI2 = kotlin.collections.p.I((List) okhttp3.internal.platform.android.g.t(vVar.a, true, false, new r(str, 22)), ",", null, null, null, 62);
            StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("\n", str, "\t ");
            sbX.append(pVar.c);
            sbX.append("\t ");
            sbX.append(numValueOf);
            sbX.append("\t ");
            sbX.append(pVar.b.name());
            sbX.append("\t ");
            sbX.append(strI);
            sbX.append("\t ");
            sbX.append(strI2);
            sbX.append('\t');
            sb.append(sbX.toString());
        }
        return sb.toString();
    }
}
