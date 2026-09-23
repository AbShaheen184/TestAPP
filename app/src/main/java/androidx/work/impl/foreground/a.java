package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.compose.ui.platform.coreshims.b;
import androidx.media3.exoplayer.dash.manifest.t;
import androidx.work.impl.constraints.c;
import androidx.work.impl.constraints.h;
import androidx.work.impl.d;
import androidx.work.impl.model.j;
import androidx.work.impl.model.p;
import androidx.work.n;
import androidx.work.y;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h, androidx.work.impl.a {
    public static final String G = y.g("SystemFgDispatcher");
    public j A;
    public final LinkedHashMap B;
    public final HashMap C;
    public final HashMap D;
    public final t E;
    public SystemForegroundService F;
    public final androidx.work.impl.t e;
    public final androidx.work.impl.utils.taskexecutor.a y;
    public final Object z = new Object();

    public a(Context context) {
        androidx.work.impl.t tVarB = androidx.work.impl.t.b(context);
        this.e = tVarB;
        this.y = tVarB.d;
        this.A = null;
        this.B = new LinkedHashMap();
        this.D = new HashMap();
        this.C = new HashMap();
        this.E = new t(tVarB.j);
        tVarB.f.a(this);
    }

    public static Intent a(Context context, j jVar, n nVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.a);
        intent.putExtra("KEY_GENERATION", jVar.b);
        intent.putExtra("KEY_NOTIFICATION_ID", nVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", nVar.b);
        intent.putExtra("KEY_NOTIFICATION", nVar.c);
        return intent;
    }

    @Override // androidx.work.impl.a
    public final void b(j jVar, boolean z) {
        Map.Entry entry;
        synchronized (this.z) {
            try {
                Job job = ((p) this.C.remove(jVar)) != null ? (Job) this.D.remove(jVar) : null;
                if (job != null) {
                    job.cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        n nVar = (n) this.B.remove(jVar);
        if (jVar.equals(this.A)) {
            if (this.B.size() > 0) {
                Iterator it = this.B.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.A = (j) entry.getKey();
                if (this.F != null) {
                    n nVar2 = (n) entry.getValue();
                    SystemForegroundService systemForegroundService = this.F;
                    int i = nVar2.a;
                    int i2 = nVar2.b;
                    Notification notification = nVar2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        b.B(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        b.A(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.F.A.cancel(nVar2.a);
                }
            } else {
                this.A = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.F;
        if (nVar == null || systemForegroundService2 == null) {
            return;
        }
        y.e().a(G, "Removing Notification (id: " + nVar.a + ", workSpecId: " + jVar + ", notificationType: " + nVar.b);
        systemForegroundService2.A.cancel(nVar.a);
    }

    public final void c(Intent intent) {
        if (this.F == null) {
            kotlinx.coroutines.future.a.u("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        y.e().a(G, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            kotlinx.coroutines.future.a.q("Notification passed in the intent was null.");
            return;
        }
        n nVar = new n(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.B;
        linkedHashMap.put(jVar, nVar);
        n nVar2 = (n) linkedHashMap.get(this.A);
        if (nVar2 == null) {
            this.A = jVar;
        } else {
            this.F.A.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((n) ((Map.Entry) it.next()).getValue()).b;
                }
                nVar = new n(nVar2.a, nVar2.c, i);
            } else {
                nVar = nVar2;
            }
        }
        SystemForegroundService systemForegroundService = this.F;
        int i2 = nVar.a;
        int i3 = nVar.b;
        Notification notification2 = nVar.c;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            b.B(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            b.A(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    @Override // androidx.work.impl.constraints.h
    public final void d(p pVar, c cVar) {
        if (cVar instanceof androidx.work.impl.constraints.b) {
            String str = pVar.a;
            y.e().a(G, "Constraints unmet for WorkSpec " + str);
            j jVarQ = coil3.svg.internal.a.q(pVar);
            int i = ((androidx.work.impl.constraints.b) cVar).a;
            androidx.work.impl.t tVar = this.e;
            androidx.work.impl.utils.taskexecutor.a aVar = tVar.d;
            androidx.work.impl.utils.j jVar = new androidx.work.impl.utils.j(tVar.f, new androidx.work.impl.j(jVarQ), true, i);
            aVar.getClass();
            ((androidx.work.impl.utils.taskexecutor.c) aVar).a.execute(jVar);
        }
    }

    public final void e() {
        this.F = null;
        synchronized (this.z) {
            try {
                Iterator it = this.D.values().iterator();
                while (it.hasNext()) {
                    ((Job) it.next()).cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d dVar = this.e.f;
        synchronized (dVar.k) {
            dVar.j.remove(this);
        }
    }

    public final void f(int i, int i2) {
        y.e().f(G, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.B.entrySet()) {
            if (((n) entry.getValue()).b == i2) {
                j jVar = (j) entry.getKey();
                androidx.work.impl.t tVar = this.e;
                androidx.work.impl.utils.taskexecutor.a aVar = tVar.d;
                androidx.work.impl.utils.j jVar2 = new androidx.work.impl.utils.j(tVar.f, new androidx.work.impl.j(jVar), true, -128);
                aVar.getClass();
                ((androidx.work.impl.utils.taskexecutor.c) aVar).a.execute(jVar2);
            }
        }
        SystemForegroundService systemForegroundService = this.F;
        if (systemForegroundService != null) {
            systemForegroundService.y = true;
            y.e().a(SystemForegroundService.B, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i);
        }
    }
}
