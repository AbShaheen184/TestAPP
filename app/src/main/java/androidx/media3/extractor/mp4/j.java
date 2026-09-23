package androidx.media3.extractor.mp4;

import androidx.media3.extractor.e0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements e0 {
    public static final j y = new j(true);
    public static final j z = new j(false);
    public final boolean e;

    public j(boolean z2) {
        this.e = z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncorrectFragmentation{expected=");
        sb.append(!this.e);
        sb.append("}");
        return sb.toString();
    }
}
