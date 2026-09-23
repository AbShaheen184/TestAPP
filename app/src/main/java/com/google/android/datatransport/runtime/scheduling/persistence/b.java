package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final long a;
    public final k b;
    public final com.google.android.datatransport.runtime.i c;

    public b(long j, k kVar, com.google.android.datatransport.runtime.i iVar) {
        this.a = j;
        this.b = kVar;
        this.c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b.equals(bVar.b) && this.c.equals(bVar.c);
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
