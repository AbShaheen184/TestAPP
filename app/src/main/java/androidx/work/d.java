package androidx.work;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final Uri a;
    public final boolean b;

    public d(boolean z, Uri uri) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b == dVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
