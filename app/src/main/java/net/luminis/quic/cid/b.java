package net.luminis.quic.cid;

import com.appsalt.internal.y0;
import com.google.android.gms.measurement.internal.a0;
import java.security.SecureRandom;
import java.util.concurrent.ConcurrentHashMap;
import net.luminis.quic.frame.h;
import net.luminis.quic.impl.g;
import net.luminis.quic.send.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final int a;
    public final a0 b;
    public final k c;
    public final g d;
    public final e e;
    public final d f;
    public final byte[] g;
    public final byte[] h;
    public volatile int i = 2;
    public volatile byte[] j;

    public b(k kVar, g gVar, net.luminis.quic.log.a aVar) {
        this.c = kVar;
        e eVar = new e(null, aVar);
        this.e = eVar;
        this.a = eVar.e;
        this.g = eVar.b;
        this.d = gVar;
        byte[] bArr = new byte[8];
        this.h = bArr;
        new SecureRandom().nextBytes(bArr);
        d dVar = new d(8, aVar);
        dVar.b = bArr;
        dVar.a.put(0, new a(bArr, 0, 2));
        this.f = dVar;
        this.b = new a0(26);
    }

    public final void a() {
        e eVar = this.e;
        ConcurrentHashMap concurrentHashMap = eVar.a;
        Integer num = null;
        boolean z = false;
        for (Integer num2 : concurrentHashMap.keySet()) {
            if (!z || num2.compareTo(num) > 0) {
                num = num2;
                z = true;
            }
        }
        int iIntValue = (z ? num.intValue() : 0) + 1;
        byte[] bArr = new byte[eVar.e];
        eVar.d.nextBytes(bArr);
        concurrentHashMap.put(Integer.valueOf(iIntValue), new a(bArr, iIntValue, 1));
        eVar.a();
        this.b.getClass();
        h hVar = new h();
        hVar.e = iIntValue;
        hVar.y = 0;
        hVar.z = bArr;
        byte[] bArr2 = new byte[16];
        hVar.A = bArr2;
        h.B.nextBytes(bArr2);
        this.c.f(hVar, 4, new y0(this, 1));
    }
}
