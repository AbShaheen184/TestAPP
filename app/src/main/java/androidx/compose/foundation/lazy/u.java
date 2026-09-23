package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.g0;
import androidx.compose.runtime.g1;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public final /* synthetic */ int a;
    public final g1 b;
    public final g1 c;
    public boolean d;
    public Object e;
    public final g0 f;

    public u(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = new g1(i);
                this.c = new g1(i2);
                this.f = new g0(i, 90, Context.VERSION_ES6);
                break;
            default:
                this.b = new g1(i);
                this.c = new g1(i2);
                this.f = new g0(i, 30, 100);
                break;
        }
    }

    public final void a(int i, int i2) {
        switch (this.a) {
            case 0:
                if (i < 0.0f) {
                    androidx.compose.foundation.internal.b.a("Index should be non-negative (" + i + ')');
                }
                this.b.h(i);
                this.f.b(i);
                this.c.h(i2);
                break;
            default:
                if (i < 0.0f) {
                    androidx.compose.foundation.internal.b.a("Index should be non-negative");
                }
                this.b.h(i);
                this.f.b(i);
                this.c.h(i2);
                break;
        }
    }
}
