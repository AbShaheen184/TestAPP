package org.jsoup.helper;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.activity.p;
import androidx.compose.foundation.gestures.o1;
import androidx.compose.foundation.text.n0;
import androidx.compose.foundation.text.selection.a0;
import androidx.compose.foundation.text.selection.b0;
import androidx.compose.foundation.text.selection.q0;
import androidx.compose.foundation.text.selection.w;
import androidx.compose.foundation.text.selection.z;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.text.d0;
import androidx.compose.ui.text.j0;
import androidx.compose.ui.text.l0;
import androidx.compose.ui.text.y;
import androidx.lifecycle.u0;
import androidx.lifecycle.y0;
import androidx.media3.common.util.v;
import androidx.media3.exoplayer.dash.manifest.t;
import coil3.network.r;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.tasks.s;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.collections.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static androidx.compose.ui.graphics.vector.f a = null;
    public static androidx.compose.ui.graphics.vector.f b = null;
    public static androidx.compose.ui.graphics.vector.f c = null;
    public static androidx.compose.ui.graphics.vector.f d = null;
    public static androidx.compose.ui.graphics.vector.f e = null;
    public static androidx.compose.ui.graphics.vector.f f = null;
    public static androidx.compose.ui.graphics.vector.f g = null;
    public static boolean h = true;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;

    public static void A(String str) {
        if (str == null || str.length() == 0) {
            throw new o("String must not be empty");
        }
    }

    public static void B(String str, String str2) {
        if (str.length() == 0) {
            throw new o(str2);
        }
    }

    public static void C(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new o(androidx.privacysandbox.ads.adservices.java.internal.a.r("The '", str2, "' parameter must not be empty."));
        }
    }

    public static void D(Object obj) {
        if (obj == null) {
            throw new o("Object must not be null");
        }
    }

    public static void E(Object obj, String str) {
        if (obj == null) {
            throw new o(androidx.privacysandbox.ads.adservices.java.internal.a.r("The parameter '", str, "' must not be null."));
        }
    }

    public static final int F(androidx.compose.foundation.lazy.grid.o oVar, o1 o1Var) {
        return (int) (o1Var == o1.e ? oVar.o & 4294967295L : oVar.o >> 32);
    }

    public static androidx.datastore.preferences.a G(String str, androidx.compose.ui.draw.i iVar, com.google.firebase.datastorage.a aVar, int i2) {
        kotlin.jvm.functions.l yVar = aVar;
        if ((i2 & 4) != 0) {
            yVar = new y(19);
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        CoroutineScope.getClass();
        return new androidx.datastore.preferences.a(str, iVar, yVar, CoroutineScope);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object J(r rVar, kotlin.coroutines.jvm.internal.c cVar) {
        coil3.network.internal.c cVar2;
        r rVar2;
        Throwable th;
        okio.f fVar;
        if (cVar instanceof coil3.network.internal.c) {
            cVar2 = (coil3.network.internal.c) cVar;
            int i2 = cVar2.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.A = i2 - Integer.MIN_VALUE;
            } else {
                cVar2 = new coil3.network.internal.c(cVar);
            }
        } else {
            cVar2 = new coil3.network.internal.c(cVar);
        }
        Object obj = cVar2.z;
        int i3 = cVar2.A;
        if (i3 != 0) {
            if (i3 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = cVar2.y;
            rVar2 = cVar2.e;
            try {
                kotlin.a.e(obj);
                q.e(rVar2, null);
                return fVar;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    q.e(rVar2, th);
                    throw th3;
                }
            }
        }
        kotlin.a.e(obj);
        try {
            okio.f fVar2 = new okio.f();
            cVar2.e = rVar;
            cVar2.y = fVar2;
            cVar2.A = 1;
            rVar.e.O(fVar2);
            kotlin.y yVar = kotlin.y.a;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (yVar == aVar) {
                return aVar;
            }
            rVar2 = rVar;
            fVar = fVar2;
            q.e(rVar2, null);
            return fVar;
        } catch (Throwable th4) {
            rVar2 = rVar;
            th = th4;
            throw th;
        }
    }

    public static boolean N(androidx.media3.extractor.k kVar, boolean z) {
        int i2;
        v vVar = new v(16);
        boolean z2 = true;
        while (true) {
            vVar.J(8);
            if (!kVar.e(vVar.a, 0, 8, true)) {
                break;
            }
            long jB = vVar.B();
            int iM = vVar.m();
            if (jB != 1) {
                i2 = 8;
            } else {
                if (!kVar.e(vVar.a, 8, 8, true)) {
                    break;
                }
                jB = vVar.F();
                i2 = 16;
            }
            long j2 = i2;
            if (jB < j2) {
                break;
            }
            int i3 = (int) (jB - j2);
            if (z2) {
                if (iM != 1718909296 || i3 < 8) {
                    break;
                }
                vVar.J(4);
                kVar.e(vVar.a, 0, 4, false);
                if (vVar.m() != 1751476579) {
                    break;
                }
                if (!z) {
                    return true;
                }
                kVar.a(i3 - 4, false);
                z2 = false;
            } else {
                if (iM == 1836086884) {
                    return true;
                }
                if (i3 != 0) {
                    kVar.a(i3, false);
                }
            }
        }
        return false;
    }

    public static boolean O(String str) {
        return str == null || str.isEmpty();
    }

    public static void P(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.platform.coreshims.b.C(viewGroup, z);
        } else if (h) {
            try {
                androidx.compose.ui.platform.coreshims.b.C(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }

    public static s Q(List list) {
        if (list == null || list.isEmpty()) {
            return o(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((com.google.android.gms.tasks.i) it.next()) == null) {
                com.google.firebase.platforminfo.b.h("null tasks are not accepted");
                return null;
            }
        }
        s sVar = new s();
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l(list.size(), sVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            com.google.android.gms.tasks.i iVar = (com.google.android.gms.tasks.i) it2.next();
            com.google.android.gms.tasks.r rVar = com.google.android.gms.tasks.k.b;
            iVar.c(rVar, lVar);
            iVar.b(rVar, lVar);
            s sVar2 = (s) iVar;
            sVar2.b.h(new com.google.android.gms.tasks.n((Executor) rVar, (com.google.android.gms.tasks.c) lVar));
            sVar2.p();
        }
        return sVar;
    }

    public static Object R(com.google.android.gms.tasks.i iVar) throws ExecutionException {
        if (iVar.h()) {
            return iVar.f();
        }
        if (((s) iVar).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(iVar.e());
    }

    public static final androidx.compose.ui.unit.e a(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        androidx.compose.ui.unit.fontscaling.a aVarA = androidx.compose.ui.unit.fontscaling.b.a(f2);
        if (aVarA == null) {
            aVarA = new androidx.compose.ui.unit.n(f2);
        }
        return new androidx.compose.ui.unit.e(f3, f2, aVarA);
    }

    public static final androidx.compose.ui.geometry.c b(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new androidx.compose.ui.geometry.c(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3));
    }

    public static final z c(q0 q0Var, a0 a0Var) {
        androidx.compose.foundation.text.selection.j jVarE = q0Var.e();
        w wVar = (w) q0Var.A;
        boolean z = jVarE == androidx.compose.foundation.text.selection.j.e;
        return new z(e(wVar, z, true, a0Var), e(wVar, z, false, a0Var), z);
    }

    public static final androidx.compose.foundation.text.selection.y d(final q0 q0Var, final w wVar, androidx.compose.foundation.text.selection.y yVar) {
        androidx.compose.foundation.text.selection.j jVar;
        int i2 = wVar.c;
        int i3 = wVar.b;
        boolean z = q0Var.y;
        final int i4 = z ? i3 : i2;
        j0 j0Var = (j0) wVar.e;
        int i5 = wVar.d;
        b0 b0Var = new b0(wVar, i4, 0);
        kotlin.i iVar = kotlin.i.y;
        final kotlin.h hVarC = kotlin.a.c(iVar, b0Var);
        final int i6 = z ? i2 : i3;
        kotlin.h hVarC2 = kotlin.a.c(iVar, new kotlin.jvm.functions.a() { // from class: androidx.compose.foundation.text.selection.c0
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.h] */
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                w wVar2 = wVar;
                androidx.compose.ui.text.j0 j0Var2 = (androidx.compose.ui.text.j0) wVar2.e;
                int iIntValue = ((Number) hVarC.getValue()).intValue();
                q0 q0Var2 = q0Var;
                boolean z2 = q0Var2.y;
                boolean z3 = q0Var2.e() == j.e;
                int i7 = i4;
                long jI = j0Var2.i(i7);
                androidx.compose.ui.text.n nVar = j0Var2.b;
                int i8 = androidx.compose.ui.text.l0.c;
                int iF = (int) (jI >> 32);
                int iD = nVar.d(iF);
                int i9 = nVar.f;
                if (iD != iIntValue) {
                    iF = iIntValue >= i9 ? j0Var2.f(i9 - 1) : j0Var2.f(iIntValue);
                }
                int iC = (int) (jI & 4294967295L);
                if (nVar.d(iC) != iIntValue) {
                    iC = iIntValue >= i9 ? nVar.c(i9 - 1, false) : nVar.c(iIntValue, false);
                }
                int i10 = i6;
                if (iF == i10) {
                    return wVar2.a(iC);
                }
                if (iC == i10) {
                    return wVar2.a(iF);
                }
                if (!(z2 ^ z3) ? i7 >= iF : i7 > iC) {
                    iF = iC;
                }
                return wVar2.a(iF);
            }
        });
        if (1 != yVar.c) {
            return (androidx.compose.foundation.text.selection.y) hVarC2.getValue();
        }
        if (i4 == i5) {
            return yVar;
        }
        if (((Number) hVarC.getValue()).intValue() != j0Var.b.d(i5)) {
            return (androidx.compose.foundation.text.selection.y) hVarC2.getValue();
        }
        int i7 = yVar.b;
        long jI = j0Var.i(i7);
        if (i5 != -1) {
            if (i4 != i5) {
                androidx.compose.foundation.text.selection.j jVar2 = androidx.compose.foundation.text.selection.j.e;
                if (i3 < i2) {
                    jVar = androidx.compose.foundation.text.selection.j.y;
                } else {
                    jVar = i3 > i2 ? jVar2 : androidx.compose.foundation.text.selection.j.z;
                }
                if (((z ? 1 : 0) ^ (jVar == jVar2 ? 1 : 0)) == 0) {
                }
            }
            return wVar.a(i4);
        }
        int i8 = l0.c;
        return (i7 == ((int) (jI >> 32)) || i7 == ((int) (jI & 4294967295L))) ? (androidx.compose.foundation.text.selection.y) hVarC2.getValue() : wVar.a(i4);
    }

    public static final androidx.compose.foundation.text.selection.y e(w wVar, boolean z, boolean z2, a0 a0Var) {
        long jB;
        long j2;
        int i2 = z2 ? wVar.b : wVar.c;
        switch (a0Var.a) {
            case 0:
                String str = ((j0) wVar.e).a.a.y;
                jB = d0.b(n0.n(str, i2), n0.m(str, i2));
                break;
            default:
                jB = ((j0) wVar.e).i(i2);
                break;
        }
        if (z ^ z2) {
            int i3 = l0.c;
            j2 = jB >> 32;
        } else {
            int i4 = l0.c;
            j2 = 4294967295L & jB;
        }
        return wVar.a((int) j2);
    }

    public static Object f(com.google.android.gms.tasks.i iVar) throws InterruptedException {
        x.f("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            kotlinx.coroutines.future.a.u("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        x.h(iVar, "Task must not be null");
        if (iVar.g()) {
            return R(iVar);
        }
        t tVar = new t(29);
        Executor executor = com.google.android.gms.tasks.k.b;
        iVar.c(executor, tVar);
        iVar.b(executor, tVar);
        s sVar = (s) iVar;
        sVar.b.h(new com.google.android.gms.tasks.n(executor, (com.google.android.gms.tasks.c) tVar));
        sVar.p();
        ((CountDownLatch) tVar.e).await();
        return R(iVar);
    }

    public static Object g(com.google.android.gms.tasks.i iVar, long j2, TimeUnit timeUnit) throws TimeoutException {
        x.f("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            kotlinx.coroutines.future.a.u("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        x.h(iVar, "Task must not be null");
        x.h(timeUnit, "TimeUnit must not be null");
        if (iVar.g()) {
            return R(iVar);
        }
        t tVar = new t(29);
        Executor executor = com.google.android.gms.tasks.k.b;
        iVar.c(executor, tVar);
        iVar.b(executor, tVar);
        s sVar = (s) iVar;
        sVar.b.h(new com.google.android.gms.tasks.n(executor, (com.google.android.gms.tasks.c) tVar));
        sVar.p();
        if (((CountDownLatch) tVar.e).await(j2, timeUnit)) {
            return R(iVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static s h(Executor executor, Callable callable) {
        x.h(executor, "Executor must not be null");
        s sVar = new s();
        executor.execute(new com.google.android.gms.tasks.o(2, sVar, callable));
        return sVar;
    }

    public static final androidx.compose.foundation.text.selection.y l(androidx.compose.foundation.text.selection.y yVar, w wVar, int i2) {
        return new androidx.compose.foundation.text.selection.y(((j0) wVar.e).a(i2), i2, yVar.c);
    }

    public static StaticLayout m(CharSequence charSequence, TextPaint textPaint, int i2, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, int i6, boolean z, int i7, int i8, int i9, int i10) {
        if (i3 < 0) {
            androidx.compose.ui.text.internal.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i3 < 0 || i3 > length) {
            androidx.compose.ui.text.internal.a.a("invalid end value");
        }
        if (i4 < 0) {
            androidx.compose.ui.text.internal.a.a("invalid maxLines value");
        }
        if (i2 < 0) {
            androidx.compose.ui.text.internal.a.a("invalid width value");
        }
        if (i5 < 0) {
            androidx.compose.ui.text.internal.a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i3, textPaint, i2);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i4);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i5);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i7);
        builderObtain.setHyphenationFrequency(i10);
        builderObtain.setIndents(null, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            com.google.android.gms.common.wrappers.a.m(builderObtain, i6);
        }
        if (i11 >= 28) {
            androidx.arch.core.executor.d.C(builderObtain);
        }
        if (i11 >= 33) {
            androidx.compose.ui.text.android.d.o(builderObtain, i8, i9);
        }
        if (i11 >= 35) {
            androidx.compose.ui.text.android.i.a(builderObtain);
        }
        return builderObtain.build();
    }

    public static final dagger.hilt.android.internal.lifecycle.e n(y0 y0Var, androidx.compose.runtime.s sVar) {
        if (!(y0Var instanceof androidx.lifecycle.j)) {
            sVar.b0(-1968008324);
            sVar.p(false);
            return null;
        }
        sVar.b0(-1968186822);
        Context baseContext = (Context) sVar.j(m0.b);
        u0 defaultViewModelProviderFactory = ((androidx.lifecycle.j) y0Var).getDefaultViewModelProviderFactory();
        baseContext.getClass();
        defaultViewModelProviderFactory.getClass();
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof p) {
                dagger.hilt.android.internal.lifecycle.e eVarD = dagger.hilt.android.internal.lifecycle.e.d((p) baseContext, defaultViewModelProviderFactory);
                sVar.p(false);
                return eVarD;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            baseContext.getClass();
        }
        com.google.firebase.platforminfo.b.k(baseContext, "Expected an activity context for creating a HiltViewModelFactory but instead found: ");
        return null;
    }

    public static s o(Object obj) {
        s sVar = new s();
        sVar.k(obj);
        return sVar;
    }

    public static Object r(Object obj, Class cls) {
        if (obj instanceof dagger.hilt.internal.a) {
            return cls.cast(obj);
        }
        if (obj instanceof dagger.hilt.internal.b) {
            return r(((dagger.hilt.internal.b) obj).a(), cls);
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + dagger.hilt.internal.a.class + " or " + dagger.hilt.internal.b.class);
    }

    public static final androidx.compose.ui.graphics.vector.f s() {
        androidx.compose.ui.graphics.vector.f fVar = a;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.ArrowUpward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.v(4.0f, 12.0f);
        gVar.u(1.41f, 1.41f);
        gVar.t(11.0f, 7.83f);
        gVar.z(20.0f);
        gVar.s(2.0f);
        gVar.z(7.83f);
        gVar.u(5.58f, 5.59f);
        gVar.t(20.0f, 12.0f);
        androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar, -8.0f, -8.0f, -8.0f, 8.0f);
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        a = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f t() {
        androidx.compose.ui.graphics.vector.f fVar = c;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.FileOpen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.v(14.0f, 2.0f);
        gVar.r(6.0f);
        gVar.m(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        gVar.A(16.0f);
        gVar.n(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        gVar.r(15.0f);
        gVar.A(-8.0f);
        gVar.s(5.0f);
        gVar.z(8.0f);
        gVar.t(14.0f, 2.0f);
        gVar.l();
        gVar.v(13.0f, 9.0f);
        gVar.z(3.5f);
        gVar.t(18.5f, 9.0f);
        gVar.r(13.0f);
        gVar.l();
        gVar.v(17.0f, 21.66f);
        gVar.z(16.0f);
        gVar.s(5.66f);
        gVar.A(2.0f);
        gVar.s(-2.24f);
        gVar.u(2.95f, 2.95f);
        gVar.u(-1.41f, 1.41f);
        gVar.t(19.0f, 19.41f);
        gVar.u(0.0f, 2.24f);
        gVar.r(17.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        c = fVarB;
        return fVarB;
    }

    public static Intent u(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strV = v(context, componentName);
        if (strV == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strV);
        return v(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String v(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final androidx.compose.ui.graphics.vector.f w() {
        androidx.compose.ui.graphics.vector.f fVar = e;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.PlayCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(12.0f, 2.0f);
        gVarJ.m(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        gVarJ.x(4.48f, 10.0f, 10.0f, 10.0f);
        gVarJ.x(10.0f, -4.48f, 10.0f, -10.0f);
        gVarJ.w(17.52f, 2.0f, 12.0f, 2.0f);
        gVarJ.l();
        gVarJ.v(9.5f, 16.5f);
        gVarJ.A(-9.0f);
        gVarJ.u(7.0f, 4.5f);
        gVarJ.t(9.5f, 16.5f);
        gVarJ.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarJ.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        e = fVarB;
        return fVarB;
    }

    public static void y(String str, boolean z) {
        if (!z) {
            throw new o(str);
        }
    }

    public static void z(boolean z) {
        if (!z) {
            throw new o("Must be true");
        }
    }

    public abstract void H(com.google.common.util.concurrent.q qVar, com.google.common.util.concurrent.q qVar2);

    public abstract void I(com.google.common.util.concurrent.q qVar, Thread thread);

    public abstract void L(boolean z);

    public abstract void M();

    public abstract boolean i(com.google.common.util.concurrent.r rVar, com.google.common.util.concurrent.f fVar, com.google.common.util.concurrent.f fVar2);

    public abstract boolean j(com.google.common.util.concurrent.r rVar, Object obj, Object obj2);

    public abstract boolean k(com.google.common.util.concurrent.r rVar, com.google.common.util.concurrent.q qVar, com.google.common.util.concurrent.q qVar2);

    public abstract com.google.common.util.concurrent.f p(com.google.common.util.concurrent.r rVar);

    public abstract com.google.common.util.concurrent.q q(com.google.common.util.concurrent.r rVar);

    public abstract void x();

    public void K(boolean z) {
    }
}
