package androidx.media3.exoplayer.audio;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public final Context a;
    public j0 b;
    public o0 c;
    public b d;
    public final float e;

    public e0(Context context) {
        this.a = context != null ? context.getApplicationContext() : null;
        this.c = o0.a;
        if (context == null) {
            this.d = b.f;
        }
        this.e = 8.0f;
    }
}
