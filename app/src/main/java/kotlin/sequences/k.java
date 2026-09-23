package kotlin.sequences;

import com.app.mlounge.ui.viewmodel.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.g0;
import kotlin.collections.q;
import kotlin.collections.u;
import kotlin.collections.w;
import kotlin.collections.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends kotlin.collections.builders.c {
    public static h K(Iterator it) {
        it.getClass();
        return new a(new u(it, 2));
    }

    public static h L(Object obj, kotlin.jvm.functions.l lVar) {
        if (obj == null) {
            return e.a;
        }
        return new kotlin.io.h(2, new androidx.navigation.internal.h(obj, 27), lVar);
    }

    public static String M(h hVar, String str) {
        hVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : hVar) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            kotlin.coroutines.intrinsics.h.b(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static g N(h hVar, kotlin.jvm.functions.l lVar) {
        return new g(new n(hVar, lVar, 1), false, new q0(12));
    }

    public static List O(h hVar) {
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return w.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return q.j(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set P(h hVar) {
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return y.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return g0.k(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
