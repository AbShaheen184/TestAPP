package com.app.mlounge.data.remote.model;

import java.util.Map;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class EpornerResolveResponse {
    public static final int $stable = 8;
    private final Map<String, Map<String, EpornerSourceDetail>> sources;

    public EpornerResolveResponse(Map map) {
        this.sources = map;
    }

    public final Map a() {
        return this.sources;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EpornerResolveResponse) && l.a(this.sources, ((EpornerResolveResponse) obj).sources);
    }

    public final int hashCode() {
        Map<String, Map<String, EpornerSourceDetail>> map = this.sources;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return "EpornerResolveResponse(sources=" + this.sources + ")";
    }
}
