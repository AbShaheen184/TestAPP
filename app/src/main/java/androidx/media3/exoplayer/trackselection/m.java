package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.w0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public final androidx.media3.common.r A;
    public final int e;
    public final w0 y;
    public final int z;

    public m(int i, w0 w0Var, int i2) {
        this.e = i;
        this.y = w0Var;
        this.z = i2;
        this.A = w0Var.d[i2];
    }

    public abstract int a();

    public abstract boolean d(m mVar);
}
