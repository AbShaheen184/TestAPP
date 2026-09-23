package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public final Context a;
    public final int b;
    public long c = 0;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public q0(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? q.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(androidx.compose.foundation.gestures.o1 o1Var) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        EdgeEffect edgeEffectA = i >= 31 ? q.a(context) : new w0(context);
        edgeEffectA.setColor(this.b);
        if (!androidx.compose.ui.unit.l.a(this.c, 0L)) {
            long j = this.c;
            if (o1Var == androidx.compose.foundation.gestures.o1.e) {
                edgeEffectA.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectA;
            }
            edgeEffectA.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return edgeEffectA;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(androidx.compose.foundation.gestures.o1.e);
        this.e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(androidx.compose.foundation.gestures.o1.y);
        this.f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(androidx.compose.foundation.gestures.o1.y);
        this.g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(androidx.compose.foundation.gestures.o1.e);
        this.d = edgeEffectA;
        return edgeEffectA;
    }
}
