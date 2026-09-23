package kotlin.time;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {
    public static final g b = new g(0);
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    @Override // kotlin.time.h
    public f a() {
        return new f(e.b());
    }

    public String toString() {
        switch (this.a) {
            case 0:
                int i = e.b;
                return "TimeSource(System.nanoTime())";
            default:
                return super.toString();
        }
    }
}
