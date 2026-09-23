package com.app.mlounge.ui.viewmodel;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends androidx.lifecycle.s0 {
    public final Flow A;
    public final Flow B;
    public final Flow C;
    public final Flow D;
    public final Flow E;
    public final Flow F;
    public final Flow G;
    public final Flow H;
    public final List I;
    public final List J;
    public final com.app.mlounge.data.local.prefs.v1 K;
    public final Flow L;
    public final Flow M;
    public final Flow N;
    public final Flow O;
    public final com.app.mlounge.data.local.prefs.y1 b;
    public final okhttp3.y c;
    public final Flow d;
    public final Flow e;
    public final Flow f;
    public final Flow g;
    public final Flow h;
    public final Flow i;
    public final Flow j;
    public final Flow k;
    public final Flow l;
    public final Flow m;
    public final Flow n;
    public final Flow o;
    public final Flow p;
    public final Flow q;
    public final Flow r;
    public final Flow s;
    public final Flow t;
    public final Flow u;
    public final Flow v;
    public final Flow w;
    public final Flow x;
    public final Flow y;
    public final Flow z;

    public p1(com.app.mlounge.data.local.prefs.y1 y1Var, com.app.mlounge.data.repository.r rVar, okhttp3.y yVar) {
        y1Var.getClass();
        rVar.getClass();
        yVar.getClass();
        this.b = y1Var;
        this.c = yVar;
        this.d = y1Var.c;
        this.e = y1Var.d;
        this.f = y1Var.u;
        this.g = y1Var.v;
        this.h = y1Var.w;
        this.i = y1Var.x;
        this.j = y1Var.y;
        this.k = y1Var.z;
        this.l = y1Var.A;
        this.m = y1Var.h;
        this.n = y1Var.i;
        this.o = y1Var.r;
        this.p = y1Var.e;
        this.q = y1Var.f;
        this.r = y1Var.g;
        this.s = y1Var.B;
        this.t = y1Var.C;
        this.u = y1Var.D;
        this.v = y1Var.E;
        this.w = y1Var.F;
        this.x = y1Var.G;
        this.y = y1Var.H;
        this.z = y1Var.I;
        this.A = y1Var.J;
        this.B = y1Var.K;
        this.C = y1Var.L;
        this.D = y1Var.M;
        this.E = y1Var.N;
        this.F = y1Var.O;
        this.G = y1Var.P;
        this.H = y1Var.U;
        this.I = rVar.G;
        this.J = rVar.H;
        this.K = new com.app.mlounge.data.local.prefs.v1(y1Var.p, 5);
        this.L = y1Var.Q;
        this.M = y1Var.R;
        this.N = y1Var.S;
        this.O = y1Var.T;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object e(p1 p1Var, kotlin.coroutines.jvm.internal.c cVar) {
        n1 n1Var;
        String str;
        kotlin.y yVar = kotlin.y.a;
        if (cVar instanceof n1) {
            n1Var = (n1) cVar;
            int i = n1Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                n1Var.A = i - Integer.MIN_VALUE;
            } else {
                n1Var = new n1(p1Var, cVar);
            }
        } else {
            n1Var = new n1(p1Var, cVar);
        }
        Object objWithContext = n1Var.y;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = n1Var.A;
        kotlin.coroutines.d dVar = null;
        try {
            if (i2 == 0) {
                kotlin.a.e(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                androidx.compose.foundation.text.selection.q qVar = new androidx.compose.foundation.text.selection.q(p1Var, dVar, 9);
                n1Var.A = 1;
                objWithContext = BuildersKt.withContext(io2, qVar, n1Var);
                if (objWithContext == aVar) {
                }
                return aVar;
            }
            if (i2 == 1) {
                kotlin.a.e(objWithContext);
            } else {
                if (i2 != 2) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = n1Var.e;
                kotlin.a.e(objWithContext);
            }
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("D", "SettingsVM", "Opt-out IP submitted: " + str);
            return yVar;
            String str2 = (String) objWithContext;
            if (str2 == null) {
                return yVar;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ips", new JSONArray((Collection) kotlin.collections.q.j(str2)));
            Charset charset = kotlin.text.a.d;
            charset.getClass();
            byte[] bytes = "cinemahq4:631202bd5fd9659a".getBytes(charset);
            bytes.getClass();
            String strConcat = "Basic ".concat(new okio.i(bytes).a());
            CoroutineDispatcher io3 = Dispatchers.getIO();
            androidx.compose.foundation.text.u0 u0Var = new androidx.compose.foundation.text.u0(strConcat, jSONObject, p1Var, dVar, 9);
            n1Var.e = str2;
            n1Var.A = 2;
            if (BuildersKt.withContext(io3, u0Var, n1Var) != aVar) {
                str = str2;
                Context context2 = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("D", "SettingsVM", "Opt-out IP submitted: " + str);
                return yVar;
            }
            return aVar;
        } catch (Exception e) {
            Context context3 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.d("SettingsVM", "Failed to submit opt-out IP", e);
            return yVar;
        }
    }

    public final void f(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(this), null, null, new i1(this, z, null, 0), 3, null);
    }
}
