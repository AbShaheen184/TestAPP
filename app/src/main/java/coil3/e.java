package coil3;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements j {
    public final Drawable a;

    public e(Drawable drawable) {
        this.a = drawable;
    }

    @Override // coil3.j
    public final int a() {
        return coil3.util.m.a(this.a);
    }

    @Override // coil3.j
    public final int b() {
        return coil3.util.m.b(this.a);
    }

    @Override // coil3.j
    public final boolean c() {
        return false;
    }

    @Override // coil3.j
    public final void d(Canvas canvas) {
        this.a.draw(canvas);
    }

    @Override // coil3.j
    public final long e() {
        Drawable drawable = this.a;
        long jB = ((long) coil3.util.m.b(drawable)) * 4 * ((long) coil3.util.m.a(drawable));
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.l.a(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
