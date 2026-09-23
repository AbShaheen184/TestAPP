package com.app.mlounge;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.y;
import androidx.compose.runtime.j1;
import androidx.compose.runtime.t;
import androidx.compose.ui.platform.k1;
import androidx.core.view.a2;
import androidx.core.view.b2;
import androidx.core.view.c2;
import androidx.core.view.d2;
import androidx.lifecycle.m0;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends androidx.activity.p implements dagger.hilt.internal.b {
    public static final /* synthetic */ int G = 0;
    public final j1 A;
    public final j1 B;
    public boolean C;
    public final androidx.activity.result.c D;
    public final androidx.activity.result.c E;
    public final androidx.activity.result.c F;
    public volatile dagger.hilt.android.internal.managers.b e;
    public final Object y = new Object();
    public boolean z = false;

    public MainActivity() {
        addOnContextAvailableListener(new k(this));
        this.A = t.r(Boolean.TRUE);
        this.B = t.r(Boolean.FALSE);
        this.D = registerForActivityResult(new androidx.activity.result.contract.b(2), new y(this, 27));
        this.E = registerForActivityResult(new androidx.activity.result.contract.b(3), new androidx.transition.k(12));
        this.F = registerForActivityResult(new androidx.activity.result.contract.b(3), new androidx.transition.k(12));
    }

    @Override // dagger.hilt.internal.b
    public final Object a() {
        return h().a();
    }

    @Override // androidx.activity.p, androidx.lifecycle.j
    public final u0 getDefaultViewModelProviderFactory() {
        u0 defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        d dVar = (d) ((dagger.hilt.android.internal.lifecycle.a) org.jsoup.helper.n.r(this, dagger.hilt.android.internal.lifecycle.a.class));
        dagger.internal.c cVarA = dVar.a();
        androidx.work.impl.k kVar = new androidx.work.impl.k(8, dVar.a, dVar.b);
        defaultViewModelProviderFactory.getClass();
        return new dagger.hilt.android.internal.lifecycle.e(cVarA, defaultViewModelProviderFactory, kVar);
    }

    public final dagger.hilt.android.internal.managers.b h() {
        if (this.e == null) {
            synchronized (this.y) {
                try {
                    if (this.e == null) {
                        this.e = new dagger.hilt.android.internal.managers.b(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.e;
    }

    public final void i(Bundle bundle) {
        super.onCreate(bundle);
        dagger.hilt.android.internal.managers.b bVarH = h();
        dagger.hilt.android.internal.managers.f fVar = bVarH.A;
        androidx.core.text.f fVar2 = ((dagger.hilt.android.internal.managers.d) dagger.hilt.android.internal.managers.f.b(fVar.e, fVar.y).a(a0.a(dagger.hilt.android.internal.managers.d.class))).c;
        bVarH.B = fVar2;
        if (((androidx.lifecycle.viewmodel.c) fVar2.b) == null) {
            androidx.lifecycle.viewmodel.c defaultViewModelCreationExtras = bVarH.z.getDefaultViewModelCreationExtras();
            if (fVar2.a) {
                fVar2.b = defaultViewModelCreationExtras;
            } else {
                kotlinx.coroutines.future.a.u("setExtras should only be called for an Activity that extends ComponentActivity");
            }
        }
    }

    public final void j() {
        super.onDestroy();
        androidx.core.text.f fVar = h().B;
        if (fVar != null) {
            fVar.b = null;
        }
    }

    public final void k() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && _COROUTINE.a.y(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            this.F.a("android.permission.POST_NOTIFICATIONS");
        }
        boolean z = _COROUTINE.a.y(this, "android.permission.ACCESS_FINE_LOCATION") == 0;
        boolean z2 = _COROUTINE.a.y(this, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        if (!z && !z2) {
            this.D.a(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
            return;
        }
        if (i >= 29 && _COROUTINE.a.y(this, "android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
            this.E.a("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        if (this.C) {
            return;
        }
        this.C = true;
        boolean z3 = com.app.mlounge.util.c.a;
        Application application = getApplication();
        application.getClass();
        com.app.mlounge.util.c.e(application);
    }

    @Override // androidx.activity.p, androidx.core.app.b, android.app.Activity
    public final void onCreate(Bundle bundle) {
        kotlin.coroutines.d dVar;
        androidx.lifecycle.q qVar;
        org.jsoup.helper.n b2Var;
        i(bundle);
        if (bundle != null) {
            this.A.setValue(Boolean.FALSE);
            k();
        }
        int i = 1;
        boolean z = !_COROUTINE.a.X(this);
        androidx.lifecycle.p lifecycle = getLifecycle();
        lifecycle.getClass();
        w0 w0Var = lifecycle.a;
        loop0: while (true) {
            androidx.lifecycle.q qVar2 = (androidx.lifecycle.q) ((AtomicReference) w0Var.a).get();
            dVar = null;
            if (qVar2 != null) {
                qVar = qVar2;
                break;
            }
            androidx.lifecycle.q qVar3 = new androidx.lifecycle.q(lifecycle, SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
            AtomicReference atomicReference = (AtomicReference) w0Var.a;
            do {
                if (atomicReference.compareAndSet(null, qVar3)) {
                    BuildersKt__Builders_commonKt.launch$default(qVar3, Dispatchers.getMain().getImmediate(), null, new androidx.compose.foundation.text.input.internal.k(qVar3, dVar, 3), 2, null);
                    qVar = qVar3;
                    break loop0;
                }
            } while (atomicReference.get() == null);
        }
        BuildersKt__Builders_commonKt.launch$default(qVar, null, null, new androidx.compose.foundation.text.selection.w0(this, z, dVar, i), 3, null);
        getWindow().addFlags(128);
        int i2 = 0;
        kotlin.math.a.M(getWindow(), false);
        Window window = getWindow();
        com.google.firebase.platforminfo.d dVar2 = new com.google.firebase.platforminfo.d(getWindow().getDecorView());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            b2Var = new d2(window, dVar2);
        } else if (i3 >= 30) {
            b2Var = new c2(window, dVar2);
        } else {
            b2Var = i3 >= 26 ? new b2(window, dVar2) : new a2(window, dVar2);
        }
        b2Var.x();
        b2Var.M();
        SharedPreferences sharedPreferences = getSharedPreferences("appsalt_prefs", 0);
        if (!sharedPreferences.getBoolean("consent_asked", false)) {
            this.B.setValue(Boolean.TRUE);
        }
        androidx.compose.runtime.internal.f fVar = new androidx.compose.runtime.internal.f(true, 875718475, new l(this, sharedPreferences, i2));
        ViewGroup.LayoutParams layoutParams = androidx.activity.compose.l.a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        k1 k1Var = childAt instanceof k1 ? (k1) childAt : null;
        if (k1Var != null) {
            k1Var.setParentCompositionContext(null);
            k1Var.setContent(fVar);
            return;
        }
        k1 k1Var2 = new k1(this);
        k1Var2.setParentCompositionContext(null);
        k1Var2.setContent(fVar);
        View decorView = getWindow().getDecorView();
        if (m0.d(decorView) == null) {
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        }
        if (m0.e(decorView) == null) {
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (com.google.firebase.b.z(decorView) == null) {
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(k1Var2, androidx.activity.compose.l.a);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (isFinishing()) {
            try {
                Context context = com.app.mlounge.util.a.a;
                Context context2 = com.app.mlounge.util.a.a;
                if (context2 != null) {
                    SharedPreferences sharedPreferences = context2.getSharedPreferences("diag_state", 0);
                    sharedPreferences.getClass();
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putBoolean("session_open", false);
                    editorEdit.apply();
                }
            } catch (Exception unused) {
            }
        }
        j();
    }

    @Override // android.app.Activity
    public final void onResume() {
        org.jsoup.helper.n b2Var;
        super.onResume();
        Window window = getWindow();
        com.google.firebase.platforminfo.d dVar = new com.google.firebase.platforminfo.d(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            b2Var = new d2(window, dVar);
        } else if (i >= 30) {
            b2Var = new c2(window, dVar);
        } else {
            b2Var = i >= 26 ? new b2(window, dVar) : new a2(window, dVar);
        }
        b2Var.x();
        b2Var.M();
        if (this.C) {
            boolean z = com.app.mlounge.util.c.a;
            Application application = getApplication();
            application.getClass();
            com.app.mlounge.util.c.b(application);
        }
    }
}
