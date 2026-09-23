package com.caverock.androidsvg;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 {
    public final q0 a;
    public boolean b;
    public boolean c;
    public final Paint d;
    public final Paint e;
    public androidx.compose.ui.geometry.a f;
    public androidx.compose.ui.geometry.a g;
    public boolean h;

    public v1(v1 v1Var) {
        this.b = v1Var.b;
        this.c = v1Var.c;
        this.d = new Paint(v1Var.d);
        this.e = new Paint(v1Var.e);
        androidx.compose.ui.geometry.a aVar = v1Var.f;
        if (aVar != null) {
            this.f = new androidx.compose.ui.geometry.a(aVar);
        }
        androidx.compose.ui.geometry.a aVar2 = v1Var.g;
        if (aVar2 != null) {
            this.g = new androidx.compose.ui.geometry.a(aVar2);
        }
        this.h = v1Var.h;
        try {
            this.a = (q0) v1Var.a.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
            this.a = q0.a();
        }
    }

    public v1() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.a = q0.a();
    }
}
