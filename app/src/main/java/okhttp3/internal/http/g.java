package okhttp3.internal.http;

import kotlin.collections.o;
import kotlin.text.i;
import okhttp3.j0;
import okhttp3.u;
import okio.b0;
import okio.h;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j0 {
    public final long A;
    public final b0 B;
    public final String z;

    public g(String str, long j, b0 b0Var) {
        this.z = str;
        this.A = j;
        this.B = b0Var;
    }

    @Override // okhttp3.j0
    public final h P() {
        return this.B;
    }

    @Override // okhttp3.j0
    public final long n() {
        return this.A;
    }

    @Override // okhttp3.j0
    public final u x() {
        String str = this.z;
        if (str == null) {
            return null;
        }
        i iVar = u.e;
        try {
            return o.s(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
