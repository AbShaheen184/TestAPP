package com.google.android.material.shape;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable.ConstantState {
    public m a;
    public z b;
    public com.google.android.material.elevation.a c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public int o;
    public int p;
    public final Paint.Style q;

    public g(g gVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = Paint.Style.FILL_AND_STROKE;
        this.a = gVar.a;
        this.b = gVar.b;
        this.c = gVar.c;
        this.k = gVar.k;
        this.d = gVar.d;
        this.e = gVar.e;
        this.g = gVar.g;
        this.f = gVar.f;
        this.l = gVar.l;
        this.i = gVar.i;
        this.p = gVar.p;
        this.j = gVar.j;
        this.m = gVar.m;
        this.n = gVar.n;
        this.o = gVar.o;
        this.q = gVar.q;
        if (gVar.h != null) {
            this.h = new Rect(gVar.h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        i iVar = new i(this);
        iVar.C = true;
        iVar.D = true;
        return iVar;
    }

    public g(m mVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = Paint.Style.FILL_AND_STROKE;
        this.a = mVar;
        this.c = null;
    }
}
