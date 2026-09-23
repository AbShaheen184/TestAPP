package com.app.mlounge.data.remote.ntv;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public final String a;
    public final Map b;

    public r(String str, Map map) {
        map.getClass();
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a.equals(rVar.a) && kotlin.jvm.internal.l.a(this.b, rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NtvStreamResult(url=" + this.a + ", headers=" + this.b + ")";
    }
}
