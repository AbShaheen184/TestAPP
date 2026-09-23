package androidx.media3.exoplayer;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final String a;
    public final androidx.media3.common.r b;
    public final androidx.media3.common.r c;
    public final int d;
    public final int e;

    public d(String str, androidx.media3.common.r rVar, androidx.media3.common.r rVar2, int i, int i2) {
        _COROUTINE.a.o(i == 0 || i2 == 0);
        _COROUTINE.a.o(true ^ TextUtils.isEmpty(str));
        this.a = str;
        rVar.getClass();
        this.b = rVar;
        rVar2.getClass();
        this.c = rVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.d == dVar.d && this.e == dVar.e && this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c.equals(dVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.g((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
