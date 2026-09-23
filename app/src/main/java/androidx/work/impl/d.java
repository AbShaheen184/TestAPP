package androidx.work.impl;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final String l = androidx.work.y.g("Processor");
    public final Context b;
    public final androidx.work.b c;
    public final androidx.work.impl.utils.taskexecutor.c d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public d(Context context, androidx.work.b bVar, androidx.work.impl.utils.taskexecutor.c cVar, WorkDatabase workDatabase) {
        this.b = context;
        this.c = bVar;
        this.d = cVar;
        this.e = workDatabase;
    }

    public static boolean d(String str, h0 h0Var, int i) {
        String str2 = l;
        if (h0Var == null) {
            androidx.work.y.e().a(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        h0Var.n.cancel((CancellationException) new w(i));
        androidx.work.y.e().a(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(a aVar) {
        synchronized (this.k) {
            this.j.add(aVar);
        }
    }

    public final h0 b(String str) {
        h0 h0Var = (h0) this.f.remove(str);
        boolean z = h0Var != null;
        if (!z) {
            h0Var = (h0) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        String str2 = androidx.work.impl.foreground.a.G;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.b.startService(intent);
                        } catch (Throwable th) {
                            androidx.work.y.e().d(l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return h0Var;
    }

    public final h0 c(String str) {
        h0 h0Var = (h0) this.f.get(str);
        return h0Var == null ? (h0) this.g.get(str) : h0Var;
    }

    public final void e(androidx.work.impl.model.j jVar) {
        this.d.d.execute(new androidx.media3.ui.c0(2, this, jVar));
    }
}
