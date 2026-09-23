package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends r0 {
    public static final h c = new h(i.a);

    @Override // kotlinx.serialization.internal.a
    public final int h(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // kotlinx.serialization.internal.n, kotlinx.serialization.internal.a
    public final void j(kotlinx.serialization.encoding.a aVar, int i, Object obj) {
        g gVar = (g) obj;
        gVar.getClass();
        byte bG = aVar.g(this.b, i);
        gVar.b(gVar.d() + 1);
        byte[] bArr = gVar.a;
        int i2 = gVar.b;
        gVar.b = i2 + 1;
        bArr[i2] = bG;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object k(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        g gVar = new g();
        gVar.a = bArr;
        gVar.b = bArr.length;
        gVar.b(10);
        return gVar;
    }

    @Override // kotlinx.serialization.internal.r0
    public final Object n() {
        return new byte[0];
    }

    @Override // kotlinx.serialization.internal.r0
    public final void o(kotlinx.serialization.json.internal.n nVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        nVar.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            q0 q0Var = this.b;
            q0Var.getClass();
            nVar.f(q0Var, i2);
            nVar.c(b);
        }
    }
}
