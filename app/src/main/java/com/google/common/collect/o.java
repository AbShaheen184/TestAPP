package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public transient Set e;
    public transient Collection y;
    public transient Map z;

    public Map a() {
        Map map = this.z;
        if (map != null) {
            return map;
        }
        Map mapB = b();
        this.z = mapB;
        return mapB;
    }

    public abstract Map b();

    public abstract Set c();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return a().equals(((o) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
