package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.work.impl.v;
import com.app.mlounge.R;
import com.google.android.material.internal.i;
import com.google.android.material.shape.m;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends FrameLayout {
    public static final b F = new b();
    public final float A;
    public final int B;
    public final int C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public final m e;
    public int y;
    public final float z;

    public c(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(com.google.android.material.theme.overlay.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, com.google.android.material.a.u);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.y = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.e = m.b(context2, attributeSet, 0, 0).a();
        }
        this.z = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(v.s(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(i.f(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.A = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(F);
        setFocusable(true);
        if (getBackground() == null) {
            int iA = _COROUTINE.b.A(getBackgroundOverlayColorAlpha(), _COROUTINE.b.t(this, R.attr.colorSurface), _COROUTINE.b.t(this, R.attr.colorOnSurface));
            m mVar = this.e;
            if (mVar != null) {
                int i = d.a;
                com.google.android.material.shape.i iVar = new com.google.android.material.shape.i(mVar);
                iVar.n(ColorStateList.valueOf(iA));
                drawable = iVar;
            } else {
                Resources resources = getResources();
                int i2 = d.a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iA);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            setBackground(drawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.A;
    }

    public int getAnimationMode() {
        return this.y;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.z;
    }

    public int getMaxInlineActionWidth() {
        return this.C;
    }

    public int getMaxWidth() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.B;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.y = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.D != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.D);
            drawable.setTintMode(this.E);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.D = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.E);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.E = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : F);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
