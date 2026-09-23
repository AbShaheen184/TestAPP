package androidx.media3.datasource;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public Uri a;
    public long b;
    public int c;
    public byte[] d;
    public Map e;
    public long f;
    public long g;
    public String h;
    public int i;

    public final l a() {
        _COROUTINE.a.v(this.a, "The uri must be set.");
        return new l(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
