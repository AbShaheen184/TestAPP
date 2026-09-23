package com.app.mlounge.data.remote.api;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class PlutoCategoriesResponse {
    public static final int $stable = 8;
    private final List<String> categories;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlutoCategoriesResponse) && l.a(this.categories, ((PlutoCategoriesResponse) obj).categories);
    }

    public final int hashCode() {
        List<String> list = this.categories;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "PlutoCategoriesResponse(categories=" + this.categories + ")";
    }
}
