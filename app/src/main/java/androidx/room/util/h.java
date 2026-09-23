package androidx.room.util;

import androidx.work.impl.v;
import java.util.List;
import kotlin.collections.p;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public h(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (l.a(this.a, hVar.a) && l.a(this.b, hVar.b) && l.a(this.c, hVar.c) && this.d.equals(hVar.d)) {
            return this.e.equals(hVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.g(androidx.privacysandbox.ads.adservices.java.internal.a.g(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        return kotlin.text.l.i(kotlin.text.l.k("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + v.J(p.V(this.d)) + "\n            |   referenceColumnNames = {" + v.I(p.V(this.e)) + "\n            |}\n        "));
    }
}
