package androidx.room.util;

import androidx.work.impl.v;
import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.p;
import kotlin.collections.w;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final String a;
    public final Object b;
    public final Set c;
    public final Set d;

    public j(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!this.a.equals(jVar.a) || !this.b.equals(jVar.b) || !l.a(this.c, jVar.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = jVar.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(v.o(p.W(this.b.values(), new androidx.constraintlayout.core.e(5))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(v.o(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        sb.append(v.o(set != null ? p.W(set, new androidx.constraintlayout.core.e(6)) : w.e));
        sb.append("\n            |}\n        ");
        return kotlin.text.l.k(sb.toString());
    }
}
