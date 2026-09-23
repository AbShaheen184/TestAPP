package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {
    public final d a;
    public final float b;

    public b(float f, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).a;
            f += ((b) dVar).b;
        }
        this.a = dVar;
        this.b = f;
    }

    @Override // com.google.android.material.shape.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b == bVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
