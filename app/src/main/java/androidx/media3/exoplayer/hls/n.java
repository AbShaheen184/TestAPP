package androidx.media3.exoplayer.hls;

import androidx.media3.common.util.i0;
import androidx.media3.exoplayer.source.x0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements x0 {
    public final int e;
    public final r y;
    public int z = -1;

    public n(r rVar, int i) {
        this.y = rVar;
        this.e = i;
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final boolean a() {
        if (this.z == -3) {
            return true;
        }
        if (!d()) {
            return false;
        }
        int i = this.z;
        r rVar = this.y;
        return !rVar.E() && rVar.S[i].z(rVar.q0);
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final void b() throws IOException {
        int i = this.z;
        r rVar = this.y;
        if (i == -2) {
            rVar.b();
            throw new androidx.datastore.preferences.protobuf.i(androidx.privacysandbox.ads.adservices.java.internal.a.r("Unable to bind a sample queue to TrackGroup with MIME type ", rVar.f0.a(this.e).d[0].o, "."));
        }
        if (i == -1) {
            rVar.G();
        } else if (i != -3) {
            rVar.G();
            rVar.S[i].B();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final void c() {
        _COROUTINE.a.o(this.z == -1);
        r rVar = this.y;
        rVar.b();
        rVar.h0.getClass();
        int[] iArr = rVar.h0;
        int i = this.e;
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = rVar.k0;
            if (zArr[i2]) {
                i2 = -2;
            } else {
                zArr[i2] = true;
            }
        } else if (rVar.g0.contains(rVar.f0.a(i))) {
            i2 = -3;
        } else {
            i2 = -2;
        }
        this.z = i2;
    }

    public final boolean d() {
        int i = this.z;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final int e(androidx.localbroadcastmanager.content.b bVar, androidx.media3.decoder.e eVar, int i) {
        androidx.media3.common.r rVar;
        if (this.z == -3) {
            eVar.a(4);
            return -4;
        }
        if (d()) {
            int i2 = this.z;
            r rVar2 = this.y;
            ArrayList arrayList = rVar2.K;
            if (!rVar2.E()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((k) arrayList.get(i4)).H;
                        int length = rVar2.S.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (rVar2.k0[i6] && rVar2.S[i6].D() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    i0.V(arrayList, 0, i4);
                    k kVar = (k) arrayList.get(0);
                    androidx.media3.common.r rVar3 = kVar.A;
                    if (!rVar3.equals(rVar2.d0)) {
                        rVar2.H.b(rVar2.y, rVar3, kVar.B, kVar.C, kVar.D);
                    }
                    rVar2.d0 = rVar3;
                }
                if (arrayList.isEmpty() || ((k) arrayList.get(0)).g()) {
                    int iE = rVar2.S[i2].E(bVar, eVar, i, rVar2.q0);
                    if (iE == -5) {
                        androidx.media3.common.r rVarD = (androidx.media3.common.r) bVar.z;
                        rVarD.getClass();
                        if (i2 == rVar2.Y) {
                            int iF = com.imsdk.a.f(rVar2.S[i2].D());
                            while (i3 < arrayList.size() && ((k) arrayList.get(i3)).H != iF) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                rVar = ((k) arrayList.get(i3)).A;
                            } else {
                                rVar = rVar2.c0;
                                rVar.getClass();
                            }
                            rVarD = rVarD.d(rVar);
                        }
                        bVar.z = rVarD;
                    }
                    return iE;
                }
            }
        }
        return -3;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    @Override // androidx.media3.exoplayer.source.x0
    public final int h(long j) {
        Object next;
        Object objL;
        if (!d()) {
            return 0;
        }
        int i = this.z;
        r rVar = this.y;
        if (rVar.E()) {
            return 0;
        }
        q qVar = rVar.S[i];
        int iW = qVar.w(j, rVar.q0);
        ArrayList arrayList = rVar.K;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                objL = next;
            } else {
                objL = null;
            }
        } else if (arrayList.isEmpty()) {
            objL = null;
        } else {
            objL = androidx.privacysandbox.ads.adservices.java.internal.a.l(1, arrayList);
        }
        k kVar = (k) objL;
        if (kVar != null && !kVar.g()) {
            iW = Math.min(iW, kVar.e(i) - qVar.u());
        }
        qVar.J(iW);
        return iW;
    }
}
