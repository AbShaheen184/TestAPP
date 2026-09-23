package okhttp3.internal.http;

import com.google.android.gms.measurement.internal.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.w;
import kotlin.jvm.internal.l;
import okhttp3.g0;
import okhttp3.m;
import okhttp3.n;
import okhttp3.r;
import okhttp3.s;
import okio.i;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    static {
        i iVar = i.A;
        a0.g("\"\\");
        a0.g("\t ,=");
    }

    public static final boolean a(g0 g0Var) {
        if (l.a(g0Var.e.b, "HEAD")) {
            return false;
        }
        int i = g0Var.A;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && okhttp3.internal.g.e(g0Var) == -1 && !"chunked".equalsIgnoreCase(g0.g("Transfer-Encoding", g0Var))) ? false : true;
    }

    public static final void b(n nVar, s sVar, r rVar) {
        nVar.getClass();
        sVar.getClass();
        rVar.getClass();
        if (nVar == n.u) {
            return;
        }
        Pattern pattern = m.k;
        List listH = rVar.h("Set-Cookie");
        int size = listH.size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            m mVarE = dagger.hilt.android.internal.b.e(sVar, (String) listH.get(i));
            if (mVarE != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(mVarE);
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        }
        if (listUnmodifiableList == null) {
            listUnmodifiableList = w.e;
        }
        if (listUnmodifiableList.isEmpty()) {
            return;
        }
        nVar.a(sVar, listUnmodifiableList);
    }
}
