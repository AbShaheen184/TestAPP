package kotlinx.serialization.json;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends w {
    public final boolean e;
    public final String y;

    public m(String str, boolean z) {
        str.getClass();
        this.e = z;
        this.y = str.toString();
    }

    @Override // kotlinx.serialization.json.w
    public final String b() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.e == mVar.e && kotlin.jvm.internal.l.a(this.y, mVar.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (Boolean.hashCode(this.e) * 31);
    }

    @Override // kotlinx.serialization.json.w
    public final String toString() {
        boolean z = this.e;
        String str = this.y;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        kotlinx.serialization.json.internal.p.a(str, sb);
        return sb.toString();
    }
}
