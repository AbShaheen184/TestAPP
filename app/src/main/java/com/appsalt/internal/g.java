package com.appsalt.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.appsalt.lib.ConsentActivity;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements a2 {
    public final Context a;
    public final g4 b;
    public final e2 c;
    public final boolean d;
    public Job e;
    public String f;
    public final String g;
    public final s0 h;
    public final androidx.work.impl.z i;
    public s0 j;
    public final z k;
    public final boolean l;
    public boolean m;
    public kotlin.jvm.functions.l n;
    public Exception o;

    public g(Context context, g4 g4Var) {
        Object lVar;
        e2 e2Var = new e2();
        this.a = context;
        this.b = g4Var;
        this.c = e2Var;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i >= 28;
        this.d = z2;
        b0.d = new x2(context.getApplicationContext());
        e2Var.h = z2;
        this.e = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.f = "";
        this.g = b0.d.b.c;
        s0 t0Var = new t0(new c(this, null, 1), g4Var);
        this.h = t0Var;
        androidx.work.impl.z zVar = new androidx.work.impl.z(new c(this, null, 0), g4Var);
        this.i = zVar;
        this.j = z2 ? t0Var : zVar;
        this.k = new z(context, 0);
        try {
            lVar = i >= 30 ? context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName() : context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            lVar = new kotlin.l(th);
        }
        String str = (String) (lVar instanceof kotlin.l ? null : lVar);
        if (str != null && kotlin.text.k.z(str, "com.android.vending", true)) {
            z = true;
        }
        this.l = !z;
        this.n = new com.app.mlounge.ui.viewmodel.q0(4);
    }

    @Override // com.appsalt.internal.a2
    public final boolean a() {
        return this.k.a.getBoolean("didConsent", false);
    }

    @Override // com.appsalt.internal.a2
    public final void b(boolean z) {
        this.k.a.edit().putBoolean("didConsent", z).apply();
        if (z) {
            return;
        }
        stop();
    }

    public final void c(Bundle bundle) {
        Context context = this.a;
        if (this.l && this.o == null && !a()) {
            try {
                Intent intentAddFlags = new Intent(context, (Class<?>) ConsentActivity.class).addFlags(268435456);
                if (bundle != null) {
                    intentAddFlags.putExtras(bundle);
                }
                context.startActivity(intentAddFlags);
            } catch (Exception e) {
                this.o = e;
                this.n.invoke(e);
            }
        }
    }

    @Override // com.appsalt.internal.a2
    public final String getId() {
        return this.g;
    }

    @Override // com.appsalt.internal.u
    public final boolean isRunning() {
        return this.m;
    }

    @Override // com.appsalt.internal.u
    public final void optOut() {
        b(false);
        stop();
    }

    @Override // com.appsalt.internal.v2
    public final void requestConsent(int i, int i2, int i3, int i4, int i5) {
        Bundle bundle = new Bundle();
        bundle.putInt("backgroundColor", i);
        bundle.putInt("textColor", i2);
        bundle.putInt("linksColor", i3);
        bundle.putInt("buttonTextColor", i4);
        bundle.putInt("buttonBackgroundRes", i5);
        c(bundle);
    }

    @Override // com.appsalt.internal.u
    public final void setOnError(kotlin.jvm.functions.l lVar) {
        this.n = lVar;
    }

    @Override // com.appsalt.internal.u
    public final void start(String str) {
        boolean z = this.l;
        g4 g4Var = this.b;
        if (!z) {
            g4Var.getClass();
            if (g4.b) {
                g4Var.a(1, "Unable to start");
                return;
            }
            return;
        }
        g4Var.getClass();
        if (g4.b) {
            g4Var.a(3, "checkAndStart(isConsentGiven = " + a() + ", isRunning = " + this.m + ')');
        }
        if (!a()) {
            if (g4.b) {
                g4Var.a(1, "Missing consent");
            }
        } else {
            if (this.m) {
                return;
            }
            this.f = str;
            this.e = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new t4(this, null, 1), 3, null);
            s0 s0Var = this.d ? this.h : this.i;
            this.j = s0Var;
            s0Var.c(str, false);
            this.m = true;
        }
    }

    @Override // com.appsalt.internal.u
    public final void stop() {
        this.b.getClass();
        if (this.m) {
            try {
                Job.DefaultImpls.cancel$default(this.e, (CancellationException) null, 1, (Object) null);
            } catch (Throwable unused) {
            }
            this.j.b(false);
            this.m = false;
        }
    }

    @Override // com.appsalt.internal.v2
    public final void requestConsent() {
        c(null);
    }
}
