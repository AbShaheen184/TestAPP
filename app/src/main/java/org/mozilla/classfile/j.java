package org.mozilla.classfile;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final String a;
    public final String b;
    public final String c;
    public int d = -1;

    public j(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a.equals(jVar.a) && this.b.equals(jVar.b) && this.c.equals(jVar.c);
    }

    public final int hashCode() {
        if (this.d == -1) {
            this.d = (this.a.hashCode() ^ this.b.hashCode()) ^ this.c.hashCode();
        }
        return this.d;
    }
}
