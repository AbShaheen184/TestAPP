package com.caverock.androidsvg;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 extends t0 {
    @Override // com.caverock.androidsvg.t0, com.caverock.androidsvg.u0
    public final void b(y0 y0Var) throws y1 {
        if (y0Var instanceof i1) {
            this.i.add(y0Var);
            return;
        }
        throw new y1("Text content elements cannot contain " + y0Var + " elements.");
    }
}
