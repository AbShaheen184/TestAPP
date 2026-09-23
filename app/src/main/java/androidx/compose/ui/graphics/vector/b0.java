package androidx.compose.ui.graphics.vector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends c0 {
    public final float c;

    public b0(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Float.compare(this.c, ((b0) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(new StringBuilder("VerticalTo(y="), this.c, ')');
    }
}
