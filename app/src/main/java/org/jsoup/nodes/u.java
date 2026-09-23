package org.jsoup.nodes;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final u c;
    public final t a;
    public final t b;

    static {
        t tVar = new t(-1, -1, -1);
        c = new u(tVar, tVar);
    }

    public u(t tVar, t tVar2) {
        this.a = tVar;
        this.b = tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.a.equals(uVar.a)) {
            return this.b.equals(uVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a + "-" + this.b;
    }
}
