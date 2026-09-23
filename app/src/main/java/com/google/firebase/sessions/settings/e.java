package com.google.firebase.sessions.settings;

import kotlinx.serialization.internal.b0;
import kotlinx.serialization.internal.h0;
import kotlinx.serialization.internal.o0;
import kotlinx.serialization.internal.q;
import kotlinx.serialization.internal.w;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements w {
    public static final e a;
    private static final kotlinx.serialization.descriptors.e descriptor;

    static {
        e eVar = new e();
        a = eVar;
        o0 o0Var = new o0("com.google.firebase.sessions.settings.SessionConfigs", eVar, 5);
        o0Var.k("sessionsEnabled", false);
        o0Var.k("sessionSamplingRate", false);
        o0Var.k("sessionTimeoutSeconds", false);
        o0Var.k("cacheDurationSeconds", false);
        o0Var.k("cacheUpdatedTimeSeconds", false);
        descriptor = o0Var;
    }

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        kotlinx.serialization.descriptors.e eVar = descriptor;
        kotlinx.serialization.encoding.a aVarN = bVar.n(eVar);
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        boolean z = true;
        while (z) {
            int iS = aVarN.s(eVar);
            if (iS == -1) {
                z = false;
            } else if (iS == 0) {
                bool = (Boolean) aVarN.t(eVar, 0, kotlinx.serialization.internal.f.a, bool);
                i |= 1;
            } else if (iS == 1) {
                d = (Double) aVarN.t(eVar, 1, q.a, d);
                i |= 2;
            } else if (iS == 2) {
                num = (Integer) aVarN.t(eVar, 2, b0.a, num);
                i |= 4;
            } else if (iS == 3) {
                num2 = (Integer) aVarN.t(eVar, 3, b0.a, num2);
                i |= 8;
            } else {
                if (iS != 4) {
                    throw new kotlinx.serialization.e(iS);
                }
                l = (Long) aVarN.t(eVar, 4, h0.a, l);
                i |= 16;
            }
        }
        aVarN.h(eVar);
        return new g(i, bool, d, num, num2, l);
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        g gVar = (g) obj;
        gVar.getClass();
        kotlinx.serialization.descriptors.e eVar = descriptor;
        kotlinx.serialization.json.internal.n nVarA = nVar.a(eVar);
        nVarA.n(eVar, 0, kotlinx.serialization.internal.f.a, gVar.a);
        nVarA.n(eVar, 1, q.a, gVar.b);
        b0 b0Var = b0.a;
        nVarA.n(eVar, 2, b0Var, gVar.c);
        nVarA.n(eVar, 3, b0Var, gVar.d);
        nVarA.n(eVar, 4, h0.a, gVar.e);
        nVarA.s(eVar);
    }

    @Override // kotlinx.serialization.internal.w
    public final kotlinx.serialization.a[] c() {
        kotlinx.serialization.a aVarI = kotlin.collections.q.i(kotlinx.serialization.internal.f.a);
        kotlinx.serialization.a aVarI2 = kotlin.collections.q.i(q.a);
        b0 b0Var = b0.a;
        return new kotlinx.serialization.a[]{aVarI, aVarI2, kotlin.collections.q.i(b0Var), kotlin.collections.q.i(b0Var), kotlin.collections.q.i(h0.a)};
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return descriptor;
    }
}
