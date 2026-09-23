package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.work.impl.e0;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final Object c = new Object();
    public static x d;
    public final Object a;
    public final Object b;

    public f(com.google.android.material.behavior.d dVar) {
        this.a = dVar.v("gcm.n.title");
        dVar.s("gcm.n.title");
        Object[] objArrR = dVar.r("gcm.n.title");
        if (objArrR != null) {
            String[] strArr = new String[objArrR.length];
            for (int i = 0; i < objArrR.length; i++) {
                strArr[i] = String.valueOf(objArrR[i]);
            }
        }
        this.b = dVar.v("gcm.n.body");
        dVar.s("gcm.n.body");
        Object[] objArrR2 = dVar.r("gcm.n.body");
        if (objArrR2 != null) {
            String[] strArr2 = new String[objArrR2.length];
            for (int i2 = 0; i2 < objArrR2.length; i2++) {
                strArr2[i2] = String.valueOf(objArrR2[i2]);
            }
        }
        dVar.v("gcm.n.icon");
        if (TextUtils.isEmpty(dVar.v("gcm.n.sound2"))) {
            dVar.v("gcm.n.sound");
        }
        dVar.v("gcm.n.tag");
        dVar.v("gcm.n.color");
        dVar.v("gcm.n.click_action");
        dVar.v("gcm.n.android_channel_id");
        String strV = dVar.v("gcm.n.link_android");
        strV = TextUtils.isEmpty(strV) ? dVar.v("gcm.n.link") : strV;
        if (!TextUtils.isEmpty(strV)) {
            Uri.parse(strV);
        }
        dVar.v("gcm.n.image");
        dVar.v("gcm.n.ticker");
        dVar.o("gcm.n.notification_priority");
        dVar.o("gcm.n.visibility");
        dVar.o("gcm.n.notification_count");
        dVar.n("gcm.n.sticky");
        dVar.n("gcm.n.local_only");
        dVar.n("gcm.n.default_sound");
        dVar.n("gcm.n.default_vibrate_timings");
        dVar.n("gcm.n.default_light_settings");
        dVar.t();
        dVar.q();
        dVar.w();
    }

    public static com.google.android.gms.tasks.s a(Context context, Intent intent, boolean z) {
        x xVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (c) {
            try {
                if (d == null) {
                    d = new x(context);
                }
                xVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return xVar.b(intent).j(new androidx.arch.core.executor.a(2), new com.google.firebase.i(26));
        }
        if (n.x().C(context)) {
            synchronized (u.a) {
                try {
                    u.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        u.b.a();
                    }
                    com.google.android.gms.tasks.s sVarB = xVar.b(intent);
                    com.google.android.datatransport.runtime.scheduling.jobscheduling.j jVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.j(intent, 8);
                    sVarB.getClass();
                    sVarB.b.h(new com.google.android.gms.tasks.n(com.google.android.gms.tasks.k.a, jVar));
                    sVarB.p();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            xVar.b(intent);
        }
        return org.jsoup.helper.n.o(-1);
    }

    public com.google.android.gms.tasks.s b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.a;
        androidx.arch.core.executor.a aVar = (androidx.arch.core.executor.a) this.b;
        boolean z = com.google.android.gms.common.util.b.a() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? org.jsoup.helper.n.h(aVar, new e0(1, context, intent)).d(aVar, new com.google.android.gms.tasks.b() { // from class: com.google.firebase.messaging.e
            @Override // com.google.android.gms.tasks.b
            public final Object d(com.google.android.gms.tasks.i iVar) {
                return (com.google.android.gms.common.util.b.a() && ((Integer) iVar.f()).intValue() == 402) ? f.a(context, intent, z2).j(new androidx.arch.core.executor.a(2), new com.google.firebase.i(25)) : iVar;
            }
        }) : a(context, intent, z2);
    }

    public f(Context context) {
        this.a = context;
        this.b = new androidx.arch.core.executor.a(2);
    }

    public f(ExecutorService executorService) {
        this.b = new androidx.collection.f(0);
        this.a = executorService;
    }

    public f(androidx.core.app.h hVar, String str) {
        this.a = hVar;
        this.b = str;
    }
}
