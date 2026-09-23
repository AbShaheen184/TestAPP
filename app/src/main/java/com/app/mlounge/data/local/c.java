package com.app.mlounge.data.local;

import androidx.room.b0;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final String a;
    public final List b;
    public final List c;

    public c(String str, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.a, cVar.a) && l.a(this.b, cVar.b) && l.a(this.c, cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TableSpec(name=");
        sb.append(this.a);
        sb.append(", columns=");
        sb.append(this.b);
        sb.append(", indices=");
        return b0.f(sb, this.c, ")");
    }
}
