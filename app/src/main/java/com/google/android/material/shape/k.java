package com.google.android.material.shape;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends coil3.svg.internal.a {
    @Override // coil3.svg.internal.a
    public final void t(v vVar, float f, float f2) {
        float f3 = f2 * f;
        vVar.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        r rVar = new r(0.0f, 0.0f, f4, f4);
        rVar.f = 180.0f;
        rVar.g = 90.0f;
        vVar.f.add(rVar);
        p pVar = new p(rVar);
        vVar.a(180.0f);
        vVar.g.add(pVar);
        vVar.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        double d = 270.0f;
        vVar.b = (((float) Math.cos(Math.toRadians(d))) * f6) + f5;
        vVar.c = (f6 * ((float) Math.sin(Math.toRadians(d)))) + f5;
    }
}
