package com.google.android.gms.tasks;

import android.os.Bundle;
import android.util.Log;
import com.appsalt.internal.k0;
import com.google.android.gms.measurement.internal.a0;
import com.google.android.gms.measurement.internal.b0;
import com.google.android.gms.measurement.internal.y;
import com.google.firebase.crashlytics.internal.common.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.h0;
import okhttp3.j0;
import okhttp3.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements com.google.android.material.button.b, com.google.firebase.crashlytics.internal.analytics.b, com.google.firebase.crashlytics.internal.breadcrumbs.a, h, okhttp3.internal.connection.g, retrofit2.m {
    public Object e;

    public /* synthetic */ q(Object obj) {
        this.e = obj;
    }

    public static String l(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // okhttp3.internal.connection.g
    public okhttp3.internal.connection.n a() throws Throwable {
        IOException iOException = null;
        while (!((okhttp3.internal.connection.o) this.e).l.N) {
            try {
                okhttp3.internal.connection.r rVarB = ((okhttp3.internal.connection.o) this.e).b();
                if (!rVarB.a()) {
                    okhttp3.internal.connection.q qVarE = rVarB.e();
                    if (qVarE.b == null && qVarE.c == null) {
                        qVarE = rVarB.g();
                    }
                    okhttp3.internal.connection.r rVar = qVarE.b;
                    Throwable th = qVarE.c;
                    if (th != null) {
                        throw th;
                    }
                    if (rVar != null) {
                        ((okhttp3.internal.connection.o) this.e).q.addFirst(rVar);
                    }
                }
                return rVarB.d();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    kotlin.a.a(iOException, e);
                }
                if (!((okhttp3.internal.connection.o) this.e).a(null)) {
                    throw iOException;
                }
            }
        }
        kotlinx.coroutines.future.a.w("Canceled");
        return null;
    }

    @Override // okhttp3.internal.connection.g
    public okhttp3.internal.connection.o b() {
        return (okhttp3.internal.connection.o) this.e;
    }

    @Override // retrofit2.m
    public Object c(Object obj) {
        Charset charsetA;
        j0 j0Var = (j0) obj;
        h0 h0Var = j0Var.e;
        if (h0Var == null) {
            okio.h hVarP = j0Var.P();
            u uVarX = j0Var.x();
            if (uVarX == null || (charsetA = u.a(uVarX)) == null) {
                charsetA = kotlin.text.a.a;
            }
            h0Var = new h0(hVarP, charsetA);
            j0Var.e = h0Var;
        }
        com.google.gson.stream.a aVar = new com.google.gson.stream.a(h0Var);
        aVar.L = 2;
        try {
            Object objB = ((com.google.gson.m) this.e).b(aVar);
            if (aVar.n0() != 10) {
                throw new com.google.gson.h("JSON document was not fully consumed.", 8);
            }
            j0Var.close();
            return objB;
        } catch (Throwable th) {
            j0Var.close();
            throw th;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.a
    public void d(com.google.firebase.crashlytics.internal.common.p pVar) {
        this.e = pVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.b
    public void e(String str, Bundle bundle) {
        com.google.firebase.crashlytics.internal.common.p pVar = (com.google.firebase.crashlytics.internal.common.p) this.e;
        if (pVar != null) {
            try {
                String str2 = "$A$:" + l(str, bundle);
                com.google.firebase.crashlytics.internal.common.q qVar = pVar.a;
                qVar.o.a.a(new com.google.firebase.crashlytics.internal.common.o(qVar, System.currentTimeMillis() - qVar.d, str2, 0));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    public com.google.android.material.shape.d f(com.google.android.material.shape.d dVar) {
        return dVar instanceof com.google.android.material.shape.j ? dVar : new com.google.android.material.shape.b(-((com.google.android.material.shape.i) this.e).i(), dVar);
    }

    @Override // com.google.android.gms.tasks.h
    public s g(Object obj) {
        com.google.firebase.crashlytics.internal.settings.a aVar = (com.google.firebase.crashlytics.internal.settings.a) obj;
        com.google.android.material.internal.k kVar = (com.google.android.material.internal.k) this.e;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return org.jsoup.helper.n.o(null);
        }
        com.google.firebase.crashlytics.internal.common.m mVar = (com.google.firebase.crashlytics.internal.common.m) kVar.z;
        com.google.firebase.crashlytics.internal.common.m.a(mVar);
        mVar.m.l(null, mVar.e.a);
        mVar.q.d(null);
        return org.jsoup.helper.n.o(null);
    }

    public void h(k0 k0Var, Thread thread, Throwable th) {
        s sVarD;
        com.google.firebase.crashlytics.internal.common.m mVar = (com.google.firebase.crashlytics.internal.common.m) this.e;
        synchronized (mVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            coil3.svg.internal.a.G();
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.google.firebase.crashlytics.internal.concurrency.b bVar = mVar.e.a;
            com.google.firebase.crashlytics.internal.common.k kVar = new com.google.firebase.crashlytics.internal.common.k(mVar, jCurrentTimeMillis, th, thread, k0Var);
            synchronized (bVar.y) {
                sVarD = bVar.z.d(bVar.e, new com.google.android.datatransport.runtime.scheduling.jobscheduling.j(kVar, 6));
                bVar.z = sVarD;
            }
            try {
                w.a(sVarD);
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:315:0x070d  */
    /* JADX WARN: Code duplicated, block: B:317:0x0716  */
    public net.luminis.tls.handshake.e i(ByteBuffer byteBuffer, net.luminis.tls.engine.b bVar, int i) throws net.luminis.tls.i {
        net.luminis.tls.h hVar;
        boolean zVerify;
        net.luminis.tls.extension.j jVar;
        net.luminis.tls.extension.i iVar;
        net.luminis.tls.extension.l lVar;
        byte b = byteBuffer.get();
        int i2 = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
        if (b == net.luminis.tls.e.client_hello.e) {
            new net.luminis.tls.handshake.d(byteBuffer, (com.google.android.datatransport.runtime.scheduling.jobscheduling.j) this.e);
            ((net.luminis.tls.engine.impl.a) bVar).getClass();
            throw new net.luminis.tls.alert.a("no client hello expected", 8);
        }
        List list = null;
        boolean z = true;
        int length = 0;
        if (b == net.luminis.tls.e.server_hello.e) {
            net.luminis.tls.handshake.g gVar = new net.luminis.tls.handshake.g();
            gVar.d = Collections.EMPTY_LIST;
            int i3 = i2 + 4;
            if (byteBuffer.remaining() < 44) {
                kotlinx.coroutines.future.a.g("Message too short");
                return null;
            }
            byteBuffer.getInt();
            byte b2 = byteBuffer.get();
            byte b3 = byteBuffer.get();
            if (b2 != 3 || b3 != 3) {
                throw new net.luminis.tls.alert.a("Invalid version number (should be 0x0303)", 5);
            }
            byte[] bArr = new byte[32];
            gVar.b = bArr;
            byteBuffer.get(bArr);
            Arrays.equals(gVar.b, net.luminis.tls.handshake.g.e);
            int i4 = byteBuffer.get() & 255;
            if (i4 > 32) {
                kotlinx.coroutines.future.a.g("session id length exceeds 32");
                return null;
            }
            byteBuffer.get(new byte[i4]);
            short s = byteBuffer.getShort();
            for (net.luminis.tls.c cVar : net.luminis.tls.c.values()) {
                if (cVar.e == s) {
                    gVar.c = cVar;
                    break;
                }
            }
            if (byteBuffer.get() != 0) {
                kotlinx.coroutines.future.a.g("Legacy compression method must have the value 0");
                return null;
            }
            gVar.d = net.luminis.tls.handshake.e.c(byteBuffer, net.luminis.tls.e.server_hello, null);
            gVar.a = new byte[i3];
            byteBuffer.get(gVar.a);
            net.luminis.tls.engine.impl.a aVar = (net.luminis.tls.engine.impl.a) bVar;
            if (aVar.m != 2) {
                return gVar;
            }
            Iterator it = gVar.d.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                if (((net.luminis.tls.extension.g) it.next()) instanceof net.luminis.tls.extension.n) {
                    z2 = true;
                }
            }
            boolean z3 = false;
            for (net.luminis.tls.extension.g gVar2 : gVar.d) {
                if ((gVar2 instanceof net.luminis.tls.extension.k) || (gVar2 instanceof net.luminis.tls.extension.j)) {
                    z3 = true;
                }
            }
            if (!z2 || !z3) {
                throw new net.luminis.tls.alert.a();
            }
            short s2 = -1;
            for (net.luminis.tls.extension.g gVar3 : gVar.d) {
                if (gVar3 instanceof net.luminis.tls.extension.n) {
                    s2 = ((net.luminis.tls.extension.n) gVar3).b;
                }
            }
            if (s2 != 772) {
                throw new net.luminis.tls.alert.a("invalid tls version", 5);
            }
            for (net.luminis.tls.extension.g gVar4 : gVar.d) {
                if (!(gVar4 instanceof net.luminis.tls.extension.o) && !(gVar4 instanceof net.luminis.tls.extension.n) && !(gVar4 instanceof net.luminis.tls.extension.k) && !(gVar4 instanceof net.luminis.tls.extension.j)) {
                    throw new net.luminis.tls.alert.a("illegal extension in server hello", 5);
                }
            }
            Iterator it2 = gVar.d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    jVar = null;
                    break;
                }
                net.luminis.tls.extension.g gVar5 = (net.luminis.tls.extension.g) it2.next();
                if (gVar5 instanceof net.luminis.tls.extension.j) {
                    jVar = (net.luminis.tls.extension.j) gVar5;
                    break;
                }
            }
            if (jVar != null) {
                iVar = !jVar.b.isEmpty() ? (net.luminis.tls.extension.i) jVar.b.get(0) : null;
                if (iVar == null) {
                    throw new net.luminis.tls.alert.a("", 5);
                }
                if (iVar.a != aVar.i) {
                    throw new net.luminis.tls.alert.a("server supplied key share does not match client supported named group", 5);
                }
            } else {
                iVar = null;
            }
            Iterator it3 = gVar.d.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    lVar = null;
                    break;
                }
                net.luminis.tls.extension.g gVar6 = (net.luminis.tls.extension.g) it3.next();
                if (gVar6 instanceof net.luminis.tls.extension.l) {
                    lVar = (net.luminis.tls.extension.l) gVar6;
                    break;
                }
            }
            if (iVar == null && lVar == null) {
                throw new net.luminis.tls.alert.a(" either the pre_shared_key extension or the key_share extension must be present", net.luminis.tls.b.missing_extension);
            }
            if (lVar != null) {
                aVar.u = true;
            }
            if (!aVar.h.contains(gVar.c)) {
                throw new net.luminis.tls.alert.a("cipher suite does not match", 5);
            }
            net.luminis.tls.c cVar2 = gVar.c;
            aVar.j = cVar2;
            if (aVar.c == null) {
                aVar.o = new net.luminis.tls.engine.impl.e(net.luminis.tls.engine.impl.b.c(cVar2));
                net.luminis.tls.engine.impl.e eVar = aVar.o;
                int iOrdinal = aVar.j.ordinal();
                int i5 = 16;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1 || iOrdinal == 2) {
                        i5 = 32;
                    } else if (iOrdinal != 3 && iOrdinal != 4) {
                        kotlinx.coroutines.future.a.a();
                        i5 = 0;
                    }
                }
                aVar.c = new net.luminis.tls.engine.impl.c(eVar, null, i5, net.luminis.tls.engine.impl.b.c(aVar.j));
                aVar.o.d(aVar.n);
                net.luminis.tls.engine.impl.c cVar3 = aVar.c;
                net.luminis.tls.engine.impl.e eVar2 = cVar3.r;
                net.luminis.tls.e eVar3 = net.luminis.tls.e.client_hello;
                eVar2.getClass();
                cVar3.c(cVar3.j, "c e traffic", eVar2.c(net.luminis.tls.engine.impl.e.a(eVar3)), cVar3.e);
                aVar.f.getClass();
            }
            net.luminis.tls.engine.impl.c cVar4 = aVar.c;
            if (lVar != null) {
                cVar4.f = true;
            } else if (cVar4.i != null && !cVar4.f) {
                cVar4.a(new byte[cVar4.e]);
            }
            if (iVar != null) {
                net.luminis.tls.engine.impl.c cVar5 = aVar.c;
                cVar5.h = aVar.b;
                cVar5.g = iVar.a();
                aVar.c.b();
            }
            aVar.o.d(gVar);
            net.luminis.tls.engine.impl.c cVar6 = aVar.c;
            byte[] bArr2 = cVar6.j;
            byte[] bArr3 = cVar6.c;
            short s3 = cVar6.e;
            byte[] bArrC = cVar6.c(bArr2, "derived", bArr3, s3);
            net.luminis.tls.util.a.a(bArrC);
            byte[] bArrX = cVar6.b.x(bArrC, cVar6.s);
            cVar6.o = bArrX;
            net.luminis.tls.util.a.a(bArrX);
            net.luminis.tls.engine.impl.e eVar4 = cVar6.r;
            net.luminis.tls.e eVar5 = net.luminis.tls.e.server_hello;
            eVar4.getClass();
            byte[] bArrC2 = eVar4.c(net.luminis.tls.engine.impl.e.a(eVar5));
            byte[] bArrC3 = cVar6.c(cVar6.o, "c hs traffic", bArrC2, s3);
            cVar6.n = bArrC3;
            net.luminis.tls.util.a.a(bArrC3);
            byte[] bArrC4 = cVar6.c(cVar6.o, "s hs traffic", bArrC2, s3);
            cVar6.m = bArrC4;
            net.luminis.tls.util.a.a(bArrC4);
            byte[] bArr4 = cVar6.n;
            short s4 = cVar6.d;
            Charset charset = net.luminis.tls.engine.impl.c.u;
            net.luminis.tls.util.a.a(cVar6.c(bArr4, "key", "".getBytes(charset), s4));
            net.luminis.tls.util.a.a(cVar6.c(cVar6.m, "key", "".getBytes(charset), s4));
            net.luminis.tls.util.a.a(cVar6.c(cVar6.n, "iv", "".getBytes(charset), (short) 12));
            net.luminis.tls.util.a.a(cVar6.c(cVar6.m, "iv", "".getBytes(charset), (short) 12));
            aVar.m = 3;
            net.luminis.quic.impl.i iVar2 = aVar.f;
            net.luminis.quic.crypto.d dVar = iVar2.B;
            net.luminis.tls.engine.impl.a aVar2 = iVar2.Q;
            net.luminis.tls.c cVar7 = aVar2.j;
            if (cVar7 == null) {
                kotlinx.coroutines.future.a.u("No (valid) server hello received yet");
                return null;
            }
            synchronized (dVar) {
                dVar.a = cVar7;
                dVar.c(3, cVar7, dVar.b.a);
                net.luminis.tls.engine.impl.c cVar8 = aVar2.c;
                if (cVar8 == null) {
                    throw new IllegalStateException("Traffic secret not yet available");
                }
                byte[] bArr5 = cVar8.n;
                dVar.d.getClass();
                dVar.f[2].b(bArr5);
                net.luminis.tls.engine.impl.c cVar9 = aVar2.c;
                if (cVar9 == null) {
                    throw new IllegalStateException("Traffic secret not yet available");
                }
                byte[] bArr6 = cVar9.m;
                dVar.d.getClass();
                dVar.g[2].b(bArr6);
                if (dVar.h) {
                    dVar.a(3, "HANDSHAKE_TRAFFIC_SECRET");
                }
            }
            synchronized (iVar2.D) {
                try {
                    if (androidx.constraintlayout.core.g.e(iVar2.C) >= androidx.constraintlayout.core.g.e(2)) {
                        z = false;
                    }
                    if (z) {
                        iVar2.C = 2;
                        Iterator it4 = iVar2.E.iterator();
                        while (it4.hasNext()) {
                            ((net.luminis.quic.recovery.g) it4.next()).d(iVar2.C);
                        }
                    } else {
                        iVar2.z.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            iVar2.G.add(new net.luminis.quic.impl.h(iVar2, 1));
            return gVar;
        }
        if (b == net.luminis.tls.e.encrypted_extensions.e) {
            net.luminis.tls.handshake.b bVar2 = new net.luminis.tls.handshake.b(1);
            bVar2.c = Collections.EMPTY_LIST;
            ArrayList arrayList = new ArrayList();
            Iterator it5 = ((List) bVar2.c).iterator();
            while (it5.hasNext()) {
                arrayList.add(((net.luminis.tls.extension.g) it5.next()).a());
            }
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                length += ((byte[]) it6.next()).length;
            }
            byte[] bArr7 = new byte[length + 6];
            bVar2.b = bArr7;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr7);
            byteBufferWrap.putInt((length + 2) | 134217728);
            byteBufferWrap.putShort((short) length);
            Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                byteBufferWrap.put((byte[]) it7.next());
            }
            int i6 = i2 + 4;
            com.google.android.datatransport.runtime.scheduling.jobscheduling.j jVar2 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.j) this.e;
            if (byteBuffer.remaining() < 6) {
                kotlinx.coroutines.future.a.g("Message too short");
                return null;
            }
            int iPosition = byteBuffer.position();
            int i7 = byteBuffer.getInt() & 16777215;
            if (byteBuffer.remaining() < i7 || i7 < 2) {
                kotlinx.coroutines.future.a.g("Incorrect message length");
                return null;
            }
            bVar2.c = net.luminis.tls.handshake.e.c(byteBuffer, net.luminis.tls.e.server_hello, jVar2);
            bVar2.b = new byte[i6];
            byteBuffer.get(bVar2.b);
            ((net.luminis.tls.engine.impl.a) bVar).d(bVar2, i);
            return bVar2;
        }
        net.luminis.tls.e eVar6 = net.luminis.tls.e.certificate;
        if (b == eVar6.e) {
            net.luminis.tls.handshake.a aVar3 = new net.luminis.tls.handshake.a();
            ArrayList arrayList2 = new ArrayList();
            aVar3.c = arrayList2;
            int iPosition2 = byteBuffer.position();
            int iD = aVar3.d(byteBuffer, eVar6, 13);
            try {
                int i8 = byteBuffer.get() & 255;
                if (i8 > 0) {
                    byte[] bArr8 = new byte[i8];
                    aVar3.a = bArr8;
                    byteBuffer.get(bArr8);
                } else {
                    aVar3.a = new byte[0];
                }
                aVar3.e(byteBuffer);
                aVar3.d = new byte[iD + 4];
                byteBuffer.get(aVar3.d);
                net.luminis.tls.engine.impl.a aVar4 = (net.luminis.tls.engine.impl.a) bVar;
                if (i != 2) {
                    aVar4.getClass();
                    throw new net.luminis.tls.alert.a("incorrect protection level", 8);
                }
                int i9 = aVar4.m;
                if (i9 != 5 && i9 != 4) {
                    throw new net.luminis.tls.alert.a("unexpected certificate message", 8);
                }
                if (aVar3.a.length > 0) {
                    throw new net.luminis.tls.alert.a("certificate request context should be zero length", 5);
                }
                X509Certificate x509Certificate = aVar3.b;
                if (x509Certificate == null) {
                    throw new net.luminis.tls.alert.a("missing certificate", 5);
                }
                aVar4.q = x509Certificate;
                aVar4.r = arrayList2;
                aVar4.o.f(aVar3);
                aVar4.m = 6;
                return aVar3;
            } catch (BufferUnderflowException unused) {
                kotlinx.coroutines.future.a.g("message underflow");
                return null;
            }
        }
        net.luminis.tls.e eVar7 = net.luminis.tls.e.certificate_request;
        if (b == eVar7.e) {
            net.luminis.tls.handshake.b bVar3 = new net.luminis.tls.handshake.b(0);
            int iPosition3 = byteBuffer.position();
            int iD2 = bVar3.d(byteBuffer, eVar7, 7);
            int i10 = byteBuffer.get();
            byte[] bArr9 = new byte[i10];
            if (i10 > 0) {
                byteBuffer.get(bArr9);
            }
            bVar3.c = net.luminis.tls.handshake.e.c(byteBuffer, eVar7, null);
            if (byteBuffer.position() - (iPosition3 + 4) != iD2) {
                kotlinx.coroutines.future.a.g("inconsistent length");
                return null;
            }
            bVar3.b = new byte[iD2 + 4];
            byteBuffer.get(bVar3.b);
            net.luminis.tls.engine.impl.a aVar5 = (net.luminis.tls.engine.impl.a) bVar;
            if (i != 2) {
                aVar5.getClass();
                throw new net.luminis.tls.alert.a("incorrect protection level", 8);
            }
            if (aVar5.m != 4) {
                throw new net.luminis.tls.alert.a("unexpected certificate request message", 8);
            }
            for (net.luminis.tls.extension.g gVar7 : (ArrayList) bVar3.c) {
                if (gVar7 instanceof net.luminis.tls.extension.m) {
                    list = ((net.luminis.tls.extension.m) gVar7).a;
                    break;
                }
            }
            if (list == null) {
                throw new net.luminis.tls.alert.a();
            }
            aVar5.y = list;
            aVar5.o.d(bVar3);
            aVar5.w = new ArrayList();
            for (net.luminis.tls.extension.g gVar8 : (ArrayList) bVar3.c) {
                if (gVar8 instanceof net.luminis.tls.extension.b) {
                    aVar5.w = ((net.luminis.tls.extension.b) gVar8).a;
                    break;
                }
            }
            aVar5.v = true;
            aVar5.m = 5;
            return bVar3;
        }
        net.luminis.tls.e eVar8 = net.luminis.tls.e.certificate_verify;
        if (b != eVar8.e) {
            net.luminis.tls.e eVar9 = net.luminis.tls.e.finished;
            if (b == eVar9.e) {
                net.luminis.tls.handshake.b bVar4 = new net.luminis.tls.handshake.b(2);
                byte[] bArr10 = new byte[bVar4.d(byteBuffer, eVar9, 36)];
                bVar4.b = bArr10;
                byteBuffer.get(bArr10);
                byte[] bArr11 = new byte[i2 + 4];
                bVar4.c = bArr11;
                byteBuffer.get(bArr11);
                ((net.luminis.tls.engine.impl.a) bVar).e(bVar4, i);
                return bVar4;
            }
            net.luminis.tls.e eVar10 = net.luminis.tls.e.new_session_ticket;
            if (b != eVar10.e) {
                throw new net.luminis.tls.i(androidx.privacysandbox.ads.adservices.java.internal.a.q("Invalid/unsupported message type (", b, ")"));
            }
            net.luminis.tls.handshake.f fVar = new net.luminis.tls.handshake.f();
            int iD3 = fVar.d(byteBuffer, eVar10, 17);
            int i11 = byteBuffer.getInt();
            fVar.d = i11;
            if (i11 > 604800 || i11 < 0) {
                throw new net.luminis.tls.alert.a("Invalid ticket lifetime", 5);
            }
            fVar.a = ((long) byteBuffer.getInt()) & 4294967295L;
            int i12 = iD3 - 8;
            byte[] bArrE = net.luminis.tls.handshake.f.e(byteBuffer, 1, i12, "ticket nonce");
            fVar.c = bArrE;
            fVar.b = net.luminis.tls.handshake.f.e(byteBuffer, 2, i12 - (bArrE.length + 1), "ticket");
            for (net.luminis.tls.extension.g gVar9 : net.luminis.tls.handshake.e.c(byteBuffer, eVar10, null)) {
                if (gVar9 instanceof net.luminis.tls.extension.f) {
                    if (fVar.e != null) {
                        kotlinx.coroutines.future.a.g("repeated extension is not allowed");
                        return null;
                    }
                    fVar.e = (net.luminis.tls.extension.f) gVar9;
                }
            }
            net.luminis.tls.engine.impl.a aVar6 = (net.luminis.tls.engine.impl.a) bVar;
            if (i != 3) {
                aVar6.getClass();
                throw new net.luminis.tls.alert.a("incorrect protection level", 8);
            }
            net.luminis.tls.engine.impl.c cVar10 = aVar6.c;
            cVar10.c(cVar10.l, "resumption", fVar.c, cVar10.e);
            androidx.media3.exoplayer.image.f fVar2 = new androidx.media3.exoplayer.image.f(4);
            fVar2.d = new Date();
            fVar2.b = fVar.d;
            net.luminis.tls.extension.f fVar3 = fVar.e;
            z = fVar3 != null;
            if (z) {
                fVar2.c = fVar3.a.longValue();
            }
            aVar6.t.add(fVar2);
            net.luminis.quic.impl.i iVar3 = aVar6.f;
            iVar3.getClass();
            if (z && fVar2.c != 4294967295L) {
                iVar3.z.b("Invalid quic new session ticket (invalid early data size); ignoring ticket.");
            }
            List list2 = iVar3.h0;
            net.luminis.quic.impl.m mVar = iVar3.e0;
            b0 b0Var = new b0(26);
            long j = mVar.b;
            list2.add(b0Var);
            return fVar;
        }
        net.luminis.tls.handshake.c cVar11 = new net.luminis.tls.handshake.c();
        int i13 = i2 + 4;
        int iPosition4 = byteBuffer.position();
        int iD4 = cVar11.d(byteBuffer, eVar8, 9);
        try {
            short s5 = byteBuffer.getShort();
            net.luminis.tls.h[] hVarArrValues = net.luminis.tls.h.values();
            int length2 = hVarArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    hVar = null;
                    break;
                }
                hVar = hVarArrValues[i14];
                if (hVar.e == s5) {
                    break;
                }
                i14++;
            }
            cVar11.a = hVar;
            byte[] bArr12 = new byte[byteBuffer.getShort() & 65535];
            cVar11.b = bArr12;
            byteBuffer.get(bArr12);
            if (byteBuffer.position() - iPosition4 != iD4 + 4) {
                throw new net.luminis.tls.alert.a("Incorrect message length", 2);
            }
            cVar11.c = new byte[i13];
            byteBuffer.get(cVar11.c);
            net.luminis.tls.engine.impl.a aVar7 = (net.luminis.tls.engine.impl.a) bVar;
            if (i != 2) {
                aVar7.getClass();
                throw new net.luminis.tls.alert.a("incorrect protection level", 8);
            }
            if (aVar7.m != 6) {
                throw new net.luminis.tls.alert.a("unexpected certificate verify message", 8);
            }
            net.luminis.tls.h hVar2 = cVar11.a;
            if (hVar2 == null || !aVar7.p.contains(hVar2)) {
                throw new net.luminis.tls.alert.a("signature scheme does not match", 5);
            }
            byte[] bArr13 = cVar11.b;
            X509Certificate x509Certificate2 = aVar7.q;
            net.luminis.tls.engine.impl.e eVar11 = aVar7.o;
            eVar11.getClass();
            byte[] bArrC5 = eVar11.c(net.luminis.tls.engine.impl.e.b(eVar6, false));
            Charset charset2 = net.luminis.tls.engine.impl.a.A;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate("TLS 1.3, server CertificateVerify".getBytes(charset2).length + 65 + bArrC5.length);
            for (int i15 = 0; i15 < 64; i15++) {
                byteBufferAllocate.put((byte) 32);
            }
            byteBufferAllocate.put("TLS 1.3, server CertificateVerify".getBytes(charset2));
            byteBufferAllocate.put((byte) 0);
            byteBufferAllocate.put(bArrC5);
            try {
                Signature signatureB = aVar7.b(hVar2);
                signatureB.initVerify(x509Certificate2);
                signatureB.update(byteBufferAllocate.array());
                zVerify = signatureB.verify(bArr13);
            } catch (InvalidKeyException | SignatureException unused2) {
                zVerify = false;
            }
            if (!zVerify) {
                throw new net.luminis.tls.alert.a("signature verification fails", 3);
            }
            List list3 = aVar7.r;
            try {
                X509Certificate[] x509CertificateArr = new X509Certificate[list3.size()];
                for (int i16 = 0; i16 < list3.size(); i16++) {
                    x509CertificateArr[i16] = (X509Certificate) list3.get(i16);
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX");
                trustManagerFactory.init((KeyStore) null);
                ((X509TrustManager) trustManagerFactory.getTrustManagers()[0]).checkServerTrusted(x509CertificateArr, "UNKNOWN");
                a0 a0Var = aVar7.s;
                String str = aVar7.g;
                X509Certificate x509Certificate3 = aVar7.q;
                a0Var.getClass();
                boolean z4 = false;
                try {
                    if (!a0.i(x509Certificate3.getSubjectAlternativeNames(), str)) {
                        String[] strArrSplit = x509Certificate3.getSubjectDN().getName().split(",");
                        int length3 = strArrSplit.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 < length3) {
                                String str2 = strArrSplit[i17];
                                if (str2.trim().startsWith("CN=") && !str2.trim().substring(3).equals(str)) {
                                    break;
                                }
                                i17++;
                            }
                        }
                        if (z4) {
                            throw new net.luminis.tls.alert.a("servername does not match", net.luminis.tls.b.certificate_unknown);
                        }
                        aVar7.o.f(cVar11);
                        aVar7.m = 7;
                        return cVar11;
                    }
                    z4 = true;
                    break;
                } catch (CertificateParsingException unused3) {
                }
                if (z4) {
                    throw new net.luminis.tls.alert.a("servername does not match", net.luminis.tls.b.certificate_unknown);
                }
                aVar7.o.f(cVar11);
                aVar7.m = 7;
                return cVar11;
            } catch (KeyStoreException unused4) {
                org.mozilla.javascript.c.b("keystore exception");
                return null;
            } catch (NoSuchAlgorithmException unused5) {
                org.mozilla.javascript.c.b("unsupported trust manager algorithm");
                return null;
            } catch (CertificateException e) {
                Throwable cause = e.getCause();
                String message = cause instanceof CertPathValidatorException ? cause.getMessage() + ": " + ((CertPathValidatorException) cause).getReason() : cause instanceof CertPathBuilderException ? cause.getMessage() : null;
                if (message == null) {
                    message = "certificate validation failed";
                }
                throw new net.luminis.tls.alert.a(message, 0);
            }
        } catch (BufferUnderflowException unused6) {
            kotlinx.coroutines.future.a.g("message underflow");
            return null;
        }
    }

    public com.google.firebase.crashlytics.internal.settings.a j(JSONObject jSONObject) {
        com.google.firebase.crashlytics.internal.settings.b yVar;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            yVar = new b0(23);
        } else {
            yVar = new y(24);
        }
        return yVar.h((y) this.e, jSONObject);
    }

    public JSONObject k() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.e;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(com.google.firebase.crashlytics.internal.common.g.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        com.google.firebase.crashlytics.internal.common.g.b(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                    com.google.firebase.crashlytics.internal.common.g.b(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            com.google.firebase.crashlytics.internal.common.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            com.google.firebase.crashlytics.internal.common.g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }
}
