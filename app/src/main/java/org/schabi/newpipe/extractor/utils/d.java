package org.schabi.newpipe.extractor.utils;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Serializable {
    public final Serializable e;
    public final Serializable y;

    public d(Serializable serializable, Serializable serializable2) {
        this.e = serializable;
        this.y = serializable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (Objects.equals(this.e, dVar.e) && Objects.equals(this.y, dVar.y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.e, this.y);
    }

    public final String toString() {
        return "{" + this.e + ", " + this.y + "}";
    }
}
