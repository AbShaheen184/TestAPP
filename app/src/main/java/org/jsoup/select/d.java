package org.jsoup.select;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends p {
    public boolean e;
    public int c = 0;
    public int d = 0;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    @Override // org.jsoup.select.p
    public final int a() {
        return this.d;
    }

    @Override // org.jsoup.select.p
    public final void e() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((p) it.next()).e();
        }
    }

    @Override // org.jsoup.select.p
    public final boolean f() {
        return this.e;
    }

    public final void g() {
        ArrayList<p> arrayList = this.a;
        this.c = arrayList.size();
        this.d = 0;
        for (p pVar : arrayList) {
            this.d = pVar.a() + this.d;
        }
        ArrayList arrayList2 = this.b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList2.sort(Comparator.comparingInt(new a(0)));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((p) it.next()).f()) {
                this.e = true;
                return;
            }
        }
    }
}
