package retrofit2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends z0 {
    public final boolean c;

    public h0(boolean z) {
        this.c = z;
    }

    @Override // retrofit2.z0
    public final void a(o0 o0Var, Object obj) {
        if (obj == null) {
            return;
        }
        o0Var.d(obj.toString(), null, this.c);
    }
}
