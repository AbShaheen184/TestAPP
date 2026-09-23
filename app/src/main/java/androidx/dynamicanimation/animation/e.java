package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.compose.foundation.text.input.internal.o;
import androidx.transition.k;
import com.google.android.material.shape.w;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final d m = new d(1);
    public static final d n = new d(2);
    public static final d o = new d(3);
    public static final d p = new d(4);
    public static final d q = new d(5);
    public static final d r = new d(0);
    public final w c;
    public final coil3.svg.internal.a d;
    public final float g;
    public f j;
    public float k;
    public boolean l;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean e = false;
    public long f = 0;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public e(w wVar, coil3.svg.internal.a aVar) {
        this.c = wVar;
        this.d = aVar;
        if (aVar == o || aVar == p || aVar == q) {
            this.g = 0.1f;
        } else if (aVar == r) {
            this.g = 0.00390625f;
        } else if (aVar == m || aVar == n) {
            this.g = 0.002f;
        } else {
            this.g = 1.0f;
        }
        this.j = null;
        this.k = Float.MAX_VALUE;
        this.l = false;
    }

    public static c b() {
        ThreadLocal threadLocal = c.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new o(27)));
        }
        return (c) threadLocal.get();
    }

    public final void a(float f) {
        if (this.e) {
            this.k = f;
            return;
        }
        if (this.j == null) {
            this.j = new f(f);
        }
        f fVar = this.j;
        double d = f;
        fVar.i = d;
        double d2 = (float) d;
        if (d2 > Float.MAX_VALUE) {
            com.google.firebase.platforminfo.b.n("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < -3.4028235E38f) {
            com.google.firebase.platforminfo.b.n("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.g * 0.75f);
        fVar.d = dAbs;
        fVar.e = dAbs * 62.5d;
        o oVar = b().e;
        oVar.getClass();
        if (Thread.currentThread() != ((Looper) oVar.z).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.e;
        if (z || z) {
            return;
        }
        this.e = true;
        float fZ = this.d.z(this.c);
        this.b = fZ;
        if (fZ > Float.MAX_VALUE || fZ < -3.4028235E38f) {
            kotlinx.coroutines.future.a.q("Starting value need to be in between min value and max value");
        } else {
            b().a(this);
        }
    }

    public final void c(float f) {
        this.d.R(this.c, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                k.h();
                return;
            }
            i++;
        }
    }

    public final void d() {
        if (this.j.b <= 0.0d) {
            com.google.firebase.platforminfo.b.n("Spring animations can only come to an end when there is damping");
            return;
        }
        o oVar = b().e;
        oVar.getClass();
        if (Thread.currentThread() != ((Looper) oVar.z).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.e) {
            this.l = true;
        }
    }
}
