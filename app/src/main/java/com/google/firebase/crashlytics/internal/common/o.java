package com.google.firebase.crashlytics.internal.common;

import androidx.media3.common.util.i0;
import androidx.media3.exoplayer.c0;
import androidx.media3.exoplayer.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ long z;

    public /* synthetic */ o(androidx.media3.exoplayer.audio.t tVar, Object obj, long j) {
        this.e = 2;
        this.y = tVar;
        this.A = obj;
        this.z = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        long j = this.z;
        Object obj = this.A;
        Object obj2 = this.y;
        switch (i) {
            case 0:
                q qVar = (q) obj2;
                qVar.o.b.a(new o(qVar, this.z, (String) obj, 1));
                break;
            case 1:
                String str = (String) obj;
                m mVar = ((q) obj2).g;
                s sVar = mVar.n;
                if (sVar == null || !sVar.e.get()) {
                    ((com.google.firebase.crashlytics.internal.metadata.d) mVar.i.b).d(str, j);
                }
                break;
            default:
                x xVar = ((androidx.media3.exoplayer.audio.t) obj2).b;
                String str2 = i0.a;
                c0 c0Var = xVar.e;
                androidx.media3.exoplayer.analytics.g gVar = c0Var.r;
                androidx.media3.exoplayer.analytics.a aVarL = gVar.L();
                gVar.M(aVarL, 26, new androidx.media3.exoplayer.analytics.e(aVarL, obj, j));
                if (c0Var.T == obj) {
                    c0Var.m.e(26, new androidx.media3.exoplayer.v(0));
                }
                break;
        }
    }

    public /* synthetic */ o(q qVar, long j, String str, int i) {
        this.e = i;
        this.y = qVar;
        this.z = j;
        this.A = str;
    }
}
