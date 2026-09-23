package okhttp3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends e0 {
    public final /* synthetic */ u b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte[] d;

    public d0(u uVar, int i, byte[] bArr) {
        this.b = uVar;
        this.c = i;
        this.d = bArr;
    }

    @Override // okhttp3.e0
    public final long a() {
        return this.c;
    }

    @Override // okhttp3.e0
    public final u b() {
        return this.b;
    }

    @Override // okhttp3.e0
    public final void d(okio.g gVar) {
        gVar.w(this.d, this.c);
    }
}
