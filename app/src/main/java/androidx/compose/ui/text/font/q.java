package androidx.compose.ui.text.font;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements p {
    public static Typeface a(String str, k kVar, int i) {
        if (i == 0 && kotlin.jvm.internal.l.a(kVar, k.z) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), kVar.e, i == 1);
    }

    @Override // androidx.compose.ui.text.font.p
    public final Typeface b(m mVar, k kVar, int i) {
        mVar.getClass();
        return a("sans-serif", kVar, i);
    }

    @Override // androidx.compose.ui.text.font.p
    public final Typeface h(k kVar, int i) {
        return a(null, kVar, i);
    }
}
