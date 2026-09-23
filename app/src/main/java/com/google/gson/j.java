package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends g {
    public final com.google.gson.internal.n e = new com.google.gson.internal.n(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof j) && ((j) obj).e.equals(this.e);
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final void i(String str, g gVar) {
        if (gVar == null) {
            gVar = i.e;
        }
        this.e.put(str, gVar);
    }

    public final void j(String str, Boolean bool) {
        i(str, new k(bool));
    }

    public final void k(String str, String str2) {
        i(str, str2 == null ? i.e : new k(str2));
    }

    public final g l(String str) {
        return (g) this.e.get(str);
    }

    public final f m(String str) {
        return (f) this.e.get(str);
    }

    public final j o(String str) {
        return (j) this.e.get(str);
    }
}
