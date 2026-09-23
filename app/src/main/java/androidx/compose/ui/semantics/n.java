package androidx.compose.ui.semantics;

import androidx.collection.o0;
import androidx.collection.w0;
import androidx.compose.ui.platform.i0;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements a0, Iterable, kotlin.jvm.internal.markers.a {
    public boolean A;
    public final o0 e;
    public androidx.collection.w y;
    public boolean z;

    public n() {
        long[] jArr = w0.a;
        this.e = new o0();
    }

    @Override // androidx.compose.ui.semantics.a0
    public final void b(z zVar, Object obj) {
        boolean z = obj instanceof a;
        o0 o0Var = this.e;
        if (z && o0Var.c(zVar)) {
            Object objG = o0Var.g(zVar);
            objG.getClass();
            a aVar = (a) objG;
            a aVar2 = (a) obj;
            String str = aVar2.a;
            if (str == null) {
                str = aVar.a;
            }
            kotlin.d dVar = aVar2.b;
            if (dVar == null) {
                dVar = aVar.b;
            }
            o0Var.m(zVar, new a(str, dVar));
        } else {
            o0Var.m(zVar, obj);
        }
        zVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005d A[LOOP:0: B:5:0x0026->B:15:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[EDGE_INSN: B:18:0x0060->B:16:0x0060 BREAK  A[LOOP:0: B:5:0x0026->B:15:0x005d], SYNTHETIC] */
    public final n c() {
        n nVar = new n();
        nVar.z = this.z;
        nVar.A = this.A;
        o0 o0Var = nVar.e;
        o0Var.getClass();
        o0 o0Var2 = this.e;
        o0Var2.getClass();
        Object[] objArr = o0Var2.b;
        Object[] objArr2 = o0Var2.c;
        long[] jArr = o0Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            o0Var.m(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return nVar;
    }

    public final Object d(z zVar) {
        Object objG = this.e.g(zVar);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + zVar + " - consider getOrElse or getOrNull");
    }

    public final void e(n nVar) {
        o0 o0Var = nVar.e;
        Object[] objArr = o0Var.b;
        Object[] objArr2 = o0Var.c;
        long[] jArr = o0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        z zVar = (z) obj;
                        o0 o0Var2 = this.e;
                        Object objG = o0Var2.g(zVar);
                        zVar.getClass();
                        Object objInvoke = zVar.b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            o0Var2.m(zVar, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.l.a(this.e, nVar.e) && this.z == nVar.z && this.A == nVar.A;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.A) + androidx.privacysandbox.ads.adservices.java.internal.a.h(this.e.hashCode() * 31, 31, this.z);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        androidx.collection.w wVar = this.y;
        if (wVar == null) {
            o0 o0Var = this.e;
            o0Var.getClass();
            androidx.collection.w wVar2 = new androidx.collection.w(o0Var);
            this.y = wVar2;
            wVar = wVar2;
        }
        return ((androidx.collection.j) wVar.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.z) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.A) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        o0 o0Var = this.e;
        Object[] objArr = o0Var.b;
        Object[] objArr2 = o0Var.c;
        long[] jArr = o0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((z) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return i0.q(this) + "{ " + ((Object) sb) + " }";
    }
}
