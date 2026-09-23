package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ld {
    public static final Object j = new Object();
    public static final Object k = new Object();
    public final Context a;
    public final com.google.common.base.q b;
    public final com.google.common.base.q c;
    public final com.google.common.base.q d;
    public final com.google.common.base.q e;
    public final com.google.common.base.q f;
    public final Uri g;
    public volatile pb h;
    public final Uri i;

    public ld(Context context, com.google.common.base.q qVar, com.google.common.base.q qVar2, com.google.common.base.q qVar3) {
        this.a = context;
        this.c = qVar;
        this.b = qVar3;
        this.d = qVar2;
        Pattern pattern = xd.a;
        com.caverock.androidsvg.x1 x1Var = new com.caverock.androidsvg.x1(context);
        x1Var.y0("phenotype_storage_info");
        x1Var.z0("storage-info.pb");
        this.g = x1Var.A0();
        com.caverock.androidsvg.x1 x1Var2 = new com.caverock.androidsvg.x1(context);
        x1Var2.y0("phenotype_storage_info");
        x1Var2.z0("device-encrypted-storage-info.pb");
        Set set = xd.d;
        ka.e(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        x1Var2.b = "directboot-files";
        this.i = x1Var2.A0();
        this.e = android.support.v4.media.session.b.w(new s5(this, 16));
        this.f = android.support.v4.media.session.b.w(new qa(qVar, 1));
    }

    public final void a() {
        if (!ea.s(this.a) || c().y() + 86400000 >= System.currentTimeMillis()) {
            com.google.common.util.concurrent.p0 p0Var = com.google.common.util.concurrent.p0.y;
            return;
        }
        com.google.common.util.concurrent.v0 v0Var = (com.google.common.util.concurrent.v0) this.c.get();
        v0Var.getClass();
        ListenableFuture listenableFutureE = com.google.common.util.concurrent.m0.e((ListenableFuture) this.f.get());
        int i = com.google.common.util.concurrent.h0.E;
        com.google.common.util.concurrent.m0.g(listenableFutureE instanceof com.google.common.util.concurrent.h0 ? (com.google.common.util.concurrent.h0) listenableFutureE : new com.google.common.util.concurrent.i0(listenableFutureE), new kc(this, 2), v0Var);
    }

    public final ed b() {
        pb pbVarC = c();
        return new ed(pbVarC.w(), com.google.common.collect.h0.o(pbVarC.B()), pbVarC.v(), pbVarC.x(), (pbVarC.C() && pbVarC.D().v() == ((long) Build.VERSION.SDK_INT)) ? pbVarC.D().u() : "", com.google.common.collect.h0.o(pbVarC.z()), com.google.common.collect.h0.o(pbVarC.A()), pbVarC.u(), pbVarC.F(), pbVarC.E(), pbVarC.G());
    }

    public final pb c() {
        pb pbVarI;
        pb pbVar = this.h;
        if (pbVar != null) {
            return pbVar;
        }
        synchronized (j) {
            pbVarI = this.h;
            if (pbVarI == null) {
                pbVarI = pb.I();
                if (ea.s(this.a)) {
                    h2 h2Var = (h2) pbVarI.t(7);
                    a1 a1Var = a1.a;
                    int i = o0.a;
                    a1 a1Var2 = a1.b;
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        InputStream inputStreamD = wf.d(((td) this.d.get()).b(this.g));
                        try {
                            i1 i1VarA = ((h1) h2Var).a(inputStreamD, a1Var2);
                            if (inputStreamD != null) {
                                inputStreamD.close();
                            }
                            pb pbVar2 = (pb) i1VarA;
                            StrictMode.setThreadPolicy(threadPolicy);
                            pbVarI = pbVar2;
                            this.h = pbVarI;
                        } catch (Throwable th) {
                            if (inputStreamD != null) {
                                try {
                                    inputStreamD.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th3;
                    }
                }
            }
        }
        return pbVarI;
    }
}
