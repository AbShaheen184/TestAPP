package androidx.media3.extractor.ts;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public e0(int i, int i2, int i3) {
        this.a = i != Integer.MIN_VALUE ? androidx.compose.runtime.j.d(i, "/") : "";
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }

    public final void a() {
        int i = this.d;
        this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.e = this.a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        kotlinx.coroutines.future.a.u("generateNewId() must be called before retrieving ids.");
    }

    public e0(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }
}
