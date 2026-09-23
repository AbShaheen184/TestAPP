package androidx.media3.exoplayer;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements androidx.media3.common.util.l, androidx.core.view.accessibility.n {
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ n(Object obj, int i, int i2) {
        this.e = i2;
        this.z = obj;
        this.y = i;
    }

    @Override // androidx.core.view.accessibility.n
    public boolean a(View view) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.z;
        int i = this.y;
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = sideSheetBehavior.p;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.r(i);
            return true;
        }
        View view2 = (View) sideSheetBehavior.p.get();
        androidx.compose.foundation.text.input.internal.d dVar = new androidx.compose.foundation.text.input.internal.d(sideSheetBehavior, i, 5);
        ViewParent parent = view2.getParent();
        if (parent != null && parent.isLayoutRequested() && view2.isAttachedToWindow()) {
            view2.post(dVar);
            return true;
        }
        dVar.run();
        return true;
    }

    @Override // androidx.media3.common.util.l
    public void invoke(Object obj) {
        switch (this.e) {
            case 0:
                ((androidx.media3.common.o0) obj).x((androidx.media3.common.c0) this.z, this.y);
                break;
            default:
                androidx.media3.common.v0 v0Var = ((c1) this.z).a;
                ((androidx.media3.common.o0) obj).n(this.y);
                break;
        }
    }
}
