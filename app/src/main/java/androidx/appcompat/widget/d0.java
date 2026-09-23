package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ int y;
    public final /* synthetic */ View z;

    public d0(TextView textView, Typeface typeface, int i) {
        this.z = textView;
        this.A = typeface;
        this.y = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ((TextView) this.z).setTypeface((Typeface) this.A, this.y);
                break;
            default:
                ((BottomSheetBehavior) this.A).E(this.z, this.y, false);
                break;
        }
    }

    public d0(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.A = bottomSheetBehavior;
        this.z = view;
        this.y = i;
    }
}
