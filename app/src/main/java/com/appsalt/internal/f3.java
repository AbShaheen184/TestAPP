package com.appsalt.internal;

import android.content.Context;
import java.util.Map;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 implements u, v2 {
    public final g4 a;
    public final androidx.compose.runtime.internal.c b;
    public final k0 c;
    public final androidx.media3.exoplayer.hls.c d;
    public kotlin.jvm.functions.l e;
    public boolean f;

    public f3(Context context) {
        g4 g4Var = new g4(1);
        this.a = g4Var;
        androidx.compose.runtime.internal.c cVar = new androidx.compose.runtime.internal.c(g4Var);
        this.b = cVar;
        z zVar = new z(context, 0);
        k0 k0Var = new k0();
        k0Var.a = zVar;
        g gVar = new g(context, g4Var);
        g0 g0Var = g0.e;
        kotlin.k kVar = new kotlin.k(g0Var, gVar);
        h hVar = new h(context, g4Var);
        g0 g0Var2 = g0.y;
        Map mapK = kotlin.collections.c0.k(kVar, new kotlin.k(g0Var2, hVar));
        k0Var.b = mapK;
        k0Var.c = g0Var;
        k0Var.d = new androidx.media3.exoplayer.hls.c(context);
        androidx.emoji2.text.m mVar = new androidx.emoji2.text.m(context, 2);
        k0Var.e = mVar;
        k0Var.f = new com.app.mlounge.ui.viewmodel.q0(4);
        if (zVar.a.getBoolean("isBackground", false) && mVar.b()) {
            g0Var = g0Var2;
        }
        k0Var.c = g0Var;
        ((a2) mapK.get(g0Var)).setOnError(new androidx.compose.runtime.s2(k0Var, 20));
        k0Var.h = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        this.c = k0Var;
        this.d = new androidx.media3.exoplayer.hls.c(context);
        this.e = new com.app.mlounge.ui.viewmodel.q0(4);
        k0Var.f = new androidx.compose.runtime.s2(this, 21);
        if (cVar.h()) {
            return;
        }
        this.e.invoke(new androidx.compose.runtime.snapshots.g("Project missing dependencies", 3));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.appsalt.internal.u
    public final boolean isRunning() {
        k0 k0Var = this.c;
        return ((a2) k0Var.b.get((g0) k0Var.c)).isRunning();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.appsalt.internal.u
    public final void optOut() {
        if (g4.b) {
            this.a.a(3, "optOut");
        }
        k0 k0Var = this.c;
        ((a2) k0Var.b.get((g0) k0Var.c)).optOut();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.appsalt.internal.v2
    public final void requestConsent(int i, int i2, int i3, int i4, int i5) {
        if (g4.b) {
            this.a.a(3, "requestConsent custom theme");
        }
        k0 k0Var = this.c;
        ((a2) k0Var.b.get((g0) k0Var.c)).requestConsent(i, i2, i3, i4, i5);
    }

    @Override // com.appsalt.internal.u
    public final void setOnError(kotlin.jvm.functions.l lVar) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Override // com.appsalt.internal.u
    public final void start(String str) {
        boolean z = g4.b;
        g4 g4Var = this.a;
        if (z) {
            g4Var.a(3, "start: " + str);
        }
        if (!this.b.h()) {
            this.e.invoke(new androidx.compose.runtime.snapshots.g("Project missing dependencies", 3));
            return;
        }
        if (kotlin.text.k.J(str) || str.equals("null")) {
            if (g4.b) {
                g4Var.a(1, "invalid API key: ".concat(str));
            }
        } else {
            this.d.o(str);
            k0 k0Var = this.c;
            ((a2) k0Var.b.get((g0) k0Var.c)).start(str);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.appsalt.internal.u
    public final void stop() {
        if (g4.b) {
            this.a.a(3, "stop");
        }
        k0 k0Var = this.c;
        ((a2) k0Var.b.get((g0) k0Var.c)).stop();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.appsalt.internal.v2
    public final void requestConsent() {
        if (g4.b) {
            this.a.a(3, "requestConsent");
        }
        k0 k0Var = this.c;
        ((a2) k0Var.b.get((g0) k0Var.c)).requestConsent();
    }
}
