package net.luminis.quic.frame;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringJoiner;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends n {
    public static final int D = (int) Math.pow(2.0d, 3.0d);
    public ArrayList A;
    public int B;
    public String C = null;
    public final byte[] e;
    public long y;
    public int z;

    public a(int i, ArrayList arrayList) {
        this.B = 8;
        Iterator it = arrayList.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar.b >= j - 1) {
                kotlinx.coroutines.future.a.q("invalid range");
                throw null;
            }
            j = oVar.a;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        arrayList2.addAll(arrayList);
        this.A = arrayList2;
        int i2 = D;
        this.B = i2;
        this.z = (i * 1000) / i2;
        Iterator it2 = arrayList.iterator();
        o oVar2 = (o) it2.next();
        long j2 = oVar2.b;
        long j3 = oVar2.a;
        this.y = j2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1000);
        byteBufferAllocate.put((byte) 2);
        kotlin.coroutines.g.d(this.y, byteBufferAllocate);
        kotlin.coroutines.g.e(byteBufferAllocate, this.z);
        kotlin.coroutines.g.e(byteBufferAllocate, arrayList.size() - 1);
        kotlin.coroutines.g.e(byteBufferAllocate, ((int) ((oVar2.b - j3) + 1)) - 1);
        while (it2.hasNext()) {
            o oVar3 = (o) it2.next();
            long j4 = oVar3.b;
            long j5 = oVar3.a;
            kotlin.coroutines.g.e(byteBufferAllocate, (int) ((j3 - j4) - 2));
            kotlin.coroutines.g.e(byteBufferAllocate, ((int) ((j4 - j5) + 1)) - 1);
            j3 = j5;
        }
        byte[] bArr = new byte[byteBufferAllocate.position()];
        this.e = bArr;
        byteBufferAllocate.get(bArr);
    }

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
        net.luminis.quic.recovery.b bVar;
        boolean z;
        net.luminis.quic.recovery.b bVar2;
        this.B = (int) Math.pow(2.0d, iVar.J);
        ((net.luminis.quic.ack.b[]) iVar.k0.e)[androidx.constraintlayout.core.g.e(gVar.m())].e(this);
        net.luminis.quic.recovery.g gVar2 = iVar.I;
        int iM = gVar.m();
        if (gVar2.m) {
            return;
        }
        if (gVar2.j > 0) {
            if (gVar2.f()) {
                gVar2.e.getClass();
            } else {
                gVar2.j = 0;
            }
        }
        net.luminis.quic.recovery.a aVar = gVar2.c[androidx.constraintlayout.core.g.e(iM)];
        if (aVar.k) {
            return;
        }
        aVar.h = Long.max(aVar.h, this.y);
        ArrayList arrayList = new ArrayList();
        for (Long l2 : g()) {
            if (aVar.f.containsKey(l2)) {
                net.luminis.quic.recovery.b bVar3 = (net.luminis.quic.recovery.b) aVar.f.get(l2);
                synchronized (bVar3) {
                    z = bVar3.e;
                }
                if (!z && (bVar2 = (net.luminis.quic.recovery.b) aVar.f.get(l2)) != null) {
                    synchronized (bVar2) {
                        if (!bVar2.e && !bVar2.d) {
                            bVar2.e = true;
                            arrayList.add(bVar2);
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            if (((net.luminis.quic.recovery.b) it.next()).b.o()) {
                j++;
            }
        }
        aVar.g.getAndAdd(((int) j) * (-1));
        net.luminis.quic.cc.a aVar2 = aVar.c;
        ArrayList<net.luminis.quic.recovery.b> arrayListB = net.luminis.quic.recovery.a.b(arrayList);
        synchronized (aVar2) {
            try {
                boolean z2 = aVar2.c - aVar2.b <= ((long) 3);
                aVar2.c(arrayListB);
                ArrayList<net.luminis.quic.packet.g> arrayList2 = new ArrayList();
                for (net.luminis.quic.recovery.b bVar4 : arrayListB) {
                    if (bVar4.a.longValue() > aVar2.f.longValue()) {
                        arrayList2.add(bVar4.b);
                    }
                }
                if (z2) {
                    long j2 = aVar2.c;
                    for (net.luminis.quic.packet.g gVar3 : arrayList2) {
                        long j3 = aVar2.c;
                        long j4 = aVar2.e;
                        long j5 = aVar2.c;
                        if (j3 < j4) {
                            aVar2.c = j5 + ((long) gVar3.n());
                        } else {
                            aVar2.c = j5 + ((1200 * ((long) gVar3.n())) / aVar2.c);
                        }
                    }
                    if (aVar2.c != j2) {
                        aVar2.a.getClass();
                    }
                }
                aVar2.a.e();
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.a();
        aVar.a.j();
        net.luminis.quic.recovery.h hVar = aVar.b;
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                bVar = null;
                break;
            }
            bVar = (net.luminis.quic.recovery.b) it2.next();
        } while (bVar.b.l().longValue() != this.y);
        if (bVar != null) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (((net.luminis.quic.recovery.b) it3.next()).b.o()) {
                    Long l3 = bVar.a;
                    int i = (this.z * this.B) / 1000;
                    if (l.longValue() >= l3.longValue()) {
                        if (i > hVar.g) {
                            i = hVar.g;
                        }
                        int iLongValue = (int) (l.longValue() - l3.longValue());
                        if (iLongValue < hVar.c) {
                            hVar.c = iLongValue;
                        }
                        if (iLongValue >= hVar.c + i) {
                            iLongValue -= i;
                        }
                        hVar.f = iLongValue;
                        if (hVar.d == -1) {
                            hVar.d = iLongValue;
                            hVar.e = iLongValue / 2;
                        } else {
                            hVar.e = (((hVar.e * 3) + Math.abs(hVar.d - iLongValue)) + 2) / 4;
                            hVar.d = (((hVar.d * 7) + iLongValue) + 4) / 8;
                        }
                        hVar.a.getClass();
                        break;
                    }
                    hVar.a.b("Receiving negative rtt estimate: sent=" + l3 + ", received=" + l);
                    break;
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            aVar.f.remove(((net.luminis.quic.recovery.b) it4.next()).b.l());
        }
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        byte[] bArr = this.e;
        if (bArr != null) {
            return bArr.length;
        }
        kotlinx.coroutines.future.a.u("frame length not known for parsed frames");
        return 0;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put(this.e);
    }

    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        for (o oVar : this.A) {
            oVar.getClass();
            long j = oVar.a;
            long j2 = oVar.b;
            ArrayList arrayList2 = new ArrayList((int) ((j2 - j) + 1));
            while (j2 > j) {
                arrayList2.add(Long.valueOf(j2));
                j2--;
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public final void h(ByteBuffer byteBuffer, net.luminis.quic.log.a aVar) {
        aVar.getClass();
        this.A = new ArrayList();
        byte b = byteBuffer.get();
        this.y = kotlin.coroutines.g.n(byteBuffer);
        this.z = (int) kotlin.coroutines.g.n(byteBuffer);
        int iN = (int) kotlin.coroutines.g.n(byteBuffer);
        long j = this.y;
        int iM = kotlin.coroutines.g.m(byteBuffer);
        this.A.add(new o((j - ((long) (iM + 1))) + 1, j));
        long j2 = j - ((long) iM);
        for (int i = 0; i < iN; i++) {
            int iM2 = kotlin.coroutines.g.m(byteBuffer) + 1;
            int iM3 = kotlin.coroutines.g.m(byteBuffer) + 1;
            long j3 = (j2 - ((long) iM2)) - 1;
            this.A.add(new o((j3 - ((long) iM3)) + 1, j3));
            j2 -= (long) (iM2 + iM3);
        }
        if (b == 3) {
            kotlin.coroutines.g.n(byteBuffer);
            kotlin.coroutines.g.n(byteBuffer);
            kotlin.coroutines.g.n(byteBuffer);
        }
    }

    public final String toString() {
        String string;
        if (this.C == null) {
            StringJoiner stringJoiner = new StringJoiner(",");
            for (o oVar : this.A) {
                long j = oVar.b;
                long j2 = oVar.a;
                if (((int) ((j - j2) + 1)) == 1) {
                    string = androidx.compose.runtime.j.h("", j);
                } else {
                    StringBuilder sbO = androidx.compose.runtime.j.o(j, "", "-");
                    sbO.append(j2);
                    string = sbO.toString();
                }
                stringJoiner.add(string);
            }
            this.C = stringJoiner.toString();
        }
        return "AckFrame[" + this.C + "|Δ" + ((this.z * this.B) / 1000) + "]";
    }
}
