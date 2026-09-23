package androidx.room.util;

import androidx.work.impl.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.text.r;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public i(String str, List list, List list2, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String str = iVar.a;
            if (this.b == iVar.b && this.c.equals(iVar.c) && l.a(this.d, iVar.d)) {
                String str2 = this.a;
                return r.u(str2, "index_", false) ? r.u(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + ((((r.u(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return kotlin.text.l.i(kotlin.text.l.k("\n            |Index {\n            |   name = '" + this.a + "',\n            |   unique = '" + this.b + "',\n            |   columns = {" + v.J(this.c) + "\n            |   orders = {" + v.I(this.d) + "\n            |}\n        "));
    }
}
