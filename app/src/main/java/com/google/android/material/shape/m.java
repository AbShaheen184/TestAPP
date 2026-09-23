package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public coil3.svg.internal.a a = new k();
    public coil3.svg.internal.a b = new k();
    public coil3.svg.internal.a c = new k();
    public coil3.svg.internal.a d = new k();
    public d e = new a(0.0f);
    public d f = new a(0.0f);
    public d g = new a(0.0f);
    public d h = new a(0.0f);
    public f i;
    public f j;
    public f k;
    public f l;

    public m() {
        int i = 0;
        this.i = new f(i);
        this.j = new f(i);
        this.k = new f(i);
        this.l = new f(i);
    }

    public static l a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(com.google.android.material.a.s);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            d dVarC = c(typedArrayObtainStyledAttributes, 5, aVar);
            d dVarC2 = c(typedArrayObtainStyledAttributes, 8, dVarC);
            d dVarC3 = c(typedArrayObtainStyledAttributes, 9, dVarC);
            d dVarC4 = c(typedArrayObtainStyledAttributes, 7, dVarC);
            d dVarC5 = c(typedArrayObtainStyledAttributes, 6, dVarC);
            l lVar = new l();
            lVar.a = com.google.android.gms.dynamite.g.o(i4);
            lVar.e = dVarC2;
            lVar.b = com.google.android.gms.dynamite.g.o(i5);
            lVar.f = dVarC3;
            lVar.c = com.google.android.gms.dynamite.g.o(i6);
            lVar.g = dVarC4;
            lVar.d = com.google.android.gms.dynamite.g.o(i7);
            lVar.h = dVarC5;
            return lVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static l b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.a.m, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static d c(TypedArray typedArray, int i, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new j(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean d() {
        return (this.b instanceof k) && (this.a instanceof k) && (this.c instanceof k) && (this.d instanceof k);
    }

    public final boolean e(RectF rectF) {
        boolean z = this.l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.k.getClass().equals(f.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && d();
    }

    public final l f() {
        l lVar = new l();
        lVar.a = this.a;
        lVar.b = this.b;
        lVar.c = this.c;
        lVar.d = this.d;
        lVar.e = this.e;
        lVar.f = this.f;
        lVar.g = this.g;
        lVar.h = this.h;
        lVar.i = this.i;
        lVar.j = this.j;
        lVar.k = this.k;
        lVar.l = this.l;
        return lVar;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }
}
