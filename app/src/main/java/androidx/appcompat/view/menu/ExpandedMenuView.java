package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.c2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements i, AdapterView.OnItemClickListener {
    public static final int[] e = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        c2 c2VarR = c2.R(context, attributeSet, e, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c2VarR.z;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c2VarR.C(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c2VarR.C(1));
        }
        c2VarR.U();
    }

    @Override // androidx.appcompat.view.menu.i
    public final boolean a(k kVar) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        throw null;
    }
}
