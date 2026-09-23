package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;

    public r0(CharSequence charSequence, long j, TextClassification textClassification) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return kotlin.jvm.internal.l.a(this.a, r0Var.a) && androidx.compose.ui.text.l0.b(this.b, r0Var.b) && kotlin.jvm.internal.l.a(this.c, r0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = androidx.compose.ui.text.l0.c;
        return this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + ((Object) androidx.compose.ui.text.l0.h(this.b)) + ", textClassification=" + this.c + ')';
    }
}
