package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 extends v0 implements u0, s0 {
    public List i = new ArrayList();
    public HashSet j = null;
    public String k = null;
    public HashSet l = null;
    public HashSet m = null;

    @Override // com.caverock.androidsvg.s0
    public final Set a() {
        return null;
    }

    public void b(y0 y0Var) {
        this.i.add(y0Var);
    }

    @Override // com.caverock.androidsvg.s0
    public final String c() {
        return this.k;
    }

    @Override // com.caverock.androidsvg.s0
    public final void e(HashSet hashSet) {
        this.j = hashSet;
    }

    @Override // com.caverock.androidsvg.s0
    public final Set f() {
        return this.j;
    }

    @Override // com.caverock.androidsvg.s0
    public final void g(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // com.caverock.androidsvg.u0
    public final List getChildren() {
        return this.i;
    }

    @Override // com.caverock.androidsvg.s0
    public final void h(String str) {
        this.k = str;
    }

    @Override // com.caverock.androidsvg.s0
    public final void i(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // com.caverock.androidsvg.s0
    public final Set l() {
        return this.l;
    }

    @Override // com.caverock.androidsvg.s0
    public final Set m() {
        return this.m;
    }

    @Override // com.caverock.androidsvg.s0
    public final void j(HashSet hashSet) {
    }
}
