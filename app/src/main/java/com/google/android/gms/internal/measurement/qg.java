package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class qg implements hg {
    public final hg a;
    public final Object b;

    public qg(hg hgVar, Object obj) {
        this.a = hgVar;
        e1.c(obj, "log site qualifier");
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qg)) {
            return false;
        }
        qg qgVar = (qg) obj;
        return this.a.equals(qgVar.a) && this.b.equals(qgVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String string2 = this.b.toString();
        StringBuilder sb = new StringBuilder(length + 47 + string2.length() + 3);
        androidx.room.b0.i(sb, "SpecializedLogSiteKey{ delegate='", string, "', qualifier='", string2);
        sb.append("' }");
        return sb.toString();
    }
}
