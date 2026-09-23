package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements v {
    public static final f0 F = new f0();
    public Handler B;
    public int e;
    public int y;
    public boolean z = true;
    public boolean A = true;
    public final x C = new x(this, true);
    public final androidx.activity.l D = new androidx.activity.l(this, 9);
    public final w0 E = new w0(this);

    public final void a() {
        int i = this.y + 1;
        this.y = i;
        if (i == 1) {
            if (this.z) {
                this.C.e(n.ON_RESUME);
                this.z = false;
            } else {
                Handler handler = this.B;
                handler.getClass();
                handler.removeCallbacks(this.D);
            }
        }
    }

    @Override // androidx.lifecycle.v
    public final p getLifecycle() {
        return this.C;
    }
}
