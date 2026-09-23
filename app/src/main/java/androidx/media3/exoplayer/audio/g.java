package androidx.media3.exoplayer.audio;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public boolean a;
    public boolean b;
    public boolean c;

    public /* synthetic */ g(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public h a() {
        if (this.a || !(this.b || this.c)) {
            return new h(this);
        }
        kotlinx.coroutines.future.a.u("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }
}
