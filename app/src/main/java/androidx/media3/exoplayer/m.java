package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements androidx.media3.common.util.l, com.google.android.datatransport.runtime.synchronization.b {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ m(int i, androidx.media3.common.p0 p0Var, androidx.media3.common.p0 p0Var2) {
        this.e = i;
        this.y = p0Var;
        this.z = p0Var2;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b
    public Object e() {
        com.appsalt.internal.k0 k0Var = (com.appsalt.internal.k0) this.y;
        ((com.google.android.datatransport.runtime.j) k0Var.d).u((com.google.android.datatransport.runtime.k) this.z, this.e + 1, false);
        return null;
    }

    @Override // androidx.media3.common.util.l
    public void invoke(Object obj) {
        androidx.media3.common.p0 p0Var = (androidx.media3.common.p0) this.y;
        androidx.media3.common.p0 p0Var2 = (androidx.media3.common.p0) this.z;
        androidx.media3.common.o0 o0Var = (androidx.media3.common.o0) obj;
        o0Var.getClass();
        o0Var.c(this.e, p0Var, p0Var2);
    }

    public /* synthetic */ m(com.appsalt.internal.k0 k0Var, com.google.android.datatransport.runtime.k kVar, int i) {
        this.y = k0Var;
        this.z = kVar;
        this.e = i;
    }
}
