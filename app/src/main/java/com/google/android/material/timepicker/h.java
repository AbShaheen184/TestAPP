package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends ConstraintLayout {
    public final g P;
    public int Q;
    public final com.google.android.material.shape.i R;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.g] */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        com.google.android.material.shape.i iVar = new com.google.android.material.shape.i();
        this.R = iVar;
        com.google.android.material.shape.j jVar = new com.google.android.material.shape.j(0.5f);
        com.google.android.material.shape.l lVarF = iVar.y.a.f();
        lVarF.e = jVar;
        lVarF.f = jVar;
        lVarF.g = jVar;
        lVarF.h = jVar;
        iVar.setShapeAppearanceModel(lVarF.a());
        this.R.n(ColorStateList.valueOf(-1));
        setBackground(this.R);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.a.q, R.attr.materialClockStyle, 0);
        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.P = new Runnable() { // from class: com.google.android.material.timepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                this.e.m();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.P;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.P;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.R.n(ColorStateList.valueOf(i));
    }
}
