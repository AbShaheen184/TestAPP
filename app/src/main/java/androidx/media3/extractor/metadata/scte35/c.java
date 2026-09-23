package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.h0;
import androidx.media3.common.util.g0;
import androidx.media3.common.util.u;
import androidx.media3.common.util.v;
import androidx.work.impl.model.f;
import com.google.firebase.heartbeatinfo.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends _COROUTINE.a {
    public final v m = new v();
    public final u n = new u();
    public g0 o;

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // _COROUTINE.a
    public final h0 F(androidx.media3.extractor.metadata.a aVar, ByteBuffer byteBuffer) {
        androidx.media3.common.g0 dVar;
        long j;
        long j2;
        v vVar = this.m;
        u uVar = this.n;
        g0 g0Var = this.o;
        if (g0Var != null) {
            long j3 = aVar.G;
            synchronized (g0Var) {
                j2 = g0Var.b;
            }
            if (j3 != j2) {
                g0 g0Var2 = new g0(aVar.D);
                this.o = g0Var2;
                g0Var2.a(aVar.D - aVar.G);
            }
        } else {
            g0 g0Var3 = new g0(aVar.D);
            this.o = g0Var3;
            g0Var3.a(aVar.D - aVar.G);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        vVar.K(bArrArray, iLimit);
        uVar.l(bArrArray, iLimit);
        uVar.o(39);
        long jG = (((long) uVar.g(1)) << 32) | ((long) uVar.g(32));
        uVar.o(20);
        int iG = uVar.g(12);
        int iG2 = uVar.g(8);
        vVar.N(14);
        if (iG2 == 0) {
            dVar = new d();
        } else if (iG2 == 255) {
            long jB = vVar.B();
            int i = iG - 4;
            vVar.k(new byte[i], 0, i);
            dVar = new a(jB, jG, 0);
        } else if (iG2 == 4) {
            int iZ = vVar.z();
            ArrayList arrayList = new ArrayList(iZ);
            for (int i2 = 0; i2 < iZ; i2++) {
                vVar.B();
                boolean z = (vVar.z() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int iZ2 = vVar.z();
                    boolean z2 = (iZ2 & 64) != 0;
                    boolean z3 = (iZ2 & 32) != 0;
                    if (z2) {
                        vVar.B();
                    }
                    if (!z2) {
                        int iZ3 = vVar.z();
                        ArrayList arrayList3 = new ArrayList(iZ3);
                        for (int i3 = 0; i3 < iZ3; i3++) {
                            vVar.z();
                            vVar.B();
                            arrayList3.add(new e(13));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        vVar.z();
                        vVar.B();
                    }
                    vVar.G();
                    vVar.z();
                    vVar.z();
                }
                f fVar = new f(14);
                Collections.unmodifiableList(arrayList2);
                arrayList.add(fVar);
            }
            dVar = new d();
            Collections.unmodifiableList(arrayList);
        } else if (iG2 == 5) {
            g0 g0Var4 = this.o;
            vVar.B();
            boolean z4 = (vVar.z() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int iZ4 = vVar.z();
                boolean z5 = (iZ4 & 64) != 0;
                boolean z6 = (iZ4 & 32) != 0;
                boolean z7 = (iZ4 & 16) != 0;
                long jD = (!z5 || z7) ? -9223372036854775807L : a.d(jG, vVar);
                if (!z5) {
                    int iZ5 = vVar.z();
                    ArrayList arrayList4 = new ArrayList(iZ5);
                    for (int i4 = 0; i4 < iZ5; i4++) {
                        vVar.z();
                        g0Var4.b(!z7 ? a.d(jG, vVar) : -9223372036854775807L);
                        arrayList4.add(new com.google.android.material.shape.f(13));
                    }
                    list = arrayList4;
                }
                if (z6) {
                    vVar.z();
                    vVar.B();
                }
                vVar.G();
                vVar.z();
                vVar.z();
                j = jD;
            }
            dVar = new a(j, g0Var4.b(j), list);
        } else if (iG2 != 6) {
            dVar = null;
        } else {
            g0 g0Var5 = this.o;
            long jD2 = a.d(jG, vVar);
            dVar = new a(jD2, g0Var5.b(jD2), 2);
        }
        return dVar == null ? new h0(new androidx.media3.common.g0[0]) : new h0(dVar);
    }
}
