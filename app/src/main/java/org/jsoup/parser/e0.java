package org.jsoup.parser;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Cloneable {
    public g0 A;
    public final ReentrantLock B;
    public int C;
    public final l3 e;
    public final c0 y;
    public final d0 z;

    public e0(e0 e0Var) {
        this.B = new ReentrantLock();
        this.e = e0Var.e.k();
        e0Var.y.getClass();
        this.y = new c0(0);
        d0 d0Var = e0Var.z;
        this.z = new d0(d0Var.a, d0Var.b);
        this.C = e0Var.C;
        g0 g0VarB = e0Var.b();
        g0 g0Var = g0VarB.b;
        HashMap map = g0VarB.a;
        ArrayList arrayList = g0VarB.c;
        g0 g0Var2 = new g0(g0Var, arrayList == null ? null : new ArrayList(arrayList));
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap map2 = new HashMap(((Map) entry.getValue()).size());
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    map2.put((String) entry2.getKey(), ((f0) entry2.getValue()).clone());
                }
                g0Var2.a.put((String) entry.getKey(), map2);
            }
        }
        this.A = g0Var2;
    }

    public static org.jsoup.nodes.g a(String str, String str2) {
        b bVar = new b();
        bVar.i(new StringReader(str), str2, new e0(bVar));
        bVar.p();
        return bVar.d;
    }

    public final g0 b() {
        if (this.A == null) {
            this.A = this.e.g();
        }
        return this.A;
    }

    public final Object clone() {
        return new e0(this);
    }

    public e0(l3 l3Var) {
        this.B = new ReentrantLock();
        this.e = l3Var;
        this.z = l3Var.f();
        this.y = new c0(0);
        this.C = l3Var.d();
    }
}
