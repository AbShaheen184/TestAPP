package okhttp3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j0 {
    public final String A;
    public final String B;
    public final okio.b0 C;
    public final okhttp3.internal.cache.e z;

    public c(okhttp3.internal.cache.e eVar, String str, String str2) {
        this.z = eVar;
        this.A = str;
        this.B = str2;
        this.C = new okio.b0(new coil3.decode.b((okio.h0) eVar.z.get(1), this));
    }

    @Override // okhttp3.j0
    public final okio.h P() {
        return this.C;
    }

    @Override // okhttp3.j0
    public final long n() {
        String str = this.B;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = okhttp3.internal.e.a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // okhttp3.j0
    public final u x() {
        String str = this.A;
        if (str == null) {
            return null;
        }
        kotlin.text.i iVar = u.e;
        try {
            return kotlin.collections.o.s(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
