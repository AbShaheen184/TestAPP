package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends n0 {
    @Override // androidx.appcompat.widget.n0, androidx.appcompat.widget.p0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // androidx.appcompat.widget.p0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
