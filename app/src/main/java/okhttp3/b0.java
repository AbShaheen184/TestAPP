package okhttp3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public final s a;
    public final String b;
    public final r c;
    public final e0 d;
    public final kotlin.collections.g0 e;
    public g f;

    public b0(a0 a0Var) {
        a0Var.getClass();
        s sVar = a0Var.a;
        if (sVar == null) {
            kotlinx.coroutines.future.a.u("url == null");
            throw null;
        }
        this.a = sVar;
        this.b = a0Var.b;
        this.c = a0Var.c.k();
        this.d = a0Var.d;
        this.e = a0Var.e;
    }

    public final a0 a() {
        a0 a0Var = new a0();
        a0Var.a = this.a;
        a0Var.b = this.b;
        a0Var.d = this.d;
        a0Var.e = this.e;
        a0Var.c = this.c.d();
        return a0Var;
    }

    public final s b() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        r rVar = this.c;
        if (rVar.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : rVar) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.q.o();
                    throw null;
                }
                kotlin.k kVar = (kotlin.k) obj;
                String str = (String) kVar.e;
                String str2 = (String) kVar.y;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (okhttp3.internal.e.m(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        okhttp3.internal.a aVar = okhttp3.internal.a.d;
        kotlin.collections.g0 g0Var = this.e;
        if (!kotlin.jvm.internal.l.a(g0Var, aVar)) {
            sb.append(", tags=");
            sb.append(g0Var);
        }
        sb.append('}');
        return sb.toString();
    }
}
