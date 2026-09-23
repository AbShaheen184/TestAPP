package com.google.android.material.shape;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends coil3.svg.internal.a {
    @Override // coil3.svg.internal.a
    public final void t(v vVar, float f, float f2) {
        float f3 = f2 * f;
        vVar.d(f3, 180.0f, 90.0f);
        double d = f3;
        vVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d), (float) (Math.sin(Math.toRadians(0.0f)) * d));
    }
}
