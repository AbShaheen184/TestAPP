package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import java.util.List;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public static t l;
    public static t m;
    public static final Object n;
    public final Context a;
    public final androidx.work.b b;
    public final WorkDatabase c;
    public final androidx.work.impl.utils.taskexecutor.a d;
    public final List e;
    public final d f;
    public final androidx.media3.exoplayer.dash.manifest.t g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final androidx.work.impl.constraints.trackers.i j;
    public final CoroutineScope k;

    static {
        androidx.work.y.g("WorkManagerImpl");
        l = null;
        m = null;
        n = new Object();
    }

    public t(Context context, final androidx.work.b bVar, androidx.work.impl.utils.taskexecutor.a aVar, final WorkDatabase workDatabase, final List list, d dVar, androidx.work.impl.constraints.trackers.i iVar) {
        Context applicationContext = context.getApplicationContext();
        kotlin.coroutines.d dVar2 = null;
        if (applicationContext.isDeviceProtectedStorage()) {
            kotlinx.coroutines.future.a.u("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        androidx.work.y yVar = new androidx.work.y(bVar.h);
        synchronized (androidx.work.y.b) {
            try {
                if (androidx.work.y.c == null) {
                    androidx.work.y.c = yVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = applicationContext;
        this.d = aVar;
        this.c = workDatabase;
        this.f = dVar;
        this.j = iVar;
        this.b = bVar;
        this.e = list;
        androidx.work.impl.utils.taskexecutor.c cVar = (androidx.work.impl.utils.taskexecutor.c) aVar;
        CoroutineDispatcher coroutineDispatcher = cVar.b;
        coroutineDispatcher.getClass();
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.k = CoroutineScope;
        this.g = new androidx.media3.exoplayer.dash.manifest.t(workDatabase);
        final androidx.room.y yVar2 = cVar.a;
        String str = i.a;
        dVar.a(new a() { // from class: androidx.work.impl.g
            @Override // androidx.work.impl.a
            public final void b(androidx.work.impl.model.j jVar, boolean z) {
                yVar2.execute(new h(list, jVar, bVar, workDatabase, 0));
            }
        });
        cVar.a.execute(new androidx.work.impl.utils.c(applicationContext, this));
        String str2 = n.a;
        CoroutineScope.getClass();
        if (androidx.work.impl.utils.i.a(applicationContext, bVar)) {
            FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(FlowKt.conflate(FlowKt.retryWhen(com.imsdk.a.g(workDatabase.w().a, new String[]{"workspec"}, new androidx.navigation.compose.r(17)), new m(4, null)))), new androidx.compose.material3.internal.t(applicationContext, dVar2, 1)), CoroutineScope);
        }
    }

    public static t b(Context context) {
        t tVar;
        Object obj = n;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        tVar = l;
                        if (tVar == null) {
                            tVar = m;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return tVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (tVar != null) {
            return tVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public final androidx.work.a0 a(String str) {
        androidx.work.a0 a0Var = this.b.m;
        String strConcat = "CancelWorkByName_".concat(str);
        androidx.room.y yVar = ((androidx.work.impl.utils.taskexecutor.c) this.d).a;
        yVar.getClass();
        return v.K(a0Var, strConcat, yVar, new androidx.activity.compose.f(25, str, this));
    }

    public final void c() {
        synchronized (n) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        androidx.work.a0 a0Var = this.b.m;
        androidx.navigation.internal.h hVar = new androidx.navigation.internal.h(this, 9);
        a0Var.getClass();
        boolean zW = kotlin.math.a.w();
        if (zW) {
            try {
                Trace.beginSection(kotlin.math.a.S("ReschedulingWork"));
            } finally {
                if (zW) {
                    Trace.endSection();
                }
            }
        }
        hVar.invoke();
    }
}
