package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.activity.compose.f;
import androidx.appcompat.widget.c2;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import androidx.work.a0;
import androidx.work.impl.t;
import androidx.work.impl.utils.taskexecutor.c;
import androidx.work.y;
import com.google.common.util.concurrent.k0;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends Service implements v {
    public static final String B = y.g("SystemFgService");
    public NotificationManager A;
    public final c2 e = new c2(this);
    public boolean y;
    public a z;

    public final void a() {
        this.A = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.z = aVar;
        if (aVar.F != null) {
            y.e().c(a.G, "A callback already exists.");
        } else {
            aVar.F = this;
        }
    }

    public final void b() {
        c2 c2Var = this.e;
        c2Var.getClass();
        c2Var.S(n.ON_CREATE);
        super.onCreate();
    }

    public final void c() {
        c2 c2Var = this.e;
        c2Var.getClass();
        c2Var.S(n.ON_STOP);
        c2Var.S(n.ON_DESTROY);
        super.onDestroy();
    }

    @Override // androidx.lifecycle.v
    public final p getLifecycle() {
        return (x) this.e.y;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        c2 c2Var = this.e;
        c2Var.getClass();
        c2Var.S(n.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        b();
        a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c();
        this.z.e();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        c2 c2Var = this.e;
        c2Var.getClass();
        c2Var.S(n.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.y;
        String str = B;
        if (z) {
            y.e().f(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.z.e();
            a();
            this.y = false;
        }
        if (intent == null) {
            return 3;
        }
        a aVar = this.z;
        aVar.getClass();
        String str2 = a.G;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            y.e().f(str2, "Started foreground service " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            androidx.work.impl.utils.taskexecutor.a aVar2 = aVar.y;
            k0 k0Var = new k0(5, aVar, stringExtra, false);
            aVar2.getClass();
            ((c) aVar2).a.execute(k0Var);
            aVar.c(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            aVar.c(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            y.e().f(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = aVar.F;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.y = true;
            y.e().a(str, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i2);
            return 3;
        }
        y.e().f(str2, "Stopping foreground work for " + intent);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        t tVar = aVar.e;
        UUID uuidFromString = UUID.fromString(stringExtra2);
        tVar.getClass();
        uuidFromString.getClass();
        a0 a0Var = tVar.b.m;
        androidx.room.y yVar = ((c) tVar.d).a;
        yVar.getClass();
        androidx.work.impl.v.K(a0Var, "CancelWorkById", yVar, new f(26, tVar, uuidFromString));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.z.f(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.z.f(i, i2);
    }
}
