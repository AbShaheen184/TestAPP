package androidx.compose.foundation;

import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class u1 implements s1 {
    public final Magnifier a;

    public u1(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // androidx.compose.foundation.s1
    public void a(long j, long j2) {
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return (((long) this.a.getHeight()) & 4294967295L) | (((long) this.a.getWidth()) << 32);
    }

    public final void d() {
        this.a.update();
    }
}
