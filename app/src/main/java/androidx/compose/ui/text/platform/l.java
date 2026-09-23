package androidx.compose.ui.text.platform;

import androidx.compose.runtime.w2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements w2 {
    public final boolean e;

    public l(boolean z) {
        this.e = z;
    }

    @Override // androidx.compose.runtime.w2
    public final Object getValue() {
        return Boolean.valueOf(this.e);
    }
}
