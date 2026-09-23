package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.a;
import androidx.coordinatorlayout.widget.d;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends a {
    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.a.g);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final void c(d dVar) {
        if (dVar.h == 0) {
            dVar.h = 80;
        }
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior() {
    }
}
