package okhttp3;

import java.io.EOFException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends e0 {
    public static final u f;
    public static final u g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public final okio.i b;
    public final List c;
    public final u d;
    public long e;

    static {
        kotlin.text.i iVar = u.e;
        f = kotlin.collections.o.s("multipart/mixed");
        kotlin.collections.o.s("multipart/alternative");
        kotlin.collections.o.s("multipart/digest");
        kotlin.collections.o.s("multipart/parallel");
        g = kotlin.collections.o.s("multipart/form-data");
        h = new byte[]{58, 32};
        i = new byte[]{13, 10};
        j = new byte[]{45, 45};
    }

    public w(okio.i iVar, u uVar, List list) {
        iVar.getClass();
        uVar.getClass();
        this.b = iVar;
        this.c = list;
        kotlin.text.i iVar2 = u.e;
        this.d = kotlin.collections.o.s(uVar + "; boundary=" + iVar.u());
        this.e = -1L;
    }

    @Override // okhttp3.e0
    public final long a() throws EOFException {
        long j2 = this.e;
        if (j2 != -1) {
            return j2;
        }
        long jE = e(null, true);
        this.e = jE;
        return jE;
    }

    @Override // okhttp3.e0
    public final u b() {
        return this.d;
    }

    @Override // okhttp3.e0
    public final boolean c() {
        List list = this.c;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((v) it.next()).b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.e0
    public final void d(okio.g gVar) throws EOFException {
        e(gVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(okio.g gVar, boolean z) throws EOFException {
        okio.f fVar;
        okio.g fVar2;
        if (z) {
            fVar2 = new okio.f();
            fVar = fVar2;
        } else {
            fVar = 0;
            fVar2 = gVar;
        }
        List list = this.c;
        int size = list.size();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            okio.i iVar = this.b;
            byte[] bArr = j;
            byte[] bArr2 = i;
            if (i2 >= size) {
                fVar2.getClass();
                fVar2.write(bArr);
                fVar2.J(iVar);
                fVar2.write(bArr);
                fVar2.write(bArr2);
                if (!z) {
                    return j2;
                }
                fVar.getClass();
                long j3 = j2 + fVar.y;
                fVar.a();
                return j3;
            }
            v vVar = (v) list.get(i2);
            r rVar = vVar.a;
            e0 e0Var = vVar.b;
            fVar2.getClass();
            fVar2.write(bArr);
            fVar2.J(iVar);
            fVar2.write(bArr2);
            int size2 = rVar.size();
            for (int i3 = 0; i3 < size2; i3++) {
                fVar2.y(rVar.c(i3)).write(h).y(rVar.f(i3)).write(bArr2);
            }
            u uVarB = e0Var.b();
            if (uVarB != null) {
                fVar2.y("Content-Type: ").y(uVarB.a).write(bArr2);
            }
            long jA = e0Var.a();
            if (jA == -1 && z) {
                fVar.getClass();
                fVar.a();
                return -1L;
            }
            fVar2.write(bArr2);
            if (z) {
                j2 += jA;
            } else {
                e0Var.d(fVar2);
            }
            fVar2.write(bArr2);
            i2++;
        }
    }
}
