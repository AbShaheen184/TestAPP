package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements t1 {
    public static final v1 b = new v1(0);
    public static final v1 c = new v1(1);
    public final /* synthetic */ int a;

    public /* synthetic */ v1(int i) {
        this.a = i;
    }

    @Override // androidx.compose.foundation.t1
    public final boolean a() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // androidx.compose.foundation.t1
    public final s1 b(View view, androidx.compose.ui.unit.c cVar) {
        switch (this.a) {
            case 0:
                return new u1(new Magnifier(view));
            default:
                return new w1(new Magnifier(view));
        }
    }
}
