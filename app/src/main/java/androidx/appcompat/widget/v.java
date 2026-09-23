package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final TextView a;
    public final com.google.firebase.platforminfo.d b;

    public v(TextView textView) {
        this.a = textView;
        com.google.firebase.platforminfo.d dVar = new com.google.firebase.platforminfo.d();
        dVar.e = new androidx.emoji2.viewsintegration.g(textView);
        this.b = dVar;
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, androidx.appcompat.a.g, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((kotlin.math.a) this.b.e).N(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
