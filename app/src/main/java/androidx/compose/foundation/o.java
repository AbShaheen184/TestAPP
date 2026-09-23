package androidx.compose.foundation;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final Context a;
    public final androidx.compose.ui.unit.c b;
    public final long c;
    public final androidx.compose.foundation.layout.z0 d;

    public o(Context context, androidx.compose.ui.unit.c cVar, long j, androidx.compose.foundation.layout.z0 z0Var) {
        this.a = context;
        this.b = cVar;
        this.c = j;
        this.d = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        o oVar = (o) obj;
        return kotlin.jvm.internal.l.a(this.a, oVar.a) && kotlin.jvm.internal.l.a(this.b, oVar.b) && androidx.compose.ui.graphics.t.c(this.c, oVar.c) && kotlin.jvm.internal.l.a(this.d, oVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = androidx.compose.ui.graphics.t.j;
        return this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e(iHashCode, 31, this.c);
    }
}
