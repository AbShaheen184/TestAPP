package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.text.input.internal.o;
import com.app.mlounge.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ViewGroup {
    public final o A;
    public int B;
    public final int e;
    public final ArrayList y;
    public final ArrayList z;

    public d(Context context) {
        super(context);
        this.e = 5;
        ArrayList arrayList = new ArrayList();
        this.y = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.z = arrayList2;
        this.A = new o(9);
        setClipChildren(false);
        e eVar = new e(context);
        addView(eVar);
        arrayList.add(eVar);
        arrayList2.add(eVar);
        this.B = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
