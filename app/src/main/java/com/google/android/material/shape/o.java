package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends u {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public o(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // com.google.android.material.shape.u
    public final void a(Matrix matrix, com.google.android.material.shadow.a aVar, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((u) it.next()).a(this.d, aVar, i, canvas);
        }
    }
}
