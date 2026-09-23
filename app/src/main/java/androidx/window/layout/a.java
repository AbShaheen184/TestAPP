package androidx.window.layout;

import android.graphics.Rect;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final androidx.window.core.a a;
    public final float b;

    public a(Rect rect, float f) {
        this.a = new androidx.window.core.a(rect);
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        a aVar = (a) obj;
        return l.a(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.a);
        sb.append(", density=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.b, ')');
    }

    public a(androidx.window.core.a aVar, float f) {
        this.a = aVar;
        this.b = f;
    }
}
