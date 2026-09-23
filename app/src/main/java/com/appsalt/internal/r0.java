package com.appsalt.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.cd;
import com.google.android.gms.internal.measurement.hc;
import com.google.android.gms.internal.measurement.ic;
import com.google.android.gms.internal.measurement.na;
import com.google.android.gms.internal.measurement.pc;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements net.luminis.quic.log.a {
    public volatile Object e;
    public Object y;

    public String a() {
        return ((SimpleDateFormat) this.e).format(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // net.luminis.quic.log.a
    public void b(String str) {
        a();
        ((g4) ((androidx.work.impl.k) this.y).y).getClass();
    }

    @Override // net.luminis.quic.log.a
    public void c(String str, Throwable th) {
        a();
        Objects.toString(th);
        ((g4) ((androidx.work.impl.k) this.y).y).getClass();
    }

    public pc d(final na naVar) {
        final hc hcVar = (hc) this.e;
        hc hcVar2 = pc.j;
        if (hcVar != hcVar2) {
            com.google.android.gms.internal.measurement.s5 s5Var = pc.i;
            s5Var.getClass();
            final androidx.media3.common.util.m0 m0Var = new androidx.media3.common.util.m0();
            m0Var.e = false;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) s5Var.y;
            Context context = naVar.b;
            String str = hcVar.d;
            if (str == null) {
                str = (String) hcVar.a.apply(context);
                hcVar.d = str;
            }
            ic icVar = (ic) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: com.google.android.gms.internal.measurement.oc
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    ic icVar2 = new ic(new pc(naVar, hcVar));
                    m0Var.e = true;
                    return icVar2;
                }
            });
            if (m0Var.e) {
                cd.a(naVar.b, new com.google.android.gms.internal.measurement.s5(s5Var, 13));
            }
            this.y = icVar.a;
            this.e = hcVar2;
        }
        return (pc) this.y;
    }

    @Override // net.luminis.quic.log.a
    public com.google.android.gms.measurement.internal.z e() {
        return new com.google.android.gms.measurement.internal.z(27);
    }

    @Override // net.luminis.quic.log.a
    public void f() {
        synchronized (this) {
        }
    }
}
