package com.google.firebase.components;

import androidx.room.t;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public int d;
    public int e;
    public e f;
    public final HashSet g;

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            t.e(cls2, "Null interface");
            this.b.add(r.a(cls2));
        }
    }

    public final void a(j jVar) {
        if (this.b.contains(jVar.a)) {
            kotlinx.coroutines.future.a.q("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.c.add(jVar);
        }
    }

    public final b b() {
        if (this.f != null) {
            return new b(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }
        kotlinx.coroutines.future.a.u("Missing required property: factory.");
        return null;
    }

    public final void c(int i) {
        if (this.d == 0) {
            this.d = i;
        } else {
            kotlinx.coroutines.future.a.u("Instantiation type has already been set.");
        }
    }

    public a(r rVar, r[] rVarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            t.e(rVar2, "Null interface");
        }
        Collections.addAll(this.b, rVarArr);
    }
}
