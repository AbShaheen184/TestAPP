package com.caverock.androidsvg;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x extends w0 implements u0 {
    public List h = new ArrayList();
    public Boolean i;
    public Matrix j;
    public int k;
    public String l;

    @Override // com.caverock.androidsvg.u0
    public final void b(y0 y0Var) throws y1 {
        if (y0Var instanceof p0) {
            this.h.add(y0Var);
            return;
        }
        throw new y1("Gradient elements cannot contain " + y0Var + " elements.");
    }

    @Override // com.caverock.androidsvg.u0
    public final List getChildren() {
        return this.h;
    }
}
