package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.app.mlounge.R;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.j;
import com.google.android.material.shape.g;
import com.google.android.material.shape.i;
import com.google.android.material.shape.m;
import com.google.android.material.shape.w;
import com.google.android.material.shape.z;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final MaterialButton a;
    public m b;
    public z c;
    public androidx.dynamicanimation.animation.f d;
    public j e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public PorterDuff.Mode l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    public i p;
    public boolean t;
    public RippleDrawable v;
    public int w;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean u = true;

    public e(MaterialButton materialButton, m mVar) {
        this.a = materialButton;
        this.b = mVar;
    }

    public final i a(boolean z) {
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (i) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.h;
        int i4 = this.i;
        this.i = i2;
        this.h = i;
        if (!this.r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void c() {
        i iVar = new i(this.b);
        z zVar = this.c;
        if (zVar != null) {
            iVar.o(zVar);
        }
        androidx.dynamicanimation.animation.f fVar = this.d;
        if (fVar != null) {
            iVar.l(fVar);
        }
        j jVar = this.e;
        if (jVar != null) {
            iVar.a0 = jVar;
        }
        MaterialButton materialButton = this.a;
        iVar.k(materialButton.getContext());
        iVar.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            iVar.setTintMode(mode);
        }
        float f = this.k;
        ColorStateList colorStateList = this.n;
        iVar.y.k = f;
        iVar.invalidateSelf();
        g gVar = iVar.y;
        if (gVar.e != colorStateList) {
            gVar.e = colorStateList;
            iVar.onStateChange(iVar.getState());
        }
        i iVar2 = new i(this.b);
        z zVar2 = this.c;
        if (zVar2 != null) {
            iVar2.o(zVar2);
        }
        androidx.dynamicanimation.animation.f fVar2 = this.d;
        if (fVar2 != null) {
            iVar2.l(fVar2);
        }
        iVar2.setTint(0);
        float f2 = this.k;
        int iT = this.q ? _COROUTINE.b.t(materialButton, R.attr.colorSurface) : 0;
        iVar2.y.k = f2;
        iVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iT);
        g gVar2 = iVar2.y;
        if (gVar2.e != colorStateListValueOf) {
            gVar2.e = colorStateListValueOf;
            iVar2.onStateChange(iVar2.getState());
        }
        i iVar3 = new i(this.b);
        this.p = iVar3;
        z zVar3 = this.c;
        if (zVar3 != null) {
            iVar3.o(zVar3);
        }
        androidx.dynamicanimation.animation.f fVar3 = this.d;
        if (fVar3 != null) {
            this.p.l(fVar3);
        }
        this.p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(com.google.android.material.ripple.a.a(this.o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{iVar2, iVar}), this.f, this.h, this.g, this.i), this.p);
        this.v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        i iVarA = a(false);
        if (iVarA != null) {
            iVarA.m(this.w);
            iVarA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        w wVar;
        i iVarA = a(false);
        if (iVarA != null) {
            z zVar = this.c;
            if (zVar != null) {
                iVarA.o(zVar);
            } else {
                iVarA.setShapeAppearanceModel(this.b);
            }
            androidx.dynamicanimation.animation.f fVar = this.d;
            if (fVar != null) {
                iVarA.l(fVar);
            }
        }
        i iVarA2 = a(true);
        if (iVarA2 != null) {
            z zVar2 = this.c;
            if (zVar2 != null) {
                iVarA2.o(zVar2);
            } else {
                iVarA2.setShapeAppearanceModel(this.b);
            }
            androidx.dynamicanimation.animation.f fVar2 = this.d;
            if (fVar2 != null) {
                iVarA2.l(fVar2);
            }
        }
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            wVar = null;
        } else {
            int numberOfLayers = this.v.getNumberOfLayers();
            RippleDrawable rippleDrawable2 = this.v;
            wVar = numberOfLayers > 2 ? (w) rippleDrawable2.getDrawable(2) : (w) rippleDrawable2.getDrawable(1);
        }
        if (wVar != null) {
            wVar.setShapeAppearanceModel(this.b);
            if (wVar instanceof i) {
                i iVar = (i) wVar;
                z zVar3 = this.c;
                if (zVar3 != null) {
                    iVar.o(zVar3);
                }
                androidx.dynamicanimation.animation.f fVar3 = this.d;
                if (fVar3 != null) {
                    iVar.l(fVar3);
                }
            }
        }
    }

    public final void e() {
        i iVarA = a(false);
        i iVarA2 = a(true);
        if (iVarA != null) {
            float f = this.k;
            ColorStateList colorStateList = this.n;
            iVarA.y.k = f;
            iVarA.invalidateSelf();
            g gVar = iVarA.y;
            if (gVar.e != colorStateList) {
                gVar.e = colorStateList;
                iVarA.onStateChange(iVarA.getState());
            }
            if (iVarA2 != null) {
                float f2 = this.k;
                int iT = this.q ? _COROUTINE.b.t(this.a, R.attr.colorSurface) : 0;
                iVarA2.y.k = f2;
                iVarA2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iT);
                g gVar2 = iVarA2.y;
                if (gVar2.e != colorStateListValueOf) {
                    gVar2.e = colorStateListValueOf;
                    iVarA2.onStateChange(iVarA2.getState());
                }
            }
        }
    }
}
