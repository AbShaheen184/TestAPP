package coil3.request;

import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements o {
    public final Job e;

    public /* synthetic */ a(Job job) {
        this.e = job;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return kotlin.jvm.internal.l.a(this.e, ((a) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.e + ")";
    }
}
