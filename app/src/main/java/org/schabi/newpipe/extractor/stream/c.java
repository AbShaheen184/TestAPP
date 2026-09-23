package org.schabi.newpipe.extractor.stream;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Serializable {
    public static final c z = new c("", 3);
    public final String e;
    public final int y;

    public c(String str, int i) {
        this.y = i;
        this.e = str == null ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.y == cVar.y && this.e.equals(cVar.e);
    }

    public final int hashCode() {
        return Objects.hash(this.e, Integer.valueOf(this.y));
    }
}
