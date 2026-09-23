package com.caverock.androidsvg;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements j0 {
    public final ArrayList a;
    public float b;
    public float c;
    public q1 d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public p1(x1 x1Var, androidx.compose.ui.text.android.selection.e eVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.d = null;
        this.e = false;
        this.f = true;
        this.g = -1;
        if (eVar == null) {
            return;
        }
        eVar.r(this);
        if (this.h) {
            this.d.b((q1) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        q1 q1Var = this.d;
        if (q1Var != null) {
            arrayList.add(q1Var);
        }
    }

    @Override // com.caverock.androidsvg.j0
    public final void a(float f, float f2, float f3, float f4) {
        this.d.a(f, f2);
        this.a.add(this.d);
        this.d = new q1(f3, f4, f3 - f, f4 - f2);
        this.h = false;
    }

    @Override // com.caverock.androidsvg.j0
    public final void b(float f, float f2) {
        boolean z = this.h;
        ArrayList arrayList = this.a;
        if (z) {
            this.d.b((q1) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        q1 q1Var = this.d;
        if (q1Var != null) {
            arrayList.add(q1Var);
        }
        this.b = f;
        this.c = f2;
        this.d = new q1(f, f2, 0.0f, 0.0f);
        this.g = arrayList.size();
    }

    @Override // com.caverock.androidsvg.j0
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f || this.e) {
            this.d.a(f, f2);
            this.a.add(this.d);
            this.e = false;
        }
        this.d = new q1(f5, f6, f5 - f3, f6 - f4);
        this.h = false;
    }

    @Override // com.caverock.androidsvg.j0
    public final void close() {
        this.a.add(this.d);
        e(this.b, this.c);
        this.h = true;
    }

    @Override // com.caverock.androidsvg.j0
    public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.e = true;
        this.f = false;
        q1 q1Var = this.d;
        x1.i(q1Var.a, q1Var.b, f, f2, f3, z, z2, f4, f5, this);
        this.f = true;
        this.h = false;
    }

    @Override // com.caverock.androidsvg.j0
    public final void e(float f, float f2) {
        this.d.a(f, f2);
        this.a.add(this.d);
        q1 q1Var = this.d;
        this.d = new q1(f, f2, f - q1Var.a, f2 - q1Var.b);
        this.h = false;
    }
}
