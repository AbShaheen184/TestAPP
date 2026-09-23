package androidx.media3.extractor.ogg;

import androidx.media3.common.util.v;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public h0 b;
    public p c;
    public g d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final e a = new e();
    public androidx.localbroadcastmanager.content.b j = new androidx.localbroadcastmanager.content.b(19, false);

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j, androidx.localbroadcastmanager.content.b bVar);

    public void d(boolean z) {
        if (z) {
            this.j = new androidx.localbroadcastmanager.content.b(19, false);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
