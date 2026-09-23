package com.google.android.gms.internal.measurement;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class eb {
    public final z9 a;

    public eb(z9 z9Var) {
        this.a = z9Var;
    }

    public static com.google.common.util.concurrent.a b(com.google.android.gms.tasks.s sVar) {
        fa faVar = new fa();
        faVar.E = sVar;
        s5 s5Var = new s5(faVar, 10);
        com.google.common.util.concurrent.d0 d0Var = com.google.common.util.concurrent.d0.e;
        sVar.a(d0Var, s5Var);
        return com.google.common.util.concurrent.m0.a(faVar, com.google.android.gms.common.api.d.class, db.b, d0Var);
    }

    public final com.google.common.util.concurrent.a a(j5 j5Var) {
        String string;
        z9 z9Var = this.a;
        String simpleName = ba.class.getSimpleName();
        Looper looper = z9Var.f;
        com.google.android.gms.common.internal.x.h(looper, "Looper must not be null");
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f();
        fVar.a = new androidx.work.impl.utils.taskexecutor.b(looper);
        fVar.b = j5Var;
        com.google.android.gms.common.internal.x.d(simpleName);
        fVar.c = new com.google.android.gms.common.api.internal.f(j5Var, simpleName);
        String strA = com.google.android.gms.common.util.c.a();
        if (strA == null) {
            string = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = strA.length() + 1;
            int iIdentityHashCode = System.identityHashCode(ba.class);
            StringBuilder sb = new StringBuilder(length + String.valueOf(iIdentityHashCode).length());
            sb.append(strA);
            sb.append("|");
            sb.append(iIdentityHashCode);
            string = sb.toString();
        }
        com.google.android.datatransport.runtime.j jVar = new com.google.android.datatransport.runtime.j(z9Var, string, fVar, 7);
        f1 f1Var = f1.B;
        androidx.compose.material.ripple.g gVar = new androidx.compose.material.ripple.g();
        gVar.d = fVar;
        gVar.b = jVar;
        gVar.c = f1Var;
        gVar.e = new com.google.android.gms.common.d[]{h.b};
        gVar.a = false;
        com.google.android.gms.common.api.internal.f fVar2 = (com.google.android.gms.common.api.internal.f) ((androidx.emoji2.text.f) gVar.d).c;
        com.google.android.gms.common.internal.x.h(fVar2, "Key must not be null");
        androidx.emoji2.text.f fVar3 = (androidx.emoji2.text.f) gVar.d;
        androidx.compose.foundation.lazy.layout.b1 b1Var = new androidx.compose.foundation.lazy.layout.b1(gVar, fVar3, (com.google.android.gms.common.d[]) gVar.e, gVar.a);
        androidx.media3.exoplayer.hls.c cVar = new androidx.media3.exoplayer.hls.c(gVar, fVar2);
        com.google.android.gms.common.internal.x.h((com.google.android.gms.common.api.internal.f) fVar3.c, "Listener has already been released.");
        com.google.android.gms.common.api.internal.e eVar = z9Var.i;
        eVar.getClass();
        com.google.android.gms.tasks.j jVar2 = new com.google.android.gms.tasks.j();
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(new com.google.android.gms.common.api.internal.v(new com.google.android.gms.common.api.internal.s(b1Var, cVar), jVar2), eVar.F.get(), z9Var);
        com.google.android.gms.internal.base.g gVar2 = eVar.J;
        gVar2.sendMessage(gVar2.obtainMessage(8, rVar));
        return b(jVar2.a);
    }
}
