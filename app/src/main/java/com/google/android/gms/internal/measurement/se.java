package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class se {
    public final yb a;
    public final a1 b;

    public se(yb ybVar, a1 a1Var) {
        this.a = ybVar;
        if (a1Var != null) {
            this.b = a1Var;
        } else {
            com.google.firebase.platforminfo.b.h("Null extensionRegistryLite");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof se)) {
            return false;
        }
        se seVar = (se) obj;
        return this.a.equals(seVar.a) && this.b.equals(seVar.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String string2 = this.b.toString();
        StringBuilder sb = new StringBuilder(length + 53 + string2.length() + 1);
        androidx.room.b0.i(sb, "ProtoSerializer{defaultValue=", string, ", extensionRegistryLite=", string2);
        sb.append("}");
        return sb.toString();
    }
}
