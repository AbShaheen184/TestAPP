package com.caverock.androidsvg;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y extends v0 implements a0, s0 {
    public HashSet i = null;
    public String j = null;
    public HashSet k = null;
    public HashSet l = null;
    public HashSet m = null;
    public Matrix n;

    @Override // com.caverock.androidsvg.s0
    public final Set a() {
        return this.k;
    }

    @Override // com.caverock.androidsvg.s0
    public final String c() {
        return this.j;
    }

    @Override // com.caverock.androidsvg.s0
    public final void e(HashSet hashSet) {
        this.i = hashSet;
    }

    @Override // com.caverock.androidsvg.s0
    public final Set f() {
        return this.i;
    }

    @Override // com.caverock.androidsvg.s0
    public final void g(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // com.caverock.androidsvg.s0
    public final void h(String str) {
        this.j = str;
    }

    @Override // com.caverock.androidsvg.s0
    public final void i(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // com.caverock.androidsvg.s0
    public final void j(HashSet hashSet) {
        this.k = hashSet;
    }

    @Override // com.caverock.androidsvg.a0
    public final void k(Matrix matrix) {
        this.n = matrix;
    }

    @Override // com.caverock.androidsvg.s0
    public final Set l() {
        return this.l;
    }

    @Override // com.caverock.androidsvg.s0
    public final Set m() {
        return this.m;
    }
}
