package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends CheckBox {
    public v A;
    public final r e;
    public final o y;
    public final h0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.chipStyle);
        z1.a(context);
        y1.a(this, getContext());
        this.e = new r(this);
        Context context2 = getContext();
        int[] iArr = androidx.appcompat.a.j;
        c2 c2VarR = c2.R(context2, attributeSet, iArr, R.attr.chipStyle);
        TypedArray typedArray = (TypedArray) c2VarR.z;
        androidx.core.view.s0.l(this, getContext(), iArr, attributeSet, (TypedArray) c2VarR.z, R.attr.chipStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setButtonDrawable(androidx.work.impl.v.v(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setButtonDrawable(androidx.work.impl.v.v(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setButtonDrawable(androidx.work.impl.v.v(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setButtonTintList(c2VarR.y(2));
            }
            if (typedArray.hasValue(3)) {
                setButtonTintMode(t0.b(typedArray.getInt(3, -1), null));
            }
            c2VarR.U();
            o oVar = new o(this);
            this.y = oVar;
            oVar.f(attributeSet, R.attr.chipStyle);
            h0 h0Var = new h0(this);
            this.z = h0Var;
            h0Var.d(attributeSet, R.attr.chipStyle);
            getEmojiTextViewHelper().a(attributeSet, R.attr.chipStyle);
        } catch (Throwable th) {
            c2VarR.U();
            throw th;
        }
    }

    private v getEmojiTextViewHelper() {
        if (this.A == null) {
            this.A = new v(this);
        }
        return this.A;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.y;
        if (oVar != null) {
            oVar.b();
        }
        h0 h0Var = this.z;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.y;
        if (oVar != null) {
            return oVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.y;
        if (oVar != null) {
            return oVar.e();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        r rVar = this.e;
        if (rVar != null) {
            return (ColorStateList) rVar.e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        r rVar = this.e;
        if (rVar != null) {
            return (PorterDuff.Mode) rVar.f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        a2 a2Var = this.z.h;
        if (a2Var != null) {
            return (ColorStateList) a2Var.c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        a2 a2Var = this.z.h;
        if (a2Var != null) {
            return (PorterDuff.Mode) a2Var.d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((kotlin.math.a) getEmojiTextViewHelper().b.e).K(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.y;
        if (oVar != null) {
            oVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o oVar = this.y;
        if (oVar != null) {
            oVar.i(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        r rVar = this.e;
        if (rVar != null) {
            if (rVar.c) {
                rVar.c = false;
            } else {
                rVar.c = true;
                rVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.z;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.z;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((kotlin.math.a) getEmojiTextViewHelper().b.e).N(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((kotlin.math.a) getEmojiTextViewHelper().b.e).r(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.y;
        if (oVar != null) {
            oVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.y;
        if (oVar != null) {
            oVar.n(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        r rVar = this.e;
        if (rVar != null) {
            rVar.e = colorStateList;
            rVar.a = true;
            rVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        r rVar = this.e;
        if (rVar != null) {
            rVar.f = mode;
            rVar.b = true;
            rVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        h0 h0Var = this.z;
        h0Var.i(colorStateList);
        h0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        h0 h0Var = this.z;
        h0Var.j(mode);
        h0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(androidx.work.impl.v.v(getContext(), i));
    }
}
