package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements d {
    public final float a;

    public j(float f) {
        this.a = f;
    }

    @Override // com.google.android.material.shape.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.a == ((j) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.o((int) (this.a * 100.0f), "%", new StringBuilder());
    }
}
