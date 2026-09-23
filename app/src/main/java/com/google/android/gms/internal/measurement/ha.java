package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ha {
    public final Context a;
    public final com.google.common.base.q b;

    public ha(Context context, com.google.common.base.q qVar) {
        this.a = context;
        this.b = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ha)) {
            return false;
        }
        ha haVar = (ha) obj;
        if (!this.a.equals(haVar.a)) {
            return false;
        }
        com.google.common.base.q qVar = haVar.b;
        com.google.common.base.q qVar2 = this.b;
        if (qVar2 == null) {
            return qVar == null;
        }
        return qVar2.equals(qVar);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        com.google.common.base.q qVar = this.b;
        return (iHashCode * 1000003) ^ (qVar == null ? 0 : qVar.hashCode());
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        androidx.room.b0.i(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
