package com.google.firebase;

import android.os.Bundle;
import android.util.Log;
import com.caverock.androidsvg.x1;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.tasks.s;
import com.google.firebase.components.n;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.crashlytics.internal.model.n2;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements com.google.firebase.inject.a, com.google.firebase.components.e, com.google.android.gms.tasks.e, com.google.android.gms.tasks.b, com.google.android.datatransport.e, com.google.firebase.events.a {
    public final /* synthetic */ int e;

    public /* synthetic */ i(int i) {
        this.e = i;
    }

    public static /* synthetic */ void b(Object obj, Object obj2, String str) {
        throw new androidx.compose.ui.res.e(str + obj + obj2, 7);
    }

    @Override // com.google.android.gms.tasks.e
    public void F(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // com.google.android.datatransport.e
    public Object apply(Object obj) {
        switch (this.e) {
            case 19:
                com.google.firebase.crashlytics.internal.send.a.b.getClass();
                return com.google.firebase.crashlytics.internal.model.serialization.a.a.d((n2) obj).getBytes(Charset.forName("UTF-8"));
            default:
                com.google.firebase.messaging.reporting.e eVar = (com.google.firebase.messaging.reporting.e) obj;
                com.google.android.datatransport.runtime.j jVar = com.google.firebase.messaging.j.a;
                jVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    jVar.p(eVar, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // com.google.firebase.inject.a
    public void c(com.google.firebase.inject.b bVar) {
        switch (this.e) {
            case 4:
                return;
            default:
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    @Override // com.google.android.gms.tasks.b
    public Object d(com.google.android.gms.tasks.i iVar) throws IOException {
        boolean z;
        int i;
        Object obj;
        switch (this.e) {
            case 12:
                if (iVar.h()) {
                    com.google.firebase.crashlytics.internal.common.b bVar = (com.google.firebase.crashlytics.internal.common.b) iVar.f();
                    com.google.firebase.crashlytics.internal.b bVar2 = com.google.firebase.crashlytics.internal.b.a;
                    bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.b);
                    File file = bVar.c;
                    z = true;
                    if (file.delete()) {
                        bVar2.b("Deleted report file: " + file.getPath());
                    } else {
                        bVar2.d(null, "Crashlytics could not delete report file: " + file.getPath());
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", iVar.e());
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                i = 403;
                break;
            case 26:
                i = -1;
                break;
            default:
                s sVar = (s) iVar;
                synchronized (sVar.a) {
                    x.i("Task is not yet complete", sVar.c);
                    if (sVar.d) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    boolean zIsInstance = IOException.class.isInstance(sVar.f);
                    Exception exc = sVar.f;
                    if (zIsInstance) {
                        throw ((Throwable) IOException.class.cast(exc));
                    }
                    if (exc != null) {
                        throw new com.google.android.gms.tasks.g(exc);
                    }
                    obj = sVar.e;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null) {
                        return string;
                    }
                    String string2 = bundle.getString("unregistered");
                    if (string2 != null) {
                        return string2;
                    }
                    String string3 = bundle.getString("error");
                    if ("RST".equals(string3)) {
                        kotlinx.coroutines.future.a.w("INSTANCE_ID_RESET");
                    } else if (string3 != null) {
                        kotlinx.coroutines.future.a.w(string3);
                    } else {
                        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                        kotlinx.coroutines.future.a.w("SERVICE_NOT_AVAILABLE");
                    }
                } else {
                    kotlinx.coroutines.future.a.w("SERVICE_NOT_AVAILABLE");
                }
                return null;
        }
        return Integer.valueOf(i);
    }

    @Override // com.google.firebase.components.e
    public Object g(x1 x1Var) {
        switch (this.e) {
            case 6:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 7:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 9:
                n nVar = ExecutorsRegistrar.a;
                return com.google.firebase.concurrent.i.e;
            case 20:
                return TransportRegistrar.lambda$getComponents$0(x1Var);
            case 21:
                return TransportRegistrar.lambda$getComponents$1(x1Var);
            case 22:
                return TransportRegistrar.lambda$getComponents$2(x1Var);
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(x1Var);
        }
    }

    public /* synthetic */ i(Object obj, int i) {
        this.e = i;
    }

    private final void a(com.google.firebase.inject.b bVar) {
    }
}
