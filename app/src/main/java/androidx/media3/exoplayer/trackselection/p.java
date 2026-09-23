package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.w0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final w0 a;
    public final int[] b;

    public p(int i, w0 w0Var, int[] iArr) {
        if (iArr.length == 0) {
            androidx.media3.common.util.b.g("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = w0Var;
        this.b = iArr;
    }
}
