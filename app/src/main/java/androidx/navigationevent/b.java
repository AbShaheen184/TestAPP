package androidx.navigationevent;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public b(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.c == bVar.c && this.d == bVar.d && this.b == bVar.b && this.a == bVar.a && this.e == bVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + androidx.privacysandbox.ads.adservices.java.internal.a.d(this.a, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.b, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
