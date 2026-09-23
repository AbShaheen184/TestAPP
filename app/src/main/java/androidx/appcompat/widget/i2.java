package androidx.appcompat.widget;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends ViewGroup.MarginLayoutParams {
    public int a;
    public int b;

    public i2(i2 i2Var) {
        super((ViewGroup.MarginLayoutParams) i2Var);
        this.a = 0;
        this.a = i2Var.a;
    }

    public i2(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
