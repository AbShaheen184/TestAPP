package com.google.firebase.sessions.api;

import com.google.firebase.crashlytics.internal.common.j;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Mutex a;
    public j b;

    public a(Mutex mutex) {
        mutex.getClass();
        this.a = mutex;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.a, aVar.a) && l.a(this.b, aVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        j jVar = this.b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + ')';
    }
}
