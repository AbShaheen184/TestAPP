package net.luminis.tls.engine.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final d[] d = {d.e, d.y, d.z, d.A, d.B, d.C, d.D, d.E, d.F, d.G};
    public final MessageDigest a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public e(int i) {
        String str = "SHA-" + (i * 8);
        try {
            this.a = MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException unused) {
            org.mozilla.javascript.c.b(androidx.privacysandbox.ads.adservices.java.internal.a.r("Missing ", str, " support"));
            throw null;
        }
    }

    public static d a(net.luminis.tls.e eVar) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(net.luminis.tls.e.certificate);
        arrayList.add(net.luminis.tls.e.certificate_verify);
        arrayList.add(net.luminis.tls.e.finished);
        if (!arrayList.contains(eVar)) {
            return d.values()[eVar.ordinal()];
        }
        com.google.firebase.platforminfo.b.f(eVar, "cannot convert ambiguous type ");
        return null;
    }

    public static d b(net.luminis.tls.e eVar, boolean z) {
        if (eVar == net.luminis.tls.e.finished) {
            return z ? d.G : d.D;
        }
        if (eVar == net.luminis.tls.e.certificate) {
            return z ? d.E : d.B;
        }
        if (eVar == net.luminis.tls.e.certificate_verify) {
            return z ? d.F : d.C;
        }
        return d.values()[eVar.ordinal()];
    }

    public final byte[] c(d dVar) {
        MessageDigest messageDigest;
        ConcurrentHashMap concurrentHashMap = this.c;
        if (!concurrentHashMap.containsKey(dVar)) {
            int i = 0;
            while (true) {
                messageDigest = this.a;
                if (i >= 10) {
                    break;
                }
                d dVar2 = d[i];
                ConcurrentHashMap concurrentHashMap2 = this.b;
                if (concurrentHashMap2.containsKey(dVar2)) {
                    messageDigest.update((byte[]) concurrentHashMap2.get(dVar2));
                }
                if (dVar2 == dVar) {
                    break;
                }
                i++;
            }
            concurrentHashMap.put(dVar, messageDigest.digest());
        }
        return (byte[]) concurrentHashMap.get(dVar);
    }

    public final void d(net.luminis.tls.handshake.e eVar) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(net.luminis.tls.e.certificate);
        arrayList.add(net.luminis.tls.e.certificate_verify);
        arrayList.add(net.luminis.tls.e.finished);
        if (arrayList.contains(eVar.b())) {
            kotlinx.coroutines.future.a.r();
            return;
        }
        this.b.put(a(eVar.b()), eVar.a());
    }

    public final void e(net.luminis.tls.handshake.e eVar) {
        this.b.put(b(eVar.b(), true), eVar.a());
    }

    public final void f(net.luminis.tls.handshake.e eVar) {
        this.b.put(b(eVar.b(), false), eVar.a());
    }
}
