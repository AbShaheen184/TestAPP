package androidx.media3.container;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public final /* synthetic */ int e;
    public int y;

    public /* synthetic */ f(int i, int i2) {
        this.e = i2;
        this.y = i;
    }

    public static String d(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public void a(int i) {
        this.y = i | this.y;
    }

    public boolean e(int i) {
        return (this.y & i) == i;
    }

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int m();

    public abstract int n();

    public String toString() {
        switch (this.e) {
            case 0:
                return d(this.y);
            default:
                return super.toString();
        }
    }
}
