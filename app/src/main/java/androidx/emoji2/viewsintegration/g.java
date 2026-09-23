package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.math.a {
    public final f L;

    public g(TextView textView) {
        this.L = new f(textView);
    }

    @Override // kotlin.math.a
    public final void K(boolean z) {
        if (androidx.emoji2.text.j.d()) {
            this.L.K(z);
        }
    }

    @Override // kotlin.math.a
    public final void N(boolean z) {
        boolean zD = androidx.emoji2.text.j.d();
        f fVar = this.L;
        if (zD) {
            fVar.N(z);
        } else {
            fVar.N = z;
        }
    }

    @Override // kotlin.math.a
    public final InputFilter[] r(InputFilter[] inputFilterArr) {
        return !androidx.emoji2.text.j.d() ? inputFilterArr : this.L.r(inputFilterArr);
    }
}
