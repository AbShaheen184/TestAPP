package retrofit2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends RuntimeException {
    public final int e;
    public final transient r0 y;

    public q(r0 r0Var) {
        StringBuilder sb = new StringBuilder("HTTP ");
        okhttp3.g0 g0Var = r0Var.a;
        int i = g0Var.A;
        sb.append(i);
        sb.append(" ");
        sb.append(g0Var.z);
        super(sb.toString());
        this.e = i;
        this.y = r0Var;
    }
}
