package androidx.work;

import android.net.NetworkRequest;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final e j = new e();
    public final z a;
    public final androidx.work.impl.utils.f b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public e(e eVar) {
        eVar.getClass();
        this.c = eVar.c;
        this.d = eVar.d;
        this.b = eVar.b;
        this.a = eVar.a;
        this.e = eVar.e;
        this.f = eVar.f;
        this.i = eVar.i;
        this.g = eVar.g;
        this.h = eVar.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !e.class.equals(obj.getClass())) {
            return false;
        }
        e eVar = (e) obj;
        if (this.c == eVar.c && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f && this.g == eVar.g && this.h == eVar.h && kotlin.jvm.internal.l.a(a(), eVar.a()) && this.a == eVar.a) {
            return kotlin.jvm.internal.l.a(this.i, eVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int iHashCode2 = (this.i.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestA = a();
        return iHashCode2 + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public e(androidx.work.impl.utils.f fVar, z zVar, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, LinkedHashSet linkedHashSet) {
        this.b = fVar;
        this.a = zVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = linkedHashSet;
    }

    public e() {
        this.b = new androidx.work.impl.utils.f(null);
        this.a = z.e;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = kotlin.collections.y.e;
    }
}
