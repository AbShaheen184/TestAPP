package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends _COROUTINE.a {
    public final /* synthetic */ int m;

    @Override // _COROUTINE.a
    public final int P(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i;
        switch (this.m) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // _COROUTINE.a
    public final int U() {
        switch (this.m) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // _COROUTINE.a
    public final ViewPropertyAnimator V(View view, int i) {
        switch (this.m) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
