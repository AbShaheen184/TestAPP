package androidx.media3.common.util;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final Object a;
    public androidx.core.text.f b = new androidx.core.text.f();
    public boolean c;
    public boolean d;

    public n(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
