package net.luminis.tls.engine.impl;

import androidx.media3.exoplayer.source.t0;
import androidx.work.p;
import com.google.android.gms.measurement.internal.a0;
import com.google.android.gms.measurement.internal.b0;
import com.google.android.material.internal.k;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import net.luminis.quic.impl.i;
import net.luminis.quic.impl.m;
import net.luminis.quic.impl.n;
import net.luminis.tls.extension.g;
import net.luminis.tls.extension.j;
import net.luminis.tls.extension.o;
import net.luminis.tls.f;
import net.luminis.tls.h;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b implements net.luminis.tls.engine.b {
    public static final Charset A;
    public static final ArrayList z;
    public final k e;
    public final i f;
    public String g;
    public final ArrayList h;
    public f i;
    public net.luminis.tls.c j;
    public final ArrayList k;
    public ArrayList l;
    public int m;
    public net.luminis.tls.handshake.d n;
    public e o;
    public ArrayList p;
    public X509Certificate q;
    public List r;
    public final a0 s;
    public final ArrayList t;
    public boolean u;
    public boolean v;
    public ArrayList w;
    public final Function x;
    public List y;

    static {
        ArrayList arrayList = new ArrayList();
        z = arrayList;
        arrayList.add(h.rsa_pss_rsae_sha256);
        arrayList.add(h.rsa_pss_rsae_sha384);
        arrayList.add(h.rsa_pss_rsae_sha512);
        arrayList.add(h.ecdsa_secp256r1_sha256);
        arrayList.add(h.ecdsa_secp384r1_sha384);
        arrayList.add(h.ecdsa_secp521r1_sha512);
        A = Charset.forName("ISO-8859-1");
    }

    public a(k kVar, i iVar) {
        this.d = new b0(27);
        this.m = 1;
        this.r = Collections.EMPTY_LIST;
        this.u = false;
        this.e = kVar;
        this.f = iVar;
        this.h = new ArrayList();
        this.k = new ArrayList();
        this.s = new a0(27);
        this.t = new ArrayList();
        this.x = new androidx.media3.exoplayer.audio.f(3);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x03cf  */
    public final void d(net.luminis.tls.handshake.b bVar, int i) {
        if (i != 2) {
            throw new net.luminis.tls.alert.a("incorrect protection level", 8);
        }
        if (this.m != 3) {
            throw new net.luminis.tls.alert.a("unexpected encrypted extensions message", 8);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            arrayList.add(((g) it.next()).getClass());
        }
        for (g gVar : (List) bVar.c) {
            if (!(gVar instanceof o) && !arrayList.contains(gVar.getClass())) {
                throw new net.luminis.tls.alert.a("extension response to missing request", 9);
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = ((List) bVar.c).iterator();
        while (it2.hasNext()) {
            hashSet.add(((g) it2.next()).getClass());
        }
        if (hashSet.size() != ((List) bVar.c).size()) {
            throw new net.luminis.tls.alert.a("duplicate extensions not allowed", 9);
        }
        this.o.d(bVar);
        this.m = this.u ? 7 : 4;
        i iVar = this.f;
        List<g> list = (List) bVar.c;
        iVar.getClass();
        for (g gVar2 : list) {
            if (gVar2 instanceof net.luminis.tls.extension.f) {
                iVar.p0 = 3;
                iVar.z.getClass();
            } else if (gVar2 instanceof net.luminis.quic.tls.a) {
                m mVar = ((net.luminis.quic.tls.a) gVar2).d;
                net.luminis.quic.cid.b bVar2 = iVar.Y;
                net.luminis.quic.log.a aVar = iVar.z;
                if (mVar.m == null || mVar.a == null) {
                    aVar.b("Missing connection id from server transport parameter");
                    if (mVar.m == null) {
                        iVar.e(3, net.luminis.quic.a.TRANSPORT_PARAMETER_ERROR.e, "missing initial_source_connection_id transport parameter");
                    } else {
                        iVar.e(3, net.luminis.quic.a.TRANSPORT_PARAMETER_ERROR.e, "missing original_destination_connection_id transport parameter");
                    }
                } else {
                    net.luminis.quic.cid.d dVar = bVar2.f;
                    if (!Arrays.equals(dVar != null ? dVar.b : new byte[0], mVar.m)) {
                        aVar.b("Source connection id does not match corresponding transport parameter");
                        iVar.e(3, net.luminis.quic.a.PROTOCOL_VIOLATION.e, "initial_source_connection_id transport parameter does not match");
                    } else if (Arrays.equals(bVar2.h, mVar.a)) {
                        if (iVar.A == 2) {
                            k kVar = mVar.q;
                            if (kVar == null || !((n) kVar.y).equals(iVar.e.a)) {
                                iVar.z.b("Chosen version is not equal to negotiated version: connection version: " + iVar.e + ", version info: " + kVar);
                                iVar.e(3, (long) net.luminis.quic.a.VERSION_NEGOTIATION_ERROR.e, "Chosen version does not match packet version");
                            } else {
                                iVar.A = 3;
                                net.luminis.quic.log.a aVar2 = iVar.z;
                                n nVar = iVar.Z;
                                net.luminis.quic.impl.o oVar = iVar.e;
                                Objects.toString(nVar);
                                Objects.toString(oVar);
                                aVar2.getClass();
                            }
                        }
                        iVar.e0 = mVar;
                        if (iVar.K == null) {
                            iVar.K = new net.luminis.quic.stream.b(iVar.e0.c, iVar.e0.d, iVar.e0.e, iVar.e0.f, iVar.z);
                            iVar.W.c = iVar.K;
                        } else {
                            iVar.z.getClass();
                            net.luminis.quic.stream.b bVar3 = iVar.K;
                            m mVar2 = iVar.e0;
                            synchronized (bVar3) {
                                try {
                                    long j = mVar2.c;
                                    long j2 = bVar3.a;
                                    if (j > j2) {
                                        bVar3.i.getClass();
                                        long j3 = mVar2.c;
                                        if (j3 > bVar3.e) {
                                            bVar3.e = j3;
                                        }
                                    } else if (j < j2) {
                                        bVar3.i.b("Ignoring attempt to reduce initial max data from " + bVar3.a + " to " + mVar2.c);
                                    }
                                    long j4 = mVar2.d;
                                    long j5 = bVar3.b;
                                    if (j4 > j5) {
                                        bVar3.i.getClass();
                                        for (Map.Entry entry : bVar3.g.entrySet()) {
                                            if (((Integer) entry.getKey()).intValue() % 4 == 1 && mVar2.d > ((Long) entry.getValue()).longValue()) {
                                                bVar3.g.put((Integer) entry.getKey(), Long.valueOf(mVar2.d));
                                            }
                                        }
                                    } else if (j4 < j5) {
                                        bVar3.i.b("Ignoring attempt to reduce max data from " + bVar3.b + " to " + mVar2.d);
                                    }
                                    long j6 = mVar2.e;
                                    long j7 = bVar3.c;
                                    if (j6 > j7) {
                                        bVar3.i.getClass();
                                        for (Map.Entry entry2 : bVar3.g.entrySet()) {
                                            if (((Integer) entry2.getKey()).intValue() % 4 == 0 && mVar2.e > ((Long) entry2.getValue()).longValue()) {
                                                bVar3.g.put((Integer) entry2.getKey(), Long.valueOf(mVar2.e));
                                            }
                                        }
                                    } else if (j6 < j7) {
                                        bVar3.i.b("Ignoring attempt to reduce max data from " + bVar3.c + " to " + mVar2.e);
                                    }
                                    long j8 = mVar2.f;
                                    long j9 = bVar3.d;
                                    if (j8 > j9) {
                                        bVar3.i.getClass();
                                        for (Map.Entry entry3 : bVar3.g.entrySet()) {
                                            if (((Integer) entry3.getKey()).intValue() % 4 == 2 && mVar2.f > ((Long) entry3.getValue()).longValue()) {
                                                bVar3.g.put((Integer) entry3.getKey(), Long.valueOf(mVar2.f));
                                            }
                                        }
                                    } else if (j8 < j9) {
                                        bVar3.i.b("Ignoring attempt to reduce max data from " + bVar3.d + " to " + mVar2.f);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        net.luminis.quic.cid.b bVar4 = iVar.Y;
                        int i2 = iVar.e0.l;
                        bVar4.getClass();
                        bVar4.i = Integer.min(i2, 6);
                        long j10 = iVar.X.b;
                        long j11 = iVar.e0.b;
                        iVar.getClass();
                        long jMin = Long.min(j10, j11);
                        if (jMin == 0) {
                            jMin = Long.max(j10, j11);
                        }
                        if (jMin != 0) {
                            iVar.z.getClass();
                            net.luminis.quic.impl.d dVar2 = iVar.F;
                            dVar2.b = jMin;
                            if (dVar2.f) {
                                dVar2.g.cancel(true);
                            } else {
                                dVar2.f = true;
                            }
                            long j12 = 1000;
                            dVar2.g = dVar2.a.scheduleAtFixedRate(new p(dVar2, 11), j12, j12, TimeUnit.MILLISECONDS);
                        }
                        net.luminis.quic.cid.b bVar5 = iVar.Y;
                        byte[] bArr = iVar.e0.p;
                        ConcurrentHashMap concurrentHashMap = bVar5.f.a;
                        net.luminis.quic.cid.a aVar3 = (net.luminis.quic.cid.a) concurrentHashMap.get(0);
                        concurrentHashMap.put(0, new net.luminis.quic.cid.a(aVar3.a, aVar3.c, aVar3.b, bArr));
                        boolean z2 = iVar.o0;
                        m mVar3 = iVar.e0;
                        if (z2) {
                            if (mVar3.n != null) {
                                if (!Arrays.equals(iVar.Y.j, iVar.e0.n)) {
                                    iVar.e(3, net.luminis.quic.a.TRANSPORT_PARAMETER_ERROR.e, "incorrect retry_source_connection_id transport parameter");
                                }
                            } else {
                                iVar.e(3, net.luminis.quic.a.TRANSPORT_PARAMETER_ERROR.e, "incorrect retry_source_connection_id transport parameter");
                            }
                        } else if (mVar3.n != null) {
                            iVar.e(3, net.luminis.quic.a.TRANSPORT_PARAMETER_ERROR.e, "unexpected retry_source_connection_id transport parameter");
                        }
                        m mVar4 = iVar.e0;
                        net.luminis.quic.stream.n nVar2 = iVar.W;
                        long j13 = mVar4.g;
                        if (nVar2.i == null || j13 >= nVar2.i.longValue()) {
                            nVar2.d.getClass();
                            nVar2.i = Long.valueOf(j13);
                            if (j13 > 2147483647L) {
                                nVar2.d.b("Server initial max streams bidirectional is larger than supported; limiting to 2147483647");
                                j13 = 2147483647L;
                            }
                            nVar2.k.release((int) j13);
                        } else {
                            nVar2.d.b("Attempt to reduce value of initial_max_streams_bidi from " + nVar2.i + " to " + j13 + "; ignoring.");
                        }
                        net.luminis.quic.stream.n nVar3 = iVar.W;
                        long j14 = mVar4.h;
                        if (nVar3.j == null || j14 >= nVar3.j.longValue()) {
                            nVar3.d.getClass();
                            nVar3.j = Long.valueOf(j14);
                            if (j14 > 2147483647L) {
                                nVar3.d.b("Server initial max streams unidirectional is larger than supported; limiting to 2147483647");
                                j14 = 2147483647L;
                            }
                            nVar3.l.release((int) j14);
                        } else {
                            nVar3.d.b("Attempt to reduce value of initial_max_streams_uni from " + nVar3.j + " to " + j14 + "; ignoring.");
                        }
                        iVar.J = mVar4.i;
                        net.luminis.quic.send.k kVar2 = iVar.T;
                        int i3 = mVar4.k;
                        kVar2.u = i3;
                        kVar2.f.g = i3;
                        net.luminis.quic.recovery.g gVar3 = kVar2.l;
                        synchronized (gVar3) {
                            gVar3.g = i3;
                        }
                        net.luminis.quic.send.k kVar3 = iVar.T;
                        int i4 = mVar4.o;
                        if (i4 < kVar3.a) {
                            kVar3.a = i4;
                        }
                    } else {
                        aVar.b("Original destination connection id does not match corresponding transport parameter");
                        iVar.e(3, net.luminis.quic.a.PROTOCOL_VIOLATION.e, "original_destination_connection_id transport parameter does not match");
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(net.luminis.tls.handshake.b bVar, int i) {
        String str;
        if (i != 2) {
            throw new net.luminis.tls.alert.a("incorrect protection level", 8);
        }
        if (this.m != 7) {
            throw new net.luminis.tls.alert.a("unexpected finished message", 8);
        }
        this.o.f(bVar);
        e eVar = this.o;
        net.luminis.tls.e eVar2 = net.luminis.tls.e.certificate_verify;
        eVar.getClass();
        if (!Arrays.equals(bVar.b, a(eVar.c(e.b(eVar2, false)), this.c.m))) {
            throw new net.luminis.tls.alert.a("incorrect finished message", 3);
        }
        if (this.v) {
            k kVar = this.e;
            net.luminis.tls.handshake.a aVar = new net.luminis.tls.handshake.a();
            aVar.c = new ArrayList();
            aVar.a = new byte[0];
            aVar.b = null;
            aVar.c = new ArrayList();
            ArrayList arrayList = aVar.c;
            int size = arrayList.size();
            ArrayList<byte[]> arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    arrayList2.add(((X509Certificate) it.next()).getEncoded());
                } catch (CertificateEncodingException e) {
                    kotlinx.coroutines.future.a.l(e);
                    return;
                }
            }
            Iterator it2 = arrayList2.iterator();
            int length = 0;
            while (it2.hasNext()) {
                length += ((byte[]) it2.next()).length;
            }
            int i2 = (size * 5) + 8 + length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2);
            byteBufferAllocate.putInt((net.luminis.tls.e.certificate.e << 24) | (i2 - 4));
            byteBufferAllocate.put((byte) 0);
            byteBufferAllocate.put((byte) 0);
            byteBufferAllocate.putShort((short) (i2 - 8));
            for (byte[] bArr : arrayList2) {
                if (bArr.length > 65520) {
                    org.mozilla.javascript.c.b("Certificate size not supported");
                    return;
                }
                byteBufferAllocate.put((byte) 0);
                byteBufferAllocate.putShort((short) bArr.length);
                byteBufferAllocate.put(bArr);
                byteBufferAllocate.putShort((short) 0);
            }
            aVar.d = byteBufferAllocate.array();
            net.luminis.quic.crypto.f fVarD = ((i) kVar.z).d(3);
            fVarD.c(aVar);
            net.luminis.quic.log.a aVar2 = (net.luminis.quic.log.a) kVar.y;
            fVarD.b(fVarD.i);
            aVar2.getClass();
            this.o.e(aVar);
        }
        e eVar3 = this.o;
        net.luminis.tls.e eVar4 = net.luminis.tls.e.certificate_verify;
        eVar3.getClass();
        byte[] bArrA = a(eVar3.c(e.b(eVar4, true)), this.c.n);
        net.luminis.tls.handshake.b bVar2 = new net.luminis.tls.handshake.b(2);
        bVar2.b = bArrA;
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArrA.length + 4);
        net.luminis.tls.e eVar5 = net.luminis.tls.e.finished;
        byteBufferAllocate2.putInt((eVar5.e << 24) | bVar2.b.length);
        byteBufferAllocate2.put(bVar2.b);
        bVar2.c = byteBufferAllocate2.array();
        k kVar2 = this.e;
        net.luminis.quic.crypto.f fVarD2 = ((i) kVar2.z).d(3);
        fVarD2.c(bVar2);
        net.luminis.quic.log.a aVar3 = (net.luminis.quic.log.a) kVar2.y;
        fVarD2.b(fVarD2.i);
        aVar3.getClass();
        this.o.e(bVar2);
        c cVar = this.c;
        byte[] bArr2 = cVar.o;
        e eVar6 = cVar.r;
        eVar6.getClass();
        byte[] bArrC = eVar6.c(e.b(eVar5, false));
        byte[] bArr3 = cVar.c;
        int i3 = cVar.e;
        byte[] bArrC2 = cVar.c(bArr2, "derived", bArr3, i3);
        net.luminis.tls.util.a.a(bArrC2);
        byte[] bArrX = cVar.b.x(bArrC2, new byte[i3]);
        cVar.t = bArrX;
        net.luminis.tls.util.a.a(bArrX);
        byte[] bArrC3 = cVar.c(cVar.t, "c ap traffic", bArrC, i3);
        cVar.p = bArrC3;
        net.luminis.tls.util.a.a(bArrC3);
        byte[] bArrC4 = cVar.c(cVar.t, "s ap traffic", bArrC, i3);
        cVar.q = bArrC4;
        net.luminis.tls.util.a.a(bArrC4);
        byte[] bArr4 = cVar.p;
        short s = cVar.d;
        Charset charset = c.u;
        net.luminis.tls.util.a.a(cVar.c(bArr4, "key", "".getBytes(charset), s));
        net.luminis.tls.util.a.a(cVar.c(cVar.q, "key", "".getBytes(charset), s));
        net.luminis.tls.util.a.a(cVar.c(cVar.p, "iv", "".getBytes(charset), (short) 12));
        net.luminis.tls.util.a.a(cVar.c(cVar.q, "iv", "".getBytes(charset), (short) 12));
        c cVar2 = this.c;
        e eVar7 = cVar2.r;
        eVar7.getClass();
        byte[] bArrC5 = cVar2.c(cVar2.t, "res master", eVar7.c(e.b(eVar5, true)), cVar2.e);
        cVar2.l = bArrC5;
        net.luminis.tls.util.a.a(bArrC5);
        this.m = 8;
        i iVar = this.f;
        net.luminis.quic.crypto.d dVar = iVar.B;
        a aVar4 = iVar.Q;
        synchronized (dVar) {
            dVar.c(4, dVar.a, dVar.b.a);
            c cVar3 = aVar4.c;
            if (cVar3 == null) {
                throw new IllegalStateException("Traffic secret not yet available");
            }
            byte[] bArr5 = cVar3.p;
            dVar.d.getClass();
            dVar.f[3].b(bArr5);
            c cVar4 = aVar4.c;
            if (cVar4 == null) {
                throw new IllegalStateException("Traffic secret not yet available");
            }
            byte[] bArr6 = cVar4.q;
            dVar.d.getClass();
            dVar.g[3].b(bArr6);
            if (dVar.h) {
                dVar.a(4, "TRAFFIC_SECRET_0");
            }
        }
        synchronized (iVar.D) {
            try {
                if (androidx.constraintlayout.core.g.e(iVar.C) < androidx.constraintlayout.core.g.e(3)) {
                    iVar.C = 3;
                    Iterator it3 = iVar.E.iterator();
                    while (it3.hasNext()) {
                        ((net.luminis.quic.recovery.g) it3.next()).d(iVar.C);
                    }
                } else {
                    net.luminis.quic.log.a aVar5 = iVar.z;
                    StringBuilder sb = new StringBuilder("Handshake state cannot be set to HasAppKeys; current state is ");
                    int i4 = iVar.C;
                    if (i4 == 1) {
                        str = "Initial";
                    } else if (i4 == 2) {
                        str = "HasHandshakeKeys";
                    } else if (i4 == 3) {
                        str = "HasAppKeys";
                    } else if (i4 != 4) {
                        str = i4 != 5 ? "null" : "Confirmed";
                    } else {
                        str = "Completed";
                    }
                    sb.append(str);
                    aVar5.b(sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        iVar.L = 3;
        iVar.d0.countDown();
    }

    public final void f() {
        KeyPairGenerator keyPairGenerator;
        ArrayList<h> arrayList = new ArrayList(2);
        arrayList.add(h.rsa_pss_rsae_sha256);
        arrayList.add(h.ecdsa_secp256r1_sha256);
        f fVar = f.secp256r1;
        if (this.m != 1) {
            kotlinx.coroutines.future.a.u("Handshake already started");
            return;
        }
        if (!j.d.contains(fVar)) {
            t0.m(fVar, " not supported", "Named group ");
            return;
        }
        for (h hVar : arrayList) {
            ArrayList arrayList2 = z;
            if (!arrayList2.contains(hVar)) {
                ArrayList arrayList3 = new ArrayList(arrayList);
                arrayList3.removeAll(arrayList2);
                com.google.firebase.platforminfo.b.f(arrayList3, "Unsupported signature scheme(s): ");
                return;
            }
        }
        this.p = arrayList;
        this.i = fVar;
        try {
            if (fVar == f.secp256r1 || fVar == f.secp384r1 || fVar == f.secp521r1) {
                keyPairGenerator = KeyPairGenerator.getInstance("EC");
                keyPairGenerator.initialize(new ECGenParameterSpec(fVar.toString()));
            } else {
                if (fVar != f.x25519 && fVar != f.x448) {
                    throw new RuntimeException("unsupported group " + fVar);
                }
                keyPairGenerator = KeyPairGenerator.getInstance("XDH");
                androidx.compose.ui.text.android.c.d();
                keyPairGenerator.initialize(androidx.compose.ui.text.android.c.b(fVar.toString().toUpperCase()));
            }
            KeyPair keyPairGenKeyPair = keyPairGenerator.genKeyPair();
            this.b = keyPairGenKeyPair.getPrivate();
            this.a = keyPairGenKeyPair.getPublic();
            if (this.g == null || this.h.isEmpty()) {
                kotlinx.coroutines.future.a.u("not all mandatory properties are set");
                return;
            }
            net.luminis.tls.handshake.d dVar = new net.luminis.tls.handshake.d(this.g, this.a, this.h, this.p, fVar, this.k, this.c);
            this.n = dVar;
            this.l = dVar.d;
            if (this.c != null) {
                this.o.d(dVar);
                c cVar = this.c;
                e eVar = cVar.r;
                net.luminis.tls.e eVar2 = net.luminis.tls.e.client_hello;
                eVar.getClass();
                cVar.c(cVar.j, "c e traffic", eVar.c(e.a(eVar2)), cVar.e);
                this.f.getClass();
            }
            k kVar = this.e;
            net.luminis.tls.handshake.d dVar2 = this.n;
            net.luminis.quic.crypto.f fVarD = ((i) kVar.z).d(1);
            fVarD.c(dVar2);
            ((i) kVar.z).L = 2;
            ((i) kVar.z).B.e = dVar2.b;
            net.luminis.quic.log.a aVar = (net.luminis.quic.log.a) kVar.y;
            fVarD.b(fVarD.i);
            aVar.getClass();
            ((i) kVar.z).n0 = dVar2;
            this.m = 2;
        } catch (InvalidAlgorithmParameterException unused) {
            kotlinx.coroutines.future.a.a();
        } catch (NoSuchAlgorithmException unused2) {
            org.mozilla.javascript.c.b("missing key pair generator algorithm EC");
        }
    }
}
