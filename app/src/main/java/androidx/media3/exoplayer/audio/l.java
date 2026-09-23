package androidx.media3.exoplayer.audio;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public int a = 0;
    public boolean b;
    public boolean c;
    public boolean d;

    public m a() {
        if (this.b || !(this.c || this.d)) {
            return new m(this);
        }
        kotlinx.coroutines.future.a.u("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        return null;
    }
}
