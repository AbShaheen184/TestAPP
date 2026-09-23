package androidx.customview.widget;

import android.graphics.Rect;
import androidx.work.impl.model.f;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparator {
    public final f A;
    public final Rect e = new Rect();
    public final Rect y = new Rect();
    public final boolean z;

    public b(boolean z, f fVar) {
        this.z = z;
        this.A = fVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.A.getClass();
        Rect rect = this.e;
        ((androidx.core.view.accessibility.d) obj).f(rect);
        Rect rect2 = this.y;
        ((androidx.core.view.accessibility.d) obj2).f(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.z;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
