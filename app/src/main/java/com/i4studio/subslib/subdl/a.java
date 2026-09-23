package com.i4studio.subslib.subdl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.c;
import kotlin.text.k;
import org.jsoup.helper.d;
import org.jsoup.helper.f;
import org.jsoup.helper.n;
import org.jsoup.nodes.g;
import org.jsoup.nodes.j;
import org.jsoup.select.e;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final g a(a aVar, String str) {
        try {
            f fVarC = c.c(str);
            d dVar = fVarC.a;
            dVar.getClass();
            n.C("User-Agent", "name");
            dVar.d("User-Agent");
            dVar.a("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
            dVar.f = 15000;
            return fVarC.a();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final ArrayList b(a aVar, g gVar) {
        String string;
        String strD0;
        String strD1;
        String string2;
        String strD2;
        ArrayList arrayList = new ArrayList();
        e eVarB0 = gVar.b0("div.flex-col.mt-4.select-none");
        eVarB0.getClass();
        Iterator<E> it = eVarB0.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            j jVar = (j) next;
            j jVarC0 = jVar.c0("div.inline-flex.items-center.rounded-md.border");
            j jVarC1 = jVar.c0("h2.text-lg.font-semibold");
            if (jVarC0 == null || (strD2 = jVarC0.d0()) == null || (string = k.g0(strD2).toString()) == null) {
                string = "";
            }
            String str = string;
            String str2 = (jVarC1 == null || (strD1 = jVarC1.d0()) == null || (string2 = k.g0(strD1).toString()) == null) ? str : string2;
            e eVarB1 = jVar.b0("li.flex.justify-between");
            eVarB1.getClass();
            Iterator<E> it2 = eVarB1.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                next2.getClass();
                j jVar2 = (j) next2;
                j jVarC2 = jVar2.c0("h4");
                String string3 = (jVarC2 == null || (strD0 = jVarC2.d0()) == null) ? null : k.g0(strD0).toString();
                j jVarC3 = jVar2.c0("a[href^=https://dl.subdl.com/subtitle/]");
                String strD = jVarC3 != null ? jVarC3.d("href") : null;
                if (strD != null && string3 != null) {
                    String strB0 = k.b0(k.Y(strD, "/", strD), ".zip");
                    e eVarB2 = jVar2.b0("svg.lucide-ear-off");
                    eVarB2.getClass();
                    eVarB2.isEmpty();
                    arrayList.add(new com.i4studio.subslib.model.c(strB0, string3, str2, str, strD, string3));
                }
            }
        }
        return arrayList;
    }
}
