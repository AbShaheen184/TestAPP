package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout$ScrollingViewBehavior {
    public SearchBar$ScrollingViewBehavior() {
    }

    @Override // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior, androidx.coordinatorlayout.widget.a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.d(coordinatorLayout, view, view2);
        return false;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
