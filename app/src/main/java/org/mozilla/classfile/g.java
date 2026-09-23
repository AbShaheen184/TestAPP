package org.mozilla.classfile;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public int a;
    public String b;
    public String c;
    public int d;

    public final boolean equals(Object obj) {
        String str = this.c;
        String str2 = this.b;
        int i = this.a;
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return i == gVar.a && str2.equals(gVar.b) && str.equals(gVar.c);
    }

    public final int hashCode() {
        return this.d;
    }
}
