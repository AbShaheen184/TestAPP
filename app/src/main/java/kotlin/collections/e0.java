package kotlin.collections;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends b {
    public int A;
    public final /* synthetic */ f0 B;
    public int z;

    public e0(f0 f0Var) {
        this.B = f0Var;
        this.z = f0Var.A;
        this.A = f0Var.z;
    }

    @Override // kotlin.collections.b
    public final void b() {
        int i = this.z;
        if (i == 0) {
            this.e = 2;
            return;
        }
        f0 f0Var = this.B;
        Object[] objArr = f0Var.e;
        int i2 = this.A;
        this.y = objArr[i2];
        this.e = 1;
        this.A = (i2 + 1) % f0Var.y;
        this.z = i - 1;
    }
}
