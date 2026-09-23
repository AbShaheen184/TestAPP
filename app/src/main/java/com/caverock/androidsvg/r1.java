package com.caverock.androidsvg;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements j0 {
    public final Path a = new Path();
    public float b;
    public float c;

    public r1(androidx.compose.ui.text.android.selection.e eVar) {
        if (eVar == null) {
            return;
        }
        eVar.r(this);
    }

    @Override // com.caverock.androidsvg.j0
    public final void a(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
        this.b = f3;
        this.c = f4;
    }

    @Override // com.caverock.androidsvg.j0
    public final void b(float f, float f2) {
        this.a.moveTo(f, f2);
        this.b = f;
        this.c = f2;
    }

    @Override // com.caverock.androidsvg.j0
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
        this.b = f5;
        this.c = f6;
    }

    @Override // com.caverock.androidsvg.j0
    public final void close() {
        this.a.close();
    }

    @Override // com.caverock.androidsvg.j0
    public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        x1.i(this.b, this.c, f, f2, f3, z, z2, f4, f5, this);
        this.b = f4;
        this.c = f5;
    }

    @Override // com.caverock.androidsvg.j0
    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
        this.b = f;
        this.c = f2;
    }
}
