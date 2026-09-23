package com.app.mlounge.ui.screens.livetv;

import androidx.compose.runtime.s;
import com.app.mlounge.data.iptv.n;
import com.app.mlounge.data.remote.model.IptvChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.w;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.r;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements r {
    public final /* synthetic */ l A;
    public final /* synthetic */ long B;
    public final /* synthetic */ List e;
    public final /* synthetic */ Map y;
    public final /* synthetic */ l z;

    public f(List list, Map map, l lVar, l lVar2, long j) {
        this.e = list;
        this.y = map;
        this.z = lVar;
        this.A = lVar2;
        this.B = j;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        long j;
        Object next;
        androidx.compose.foundation.lazy.d dVar = (androidx.compose.foundation.lazy.d) obj;
        int iIntValue = ((Number) obj2).intValue();
        s sVar = (s) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        int i = (iIntValue2 & 6) == 0 ? (sVar.f(dVar) ? 4 : 2) | iIntValue2 : iIntValue2;
        if ((iIntValue2 & 48) == 0) {
            i |= sVar.d(iIntValue) ? 32 : 16;
        }
        if (sVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
            IptvChannel iptvChannel = (IptvChannel) this.e.get(iIntValue);
            sVar.b0(642646740);
            Iterable iterable = (List) this.y.get(iptvChannel.e());
            if (iterable == null) {
                iterable = w.e;
            }
            Iterator it = iterable.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                obj5 = null;
                j = this.B;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                n nVar = (n) next;
                if (nVar.c() <= j && nVar.a() > j) {
                    break;
                }
            }
            n nVar2 = (n) next;
            for (Object obj6 : iterable) {
                if (((n) obj6).c() > j) {
                    obj5 = obj6;
                    break;
                }
            }
            n nVar3 = (n) obj5;
            l lVar = this.z;
            boolean zF = sVar.f(lVar) | sVar.f(iptvChannel);
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (zF || objQ == fVar) {
                objQ = new e(lVar, iptvChannel, 0);
                sVar.l0(objQ);
            }
            kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ;
            l lVar2 = this.A;
            boolean zF2 = sVar.f(lVar2) | sVar.f(iptvChannel);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == fVar) {
                objQ2 = new e(lVar2, iptvChannel, 1);
                sVar.l0(objQ2);
            }
            a.a(iptvChannel, nVar2, nVar3, aVar, (kotlin.jvm.functions.a) objQ2, sVar, 0);
            sVar.p(false);
        } else {
            sVar.W();
        }
        return y.a;
    }
}
